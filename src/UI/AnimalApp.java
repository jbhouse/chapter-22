package UI;

import java.util.ArrayList;
import java.util.List;

import business.Animal;
import business.Cat;
import business.Dog;
import business.Turtle;

public class AnimalApp {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<>();
		animals.add(new Dog("dogo"));
		animals.add(new Cat("kitcat"));
		animals.add(new Turtle("turt"));
		animals.stream().forEach(a -> {
			System.out.println(a.getNameAndType());
			a.speak(); 
			});
	}


}
