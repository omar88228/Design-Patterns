import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import Entity.Address;
import Entity.Apartment;
import Entity.Estate;
import Entity.Garage;
import Entity.Villa;

public class Singleton {
	private int cunt = 1;
	private static Singleton singleton;
	private ArrayList<String> lista = new ArrayList<String>();

	private Singleton() {

	}

	public static Singleton getSingletion() {

		if (singleton == null) {
			singleton = new Singleton();
		}

		return singleton;

	}

	public void readFile() {

		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("./WebContent/info.csv"));
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

//	public Estate createEstate(Address address) {
//		String[] attributes = atributeSplit();
//
//		return new Estate(Integer.parseInt(attributes[0]), Integer.parseInt(attributes[1]),
//				Integer.parseInt(attributes[2]), address);
//
//	}



	public String[] atributeSplit() {

		String infoEstate = this.getLista().get(cunt);
		String[] attributes = infoEstate.split(",");

		return attributes;

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
