import javax.swing.*;
import java.util.ArrayList;

public class Tarea12 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Azul Carolina Martínez Cabañas\n1868435 ITS\nPeriodo Enero-Junio 2020\nIng. Ismael Gutiérrez Pimentel");
        int n = Integer.parseInt(JOptionPane.showInputDialog("Serie C\nIngrese el número de la serie al que se quiere llegar: "));

        ArrayList<Integer> impresion = new ArrayList<>();
        int contador = 0, positivos = 2, negativos = -3, actual = 1;
        boolean varSwitcheable = true;
        for (int i = 1; i <=n ; i++) {
            if(varSwitcheable){
                for (int j = 1; j <= actual ; j++) {
                    if(contador>=n){
                        continue;
                    }else{
                        impresion.add(positivos);
                        positivos +=2;
                        contador +=1;
                    }
                }
                varSwitcheable = false;
                actual +=1;
            }else{
                for(int j = 1; j<=3; j++){
                    if(contador>=n){
                        continue;
                    }else{
                        impresion.add(negativos);
                        negativos -=2;
                        contador +=1;
                    }
                }
                varSwitcheable = true;
            }
        }
        String mensaje ="";
        for(Integer numero: impresion){
            mensaje += numero + " ";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
}