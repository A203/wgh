package cn.www.h1;

public class A {

	//�����������η����εķ���
		public void methodA1() {
			System.out.println("public methodA1");
		}
		
		//˽�з���
		private void methodA2(){
			System.out.println("public methodA2");
		}
		
		//default��Χ�ķ�����ͬһ����Ҳ���Է��ʣ�System.out.println("public methodA1");
		void methodA3(){
			System.out.println("public methodA3");
		}
		
		//protected��ͬһ�����������׿��Է��ʣ�
		protected void methodA4(){
			System.out.println("public methodA4");
	}

}
