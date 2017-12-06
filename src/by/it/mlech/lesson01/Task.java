package by.it.mlech.lesson01;

public class Task {

        public static void main(String[] args) {
            for (byte i = -128; i < 127; i++) {
                String binary = Integer.toBinaryString(i);
                String he = Integer.toHexString(i);
                String ok = Integer.toOctalString(i);
                if (binary.length()>8) binary=binary.substring(binary.length()-8);
                binary = String.format("%8s", binary).replace(" ", "0");
                System.out.printf("%8s %8s %8s %4d %n",binary, he, ok, i);
            }
        }
    }

