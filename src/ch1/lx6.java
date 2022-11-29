package ch1;

import java.util.*;  

public class lx6 {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("输入你java成绩：");  
		int java = inp.nextInt();
		System.out.print("输入你sql成绩：");  
		int sql = inp.nextInt();
		System.out.print("输入你html成绩：");  
		int html = inp.nextInt();
		System.out.println("java成绩：" + java + "  sql成绩" + sql +"	html成绩" +html); 
		inp.close();  
		int diffen;
		double avg;
		diffen = java-sql;
		avg =(java+sql+html)/3;
		System.out.println("java和sql成绩差："+diffen);
		System.out.println("平均差："+avg);
		

	}

}
