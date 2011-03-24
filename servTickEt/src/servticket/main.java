/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package servticket;

import java.io.FileOutputStream;
import java.io.IOException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;

public class main {

    public static void main(String[] args) {
        Document documento = new Document();
        try {
            PdfWriter.getInstance(documento, new FileOutputStream("prueba.pdf"));
            documento.open();
            documento.add(new Paragraph("Este es un dato"));
            documento.add(new Paragraph("Hola"));
            documento.close();
             File prueba = new File("prueba.pdf");
         Desktop.getDesktop().open(prueba);
        } catch (DocumentException de) {
            System.err.println(de.getMessage());
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
         

    }
}