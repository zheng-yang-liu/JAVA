package ch5;

public class zy5_1 {
    public static void main(String[] args) {
        int trainees = 2012;
        double initial = 25;
        while (initial <100) {
            initial = initial * (1+0.25);
            trainees++;
        }
        System.out.println("在"+trainees+"年到达100万人");
    }
}
