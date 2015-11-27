/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import javax.swing.JFrame;

/**
 *
 * @author GRS
 */

import java.awt.Graphics;  
import java.awt.Graphics2D;  
  
import javax.swing.JFrame;  
@SuppressWarnings("serial")  
public class Linha extends JFrame {
    
    public Linha() {  
        super("JFrame com linha");  
        setSize(800,600);  
        setLocationRelativeTo(null);  
    }  
      
    @Override  
    public void paint(Graphics g) {  
        Graphics2D g2d = (Graphics2D) g.create();  
        g2d.drawLine(10, 10, 70, 50);  
        g.dispose();  
    }  
      
    public static void main(String[] args) {  
        Linha janela = new Linha();  
        janela.setVisible(true);  
    }  
    
}
