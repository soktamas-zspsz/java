/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileproba;

import java.io.IOException;

/**
 *
 * @author user
 */
public class Proba {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
       int[] tomb;
       tomb = new int[6];
  
       TombTip tombMuv = new TombTip();
       tombMuv.velFeltoltestKiir(tomb);
        System.out.println("-------------------------");
       tombMuv.rendezes(tomb);
       tombMuv.kiiras(tomb);
       tombMuv.fajlbaIr(tomb);
       tombMuv.fajlbolOlvas();
       
       
//        RandomAccessFile raf;
//        String sor;
//        try {
//            raf = new RandomAccessFile("szamok.txt", "rw");
//            int db = 0;
////            for (int i = 0; i<6; i++){
////                tomb[i] = szam.nextInt(15)+65;
//                //System.out.println(tomb[i]);
////                sor = Integer.toString(tomb[i]);
////                raf.writeBytes(sor  +"\n");
////                raf.writeChar(tomb[i]);
//                raf.close();            
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Proba.class.getName()).log(Level.SEVERE, null, ex);
//        }
       //feltöltés véletlenszámokkal
//       for (int i = 0; i<6; i++){
//           tomb[i] = szam.nextInt(15)+65;
           
    }
       
       //Rendezés
//       int cs;
//       for (int i = 0; i < 5; i++){
//           for (int j = i + 1; j < 6; j++){
//               if (tomb[i] > tomb[j]) {
//                   cs = tomb[i];
//                   tomb[i]= tomb[j];
//                   tomb[j] = cs;
//               }
//           }
//       }
//        System.out.println("");
//       for (int i = 0; i < 6; i++){
//           System.out.println(tomb[i]);
              
       
        
}
