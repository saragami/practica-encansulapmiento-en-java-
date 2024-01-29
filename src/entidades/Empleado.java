package entidades;

public class Empleado extends Persona{
	//1. atributos y propiedades 
	public String numEmpleado;
	public String nss;
	public String puesto;
	//2. constructor con parametros
	public Empleado(String nombre, int edad, String correo, String telefono, String numEmpleado, String nss,
			String puesto) {
		super(nombre, edad, correo, telefono);//super son los elementos heredados de persona
		this.numEmpleado = numEmpleado;
		this.nss = nss;
		this.puesto = puesto;
	}
	
	 
	//3. Metodo para imprimirInformacion empleado
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Correo: " + correo);
        System.out.println("Telefono: " + telefono);
        System.out.println("Numero Empleado: " + numEmpleado);
        System.out.println("Numero Seguro Social: " + nss);
        System.out.println("Puesto: " + puesto);
    }//cierre mostrarInformacin
	

}
