import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import Entity.Estate;
import Entity.Iestate;

public class Main {

	public static void main(String[] args) {
		Singleton sing = Singleton.getSingletion();
//		sing.readFile();
//		
//		Estate estate = sing.createEstate(sing.createAdress());
//		System.out.println(estate);
//		Estate estate1 = sing.createEstate(sing.createAdress());
//		System.out.println(estate);
		
		FactoryEstate factory = new FactoryEstate();
		Iestate estate = factory.getEstate(sing);
		Iestate estate1 = factory.getEstate(sing);
		System.out.println(estate.estateType());
		System.out.println(estate1.estateType());
		
	}
}
