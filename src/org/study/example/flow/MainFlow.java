

package org.study.example.flow;



public class MainFlow {
    public static void main(String[] args){
        for(int i = 0; i<10; i++){
            System.out.println("imprime 1.1");
            continue;
         //   System.out.println("imprime 2.1");
        }
        
        for(int i = 0; i<10; i++){
            System.out.println("imprime 1.2");
            break;
        //    System.out.println("imprime 2.2");
        }
    }
}
