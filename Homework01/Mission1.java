package mission1;

public class Mission1 {
   public static void main(String arg[]){
   Student s=new Student();
   s.name="Anna";
   s.tell();
   }
};
class Student{
	String name;
	public void tell(){
	System.out.println("Hello Anna");
	}
}
