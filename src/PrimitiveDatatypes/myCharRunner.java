package PrimitiveDatatypes;

public class myCharRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myChar  MyChar = new myChar('b');
		System.out.println(MyChar.isVowel());
		System.out.println(MyChar.isNumber());
		System.out.println(MyChar.isAlphabet());
		MyChar.printLowerCase();
		MyChar.printUpperCase();
	}

}
