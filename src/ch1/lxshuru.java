package ch1;
import java.util.*;  
public class lxshuru {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("输入你的姓名：");  
		String name = s.nextLine();  
		System.out.print("输入你的年龄：");  
		int age = s.nextInt();  
		System.out.println("姓名：" + name + "  年龄：" + age );  
		s.close();         //若没有关闭Scanner对象将会出现警告  

	}

}
