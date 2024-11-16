package edu.cug;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * MainApplication.java
 *
 * @author zh
 * @since 2024/11/16 on 22:43
 */

@SpringBootApplication
public class MainApplication {

    // the encrypted mainboard serial number
    public static final String encodeMainBoardSN = "$2a$10$X/mpIUuyJOoZuwqFsm9U5.jEvjeHfb.i36ucOhjLMyLxFw3oqLMJS";
    public static void main(String[] args) {
        if (BCrypt.checkpw("8SSB27B88599K2DG48W004X", encodeMainBoardSN)) {
        }
        SpringApplication.run(MainApplication.class, args);
    }
}
