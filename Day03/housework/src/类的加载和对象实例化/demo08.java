package ��ļ��غͶ���ʵ����;

public class demo08 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
