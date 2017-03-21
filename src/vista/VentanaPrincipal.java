package vista;

import java.awt.Color;
import javax.swing.JFrame;
import modelo.Barberia;

public class VentanaPrincipal {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public static void main(String[]args){
		Barberia barberia = new Barberia();
		Main panel = new Main(barberia);
		barberia.getBarbero().start();;
		new Thread(panel).start();
	}


}
