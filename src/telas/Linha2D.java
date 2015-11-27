/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Line2D;

/**
 *
 * @author GRS
 */
public class Linha2D {
    
    public static Image img;  
    public static Graphics2D g2;  
    private static javax.swing.JFrame j;  
           
      
    public static void main(String args[])  
    {  
       drawningALine();  
          
    }  
      
     
      
      
      
      
    public static void drawningALine()  
    {  
  
    Line2D linha = new Line2D.Double(1, 1, 1, 1);  
      g2.draw(linha);  
      j.paint(g2);  
           
    }  
     
    
}
