package ch2;

public class lx3 {

	public static void main(String[] args) {
		// 类型转换
		//第一次平均分
		double favg=81.29;
		//第二次平均分比第一次多2分
		double savg;
		int rise=2;
		savg =favg+rise;//自动类型转换
		System.out.println("第二平均分" + savg);
		
		
		
		//强制类型转换 语法（数据类型）表达式
		int b=(int)10.8;
		System.out.println(b);
	
	}

}
