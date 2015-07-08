package SanJiaoXingTuAn;
import java.util.Scanner;
public class sanjiaoxingtuan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.print("qingshuruhanghao:");
        int num=input.nextInt();
        
        for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=i;j++){
				System.out.println("*");
			}
			System.out.println();
			}

	}

}
