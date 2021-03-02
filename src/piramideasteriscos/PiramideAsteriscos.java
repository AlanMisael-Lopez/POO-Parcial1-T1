package piramideasteriscos;

import java.util.Scanner;

public class PiramideAsteriscos {
    
            private int filas;
        Scanner sc = new Scanner(System.in);
        
    public PiramideAsteriscos(){
        System.out.println("Hacer un programa que pinte una piramide de asteriscos\n");
    }
        public void datoFila(){
            System.out.print("Ingrese el numero de filas: ");
            filas = sc.nextInt();
        }
        public void proceso(){
        for(int i=0; i<=filas; i++){
            System.out.println("");
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
        }
        }
    public static void main(String[] args) {
  
        PiramideAsteriscos exe = new PiramideAsteriscos();
        
        exe.datoFila();
        exe.proceso();
    }
    
}
