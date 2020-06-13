
public class Professor extends UniversityMember {
String officeLocation;

public Professor(String name, int age, String id, String officeLocation) {
	super(name,age,id);
	this.officeLocation =officeLocation;
	
}

public String getOfficeLocation() {
	return officeLocation;
}

public void setOfficeLocation(String officeLocation) {
	this.officeLocation = officeLocation;
}

@Override
public String toString() {
	return super.toString() + " Office: " + officeLocation;
	
}

@Override
public int hashCode() {
int hash =3;
hash = 13* hash + super.hashCode() +officeLocation.hashCode();
return hash;

}

@Override
public boolean equals(Object obj) {
	if (this == obj) return true;
	if (obj == null) return false;
	if (getClass()!=obj.getClass() ) return false;
	if (!super.equals(obj)) return false;
	Professor pf = (Professor) obj;
	return officeLocation.equals(pf.officeLocation);
}
}
