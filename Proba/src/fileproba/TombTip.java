/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileproba;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

/**
 *
 * @author user
 */
public class TombTip {
    
    public TombTip(){
        System.out.println("Hello!");
    }
    
    public void velFeltoltestKiir(int[] tomb){
        Random szam = new Random();
        for (int i = 0; i<6; i++){
                tomb[i] = szam.nextInt(15)+65;
                System.out.println(tomb[i]);
        }
    }

    public int[] rendezes(int[] tomb){        
           int cs;
           for (int i = 0; i < 5; i++){
               for (int j = i + 1; j < 6; j++){
                   if (tomb[i] > tomb[j]) {
                       cs = tomb[i];
                       tomb[i]= tomb[j];
                       tomb[j] = cs;
                   }
               }
           }
        return tomb;
    }
    
    public void kiiras(int[] tomb){
        for (int element : tomb){
            System.out.println(element);
        }
    }
    
    public void fajlbaIr(int[] tomb) throws IOException{
        String sor;
        RandomAccessFile raf;
        raf = new RandomAccessFile("szamok.txt", "rw");
        for (int element : tomb){
            sor = Integer.toString(element);
            raf.writeBytes(sor + "\n\r");
        }
        raf.close();
        
    }
    
    public void fajlbolOlvas() throws FileNotFoundException, IOException {
       String sor;
       RandomAccessFile raf = new RandomAccessFile("szamok2.txt", "r");
       int[] tomb;
       tomb = new int[6];
        System.out.println("----------------");
               
       for (int i=1;i <= 6;i++){
           sor = raf.readLine();
           System.out.println(sor);
       }
    }
    
}
