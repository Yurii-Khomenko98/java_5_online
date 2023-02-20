package ua.com.alevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle {

    public void test() throws IOException {
        byte[] ascii = new byte[128];
//        for (byte i = 0 ; i <128; i = (byte) (i + 1)) {
//            System.out.println("i = " +i);
//            ascii[i] = i;
//            if (i == 127) {
//                break;
//            }
//        }

//        for (int i = 0; i < ascii.length; i++) {
//            System.out.println("index: " + i + ", symbol: " + (char)i);
//        }
//        for (byte b : ascii) {
//            System.out.println("index: " + b + ", symbol: " + (char)b);
//        }

//        for (byte i = 0 ; i <128; i = (byte) (i + 1)) {
//            System.out.println("i = " + i);
//            ascii[i] = i;
//            if (i == 127) {
//                break;
//            }
//        }

//        byte i = 0;
//        while (i < 128) {
//            ascii[i] = i;
//            if (i == 127) {
//                break;
//            }
//            i++;
//        }
//        for (byte b : ascii) {
//            System.out.println("index: " + b + ", symbol: " + (char)b);
//        }

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter some value:");
        String s = bf.readLine();
        System.out.println("s = " + s);


    }
}
