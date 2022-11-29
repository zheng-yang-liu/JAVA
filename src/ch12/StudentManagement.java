package ch12;
//关联Stu；StudentManagement；ceshiAdd三个文件
public class StudentManagement {
    //创建一个来自对象的数组
    Stu[] stus=new Stu[10];

    //添加学生
    public void AddStudent(Stu stu){
        for (int i = 0; i < stus.length; i++) {
            if(stus[i] == null){
                stus[i]=stu;
                break;
            }
        }
    }

    //显示学生信息
    public void RemoveStudent(){
        System.out.println("本班学生列表：");
        for (int i = 0; i < stus.length; i++) {
            if(stus[i] != null){
                //用Stu类的显示信息的方法进行输出显示
                stus[i].ShowInfo();
            }
        }
    }
}
