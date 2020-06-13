
public class PersonDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* 
		 * 
		 * The Driver class will contain a main method to enable you to test your implementation of the
classes above. As part of your testing, create an array of objects of type Person, put at least one
Person, UniversityMember, Professor, and Student in the list, then loop over the list and
call each object's toString method. Test your equals() and hashCode() methods on some
equal and unequal objects.
		 * 
		 * 
		 * */
	
	
	
	Person[] loop = new Person[8];
	
	Person p1 = new Person(21,"sam");
	Person p2 = new Person(21,"sam");
	UniversityMember m1 = new UniversityMember( "cody",25, "22002");
	Student s1 = new Student( "cody",25, "22222",2.0);
	Student s2 = new Student( "sammy",21, "22275",3.0);
	Professor pr1 = new Professor( "Dr. prof",40, "22422","118");
	Professor pr2 = new Professor( "Dr. math",45, "22426","120");
	
	//loop[0] = Person(21, sam );
	loop[0] = p1;
	loop[1] = p2;
	loop[2] = m1;
	loop[3] = s1;
	loop[4] = pr1;
	loop[5] = p1;
	loop[6] = pr2;
	loop[7] = s2;
	
	for(int i=0; i<loop.length;i++) {
		System.out.println(loop[i].toString());
		}
	System.out.println(p1.equals(p2));
	System.out.println(pr2.equals(pr1));
	System.out.println("Next two hash should be equal with final two unequal");
	System.out.println(p1.hashCode());
	System.out.println(p2.hashCode());
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	}

}
