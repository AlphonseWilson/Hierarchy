package javaPractice.Basics.UpAndDownCastingExample;

public class Show {

	public static void main(String[] args) {
		tree();
		//upCast();
		//downCast();

	}
	
	public static void tree() {
		Cat c = new Cat();
		System.out.println(c.health);
		System.out.println(c.description);
		System.out.println(c.type);
		
		System.out.println();
		Dog d = new Dog();
		System.out.println(d.health);
		System.out.println(d.description);
		System.out.println(d.type);
		
		
		System.out.println();
		Alligator a = new Alligator();
		System.out.println(a.health);
		System.out.println(a.description);
		System.out.println(a.type);
		
		System.out.println(a.move);
		
	}
	
	public static void upCast() {
	    Mammal m = (Mammal)new Cat();
	    System.out.println(m.description);

	}
	
	public static void downCast() {
		Cat c1 = new Cat();
		Animal a = c1;
		Cat c2 = (Cat) a;
	    System.out.println("cat1:"+c1.type+" cat2:"+c2.type);

	}

}
