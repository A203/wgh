package Phone;

public class Phone1 {
	String name;
	String brand;
	int price;
	void call()
	{
	   System.out.println("��绰");
	}
	void sendMsg()
	{
		System.out.println("������");
	}

	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Phone1 p=new Phone1();
	p.name="note";
	p.brand="ƻ��";
	p.price=5999;
	p.call();
	p.sendMsg();
	System.out.println(p.name);
			
		

	}

}
