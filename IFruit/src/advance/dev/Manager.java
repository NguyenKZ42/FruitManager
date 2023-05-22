package advance.dev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Manager implements IManager{
	private List<Fruit> fruits;

    public Manager() {
        fruits = new ArrayList<>();
    }

    public void addFruit(Fruit fruit) {
        fruits.add(fruit);
    }

    public void removeFruit(Fruit fruitToRemove) {
        fruits.removeIf(fruit -> fruit.getName().equals(fruitToRemove));
    }

    public void updateFruit(Fruit fruit, String newName, double newWeight, double newPrice) {
    	fruit.setName(newName);
		fruit.setWeight(newWeight);
		   fruit.setPrice(newPrice);
		    System.out.println("Fruit updated successfully!");
    }

    public List<Fruit> getAllFruits() {
    	 for (int i = 0; i < fruits.size(); i++) {
             System.out.println(fruits.get(i).toString());
    	 }
		return fruits;
    }

	@Override
	public void sortFruitsByName() {
		 Collections.sort(fruits, Comparator.comparing(Fruit::getName));
	}

	@Override
	public void removeFruit(String name) {
		fruits.removeIf(fruit -> fruit.getName().equals(name));
		
	}
	}