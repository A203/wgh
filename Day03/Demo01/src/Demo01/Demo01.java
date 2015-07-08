package Demo01;

public class Demo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		Person p1=new Person("Jack",18);
		System.out.println(p1.name);

	}

}
class Person{
	String name;
	int age;
	Person(String n,int a)
	{
		name=n;
		age=a;
	}
	Person(){
		 System.out.println(1);}
	{
		System.out.println(2);
	}
}