package mv.tuto_maven;

import java.util.LinkedList;

import com.itextpdf.text.List;

import mv.tuto_maven.FirstPdf;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args )
    {
        System.out.println( "Hello World!" );
        
        int f = 12;
        f = 12;
        f = 12;
        int i = useless(f);
        double y = Math.sqrt(f);
        f = 12;
    }
    
    public static int useless(int f) {
    	double PI = 3.141592;
    	LinkedList<Double> listeInutile = new LinkedList<Double>();
    	listeInutile.add(PI);
    	listeInutile.add(PI);
    	listeInutile.remove();
    	return f;
    }
}
