import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import Entity.Address;
import Entity.Estate;

public class Singleton {
	private int cunt = 1;
	private static Singleton singleton;
	private  ArrayList<String> lista = new ArrayList<String>();

	private Singleton() {

	}

	public static Singleton getSingletion() {

		if (singleton == null) {
			singleton = new Singleton();
		}

		return singleton;

	}

	public  void readFile() {

		BufferedReader reader;
		try {
			reader = new BufferedReader(
					new FileReader("C:\\Users\\o.oueslati\\eclipse-workspace\\Immobile\\WebContent/info.csv"));
			String line = reader.readLine();
			while (line != null) {
				this.getLista().add(line);

				line = reader.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public Estate createEstate( ) {
		String infoEstate = this.getLista().get(cunt);
		String [] attributes=infoEstate.split(",");
		Address address = new Address(attributes[3], attributes[4], attributes[5], attributes[6],Integer.parseInt(attributes[7]) );
		cunt++;
		return new Estate(Integer.parseInt(attributes[0]), Integer.parseInt(attributes[1]), Integer.parseInt(attributes[2]), address);
		
	}

	public int getCunt() {
		return cunt;
	}

	public void setCunt(int cunt) {
		this.cunt = cunt;
	}

	public ArrayList<String> getLista() {
		return lista;
	}

	public void setLista(ArrayList<String> lista) {
		this.lista = lista;
	}
	
}
