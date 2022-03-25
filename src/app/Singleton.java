package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Singleton {

	private static Singleton singleton;
	private ArrayList<String> lista = new ArrayList<String>();

	private Singleton() {
		readFile();
	}

	public static Singleton getInstance() {
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
			System.out.println(e);
			System.out.println("#########################");
			System.out.println(e.getMessage());
			System.out.println("#########################");
			System.out.println(e.getStackTrace());
			
		}
	}

	public ArrayList<String> getLista() {
		return lista;
	}

}
