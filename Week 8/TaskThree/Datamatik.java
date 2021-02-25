class Datamatik{
	
	public static void main(String[] args){
		Teacher myTeacher = new Teacher("Tess", 47, true);
		Student student1 = new Student("Christian", 35, false, "Team A");
		Student student2 = new Student("Peter", 20, false, "Team A");


		System.out.println("Teacher: " + myTeacher.name);

		System.out.println("The students names are: "+student1.name+" and "+student2.name + "\nThey are both members of " + 
							student1.datamatikerTeam);


	}
	
}