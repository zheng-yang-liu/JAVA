package ch15继承;

public class School {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        System.out.println();
        Teacher teacher2 = new Teacher("李四","宝典","软件2101");
        teacher2.ShowInfo();
    }
}
