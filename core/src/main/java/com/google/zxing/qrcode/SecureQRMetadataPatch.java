package com.google.zxing.qrcode;

/**
 * Created by Thomas on 25.03.14.
 */
public class SecureQRMetadataPatch {

    private static Integer numberOfErrors = -1;
    private static Integer numberOfCodeWords = -1;

    private SecureQRMetadataPatch() {

    }

    public static Integer getNumberOfErrors() {
        return numberOfErrors;
    }

    public static void setNumberOfErrors(Integer numberOfErrors) {
        SecureQRMetadataPatch.numberOfErrors = numberOfErrors;
    }

    public static void setNumberOfCodeWords(Integer numberOfCodeWords) {
        SecureQRMetadataPatch.numberOfCodeWords = numberOfCodeWords;
    }

    public static Integer getNumberOfCodeWords() {
        return numberOfCodeWords;
    }
}
