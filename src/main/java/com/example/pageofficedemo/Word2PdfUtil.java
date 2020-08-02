package com.example.pageofficedemo;


import org.apache.poi.xwpf.converter.core.XWPFConverterException;
import org.apache.poi.xwpf.converter.pdf.PdfConverter;
import org.apache.poi.xwpf.converter.pdf.PdfOptions;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class Word2PdfUtil {

    public static void word2pdf(InputStream in, OutputStream out) {
        XWPFDocument document = null;
        try {
            document = new XWPFDocument(in);
            PdfOptions options = PdfOptions.create();
            PdfConverter.getInstance().convert(document, out, options);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XWPFConverterException e) {
            e.printStackTrace();
        }
    }


}
