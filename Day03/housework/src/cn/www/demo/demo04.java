package cn.www.demo;

public class demo04 {

	int age;
	
	 void hello(){
		System.out.println("hello....");
	}
	
	 static String name="张三";
			 
	//静态方法，也称之为类方法
	static void hi(){
		System.out.println("hi....");
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		demo04 d=new demo04();
		//当我们调用属性和方法的时候，一定是调用某个实例对象的属性或方法
//		d.age=10;
//		d.hello();
		System.out.println(demo04.name);
		demo04.hi();

	}



	}


