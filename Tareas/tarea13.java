import javax.swing.*;

public class Tarea13 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Azul Carolina Martínez Cabañas\n1868435 ITS\nPeriodo Enero-Junio 2020\nIng. Ismael Gutiérrez Pimentel");
        int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Búsqueda en un Vector\n Ingrese el tamaño del vector"));
        if(n==1){
            JOptionPane.showMessageDialog(null, "Ingresar números mayores a 1");
            System.exit(0);
        }
        int [] vec = new int[n];
        for (int i = 0; i <n ; i++) {
            vec[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número que pertenece al vector"));
        }
        String mensaje = "[ ";
        for (int i = 0; i <n ; i++) {
            mensaje += vec[i];
            mensaje += " ";
        }
        mensaje += " ]";
        JOptionPane.showMessageDialog(null, "El vector es:\n" + mensaje);
        int buscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número a buscar en el vector"));
        int contador = 0;
        for (int i = 0; i <n ; i++) {
            if(vec[i] == buscar){
                contador +=1 ;
            }
        }
        String impresion = "El número a buscar es: " + buscar + "\n";
        if (contador!=0){
            impresion += "Veces que aparece en el vector: " + contador;
        }else{
            impresion += "Número no encontrado en el vector";
        }
        JOptionPane.showMessageDialog(null, impresion);
    }
}