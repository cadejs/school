
public class UniversityMember extends Person {

	private String id;
	
	public UniversityMember(String name, int age, String id) {
		super(age,name);
		this.id =id;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
@Override
public boolean equals(Object obj) {
	if (this == obj) return true;
	if (obj == null) return false;
	if (getClass()!=obj.getClass() ) return false;
	if (!super.equals(obj)) return false;
	UniversityMember um = (UniversityMember) obj;
	return id.equals(um.id);
}
@Override
	public int hashCode() {
	int hash =11;
	hash = 31* hash + super.hashCode() + id.hashCode();
	return hash;
	
}

@Override
	public String toString() {
return super.toString() + " ID:" + id;

}
/*
 
	UniversityMember um1 = new UniversityMember ("sam", 23, "2222");
	UniversityMember um2 = new UniversityMember ("sam", 23, "2222");
	UniversityMember um3 = new UniversityMember ("carl", 22, "222234");
	UniversityMember um4 = new UniversityMember ("cody", 21, "24234232");
	System.out.println(um1.equals(um2));
	System.out.println(um1.equals(um3));
	System.out.println(um1);
	System.out.println(um1.hashCode());
	System.out.println(um2.hashCode());
	System.out.println(um3.hashCode());
//Double.valueof(3.4).hashcode()   bc double will need to be made to an int?
 * */
 

}
