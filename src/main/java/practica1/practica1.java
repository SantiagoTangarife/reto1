/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author saxss
 */
public class practica1 {
    public static void main (String[] args){
        System.out.println("Hola mundo"); 
        //Scanner lector = new Scanner(System.in);
        punto5();
    }
    
    public static void punto1() {
        System.out.println("Valor de N");
        int n, m, i=1;
        Scanner lector = new Scanner(System.in);
        //lector.nextInt();
        n = lector.nextInt();                   //Ultima tabla de multiplicar 
        System.out.println("Valor de M");
        //lector.nextInt();
        m=lector.nextInt();                     // ultimo numero de la tabla
        //System.out.println(n+" "+m);          //check point
        while (i<=n){
            int j=1;
            while(j<=m){ 
                System.out.println(i+"x"+j+"="+(i*j));
                j++;
            }
            i++;
            System.out.println();
            System.out.println("-------");
            System.out.println();
        }
        }
    public static void punto2(){
        Scanner lector = new Scanner(System.in);
        int n , i=1, c=0, j=1,k=0;
        String pantalla="";
        System.out.println("ingrese el valor de N para hallar su respectivo cuadrado");
        n= lector.nextInt();
        while(i<=n){
            //j=1;        //toma el valor de la sumatoria, crece de a 2
            //c=0;        // toma el valor de los pasos crece d a 1
            if (i==1){
                pantalla="1";
                k=1;
                j+=2;
                c++;
                }
            while(c<i){
                
                
                pantalla=pantalla+"+"+j;
                k+=j;       
                 
                j+=2;
                c++;
            }
           
            
            System.out.println(pantalla+"="+k);
            i++;
        }   
    }
    public static void punto3(){
        Scanner lector = new Scanner(System.in);
        int n , i=1, c, j=1,k;
        System.out.println("ingrese el valor de N para hallar su respectivo cubo");
        n= lector.nextInt();
        while(i<=n){        // numero de la base
             String pantalla="";
             k=0;
             c=0;
            while(k<i){
                k++;
                pantalla=pantalla+j+"+";
                c+=j;   //almacena la sumatoria
                j+=2;   // infinitos impares hasta n
            }
            pantalla = pantalla.substring(0, pantalla.length()-1);
            System.out.println(i+"="+pantalla+"="+c);
            i++;
        }
    }
    public static void punto4(){
        Scanner lector = new Scanner(System.in);
        int n , res;
        System.out.println("ingrese el valor de N para el retiro");
        n= lector.nextInt();
        int lista[]={100000,50000,20000,10000,5000,2000,1000,500,200,100,50};
        //lista= new int[11];
        for(int i=0;i<=11;i++){
            res=n%lista[i];
            System.out.println("$"+lista[i]+"= "+n/lista[i]);
            n=res;
            if (n==0){
                break;
            }
        }
       // while(i<=n){        // numero de la base
    }
    public static void punto5(){
        Scanner lector = new Scanner(System.in);
        int n ,m,res, c, num = 0, den=1,k=1;
        System.out.println("ingrese el valor de M para la combinacion");
        m= lector.nextInt();
        System.out.println("ingrese el valor de N para la combinacion");
        n= lector.nextInt();
       res=m-n;
       int lista[]={m,n,res};
       for(int i=0;i<3;i++){            //crear funcion factorial
           c=1;
           k=1;
           while(c<=lista[i]){
               k=k*c;                   //k=  fsctorial de m, n, (m-n), en ese orden
               c++;
           }
           
           if(i==0){
               num=k;
           }
           else{
               den=den*k;
           }
       }
       //System.out.println(num);
       System.out.println("el resultado al convinar "+m+" elementos de "+n+" en "+n+" es: "+(num/den));
    }
    }
    

