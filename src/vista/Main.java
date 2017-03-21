package vista;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import modelo.Barberia;

public class Main implements Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Barberia barberia;

	private int xCabezaPos;
	private int yCabezaPos;
	private int widthCabeza;
	private int heightCabeza;

	//Indica si hay un cliente nuevo o no
	private boolean clienteNuevo;
	//Contador de clientes nuevos
	private int contadorClientesNuevos;
	//Contador de segundo
	private int contadorSegundos;
	

	public Main(Barberia barberia) {
		this.barberia = barberia;
		contadorClientesNuevos=0;
		contadorSegundos=0;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			if (barberia.hayClienteNuevo() == true) {
				System.out.println("Ha entrado el cliente "+ contadorClientesNuevos);
				contadorClientesNuevos++;
				// Llega un cliente nuevo
				clienteNuevo = true;
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				clienteNuevo = false;
				barberia.llegaCliente();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


			}else{


				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			contadorSegundos++;
		}

	}

}
