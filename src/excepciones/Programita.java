/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

import javax.swing.JOptionPane;

/**
 *
 * @author adm
 */
public class Programita {

    int numer=0, denomi=0;
    
    public Programita() {
       
    }

    public Programita(int numer, int denomi) {
        this.numer = numer;
        this.denomi = denomi;
    }
    
    public void primeraOperación() {
           int result =getNumer()/getDenomi();
           System.out.println("El resultado de la division es: "+result);
       
    }
    public void CapturaDatos(){
       int num1, num2;
           num1=Integer.parseInt(JOptionPane.showInputDialog("ingrese el númerador"));
           num2=Integer.parseInt(JOptionPane.showInputDialog("ingrese el denominador"));
           setNumer(num1);
           setDenomi(num2);
    }    

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    public int getDenomi() {
        return denomi;
    }

    public void setDenomi(int denomi) {
        this.denomi = denomi;
    }

    
}
