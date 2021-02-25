class Main{
	
	public static void main(String[] args){
		emptyLine();
		greeting("Hello");
		person("Christian",35);
	}


	// b
	public static void emptyLine(){
		System.out.println("");
		
	}
	
	// c
	public static void greeting(String param){
		System.out.println(param);
		
	}
	
	// d
	public static void person(String name, int age){
		System.out.println("My name is " +name+ ", I am " +age+ " years old");
		
	}
}