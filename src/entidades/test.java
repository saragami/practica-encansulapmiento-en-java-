package entidades;

public class test {
	public static void main (String []args) {
		Empleado EvilFelipe = new Empleado("Evil Felipe", 31, "evilFelipe@gmail.com", "555-333-4444", "ABC123", "90876567389", "Bell Boy");
		Persona Naruto = new Persona ("Naruto", 30, "mariana@gmail.com", "90876567389");
		
		Naruto.mostrarInformacion();
		EvilFelipe.mostrarInformacion();
		
		
		//instancia de un cliente
		System.out.println();
		System.out.println("instancia de un cliente");
		
	Cliente Jesus = new Cliente ("jesus gonzales", "abcds1234", 12233335.00f, "12345");
	    Jesus.mostrarInfoCliente();
	 
	 //modificacion de los atributos
	    
	    Jesus.nombre ="evil Felipe";
	    //Jesus.setSaldo(0.00f);
	    
	    //impresion de objeto ya modificado
	    System.out.println(); //espacio
	    Jesus.mostrarInfoCliente();
	 
				
	}

}
