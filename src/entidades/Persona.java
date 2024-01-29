package entidades;

public class Persona {
	//1 propiedades o atributos 
	public String nombre;
	public int edad;
	public String correo;
	public String telefono;

	
	//2. Constructor (con parámetros)
		public Persona(String nombre, int edad, String correo, String telefono) {
			this.nombre = nombre;
			this.edad = edad;   
			this.correo = correo;
			this.telefono = telefono;
		}
		
		//Sobrecarga de metodo(overloading)
		public Persona(String nombre, int edad, String correo) {
			this.nombre = nombre;
			this.edad = edad;
			this.correo = correo;
		}
		
		//Sobrecarga de metodo(overloading)
		public Persona(String nombre, int edad) {
			this.nombre = nombre;
			this.edad = edad;
			}//cierre de constructor 
		
	
	
	
  // 2.metodos 
	public void mostrarInformacion() {
		System.out.println("nombre" + nombre);
		System.out.println("edad" + edad);
		System.out.println("correo" + correo);
		System.out.println("telefono" + telefono);
	}// cierre mostrar informacion 
	
	//Metodo para convertir dolares a pesos (funcion que retorna flotantes)
    public float conversor(float conversionDolar) {
        float dolar = 16.50f;
        float conversion = dolar*conversionDolar;
        System.out.println(conversion);
        return conversion;
    }//cierre de conversor
	
	public static void main(String[]args) {
	//instancia de un objeto persona 
	Persona Felipe = new Persona ("felipe", 30,"felipemaqueda@edu.com.mx","5512345678");
	 Felipe.mostrarInformacion();
	 Persona lamberto = new Persona ("lamberto", 2,"lam@gmail.com", "33333333");
	 lamberto.mostrarInformacion();
	 Persona Gato = new Persona ("gato", 28,"gato@gmail.com", "33333333");
	 Gato.mostrarInformacion();
	 Persona Ale = new Persona ("Ale", 28,"ale@gmail.com", "33333333");
	 Ale.mostrarInformacion();
	 Persona Sara = new Persona ("sara", 28,"hola@gmail.com", "33333333");
	 Sara.mostrarInformacion();
	 
	 
				
		
	}// cierre del main

	}//cierre de clase de la persona 



	
	
	
	