package MituGeorgeFuncions;

import java.util.Scanner;

import javax.swing.text.DefaultStyledDocument.ElementSpec;

public class Gim {
    public static int llegirEnterAmbMissatge(String missatge){
        int nombreLlegit = 0;
        boolean llegitNombre = false;
        Scanner teclat =  new Scanner(System.in);
        
        do{
            llegitNombre =true;
        try{
            System.out.print(missatge);
            nombreLlegit = teclat.nextInt();

        }catch (Exception errorAGestionar){
            System.out.println("ERROR");
        } finally {
            teclat.close();
        }

            } while (llegitNombre == false);
            teclat.close();
            return nombreLlegit;

        
 }


 public static int tornaMaxim(int primerNombre, int segonNombre){
    int maxim = 0;

    if(primerNombre>segonNombre){
        maxim = primerNombre;
    }else
    maxim = segonNombre;
   

  


    return maxim;
 }







 }
  

