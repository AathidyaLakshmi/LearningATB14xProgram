package ex_02_Java_Basics;

import java.util.Arrays;

public class Lab008_println_print_printf {
    public static void main(String[] args) {
        //print()--> print text to the console and keeps cursor on same line
        System.out.print("Hi this is Aathidya");
        System.out.print("Lakshmi");

        //println()--> print text to the console and moves cursor to next line
        System.out.println("Hi this is");
        System.out.println("Aathidya Lakshmi");

        //printf() --> print formatted text like c language
        //to add new line we can use /n like c
        System.out.printf("My name is %s and my age is %d", "Aathi",35);
    }
}

