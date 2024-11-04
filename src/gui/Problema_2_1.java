package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import semana_02.Celular;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Problema_2_1 extends JFrame {

	private JPanel contentPane;
	private JButton btnCalcular;
	private JScrollPane scrollPane;
	private JTextArea txtReporte;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema_2_1 frame = new Problema_2_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Problema_2_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			btnCalcular = new JButton("Calcular");
			btnCalcular.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					//DECLARE CREE E INICIALIZE UN OBJETO DE TIPO CELULAR (CON DATOS FIJOS).
					Celular c = new Celular(923368212, 234, "mak", 0.004);
					Celular d = new Celular(921368212, 123, "kiara", 0.002);
					Celular e = new Celular(975951753, 148, "alisson", 0.012);
					
					
					//invoque a un metodo listado que recibe ( como parametro ) la referencia 
					//a un objeto de tipo celular y visualice sus datos completos
					listado(c);
					//aumento en 20 el numero de segundos consumidos
					c.setSegConsu(c.getSegConsu()+ 20);
					//dsiminuya en 5% el precio por segundo
					c.setPreciosSeg(c.getPreciosSeg()*0.95);
					// E INVOKE DE NUEVO AL METODO LISTADO
					listado(c);
					
					listado(d); 
					
					listado(e);
					
					 
				}
				
				// METODOS TIPO VOID (CON PARAMETROS)
				void imprimir (String s) {
					txtReporte.append(s + "\n");
				}
				void listado (Celular x)
				{
					imprimir("DirMem  :  " + x);
					imprimir("Usuario  :  " + x.getUsuario());
					imprimir("Numero  :  " + x.getNum());
					imprimir("Precios de segundos  :  " + x.getPreciosSeg());
					imprimir("Segundos consumidos  :  " + x.getSegConsu());
					imprimir("CostoConsu  :  " + x.costoConsum());
					imprimir("IGV  :  " + x.impuestoIGV());
					imprimir("Total a pagar  :  " + x.totalP());
					imprimir("");
				}
			});
			btnCalcular.setBounds(197, 31, 89, 23);
			contentPane.add(btnCalcular);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 82, 473, 312);
			contentPane.add(scrollPane);
			{
				txtReporte = new JTextArea();
				scrollPane.setViewportView(txtReporte);
			}
		}
	}
}
