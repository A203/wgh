package 多态练习;

public class Fruit {
	public String toString(){
		return "水果";
	}
}

class Apple extends Fruit{
	public String toString(){
		return "苹果";
	}
}
class Mango extends Fruit{
	public String toString(){
		return "芒果";
	}
}
class  Juicer{
	public void juice(Fruit fruit){
		System.out.println("榨"+fruit+"汁");
		}

	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Juicer j=new Juicer();
		
		Fruit fruit=new Mango();
		
		j.juice(fruit);
	}
}
//多态：父类的某一种类型在不同的子类中有不同的形态
