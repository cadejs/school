
public class Person {
protected int age;
protected String name;


public Person(int age, String name) {
	//super();
	this.age = age;
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

@Override
	public int hashCode() {
	//small prime number hash
	int hash = 7;
	hash = 13 * hash +name.hashCode();
	hash = 13 * hash + age;
	return hash;
	//everything thats used in equality test shoudl show up in hashcode test
}


@Override
	public boolean equals(Object obj) {
	if (this == obj) return true;
	if (obj == null) return false;
	if (getClass()!=obj.getClass() ) return false;
	//cast to type of each class
	Person p = (Person) obj;
	//only part unique where you pick all relevant variable
	return age == p.age && name.equals(name);
}

@Override
public String toString() {
	
	return " Name: "+ name + " Age: "+ age;
}

	
	
}
