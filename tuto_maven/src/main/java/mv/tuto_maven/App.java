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
        //on enleve une ligne dans la branch2
        //Je fais un nouveau commentaire inutile
        //on va enlever le code mort !
    }
    //cette fonction ne sert vraiment a rien
    public static int useless(int f) {
    	double PI = 3.141592;
    	LinkedList<Double> listeInutile = new LinkedList<Double>();
    	listeInutile.add(PI);
    	listeInutile.add(PI);
    	listeInutile.remove();
    	return f;
    }
}
