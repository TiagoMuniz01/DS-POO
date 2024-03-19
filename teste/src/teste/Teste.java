/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste;

import java.util.Scanner;

public class Teste {
    
    static int Soma (int a, int b){
        return a;
    }
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int x = Integer.parseInt(ler.next());
        int y = Integer.parseInt(ler.next());
        Soma(x, y);
        
        String resultado = ler.next();
        System.out.print(resultado);
        
    }
    
}
