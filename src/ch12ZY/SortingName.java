package ch12ZY;

import java.util.Arrays;

public class SortingName {
    //排序
    public void sort(String[] names){
        String staging;
        System.out.println("****排序前****");
        for (int i = 0; i < names.length; i++){

            System.out.print(names[i]+"\t   ");
        }
        //字符串数组排序
        /*for (int i = 0; i < names.length-1; i++){
            if(names[i].compareTo(names[i+1])>0){
                staging=names[i];
                names[i]=names[i+1];
                names[i+1]=staging;
            }
        }*/

        //字符串数组排序
        Arrays.sort(names, String::compareToIgnoreCase);
        for(String s: names){
            System.out.print(s + "  ");
        }

        System.out.println("\n****排序后****");
        for (int i = 0; i < names.length; i++){

            System.out.print(names[i]+"\t");
        }

    }

    public static void main(String[] args) {
        String[] names = {"Tom", "Jack", "Merry", "Smith", "Sunny"};
        SortingName sortingname = new SortingName();
        sortingname.sort(names);
    }
}
