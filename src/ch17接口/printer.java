package ch17接口;
//约定
public class printer {
    //墨盒
    Inbox inbox;
    //纸张
    Paper paper;

    //设置打印机墨盒inbox打印使用的墨盒
    public void getInbox(Inbox inbox) {
        this.inbox = inbox;
    }
    //打印使用的纸张
    public void getPaper(Paper paper){

        this.paper = paper;
    }
    //打印方法
    public void print(){
        System.out.println("我正在使用墨盒"+inbox.getColor()+"在"+paper.getsize()+"打印");
    }


}
