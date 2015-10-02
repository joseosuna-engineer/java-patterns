
package org.study.example.string;


public class MainString {
    
    public static void main(String[] args){
        String a = "Hola";
        String b = "Hola";
        
        if(a==b){
            System.out.println("somos iguales");
        }else{
            System.out.println("no somos iguales");
        }
        
         if(a.equals(b)){
            System.out.println("somos iguales");
        }else{
            System.out.println("no somos iguales");
        }
    }
}
