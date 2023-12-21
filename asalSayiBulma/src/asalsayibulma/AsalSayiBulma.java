/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asalsayibulma;

import java.util.Scanner;

/**
 *
 * @author ezgir
 */
public class AsalSayiBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("2'den büyük bir sayı giriniz");
        int sayi=input.nextInt();
        while(sayi<2){
            System.out.println("2'den büyük bir sayı giriniz");
             sayi=input.nextInt();
        }
        
        boolean asalMi=true;
      for(int i=2;i<sayi;i++){
         if(sayi%i==0){
             asalMi=false;
             break;
              
          }
      
      }
        if(asalMi){
            System.out.println("asal");
            
        }else{
            System.out.println("asal değil");
        }
    }
    
}
