package ch12;
//关联Stu；StudentManagement；ceshiAdd三个文件
public class ceshiAdd {
    public static void main(String[] args) {
        Stu stu1=new Stu();
        stu1.id=44;
        stu1.name="niaho";
        stu1.age=30;
        stu1.scores=78;
        Stu stu2=new Stu();
        stu2.id=45;
        stu2.name="zaijian";
        stu2.age=13;
        stu2.scores=34;
        //创建对象
        StudentManagement student1=new StudentManagement();
        student1.AddStudent(stu1);
        student1.AddStudent(stu2);
        student1.RemoveStudent();
    }
}
