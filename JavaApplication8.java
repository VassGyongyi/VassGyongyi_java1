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
        int[] szamok = {6,4,5,8};
        ossz = osszead(szamok);
        
        int kimenet = 0;
        int szam1 = 7, szam2 = 4, szam3 = 5, szam4 =9;
        kimenet = osszead(szam1, szam2);
        kimenet = osszead(kimenet+ szam3);
        kimenet = osszead(kimenet + szam4);
        kiir(Integer.toString(kimenet));
       
            
        }
        //kiir("%d+%d=%d"+ osszead(szam1, szam2));
        
    }
    private static int elso10SzamOsszege(){
        int osszeg =0;
        for (int i = 0; i< 10; i++){
            osszeg += i;}
        return osszeg;  
        
    }
    
    private static int osszead(int [] szamok){
        return a+b;
    }
    private static void kiir(String szoveg){
        System.out.println(szoveg);
             
    }
}
