public class Person {
	static String name;
	static float age;
	
	public Person(String name, float age) {
		super();
		Person.name = name;
		Person.age = age;
	}
	/**
	 * 
	 * setting name of person
	 */
	public void setName(String name) {
		Person.name=name;
	}
	/**
	 * 
	 * get name
	 */
	public String getName() {
		return name;
	}
	/**
	 * setting age of person
	 * 
	 */
	public void setAge(float age) {
		Person.age = age;
	}
	/**
	 * 
	 * get age of person
	 */
	public float getAge() {
		return age;
	}
	
}
