package com.cydeo.java13;

public class TextBlockDemo {
    public static void main(String[] args) {
        var address = "7925 Jones \n" +
                "Mclean 22";
        System.out.println(address);

        System.out.println("-------------------------------------");

        var address2 = """
                Jones
                Mclean VA
                """;
        System.out.println(address2);
    }
}
