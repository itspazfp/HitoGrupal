
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Principal {

public static void main(String[] args) throws FileNotFoundException {
	File fichero = new File("coches.csv");
	Scanner lector = new Scanner(fichero);
	Scanner lectorT = new Scanner(System.in);
	
    Coche miCoche;
    
    System.out.print("PORFAVOR PONGA LOS DETALLES DEL COCHE QUE DESEA");
    
    System.out.print("Escribe la modelo del coche: ");
    String modelo = lectorT.nextLine();
    
    System.out.print("Escribe la marca del coche: ");
    String marca = lectorT.nextLine();
    
    System.out.print("Escribe la matricula del coche: ");
    String placa = lectorT.nextLine();
    
    Seguro miSeguro = new Seguro ("Luis", 2, 250);

    
    System.out.print("Escribe si es automatico (s/n): ");
    String tipo = lectorT.nextLine();
    if (tipo.charAt(0) == 's' || tipo.charAt(0) == 'S') {
        miCoche = new Auto(placa, marca, modelo, tipo, 0 , 0, miSeguro);
    } else {
        miCoche = new Manual(tipo, marca, modelo, placa , 0 , 0, miSeguro);
    }

    miCoche.acelerar(60);
    miCoche.frenar(10);
    if (miCoche instanceof Manual) {
        miCoche.cambiaMarcha(3);
        System.out.println("Es manual");
    } else {
        System.out.println("Es automatico");
    }
     
    System.out.println(miCoche.toString());
    
    
    System.out.println("DESEA CONSULTAR LOS DATOSANTIGUOS");
    String modo = lectorT.nextLine();
    if (modo.charAt(0) == 's' || modo.charAt(0) == 'S') {
    	System.out.println("Escriba el modelo que  busca");
    	System.out.println("Introduzca una letra");
    	String letra = lectorT.nextLine();

    	while (lector.hasNextLine()) {
    	String linea = lector.nextLine();
    	Scanner lectorLinea = new Scanner(linea);
    	lectorLinea.useDelimiter(";");


    	String tipo1 = lectorLinea.next();
    	String marca1 = lectorLinea.next();
    	String modelo1 = lectorLinea.next();
    	String placa1 = lectorLinea.next();
    	String velocidad1 = lectorLinea.next();
    	String marcha1 = lectorLinea.next();
    	String seguro1 = lectorLinea.next();
  

    	if(placa.startsWith(letra.toUpperCase()))  {


    		System.out.println("Placa: " + placa1);
    		System.out.println("Marca: " + marca1);
    		System.out.println("Modelo: " + modelo1);
    		System.out.println("Tipo: " + tipo1);
    		System.out.println("Seguro: " + seguro1);
    		System.out.println("Marcha: " + marcha1);
    		System.out.println("Velocidad: " + velocidad1);
    		System.out.println("\t");
    	System.out.println("--------------------------");
    	System.out.println("\t");
    	}

    	lector.close();
    	}
        
    }else {
    	System.out.println("Gracias.");
    }
    
   
  }
}

