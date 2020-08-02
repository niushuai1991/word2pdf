package com.example.pageofficedemo;

import java.io.*;

public class Word2PdfUtilTest {


    public static void main(String[] args) throws IOException {

        File file = new File("spring.docx");
        if (!file.exists()) {
            System.out.println("文件不存在！" + file.getAbsolutePath());
            return ;
        }

        File outFile = new File("spring.pdf");
        try (InputStream in = new FileInputStream(file);OutputStream out = new FileOutputStream(outFile)) {
            Word2PdfUtil.word2pdf(in, out);
        }
    }
}
