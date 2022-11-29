package ch13;
import java.util.*;

/**
 * 排序字符串
 *
 * @author thexu
 * @date 2022/11/29
 */
public class SortingString {
    public static void main(String[] args) {
        String[] stringArray = { "Barbara", "James", "Mary", "John",
                "Patricia", "Robert", "Michael", "Linda" };
        Arrays.sort(stringArray, String::compareToIgnoreCase);
        for(String s: stringArray){
            System.out.print(s + "  ");
        }


    }
}
