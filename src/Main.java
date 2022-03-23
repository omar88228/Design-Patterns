import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import Entity.Estate;

public class Main {

	public static void main(String[] args) {
		Singleton sing = Singleton.getSingletion();
		sing.readFile();
		Estate estate = sing.createEstate();
		System.out.println(estate);
	}
}
