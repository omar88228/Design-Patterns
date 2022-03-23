import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Singleton {
	private int cunt = 0;
	private static Singleton singleton;
	private static ArrayList<String> lista = new ArrayList<String>();

	private Singleton() {

	}

	public Singleton getSingletion() {

		if (singleton == null) {
			singleton = new Singleton();
		}

		return singleton;

	}

	public static ArrayList<String> readFile() {

		BufferedReader reader;
		try {
			reader = new BufferedReader(
					new FileReader("C:\\Users\\o.oueslati\\eclipse-workspace\\Immobile\\WebContent/info.csv"));
			String line = reader.readLine();
			while (line != null) {
				lista.add(line);

				line = reader.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(lista.get(1));

		return lista;

	}

}
