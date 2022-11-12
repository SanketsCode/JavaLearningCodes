package FunctionalProgramming;

class Superclass {

}

class Subclass extends Superclass {

}

class TestQuestion {

	static String name = "Apple";

	static TestQuestion getFruit() {

	System.out.println("Getting fruit ");

	return null;

	}

	public static void main(String[ ] args) {

	System.out.println( getFruit().name );

	}

}