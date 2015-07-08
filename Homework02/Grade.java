package erwei.demo;

public class Grade {
	public static void main(String[] args) { 
	   String[] course = { "C++", "Java", "Servlet", "JSP", "EJB" }; 
	       for (String x : course) 
	           System.out.printf("%4s",x + " "); 
	           System.out.println("\n"); 
	   //enter all grade 
	   int Grade[][]= new int[20][5]; 
	   for(int i=0;i<20;i++){ 
	       for(int j=0;j<5;j++){ 
	           Grade[i][j]=(int) (Math.random()*100); 
	           System.out.print(Grade[i][j]+"  "); 
	       }    
	       System.out.println(); 
	   }
	   System.out.println("\n各学生总成绩:");	 
	   //Total grade 
	   int allSumGrade[]=new int[20]; 
	   for(int i=0;i<20;i++){ 
	       int tempsum=0; 
	       for(int j=0;j<5;j++){ 
	           tempsum+=Grade[i][j]; 
	       } 
		   allSumGrade[i]=tempsum; 
	       //output  
	       System.out.print(allSumGrade[i]+" "); 
	   } 
       //Average grade	 
	       System.out.println("\n每门课程的平均分：");	 
	   double allAveGrade[]=new double[5]; 
	   for(int j=0;j<5;j++){ 
	   int temp=0; 
       for(int i=0;i<20;i++){ 
	       temp+=Grade[i][j]; 
	   } 
       allAveGrade[j]=temp/20.0; 
       //output 
       System.out.print(allAveGrade[j]+" "); 
      } 
	} 

}
