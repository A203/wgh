package ��ļ��غͶ���ʵ����;

public class demo07 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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