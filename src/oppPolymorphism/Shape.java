package oppPolymorphism;

public class Shape {
	private String color;
	
	public Shape(String color) {
		this.color = color;
		
	}
	
	public String toString() {
		
		return "Shape[color=" + color + "]";
	}
	
	public double getArea() {
		
		System.out.println("impossible to calculat the Area bc the Shape is unknown ");
		
		return 0;
	}

}
