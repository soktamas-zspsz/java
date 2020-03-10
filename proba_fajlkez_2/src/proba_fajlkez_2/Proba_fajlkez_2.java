/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proba_fajlkez_2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author user
 */
public class Proba_fajlkez_2 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
       String sor;
        RandomAccessFile raf;
        raf = new RandomAccessFile("szoveg.txt", "r");
        for (sor=raf.readLine(); sor!=null; sor=raf.readLine()){
            System.out.println(sor);
        }
    }
    
}
