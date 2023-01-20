/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1p2_gerardocano;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;
/**
 *
 * @author gcano
 */
public class Lab1P2_GerardoCano {
static Scanner read = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        int op=0;
        do{
        //int op = 0;
        System.out.println("Menu");
        System.out.println("1.Torres de Hanoi");
        System.out.println("2.Dates");
        System.out.println("3.Pi");
        System.out.println("4.Salir");
        System.out.println("Ingrese una opcion");
        op = read.nextInt();
        
        switch(op){
            case 1:
                System.out.println("Ingrese cantidad de discos");
                int disc = read.nextInt();
                int org =1;
                int aux =2;
                int dest = 3;
                hanoi(disc,org,aux,dest);
            break;
            case 2:
                System.out.println("Ingrese cadena");
                String cad =read.next();
                dates(cad);
            break;
            case 3:
                System.out.println("Ingrese un entero");
                int k =read.nextInt();
                System.out.println(pi(k));
              
            break;
            case 4:
                System.out.println("Saliendo");
            break;
        }
        }while (op!=4);
    }
     static void hanoi(int n, int o,int a,int d){
         //int gen=1; 
         if(n==1){
            System.out.println(" mover disco "+n+" de "+o+" a "+d);
            
        }else{
            hanoi(n-1,o,d,a); 
            System.out.println(" mover disco "+n+" de "+o+" a "+d);
            
        hanoi(n-1,a,o,d); 
        
        }
        
        
    }
     static void dates(String c) throws ParseException{
        DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String[] wawa =c.split(",");
        ArrayList<String> list = new ArrayList();
            for (int j = 0; j < wawa.length; j++) {
                if(wawa[j].charAt(2)=='/'&&wawa[j].charAt(5)=='/'){
                    list.add(wawa[j]);
                    
                }}
                for (int i = 0; i < list.size(); i++) {
                    Date d = new Date();
                    d = sdf.parse(list.get(i));
                    System.out.println(d);
                    d =new Date();//reset
         }
     }
    
        
     static double pi(int k){
        int n =0;
        double num=0;
        double den=0;
        double y =0;
        if(n==k){
            return 4*y;
        }else{
            //y+=Math.pow(-1, n)/(2*n+1);
            num=Math.pow(-1, k);
            den =(2*k+1);
            y+=num/den;
             return pi(k-1);
        }
       
    }
        
    
    
}
