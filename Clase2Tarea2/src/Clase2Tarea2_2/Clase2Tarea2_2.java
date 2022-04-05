package Clase2Tarea2_2;

public class Clase2Tarea2_2 {  // clase integer1
 
	public static void main(String[] args) {
		// Creación de un integer usando el segundo constructor
		Integer num1= new Integer("125");
		
		//Creación de un integer usando el primero constructor
		Integer num2=new Integer("20");
		
	
		//Obtención del entero que almacena cada objeto integer
		// Si no hace esto,las lineas siguientes causarian error
		//de compliación
		int n1=num1.intValue();
		int n2=num2.intValue();
		System.out.println("Suma de "+n1+" y "+n2+" vale "+(n1 + n2));
		if (n1+n2>130)
			n1++;
		else
			n1--;
		System.out.println(n1);
	}

}


