import javax.swing.*;

public class Tarea8 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Azul Carolina Martínez Cabañas\n1868435 ITS\nPeriodo Enero-Junio 2020\nIng. Ismael Gutiérrez Pimentel");

        Integer escala = Integer.parseInt(JOptionPane.showInputDialog("Convertidor de temperaturas\n¿Qué escala inicial desea escoger?\n1 para Celsius\n2 para Fahrenheit"));

        switch (escala){
            case 1:
                Double nT = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los grados centígrados "));
                Double tempF = ((nT * 1.8) + 32);
                JOptionPane.showMessageDialog(null, "Grados Fahrenheit: "+tempF);
                break;
            case 2:
                Double nF = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los grados Fahrenheit"));
                Double tempC = ((nF - 32) / 1.8);
                JOptionPane.showMessageDialog(null,"Grados centígrados: " + tempC);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ingresar una opción válida");
            }
        }
}