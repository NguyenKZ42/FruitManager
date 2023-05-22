package advance.dev;

import java.util.List;

public interface IManager {
	void addFruit(Fruit fruit);
	void removeFruit(String name);
	void updateFruit(Fruit fruit, String newName, double newWeight, double newPrice);
	List<Fruit> getAllFruits();
	void sortFruitsByName();

}
