import javax.swing.*;

public class Tarea9 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Azul Carolina Martínez Cabañas\n1868435 ITS\nPeriodo Enero-Junio 2020\nIng. Ismael Gutiérrez Pimentel");
        Integer mon = Integer.parseInt(JOptionPane.showInputDialog("\"Convertidor de pesos mexicanos a divisas extranjeras.\\nIngrese una de las siguientes opciones:\n" +
                "1 para dólar\n"+"2 para euro\n"+"3 para yen japonés\n"+"4 para dólar de Hong Kong"));
        switch(mon){
            case 1:
                Double pesDol = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de pesos que desea convertir: "));
                Double dol = pesDol / 20;
                JOptionPane.showMessageDialog(null, dol + " dólares");
                break;
            case 2:
                Double pesEur = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de pesos que desea convertir: "));
                Double eur = pesEur / 23;
                JOptionPane.showMessageDialog(null, eur + " euros");
                break;
            case 3:
                Double pesYen = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de pesos que desea convertir: "));
                Double yen = pesYen / 0.18;
                JOptionPane.showMessageDialog(null, yen + " yenes");
                break;
            case 4:
                Double pesHK = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de pesos que desea convertir: "));
                Double hk = pesHK / 2.58;
                JOptionPane.showMessageDialog(null, hk + " dólares de Hong Kong");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ingresar una opción valida");


        }
    }
}