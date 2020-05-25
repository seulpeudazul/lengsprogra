import javax.swing.*;

public class Tarea14 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Azul Carolina Martínez Cabañas\n1868435 ITS\nPeriodo Enero-Junio 2020\nIng. Ismael Gutiérrez Pimentel");
        int n = Integer.parseInt(JOptionPane.showInputDialog("Búsqueda en Matriz\nIngrese la cantidad de filas de la matriz: "));
        int m = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de columnas de la matriz. "));
        int[][] matriz = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número a la matriz"));
            }
        }
        String matrizImpresa = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrizImpresa += matriz[i][j];
                matrizImpresa += " ";
            }
            matrizImpresa += "\n";
        }
        JOptionPane.showMessageDialog(null, matrizImpresa);
        int buscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número a buscar"));
        int contador = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matriz[i][j] == buscar) {
                    contador += 1;
                }
            }
        }
        String impresion = "El número a buscar es: " + buscar;
        if (contador > 0) {
            impresion += "\nVeces que aparece en la matriz: " + contador;
        } else {
            impresion += "\nNo se encontró al numero en la matriz";
        }
        JOptionPane.showMessageDialog(null, impresion);
    }
}