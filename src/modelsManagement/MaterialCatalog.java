package modelsManagement;

import java.util.TreeMap;

import exceptions.MaterialNotFoundException;
import interfaces.MaterialCatalogInterface;
import models.Material;

public class MaterialCatalog implements MaterialCatalogInterface {
	
	private TreeMap<String, Material> materialMap;
	
	public MaterialCatalog()
	{
		materialMap = new TreeMap<String, Material>();
	}
	
	public void addMaterial(Material newMaterial)
	{
		materialMap.put(newMaterial.getID(), newMaterial);
	}
	
	public TreeMap<String, Material> getMaterialMap() {
		return materialMap;
	}

	public int getNumberOfMaterials() {
		return materialMap.size();
	}
	
	public Material findMaterial(String title) throws MaterialNotFoundException {

		title = title.trim();

		for (Material nextMaterial : materialMap.values()) {
			if (nextMaterial.getTitle().equalsIgnoreCase(title)) {
				return nextMaterial;
			}
		}
		throw new MaterialNotFoundException();
	}
	
}
