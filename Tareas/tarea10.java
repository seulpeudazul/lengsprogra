// Nombre: Miguel A. Pinal Rodriguez     Mat: 1727055    Hora:V6
// Tarea 10 - Serie A
import javax.swing.JOptionPane;

public class T10SA
{
	public static void main (String[] arg)
	{
		String mensaje="";
		int n=0, i=0, j=0;
		double num=0;
		String Ventana = JOptionPane.showInputDialog("BIENVENIDO A LA SERIE A\n:"
				+"Ingrese hasta que posicion desea llegar en la serie: ");
	
		n = Integer.parseInt(Ventana);
		for(i=1;i<=n;i++)
		 {    
			j=2*i-1;
			num= Math.pow(i,j);
			mensaje=mensaje+num+", ";
		 }
		 JOptionPane.showMessageDialog(null,mensaje);
		 
	}
}
