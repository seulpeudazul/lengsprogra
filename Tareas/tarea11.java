package Tarea;

import javax.swing.*;
import java.util.ArrayList;

public class Tarea11 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Azul Carolina Martínez Cabañas\n1868435 ITS\nPeriodo Enero-Junio 2020\nIng. Ismael Gutiérrez Pimentel");
        int n = Integer.parseInt(JOptionPane.showInputDialog("Serie B\nIngrese el número de la serie al que se quiere llegar: "));
        int control = 2, contador = 1;
        ArrayList<Integer> impresion = new ArrayList<>();

        for (int i = 1; i <=n ; i++) {
            if(i % 2 == 0){
                for (int j = 1; j<=control;j++){
                    if (contador > n){
                        continue;
                    }else{
                        impresion.add(i);
                        contador +=1;
                    }
                }
                control +=1;
            }else{
                if(contador >n){
                    continue;
                }else{
                    int negativo = i*-1;
                    impresion.add(negativo);
                    contador +=1;
                }
            }
        }
        String mensaje ="";
        for(Integer numero: impresion){
            mensaje += numero + " ";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
}