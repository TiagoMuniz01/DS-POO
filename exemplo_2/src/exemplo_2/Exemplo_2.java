/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplo_2;

import javax.swing.JOptionPane;

public class Exemplo_2 {

    public static void main(String[] args) {
        int t;
        String p;
        digite();
        p = JOptionPane.showInputDialog("Digite uma palavra qualquer: ");
        t =tamanho(p);
        JOptionPane.showMessageDialog(null, p+ " possui "+t+" caracteres");
    }
    
    static void digite(){
        JOptionPane.showMessageDialog(null, "Digite uma palavra");
    }
    
    static int tamanho(String x){
        return x.length();
    }
}
