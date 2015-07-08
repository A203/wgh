package 类的加载和对象实例化;

public class demo08 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(A.instance.num2);
		System.out.println(new A(1).num2);

	}

}

class A{
	static A instance=new A(1);
	static int num1=5;
	int num2;
	A(int num3){
		num2=num1-num3;
	}
}
