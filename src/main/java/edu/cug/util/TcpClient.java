package edu.cug.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;

/**
 * TcpClient.java
 * Tcp Client
 *
 * @author zh
 * @since 2024/11/17 on 10:56
 */
public class TcpClient {
    public static final int readTimeout = 1000;

    public static byte[] getReturnData(String host, int port, byte[] send) {
        Socket socket = null;
        try {
            socket = new Socket(host, port);
            // set the specified timeout, in milliseconds, not the socket, ensure infinite waiting for read
            socket.setSoTimeout(readTimeout);
            // keep the socket alive
            socket.setKeepAlive(true);
            OutputStream os = socket.getOutputStream();
            // send the command to the server
            os.write(send);
            os.flush();

            InputStream is = socket.getInputStream();
            // create the buffer
            byte[] buffer = new byte[100];
            // read data to the buffer, length refers to the length of valid data
            int length = is.read(buffer);
            byte[] data = Arrays.copyOf(buffer, length);

            // close resources
            os.close();
            is.close();

            return data;
        } catch (IOException e) {
            // can't read the data
            return null;
        } finally {
            try {
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        byte[] command = {0x01, 0x04, 0x00, 0x00,0x00 ,0x05};
        byte[] send = CrcUtils.generateCrc(command, 0xA001);
        System.out.println(Arrays.toString(send));
        byte[] returnData = getReturnData("192.168.1.125", 4197, send);
        System.out.println(Arrays.toString(returnData));

    }

}
