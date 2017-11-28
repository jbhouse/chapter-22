package business;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}

	@Override
	public void speak() {
		super.speak(a -> System.out.println(a.getName()+": meow hiss"));
	}

}
