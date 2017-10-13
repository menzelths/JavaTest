/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author menze
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] summe=new int[6];
        for (int i=0;i<100;i++){
            int zz=(int)(Math.random()*6+1);
            summe[zz-1]++;
        }
        
        for (int i=0;i<summe.length;i++){
            System.out.println(summe[i-1]);
            int c=54;
            String b="Hallo!";
            String d="Super2";
        }
            
    }
    
}
