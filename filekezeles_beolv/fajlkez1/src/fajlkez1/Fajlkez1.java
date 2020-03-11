/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fajlkez1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author admin
 */
public class Fajlkez1 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        RandomAccessFile raf;
        raf = new RandomAccessFile("nevek.txt", "r");
        String sor;
        //String[] nevek = null;
        int db = 0;
        for (sor = raf.readLine(); sor != null; sor = raf.readLine()) {
            db++;
        }
        String[] nevek = new String[db];
        db = 0;
        raf.seek(0);
        for (sor = raf.readLine(); sor != null; sor = raf.readLine()) {
            nevek[db] = sor;
            System.out.println(nevek[db]);
            db++;
        }
        raf.close();    
    }
}
