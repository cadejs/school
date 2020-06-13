
public class Student extends UniversityMember {
	double gpa;
	
	public Student(String name, int age, String id, double gpa) {
		super(name, age, id);
		this.gpa = gpa;
		
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

@Override
public String toString() {
	return super.toString() + " GPA:" + gpa;
	
}

@Override
public int hashCode() {
int hash =7;
hash = 23* hash + super.hashCode() +Double.valueOf(gpa).hashCode();
return hash;

}

@Override
public boolean equals(Object obj) {
	if (this == obj) return true;
	if (obj == null) return false;
	if (getClass()!=obj.getClass() ) return false;
	if (!super.equals(obj)) return false;
	Student sd = (Student) obj;
	
	//should i be setting all of them here?
	return gpa ==sd.gpa;
}


}
