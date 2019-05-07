package modelsManagement;

import java.util.Scanner;
import java.util.TreeMap;

import exceptions.DvdNotFoundException;
import models.Dvd;

public class DvdCatalog {
	
	
	static Scanner sc = new Scanner(System.in);
	
	private TreeMap<String, Dvd> dvdMap;
	
	public DvdCatalog()
	{
		dvdMap = new TreeMap<String, Dvd>();
	}

	public TreeMap<String, Dvd> getDvdMap() {
		return dvdMap;
	}
	
	public int getNumberOfDvds() {
		System.out.println("Total number of Dvd's");
		System.out.println(dvdMap.size());
		return dvdMap.size();
	}

	public void addDvd() {
		
		System.out.println("Dvd's id: ");
		String id = sc.nextLine();
		System.out.println("Dvd title: ");
		String title = sc.nextLine();
		System.out.println("Dvd's Library Branch: ");
		String branch = sc.nextLine();
		System.out.println("Dvd Director: ");
		String director = sc.nextLine();
		System.out.println("Catalog No: ");
		String catalogNo = sc.nextLine();
		System.out.println("Running time: ");
		int runningTime = sc.nextInt();
		sc.nextLine();
		
		Dvd dvd = new Dvd(id, title, branch, director, catalogNo, runningTime);
		
		dvdMap.put(dvd.getID(), dvd);
	}
	
	public void deleteDvd()
	{
		System.out.println("\nBy which way you want to delete a Dvd?");
		System.out.println("1. by name");
		System.out.println("2. by id (id is String)");
		System.out.print("\nYour choice:");
		int rmChoice = sc.nextInt();
		sc.nextLine();
		removeDvd(rmChoice);
	}
	public void removeDvd(int rmChoice)
	{
		if (rmChoice == 1)
		{
			System.out.println("Dvd name: ");
		    String name = sc.nextLine();
		    
			for (Dvd nextDvd : dvdMap.values()) {
				if (nextDvd.getTitle().equalsIgnoreCase(name))
				{
					dvdMap.remove(nextDvd);
					System.out.println("Dvd is removed ");
				}
			}
		}
		if (rmChoice == 2)
		{
			System.out.println("Dvd Id: (id is String) ");
		    String id = sc.nextLine();
		    
			for (Dvd nextDvd : dvdMap.values()) {
				if (nextDvd.getID().equalsIgnoreCase(id))
				{
//					dvdMap.remove(id, nextDvd);
					dvdMap.remove(id, nextDvd);

					System.out.println("Dvd is removed ");
				}
			}
		}
	}
	
	public void searchDvd() {
		System.out.println("\nBy which way you want to search a Dvd?");
		System.out.println("1. by name");
		System.out.println("2. by id (id is String)");
		System.out.print("\nYour choice:");
		int searchChoice = sc.nextInt();
		sc.nextLine();
		searchByChoice(searchChoice);
	}

	public void searchByChoice(int searchChoice) {
		if (searchChoice == 1) {
			System.out.println("Dvd name: ");
			String name = sc.nextLine();

			for (Dvd nextDvd : dvdMap.values()) {

				if (nextDvd.getTitle().equalsIgnoreCase(name)) {
					System.out.println("Dvd with Name: " + name);
					System.out.println(nextDvd);
				}
			}
		}
			if (searchChoice == 2) {

				System.out.println("Book Id: (id is String)");
				String id = sc.nextLine();

				for (Dvd nextDvd : dvdMap.values()) {

					if (nextDvd.getID().equalsIgnoreCase(id)) {
						System.out.println("Dvd with id: " + id);
						System.out.println(nextDvd.toString());
					}
				}

			}
	}

	public Dvd findDvd(String title) throws DvdNotFoundException {
		
		title = title.trim();
		
		for (Dvd nextDvd : dvdMap.values())
		{
			if (nextDvd.getTitle().equalsIgnoreCase(title)) {
				return nextDvd;
			}
		}
		throw new DvdNotFoundException();
	}
	
	public void printAllDvds () {
		
		for (Dvd nextDvd : dvdMap.values()) {
			System.out.println(nextDvd.toString());
		}
	}
}
