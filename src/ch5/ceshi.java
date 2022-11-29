package ch5;

public class ceshi {
    public static void main(String[] args) {
        //2015年培养学员25万人，每年增长25%，请问按此增长速度，哪一年培训学员人数到达100万人？


                int sum = 2012;
                double i = 25;//初始化
                while(i<100){//判定式
                    sum++;//变化式
                    i = i+i*0.25;//重复代码
                }
                System.out.println(sum+"年的人数是："+i+"万人");

    }
}
