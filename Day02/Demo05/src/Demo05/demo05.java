package Demo05;

public class demo05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int num=2;num<=50;num++){
		boolean flag=true;
		for(int i=2;i<num;i++){
			if(num%i==0){
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println(num+"\t");
			}
		}
				
	}
}
