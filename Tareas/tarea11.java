// Nombre: Miguel A. Pinal Rodriguez     Mat: 1727055    Hora:V6
// Tarea 11 - Serie B
import javax.swing.JOptionPane;

public class T11SB
{
	public static void main (String[] arg)
	{
		String mensaje="";
		int pos=0, i=1, j=2, posdes=0, k=1;
		String Ventana = JOptionPane.showInputDialog("BIENVENIDO A LA SERIE B\n:"
				+"Ingrese hasta que posicion desea llegar en la serie: ");
	
		posdes = Integer.parseInt(Ventana);
		for(pos=1;pos<=posdes;pos++)
		{
			if(i%2==0)
			{
				mensaje=mensaje+i+", ";
				if(k==j)
				{
					i++;
					j++;
					k=1;
				}else {
					k++;
				}
			}else {
				mensaje=mensaje+"-"+i+", ";
				i++;
			}
			
		}
		JOptionPane.showMessageDialog(null,mensaje);
		 
	}
}

