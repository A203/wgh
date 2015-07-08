package 类的加载和对象实例化;

public class demo06 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new Person(); 
	}

}


class Person{
	Person(){
		System.out.println(1);
	}
	{
		System.out.println(2);
	}
}