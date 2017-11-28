package business;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	@Override
	public void speak() {
		super.speak(a -> System.out.println(a.getName()+": bark woof"));
	}

}
