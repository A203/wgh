package cn.www.demo;

public class demo04 {

	int age;
	
	 void hello(){
		System.out.println("hello....");
	}
	
	 static String name="����";
			 
	//��̬������Ҳ��֮Ϊ�෽��
	static void hi(){
		System.out.println("hi....");
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		demo04 d=new demo04();
		//�����ǵ������Ժͷ�����ʱ��һ���ǵ���ĳ��ʵ����������Ի򷽷�
//		d.age=10;
//		d.hello();
		System.out.println(demo04.name);
		demo04.hi();

	}



	}


