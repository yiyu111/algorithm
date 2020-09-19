package test;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    static URL url;


    public static void test() throws IOException, ClassNotFoundException {
        InputStream resourceAsStream = Class.forName("test.Test").getResourceAsStream("note.text");
        StringBuilder sb = new StringBuilder();

        FileOutputStream fileOutputStream = new FileOutputStream("note.text");
        fileOutputStream.write(2322223);
        byte[] bytes = new byte[222];
        resourceAsStream.read(bytes);
        System.out.println(new String(bytes));

    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        test();
    }



}
