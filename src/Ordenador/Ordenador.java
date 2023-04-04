package Ordenador;

import javax.swing.JOptionPane;

public class Ordenador {
	
	private String marca;
	private String modelo;
	private String procesador;
	private String ram;
	private String discoDuro;
	
	//Constructores
	public Ordenador (String marca,String modelo,String procesador,String ram,String discoDuro){
		
		this.marca=marca;
		this.modelo=modelo;
		this.procesador=procesador;
		this.ram=ram;
		this.discoDuro=discoDuro;		
	
		}
	
	public Ordenador (String marca,String modelo){
		
		this.marca=marca;
		this.modelo=modelo;
			
		}

	//getters y setters
	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public String getProcesador() {
		return procesador;
	}
	
	public String getRam() {
		return ram;
	}
	
	public String getDiscoDuro() {
		return discoDuro;
	}

	public void setProcesador(String procesador){
		this.procesador=procesador;
		
	}
	
	public void setRam(String ram) {
		this.ram=ram;
		
	}
	
	public void setDiscoDuro(String discoDuro) {
		this.discoDuro=discoDuro;
		
	}
	
	//Metodos de clase
	public void modificaProcesador(Ordenador ordenador) {
		
		System.out.println("Tu ordenador tiene un procesador " + procesador);	
			ordenador.setProcesador(JOptionPane.showInputDialog("Que procesador quieres agregar?"));
				System.out.println("Cambios realizados, estas son las caracteristicas de tu ordenador\n" 
						+ ordenador.toString());
		
	}
	
	public void modificaRam(Ordenador ordenador) {
		
		System.out.println("Tu ordenador tiene una memoria Ram de " + ram);	
			ordenador.setRam(JOptionPane.showInputDialog("Que Ram quieres agregar?"));
				System.out.println("Cambios realizados, estas son las caracteristicas de tu ordenador\n"
						+ ordenador.toString());
		
	}

	public void modificaDiscoDuro(Ordenador ordenador) {
	
		System.out.println("Tu ordenador tiene un disco duro de " + discoDuro);	
			ordenador.setDiscoDuro(JOptionPane.showInputDialog("Que disco duro quieres agregar?"));
				System.out.println("Cambios realizados, estas son las caracteristicas de tu ordenador\n"
						+ ordenador.toString());
	
}
	
    public String ejecutandoPrograma(String ejecutar) {
    	return"\nEn estos momento se esta ejecutando: " + ejecutar + "\n";
    	
    }
    
    public String toString() {
    	
    	return  "El ordenador seleccionado es de la marca " + marca + ", modelo " 
    			+ modelo + ", un procesador " + procesador + ",\nuna capacidad Ram de " + ram
    			+ " y un disco duro con una capacidad de " + discoDuro + ".";
 
    }
   
 
}

	
