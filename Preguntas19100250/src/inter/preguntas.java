package inter;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class preguntas extends JFrame {

	private JPanel contentPane;
	private  JLabel lblNewLabel;
	JLabel lblNewLabel_1;
	JLabel lblNewLabel_2;
	JLabel lblNewLabel_3;
	JRadioButton rdbtnNewRadioButton;
	JRadioButton rdbtnNewRadioButton_1;
	JRadioButton rdbtnNewRadioButton_2;
	int contador=0;
	int contadorOcasiones=0;
	int contadorOcasiones2=0;
	int contadorOcasiones3=0;
	int contadorOcasiones4=0;
	int contadorOcasiones5=0;
	int acumulador=0;
	int calif=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
					preguntas frame = new preguntas();
					frame.setVisible(true);
				
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public preguntas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(800, 800, 900, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Anterior");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 rdbtnNewRadioButton.setEnabled(true);
				 rdbtnNewRadioButton_1.setEnabled(true);
				 rdbtnNewRadioButton_2.setEnabled(true);
				
				contador--;

			      switch(contador) {
			         case 1 :
			        	  lblNewLabel.setText("1 cual de las siguientes es una variable primitiva ");
			        	  lblNewLabel_1.setText("byte");
			        	  lblNewLabel_2.setText("short");
			        	  lblNewLabel_3.setText("todas las anteriores");
			        	
			           
			            break;
			         case 2 :
			        	  lblNewLabel.setText("2 .tipo de variable para emplear caracteres");
			        	  lblNewLabel_1.setText("int");
			        	  lblNewLabel_2.setText("char");
			        	  lblNewLabel_3.setText("byte");
			            break;
			         case 3 :
			        	 lblNewLabel.setText("3. dato cuyo valores solo pueden ser dos valores");
			        	 lblNewLabel_1.setText("boolean");
			        	 lblNewLabel_2.setText("int");
			        	 lblNewLabel_3.setText("string");
			        	 break;
			         case 4 :
			        	 lblNewLabel.setText("4. que es Jframe");
			        	 lblNewLabel_1.setText("clase utilizada en Swing  para generar ventanas sobre las cuales añadir distintos objetos con los que podrá interactuar o no el usuario");
			        	 lblNewLabel_2.setText("un entorno de desarrollo para java");
			        	 lblNewLabel_3.setText("ninguna de las anteriores");
			        	 break;
			         case 5 :
			        	 lblNewLabel.setText("5 .uso de ActionEvent");
			        	 lblNewLabel_1.setText(" representa un evento en el que el usuario presiona, escribe o suelta una tecla. Oyente relacionado:  KeyListener.");
			        	 lblNewLabel_2.setText("epresenta que se hace clic en un elemento gráfico, como un botón o elemento de una lista. Oyente relacionado:  ActionListener.");
			        	 lblNewLabel_3.setText("ningua de las anteriores");
			        	 break;
			      }
			      if(contador<=0) {
			    	  lblNewLabel.setText("BIENVENIDO");
			    	     rdbtnNewRadioButton.setEnabled(false);
			    		 rdbtnNewRadioButton_1.setEnabled(false);
			    		 rdbtnNewRadioButton_2.setEnabled(false);
			    	  lblNewLabel_1.setText("");
		        	  lblNewLabel_2.setText("");
		        	  lblNewLabel_3.setText("");
			    	  contador=0;
			    	
			      }
			      
			}
			
			
			
			
			}
		);
		btnNewButton.setBounds(32, 397, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 rdbtnNewRadioButton.setEnabled(true);
				 rdbtnNewRadioButton_1.setEnabled(true);
				 rdbtnNewRadioButton_2.setEnabled(true);
			contador++;
			
			switch(contador) {
	         case 1 :
	        	  lblNewLabel.setText("1 cual de las siguientes es una variable primitiva ");
	        	  lblNewLabel_1.setText("byte");
	        	  lblNewLabel_2.setText("short");
	        	  lblNewLabel_3.setText("todas las anteriores");
	        	
	           
	            break;
	         case 2 :
	        	  lblNewLabel.setText("2 .tipo de variable para emplear caracteres");
	        	  lblNewLabel_1.setText("int");
	        	  lblNewLabel_2.setText("char");
	        	  lblNewLabel_3.setText("byte");
	            break;
	         case 3 :
	        	 lblNewLabel.setText("3. dato cuyo valores solo pueden ser dos valores");
	        	 lblNewLabel_1.setText("boolean");
	        	 lblNewLabel_2.setText("int");
	        	 lblNewLabel_3.setText("string");
	        	 break;
	         case 4 :
	        	 lblNewLabel.setText("4. que es Jframe");
	        	 lblNewLabel_1.setText("clase utilizada en Swing  para generar ventanas sobre las cuales añadir distintos objetos con los que podrá interactuar o no el usuario");
	        	 lblNewLabel_2.setText("un entorno de desarrollo para java");
	        	 lblNewLabel_3.setText("ninguna de las anteriores");
	        	 break;
	         case 5 :
	        	 lblNewLabel.setText("5 .uso de ActionEvent");
	        	 lblNewLabel_1.setText(" representa un evento en el que el usuario presiona, escribe o suelta una tecla. Oyente relacionado:  KeyListener.");
	        	 lblNewLabel_2.setText("epresenta que se hace clic en un elemento gráfico, como un botón o elemento de una lista. Oyente relacionado:  ActionListener.");
	        	 lblNewLabel_3.setText("ningua de las anteriores");
	        	 break;
			         
			        
			        	
				}
				
					if(contador>5) {
						  lblNewLabel.setText("su calificacion es :   " + calif +"de 5");
						     rdbtnNewRadioButton.setEnabled(false);
				    		 rdbtnNewRadioButton_1.setEnabled(false);
				    		 rdbtnNewRadioButton_2.setEnabled(false);
				    	  lblNewLabel_1.setText("");
			        	  lblNewLabel_2.setText("");
			        	  lblNewLabel_3.setText("");
			        	 
				    	  contador=6;	 }
					
					  
			      
					
					
					
				
				
				

			}});
		btnSiguiente.setBounds(128, 397, 89, 23);
		contentPane.add(btnSiguiente);
		
		JButton btnEvaluar = new JButton("EVALUAR");
		btnEvaluar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if((contador)==1) {
					if (rdbtnNewRadioButton.isSelected()) {
						 System.out.print("falso");

						 lblNewLabel.setText("PUNTOS  " + calif);
						 
						 System.out.print(calif);
			        }
			        if (rdbtnNewRadioButton_1.isSelected()) {
			        	if(contadorOcasiones>=1) {
				        	
			        		
							 System.out.print(calif);
				        	
				        	
			        }
			        if (rdbtnNewRadioButton_2.isSelected()) {
			        	if(contadorOcasiones>=1) {
				        	
				        	
				        	
				        	 lblNewLabel.setText("PUNTOS  " + calif);
				        	}
				        	else {
				        	
				        	 calif++;
				        	 
				        	 lblNewLabel.setText("PUNTOS  " + calif);
				        	 contadorOcasiones++;
				        }  
			        	
			        
			        }  
			        	
				}
				if((contador)==2) {
					if (rdbtnNewRadioButton.isSelected()) {
						  System.out.print("falso");
						  lblNewLabel.setText("PUNTOS  " + calif);
			        }
			        if (rdbtnNewRadioButton_1.isSelected()) {
			        
			        	
			        	if(contadorOcasiones2>=1) {
			        	 
			        	 
			        	 lblNewLabel.setText("PUNTOS  " + calif);
			        	}
			        	else {
			        	 calif++;
			        	 
			        	 lblNewLabel.setText("PUNTOS  " + calif);
			        	 contadorOcasiones2++;
			        	 System.out.print(contadorOcasiones2);
			        	 System.out.print(calif);
			        }  
			        }
			        if (rdbtnNewRadioButton_2.isSelected()) {
			        	  System.out.print("falso");
			        	  lblNewLabel.setText("PUNTOS  " + calif);
			        }        
				}
				
				if((contador)==3) {
					if (rdbtnNewRadioButton.isSelected()) {
						  System.out.print("correcto");
						  calif++;
						  lblNewLabel.setText("PUNTOS  " + calif);
			        }
			        if (rdbtnNewRadioButton_1.isSelected()) {
			        	 System.out.print("falso");
			        	 lblNewLabel.setText("PUNTOS  " + calif);
			        }
			        if (rdbtnNewRadioButton_2.isSelected()) {
			        	System.out.print("falso");
			        	 lblNewLabel.setText("PUNTOS  " + calif);
			        }
				}
				if((contador)==4) {
					if (rdbtnNewRadioButton.isSelected()) {
						  System.out.print("correcto");
						  calif++;
						  lblNewLabel.setText("PUNTOS  " + calif);
			        }
			        if (rdbtnNewRadioButton_1.isSelected()) {
			        	 System.out.print("falso");
			        	 lblNewLabel.setText("PUNTOS  " + calif);
			        }
			        if (rdbtnNewRadioButton_2.isSelected()) {
			        	System.out.print("falso");
			        	 lblNewLabel.setText("PUNTOS  " + calif);
			        }
				}
				if((contador)==5) {
					if (rdbtnNewRadioButton.isSelected()) {
						  System.out.print("correcto");
						 
						  lblNewLabel.setText("PUNTOS  " + calif);
			        }
			        if (rdbtnNewRadioButton_1.isSelected()) {
			        	 System.out.print("falso");
			        	 calif++;
			        	 lblNewLabel.setText("PUNTOS  " + calif);
			        }
			        if (rdbtnNewRadioButton_2.isSelected()) {
			        	System.out.print("falso");
			        	 lblNewLabel.setText("PUNTOS  " + calif);
			        }
				
				}
				
			}				
			}}
		
				
				
				
			
		);
		btnEvaluar.setBounds(234, 397, 89, 23);
		contentPane.add(btnEvaluar);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setBounds(769, 397, 89, 23);
		contentPane.add(btnSalir);
		
		rdbtnNewRadioButton = new JRadioButton("New radio button",false);
		rdbtnNewRadioButton.setBounds(21, 62, 18, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("New radio button",false);
		rdbtnNewRadioButton_1.setBounds(21, 88, 18, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		rdbtnNewRadioButton_2 = new JRadioButton("New radio button",false);
		rdbtnNewRadioButton_2.setBounds(21, 114, 18, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		lblNewLabel = new JLabel("Bievenido");
		lblNewLabel.setBounds(21, 11, 394, 31);
		contentPane.add(lblNewLabel);
		
		 lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(45, 65, 813, 13);
		contentPane.add(lblNewLabel_1);
		
		 lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(45, 88, 813, 23);
		contentPane.add(lblNewLabel_2);
		
		 lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(45, 124, 813, 13);
		contentPane.add(lblNewLabel_3);
		
	     rdbtnNewRadioButton.setEnabled(false);
		 rdbtnNewRadioButton_1.setEnabled(false);
		 rdbtnNewRadioButton_2.setEnabled(false);
	  lblNewLabel_1.setText("");
	  lblNewLabel_2.setText("");
	  lblNewLabel_3.setText("");
	}
}
