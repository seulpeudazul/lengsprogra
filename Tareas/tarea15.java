import javax.swing.*;

public class Tarea15 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Azul Carolina Martínez Cabañas\n1868435 ITS\nPeriodo Enero-Junio 2020\nIng. Ismael Gutiérrez Pimentel");
        int mA = Integer.parseInt(JOptionPane.showInputDialog("Suma de matrices\nIngresar el número de filas de la matriz A:"));
        int nA = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el número de columnas de la matriz A:"));
        int mB = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el número de filas de la matriz B:"));
        int nB = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el número de columnas de la matriz B:"));
        if(mA != mB || nA != nB){
            JOptionPane.showMessageDialog(null, "Las dimensiones de las matrices no son válidas");
            System.exit(0);
        }else{
            int [][] matA = new int[mA][nA];
            int [][] matB = new int[mB][nB];
            for (int i = 0; i <=(mA-1) ; i++) {
                for (int j = 0; j <=(nA -1); j++) {
                    matA[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el numero de la matriz A "));
                }
            }
            for (int i = 0; i <=(mB -1) ; i++) {
                for (int j = 0; j <= (nB -1); j++) {
                    matB[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el numero de la matriz B"));
                }
            }
            int[][] suma = new int[mA][nA];
            String mensaje = "La suma de ambas matrices es\n";
            for (int i = 0; i <=(mA-1) ; i++) {
                for (int j = 0; j <=(nA -1); j++) {
                    suma[i][j] = matA[i][j] + matB[i][j];
                    mensaje += suma[i][j];
                    mensaje += " ";
                }
                mensaje += "\n";
            }
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }
}