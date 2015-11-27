/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author LAB-07
 */
public class D {
    private String lado1;
    private String ladon;
    private String par;

    public D() {
        lado1="";
        ladon="";
        par="";
    }

    public D(String lado1, String ladon, String paramentro) {
        this.lado1 = lado1;
        this.ladon = ladon;
        this.par = paramentro;
    }

    public String getLado1() {
        return lado1;
    }

    public void setLado1(String lado1) {
        this.lado1 = lado1;
    }

 
    public String getLadon() {
        return ladon;
    }

    public void setLadon(String ladon) {
        this.ladon = ladon;
    }

    public String getPar() {
        return par;
    }

    public void setPar(String par) {
        this.par = par;
    }

  

    

    @Override
    public String toString() {
        return lado1 +""+ ladon; 
    }
    
    
    
}
