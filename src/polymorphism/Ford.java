package polymorphism;

public class Ford extends Car{
    public Ford(int cylinders, String name) {
		super(cylinders, name);
	}

	public String startEngine() {
		String s = this.getClass().getName() + " -> startEngine()" ;
		return s;
	}

	public String accelerate() {
		String s = this.getClass().getName() +" -> accelerate()";
		return s;
	}

	public String brake() {
		String s = this.getClass().getName() +" -> brake()";
		return s;
	}
}
