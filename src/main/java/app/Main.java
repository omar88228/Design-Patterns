package app;

import java.util.*;
import builder.*;
import entity.*;

public class Main {

	public static void main(String[] args) {
		int surface = 0;
		int localNumber = 0;
		int floor = 0;
		int numberOfSwimmingpools = 0;
		String gateType = null;
		String type = null;
		String street = null, city = null, province = null, region = null;
		int cap = 0;
		Singleton sing = Singleton.getInstance();
		Immobile immobile = null;
		BuilderImmobile builder = new BuilderImmobile();
		BuilderAddress builderAddress = new BuilderAddress();
		ArrayList<String> attributeList = sing.getList();
		String[] attributesName = attributeList.get(0).split(",");

		for (int i = 1; i < attributeList.size(); i++) {
			String[] attributes = attributeList.get(i).split(",");

			for (int j = 0; j < attributes.length; j++) {
				if (attributesName[j].equals("surface")) {
					surface = Integer.parseInt(attributes[j]);

				}
				if (attributesName[j].equals("localNumber")) {
					localNumber = Integer.parseInt(attributes[j]);
				}
				if (attributesName[j].equals("floor") && !attributes[j].isBlank()) {
					floor = Integer.parseInt(attributes[j]);
				}
				if (attributesName[j].equals("type")) {
					type = attributes[j];

				}
				if (attributesName[j].equals("street")) {
					street = attributes[j];

				}
				if (attributesName[j].equals("city")) {
					city = attributes[j];

				}
				if (attributesName[j].equals("province")) {
					province = attributes[j];

				}
				if (attributesName[j].equals("region")) {
					region = attributes[j];

				}
				if (attributesName[j].equals("cap")) {
					cap = Integer.parseInt(attributes[j]);

				}
				if (attributesName[j].equalsIgnoreCase("numberOfSwimmingpools") && !attributes[j].isBlank()) {
					numberOfSwimmingpools = Integer.parseInt(attributes[j]);

				}
				if (attributesName[j].equals("gateType")) {
					gateType = attributes[j];

				}
			}
			Address address = builderAddress.cap(cap).city(city).street(street).region(region).province(province)
					.build();

			if (type.equalsIgnoreCase("VILLA")) {

				immobile = builder.address(address).gateType(gateType).localNumber(localNumber)
						.numberOfSwimmingpools(numberOfSwimmingpools).surface(surface).type(type).buildVilla();

			}
			if (type.equalsIgnoreCase("GARAGE")) {

				immobile = builder.address(address).gateType(gateType).localNumber(localNumber).surface(surface)
						.type(type).buildGarage();

			}
			if (type.equalsIgnoreCase("APARTMENT")) {

				immobile = builder.address(address).floor(floor).localNumber(localNumber).surface(surface).type(type)
						.buildAppartment();

			}
			System.out.println(immobile.estateType());
		}

	}

}