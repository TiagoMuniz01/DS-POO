/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplo_um;

import javax.swing.JOptionPane;

public class Exemplo_um {

    public static void main(String[] args) {
        int a;
        digite();
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));    
        dobro(a);
    }
    
    static void digite(){
        JOptionPane.showMessageDialog(null, "Digite um número:");
    }
    
    static void dobro(int n){
        int d = n * 2;
        JOptionPane.showMessageDialog(null, "Dobro de "+n+" É "+ d);
    }
}
