package interfaces;

import java.util.TreeMap;

import exceptions.MaterialNotFoundException;
import models.Material;

public interface MaterialCatalogInterface {
	
	public void addMaterial(Material newMaterial);
	public TreeMap<String, Material> getMaterialMap();
	public Material findMaterial(String title) throws MaterialNotFoundException;
	public int getNumberOfMaterials();
	
}
