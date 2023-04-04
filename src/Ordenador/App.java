package Ordenador;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class App {
	
	public static void main(String[] args) {
		
		ArrayList<Ordenador>ordenador=new ArrayList<Ordenador>();
	//Ordenadores de prueba, existentes dentro de la base de datos de la empresa
			Ordenador ordenador1=new Ordenador("Lenovo","Xp500");
			ordenador1.setProcesador("Dell");
			ordenador1.setRam("8G");
			ordenador1.setDiscoDuro("100G");
			
			Ordenador ordenador2=new Ordenador("Samsung","1000");
			ordenador2.setProcesador("OPK");
			ordenador2.setRam("16G");
			ordenador2.setDiscoDuro("168G");
			
			Ordenador ordenador3=new Ordenador("HP","Js600","PH90","80G","500G");
			Ordenador ordenador4=new Ordenador("Mac","Js1000","HP1000","16G","100G");
			
			ordenador.add(ordenador1);
			ordenador.add(ordenador2);
			ordenador.add(ordenador3);
			ordenador.add(ordenador4);
			
//------------------------------------------------------------------------------------							
	String marca=JOptionPane.showInputDialog("Introduce la marca del ordenador que estas buscando");
	String modelo=JOptionPane.showInputDialog("Introduce el modelo");
			
		int indice=buscaOrdenador(ordenador,marca,modelo);
			
			if(indice==-1) {
				
				String opcion=JOptionPane.showInputDialog("Este ordenador no existe, desea crearlo?");
				
					if (opcion.equalsIgnoreCase("si")) {
						
						crearOrdenador(ordenador,marca,modelo);
						
					}
				
			}else {
				
				System.out.println(ordenador.get(indice)+"\n");
				
					String elige=JOptionPane.showInputDialog("Desea cambiar alguno de sus componentes?");
					
						if(elige.equalsIgnoreCase("si")) {
							
							cambiaParametros((Ordenador)ordenador.get(indice));
							
						}
				
				}
			
			
			System.out.println("Fin del programa");	
		
	}
		
	static void crearOrdenador(ArrayList<Ordenador>ordenador,String marca, String modelo) {
			
			String opcion=JOptionPane.showInputDialog("Escoge entre un ordenador Basico o Personalizado");
			
				if(opcion.equalsIgnoreCase("Basico")) {
					
					Ordenador nuevo=new Ordenador(marca,modelo);
										
						System.out.println(nuevo + "\n");
									
								ordenador.add(nuevo);	
									
									System.out.println("Hemos tramitado su pedido :)");
										
			}else if(opcion.equalsIgnoreCase("Personalizado")) {
				
				Ordenador nuevo=new Ordenador(marca,modelo,JOptionPane.showInputDialog("Escoge el procesador"),
						JOptionPane.showInputDialog("Decide la capacidad de memoria Ram"),
						JOptionPane.showInputDialog("Que tipo de disco duro quieres?"));
				
					System.out.println(nuevo.ejecutandoPrograma("(Configurando tu ordenador)"));
					
						System.out.println(nuevo + "\nHemos tramitado su pedido :)");
						
							ordenador.add(nuevo);	
								
			}else {
			
				System.out.println("Esta opcion no existe");	
		}
		
	}
	
	static void cambiaParametros(Ordenador ordenador) {
		
		for(int i=0; i<=3;i++) {
		
				switch(i) {
				
					case 1:
						
						String elige=JOptionPane.showInputDialog("Desea cambiar el procesador?");
						
							if(elige.equalsIgnoreCase("Si")) {
						
								ordenador.modificaProcesador(ordenador);
							}
							
								break;
									
					case 2:
						
						elige=JOptionPane.showInputDialog("Desea cambiar la memoria Ram?");
						
							if(elige.equalsIgnoreCase("Si")) {
					
								ordenador.modificaRam(ordenador);
							
							}
							
								break;
					
					
					case 3:
						
						elige=JOptionPane.showInputDialog("Desea cambiar el disco duro?");
						
							if(elige.equalsIgnoreCase("Si")) {
				
								ordenador.modificaDiscoDuro(ordenador);	
						
							}
							
								break;		
				} 
				
			}
		
		}
		
	static int buscaOrdenador(ArrayList<Ordenador>ordenador,String marca,String modelo) {
		
		int indice=-1;
		int contador=0;

		while(contador<ordenador.size() && indice==-1){

			if(ordenador.get(contador).getMarca().equalsIgnoreCase(marca) &&
					ordenador.get(contador).getModelo().equalsIgnoreCase(modelo)){
				
				indice=contador;
				
			}

				contador++;

		}

					return indice;
			}	
	
}
	
