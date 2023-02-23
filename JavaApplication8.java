/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;

/**
 *
 * @author svgyo
 */
public class JavaApplication8 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        //elso10SzamOsszege();
        //osszead(1,2);
        kiir("Az elso 10 szám összege: "+ elso10SzamOsszege());
       
        kiir(Integer.toString(kimenet));
               
        kiir(Integer.toString(osszeadnegy()));
        kiir(Float.toString(gyok()));
        }
        //kiir("%d+%d=%d"+ osszead(szam1, szam2));
        
    }
    private static int elso10SzamOsszege(){
        int osszeg =0;
        for (int i = 0; i< 10; i++){
            osszeg += i;}
        return osszeg;  
        
    }
    
    private static int osszead(szam1, szam2){
        return a+b;
    }
    private static int osszeadnegy(){
    
    int kimenet = 0;
    int szam1 = 7, szam2 = 4, szam3 = 5, szam4 =9;
        kimenet = osszead(szam1, szam2);
        kimenet = osszead(kimenet, szam3);
        kimenet = osszead(kimenet, szam4);
    
    }
    private static float gyok{
    osszegharom =0;
        float gyok = 0;
        osszegharom = osszead(szam1, szam2);
        osszegharom = osszead(gyok, szam3);
        gyok = Math.sqrt(osszegharom);
        
    }

    private static void kiir(String szoveg){
        System.out.println(szoveg);
             
    }
    
}
