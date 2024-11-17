package edu.cug.util;

import java.util.Arrays;

/**
 * CrcUtils.java
 *
 * @author zh
 * @since 2024/11/17 on 12:56
 */
public class CrcUtils {
    public static byte[] generateCrc(byte[] data, int poly) {
        // initial value
        int crc = 0xFFFF;
        for (byte val : data) {
            crc ^= val;
            for (int j = 0; j < 8; j++) {
                if ((crc & 0x0001) == 1) {
                    crc >>= 1;
                    crc ^= poly;
                } else {
                    crc >>= 1;
                }
            }
        }
        int n = data.length + 2;
        String format = String.format("%04X", crc);
        System.out.println(format);
        byte[] newData = Arrays.copyOf(data, n);
        newData[n - 2] = (byte) Integer.parseInt(format.substring(2, 4),16);
        newData[n - 1] = (byte) Integer.parseInt(format.substring(0, 2),16);
        return newData;
    }

    public static void main(String[] args) {
        byte[] data = {0x01, 0x04, 0x0a, 0x00,0x00 ,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00};
        int poly = 0xA001;
        byte[] newData = generateCrc(data, poly);
        System.out.println(Arrays.toString(newData));
        System.out.println(newData[newData.length - 2]);
        System.out.println((byte)0xd1);
    }

}
