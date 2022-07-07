package modelo;

import javax.swing.JOptionPane;;

public class Principal 
{
    //metodo principal
    public static void main(String[] args)
    {
        //Entrada datos
        double x= Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de x: "));
        double y= Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de y: "));

        //creacion objeto suma
        Suma miSuma = new Suma(x,y);
        miSuma.sumar();
        JOptionPane.showMessageDialog(null, "La suma de " + x + " y "+ y +" es " + miSuma.mostrarResultados());

        //creacion objeto suma
        Resta miResta = new Resta(x,y);
        miResta.restar();
        JOptionPane.showMessageDialog(null, "La resta de " + x + " y "+ y +" es " + miResta.mostrarResultados());
        
        System.exit(0);

    }
}
