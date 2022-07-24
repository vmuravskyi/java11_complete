package com.muravskyi.java_11_complete.section22_reading_writing_files.lesson260_endianness;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class App {

    public static void main(String[] args) {

        int value = 123;
        int valueHex = 0x01020304;

        // BIG_ENDIAN
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(valueHex);

        byte[] bytes = byteBuffer.array();
        for (byte b : bytes) {
            System.out.printf("%02x ", b);
        }

        System.out.println();

        ByteBuffer byteBuffer2 = ByteBuffer.allocate(4);
        byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer2.putInt(valueHex);
        byte[] bytesReversed = byteBuffer2.array();
        for (byte b : bytesReversed) {
            System.out.printf("%02x ", b);
        }



    }

}
