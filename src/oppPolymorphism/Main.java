package oppPolymorphism;

public class Main {
	//Substitutability
	public static void main(String[] args) {
		
//		Circle c1 = new Cylinder(5, 10);
//		
//		System.out.println(c1.toString() +" "+c1.getArea());
//		
//		Animal monAnimal = new Animal();
//        Animal monChien = new Chien();
//
//        monAnimal.faireDuBruit(); 
//        monChien.faireDuBruit();  
//		
		Shape s = new Shape("blue");
		System.out.println(s.getArea());
		System.out.println(s);
		
		Rectangle r1 = new Rectangle(12, 2, "red");
		
	System.out.println(r1.getArea());
		System.out.println(r1);
		
		
	}

}
