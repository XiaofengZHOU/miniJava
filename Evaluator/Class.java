class Point{
	// Point class
	String j;
	Int i=10;
	String s="tt";
	Int	test(){
		i=5;
	}
	static String test(Int i, String s){
		s="test";
		// comment
		this.test();
		/* multi line comment
		*/
	}
}

class Point1 extends Point
{
	static String test(){
	}
}
