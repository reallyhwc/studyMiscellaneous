package com.xuhu.core;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author xuhu
 * @date 2021-04-06 12:20
 */
public abstract class Md5Util {
    private static final Logger logger = LoggerFactory.getLogger(Md5Util.class);
    private static final MessageDigest md5;
    protected static final char[] hexDigits;

    public Md5Util() {
    }

    public static String bufferToHex(String value) {
        return value == null ? null : bufferToHex(md5.digest(value.getBytes()));
    }

    public static String bufferToHex(byte[] bytes) {
        return bufferToHex(bytes, 0, bytes.length);
    }

    public static String bufferToHex(byte[] bytes, int m, int n) {
        StringBuilder builder = new StringBuilder(2 * n);
        int k = m + n;

        for(int l = m; l < k; ++l) {
            appendHexPair(bytes[l], builder);
        }

        return builder.toString();
    }

    private static void appendHexPair(byte bt, StringBuilder builder) {
        char c0 = hexDigits[(bt & 240) >> 4];
        char c1 = hexDigits[bt & 15];
        builder.append(c0);
        builder.append(c1);
    }

    static {
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException var1) {
            logger.error("MD5 digest failed", var1);
//            throw ExceptionUtil.unchecked(var1);
            throw new RuntimeException(var1);
        }

        hexDigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }
}
