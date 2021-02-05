package mv.tuto_maven;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * Unit test for FirstPdf.
 */

public class FirstPdfTest {
	private static String FILE = "FirstPdf.pdf";
    private static Document document;
    private static Document document2;
 
    static void main() {
	try {
	    document = new Document();
	    PdfWriter.getInstance(document, new FileOutputStream(FILE));
	    document.open();
	    
	    document2 = new Document();
	    PdfWriter.getInstance(document, new FileOutputStream(FILE));
	    document2.open();
	    
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

   
}
