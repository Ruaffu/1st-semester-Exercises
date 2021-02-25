class Datamatik{
	
	static Student[] students = new Student[10];

	public static void main(String[] args){
		
		students[0] = new Student("Christian", 35, false, 'A');
		students[1] = new Student("Bob", 30, false, 'A');
		students[2] = new Student("Nils", 19, false, 'B');
		students[3] = new Student("Anders", 41, false, 'A');
		students[4] = new Student("Hans", 45, false, 'B');
		students[5] = new Student("Hermione", 25, true, 'A');
		students[6] = new Student("Luna", 25, true, 'B');
		students[7] = new Student("Victoria", 28, true, 'B');
		students[8] = new Student("Snape", 25, false, 'A');
		students[9] = new Student("Harry", 22, false, 'B');

		printStudentName(students, 0);
		findStudentIndex(students, "Bob");
		findStudentIndex(students, "Snape");

  }

  	// b
  	public static String printStudentName(Student[] students, int index){

	    System.out.println("student at index "+ index + " is "+ students[index].name);

	    return students[index].name;
		
	}

	// c
	public static String findStudentIndex(Student[] students, String studentName){
		
		for (int i = 0; i < students.length; i++) {
			
			if (students[i].name.contains(studentName)) {
				System.out.println(students[i].name + " has an index of: " + i);
			}
			
		}
		return studentName;
		
	}

}