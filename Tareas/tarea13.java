// Nombre: Miguel A. Pinal Rodriguez     Mat: 1727055    Hora:V6
// Tarea 13 - Busqueda en Vector
import javax.swing.JOptionPane;

public class T13BV
{
	public static void main (String[] arg)
	{
		String ventana, mensaje="";
		int i, bus, numenc=0;
		//numenc Numero de veces encontrado
		int A[]= {1, 4, 7, 9, 21, 4, 0, 2, 5, 2};
		boolean enc=false; //variable para indicar que se encontro
		ventana= JOptionPane.showInputDialog("BIENVENIDO A LA BUSQUEDA DE VECTORES\n"
				+ "Introduzca el numero que desea encontrar ");
		//Busqueda del numero
		bus = Integer.parseInt(ventana);
		i=0;
		while(i<10)
		{
			if(A[i]==bus)
			{
				enc=true;
				numenc++;
			}
			i++;
		}
		//se guarda el vector
		mensaje="Su vector es: ";
		for(i=0; i<10; i++)
		{
			mensaje=mensaje+A[i]+", ";
		}
		//Impresion de resultado
		if(enc==true)
		{
			JOptionPane.showMessageDialog(null, mensaje+"\nEl "+bus+" se encontr� "+numenc+" veces en el vector");
		}else {
			JOptionPane.showMessageDialog(null, mensaje+"\nEl numero "+bus+" no fue encontrado");
		}
	}
}
