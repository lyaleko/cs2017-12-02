package by.it.liulis.lesson01;

public class Main {
    public static void main(String[] args) {
        for (byte i = -128; i < 127; i++) {
            String binary = Integer.toBinaryString(i);
            String octal = Integer.toOctalString(i);
            String hex = Integer.toHexString(i);
            show(binary, octal, hex, i);

        }
    }

    public static void show(String binary, String octal, String hex, int i) {
        System.out.printf("%8s   %8s   %8s    %4d %n", checkSize(binary), checkSize(octal), checkSize(hex), i);
    }

    public static String checkSize(String x) {
        if (x.length() > 8) {
            x = x.substring(x.length() - 8);
        }
        x = String.format("%8s", x).replace(" ", "0");
        return x;
    }
}
