package edu.pitt.cs;

public class CatImpl implements Cat {

	// TODO: Fill in with member variables
	private int id;
	private String name;
	private boolean isrented;

	public CatImpl(int id, String name) {
		this.id = id;
		this.name = name;
		isrented = false;
	}

	public void rentCat() {
		isrented = true;
	}

	public void returnCat() {
		isrented = false;
	}

	public void renameCat(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public boolean getRented() {
		return isrented;
	}

	public String toString() {
		return "ID " + id + ". " + name;
	}

}