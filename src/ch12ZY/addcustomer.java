package ch12ZY;

public class addcustomer {
    public static void main(String[] args) {
        customer1 cus1=new customer1();
        cus1.name="王一";
        cus1.age=10;
        cus1.vip=true;
        customer1 cus2=new customer1();
        cus2.name="你好";
        cus2.age=20;
        cus2.vip=false;
        customer2 customer=new customer2();
        customer.addCustome(cus1);
        customer.addCustome(cus2);
        customer.RemoveStudent();
    }
}
