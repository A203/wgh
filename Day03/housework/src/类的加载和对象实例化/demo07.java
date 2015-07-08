package 类的加载和对象实例化;

public class demo07 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Person2 p=new Person2(20);
		System.out.println(p.age);

	}

}


class Person2{
	Person2(int age){
		this.age=age;
	}
	{
		age=18;
	}
	int age;
}