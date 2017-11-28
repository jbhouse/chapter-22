package business;

public class Turtle extends Animal {
	
	public Turtle(String name) {
		super(name);
	}
	
	public void turtleSpeak() {
		System.out.println("*waves* due to lack of vocal chords");
	}

	@Override
	public void speak() {
		super.speak(a -> System.out.println(a.getName()+" *waves* since turtles don't have vocal chords"));
	}
}
