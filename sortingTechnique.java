package EECS3311_Project1;
//@author Sheshan Verma STD No. 217631441	

//Singleton class which sorts the shapes according to their surface
//Reference : https://www.javatpoint.com/insertion-sort-in-java , https://stackoverflow.com/questions/23503921/java-insertion-sort-with-an-array-list-of-objects

import java.util.List;

public class sortingTechnique {
	private static sortingTechnique sorttech;

	private sortingTechnique() {

	}

	public static sortingTechnique getInstance() {
		if (sorttech == null) {
			sorttech = new sortingTechnique();
		}
		return sorttech;
	}

	public static void sort(Panel panel) {
		List<Shape> listshapes = panel.getShape();
		int array = listshapes.size();
		for (int i = 1; i < array; i++) {
			int j = i - 1;
			Shape temp = listshapes.get(i);
			listshapes.set(i, listshapes.get(i + 1));
			listshapes.set(i + 1, temp);
			while ((i > -1) && (listshapes.get(i).computeSurface() > temp.computeSurface())) {
				listshapes.set(j, listshapes.get(j + 1));
				j--;
			}
			listshapes.set(j + 1, temp);
		}
		panel.repaint();
	}

}
