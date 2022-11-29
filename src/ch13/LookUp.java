package ch13;


public class LookUp {
    public static void main(String[] args) {
        //查找爱字出现了几次
        int count = 0;
        String s="我爱你中国，我爱你故乡！";

        for (int i = 0; i < s.length(); i++) {
            if(s.substring(i,i+1).equals("爱")){
                count++;
            }
        }
        System.out.println("爱字一共出现了"+count+"次");
    }
}

