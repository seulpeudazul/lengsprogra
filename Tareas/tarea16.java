import javax.swing.*;


public class Tarea16 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Azul Carolina Martínez Cabañas\n1868435 ITS\nPeriodo Enero-Junio 2020\nIng. Ismael Gutiérrez Pimentel");
        int mA = Integer.parseInt(JOptionPane.showInputDialog("Multiplicación de Matrices\nIngresar el número de filas de la matriz A:"));
        int nA = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el número de columnas de la matriz A:"));
        int mB = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el número de filas de la matriz B:"));
        int nB = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el número de columnas de la matriz B:"));
        if(nA == mB){
            int [][] matA = new int[mA][nA];
            int [][] matB = new int[mB][nB];
            int [][] multi = new int[mA][nB];
            for (int i = 0; i <=(mA-1) ; i++) {
                for (int j = 0; j <=(nA -1); j++) {
                    matA[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingresar los números que pertenecen a la matriz A "));
                }
            }
            for (int i = 0; i <=(mB -1) ; i++) {
                for (int j = 0; j <= (nB -1); j++) {
                    matB[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingresar los números que pertenecen a la matriz B"));
                }
            }
            String display ="";
            for (int i = 0; i <mA ; i++) {
                for (int j = 0; j <nB ; j++) {
                    multi[i][j] = 0;
                    for (int k = 0; k < nA ; k++) {
                        multi[i][j] = (matA[i][k] * matB[k][j]) + multi[i][j];
                    }
                    display += multi[i][j] + " ";
                }
                display += "\n";
            }
            JOptionPane.showMessageDialog(null, "El resultado de la multiplicación de matrices es: \n"+display);
        }else{
            JOptionPane.showMessageDialog(null, "Las dimensiones no son válidas");
            System.exit(0);
        }
    }
}