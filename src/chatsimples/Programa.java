/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatsimples;
import javax.swing.JOptionPane;
/**
 *
 * @author ronal
 */
public class Programa {
    public static void main(String[] args) {
        String  ip = (String)JOptionPane.showInputDialog("Informe o IP","192.168.0.");
        int porta = Integer.parseInt(JOptionPane.showInputDialog("Informe a Porta","5000"));
        
        Conexao c = new Conexao(ip, porta);
        
        JanelaChat j = new JanelaChat(c);
        j.setLocationRelativeTo(null);
        j.setVisible(true);
    }
}
