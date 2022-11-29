package ch12;

public class StudentName {
    String[] names=new String[5];
    public void Addname(String name) {
//        添加学生姓名
        for (int i=0; i<names.length;i++){
            if(names[i]==null){
                names[i]=name;
                break;
            }
        }
    }

    public  void Showname(){
//        显示所有学生姓名
        for (int i=0; i<names.length;i++){
            System.out.println(names[i]);
        }
    }
}
