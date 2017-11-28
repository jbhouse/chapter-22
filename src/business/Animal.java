package business;

import java.util.function.Consumer;

public abstract class Animal {
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getNameAndType() {
		return this.getName()+" the "+this.getClass().getName().substring(9, this.getClass().getName().length());
	}
	
	public abstract void speak();
	
	protected void speak(Consumer<Animal> consumer) {
		consumer.accept(this);
	}

}
