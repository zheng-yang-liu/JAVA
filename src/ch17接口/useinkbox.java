package ch17接口;

public class useinkbox {
    public static void main(String[] args) {
        printer print = new printer();
        Inbox inbox=null;
        Paper paper=null;

        //使用黑白墨盒
        inbox=new blackPaper();
        paper=new A4paper();
        print.getInbox(inbox);
        print.getPaper(paper);
        print.print();
        //使用彩色墨盒打印
        inbox=new ColorInbox();
        paper=new B5paper();
        print.getInbox(inbox);
        print.getPaper(paper);
        print.print();
    }

}
