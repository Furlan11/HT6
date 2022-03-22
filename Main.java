import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
MapFactory fabrica= new MapFactory();
lector lector= new lector();
Scanner teclado= new Scanner(System.in);	
boolean pase= true;

System.out.println("ingrese la ruta del archivo ");
String ruta=teclado.nextLine();
ArrayList<String> listaProductos=lector.Leer(ruta);
Map<String, ArrayList<String>> mapa = null;

System.out.println("Menu \n"
		+ "1.TreeMap\n"
		+ "2. HashMap\n"
		+ "3. LinkedHashMap \n"
		
		);
int op1=teclado.nextInt();
if(op1==1) {
	 mapa= fabrica.crear(op1);
}
if(op1==2) {
 mapa= fabrica.crear(op1);
}
if(op1==3) {
	 mapa= fabrica.crear(op1);
}

for(String i : listaProductos) {
	String llave="";
	String valor="";
	Set llaves=mapa.keySet();
	ArrayList<String> Plista= new ArrayList<>();
	for(int j=0; j<i.length();j++) {
		
		if(String.valueOf(i.charAt(j)).equals("|")) {
		llave=i.substring(0, j-1);
		valor=i.substring(j+1,i.length()-1);
		boolean condicion=llaves.contains(llave);
		if(condicion==false) {
			mapa.put(llave, Plista);
			
		}
		
		Plista=mapa.get(llave);
		Plista.add(valor);
		mapa.remove(llave);
		mapa.put(llave, Plista);
		
		}
		
		
	}
	
}
while(pase==true) {
	System.out.println("Menu \n"
			+ "1.salir\n"
			+ "2. agregar producto\n"
			+ "3. ver categoria de producto \n"
			+ "4. ver categoria y numero de producto \n"
			+ "5. ver inventario  \n"
			
			);
	int op2=teclado.nextInt();
	System.out.println("");
	
	if(op2==1) {
		pase=false;
	}
	
	if(op2==2) {
		System.out.print(" ingrese el nombre del producto ");
		String producto=teclado.nextLine();
		
		System.out.println("");
		teclado.nextLine();
		
		System.out.print(" ingrese el nombre del producto ");
		String llaveP=teclado.nextLine();
		
		
		if(mapa.containsKey(llaveP)==true) {
			System.out.print("llego");
			ArrayList<String> Plista1= new ArrayList<>();
			Plista1=mapa.get(llaveP);
			System.out.println(Plista1.size());
			Plista1.add(producto);

			mapa.remove(llaveP);
			mapa.put(llaveP, Plista1);
			
		}
		else {
			System.out.println("La categoria no se encontro");
			
		}
		
		
		
	}
	if(op2==3) {
		System.out.println("");
		teclado.nextLine();
		
		System.out.print(" ingrese el nombre del producto ");
		String producto=teclado.nextLine();
		
		
		if(mapa.containsValue(producto)==true) {
			Set<String> llaves=mapa.keySet();
			for(String i: llaves) {
				ArrayList<String> Plista1= new ArrayList<>();
				Plista1=mapa.get(i);
				for(String j : Plista1) {
					if(producto.equals(j)) {
						System.out.println("la categoria del producto indicado es "+ i);
						break;
					}
				}
				
				
				
			}
		}}
	
	if(op2==4) {
		System.out.println(" ingrese el nombre del producto ");
		String producto=teclado.nextLine();
		String llave1="";
		int contador=0;
		if(mapa.containsValue(producto)==true) {
			Set<String> llaves=mapa.keySet();
			for(String i: llaves) {
				ArrayList<String> Plista1= new ArrayList<>();
				Plista1=mapa.get(i);
				 contador=0;
				for(String j : Plista1) {
					if(producto.equals(j)) {
						llave1=i;
						contador=contador+1;
						break;
					}
				}
				
				
				
			}
		}
		System.out.println("La categoria del producto es "+ llave1);
		System.out.println("La cantidad del producto es "+ contador);
		}
	
	if(op2==5) {
		Set<String> llaves=mapa.keySet();
		for(String i: llaves) {
			ArrayList<String> Plista1= new ArrayList<>();
			Plista1=mapa.get(i);
			System.out.println("de la categoria"+ i +" hay los siguientes productos:");
			System.out.println("");
			for(String j : Plista1) {
				System.out.print(j);
				System.out.println("");
				}
			}
			
			
			
		}
		
	}
	
	
	
}
}
	

