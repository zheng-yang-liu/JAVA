package ch2;
import java.util.*; 
public class lx5 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int original=s.nextInt();
		
		int encryption=(original*10+5)/2+(int)3.14159;
		System.out.println(encryption);
		System.out.println("你好再见");
		System.out.println("你好");
	}

}
