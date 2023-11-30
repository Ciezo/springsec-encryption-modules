package com.example.cryptomodule.demo.encrypt;

import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.security.crypto.keygen.KeyGenerators;
import org.springframework.security.crypto.encrypt.TextEncryptor;

public class MyTextEncryptor {
    /**
     * Steps in generating an encryption to a sensitive text information like passwords
     * 1. Generate a salt for key generation
     * 2. Use text() method to create a TextEncryptor
     * 3. Now, begin encryption or decryption
     */
    private static String salt = KeyGenerators.string().generateKey();
    private static String SENSITIVE_PW = "Hello, World! 12345678";

    public static void main(String[] args) {
        /**
         * I put the rest of the encryption implementation here during runtime only
         * because I don't want to expose the other stuff from this class.
         */
        TextEncryptor encryptor = Encryptors.text(SENSITIVE_PW, salt);
        String encryptedText = encryptor.encrypt(SENSITIVE_PW);
        String decryptedText = encryptor.decrypt(encryptedText);

        System.out.println("Encrypted password: " + encryptedText);
        System.out.println("Decrypted password: " + decryptedText);
    }

}
