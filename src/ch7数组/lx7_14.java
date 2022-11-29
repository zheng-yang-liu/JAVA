package ch7数组;
import java.util.*;
public class lx7_14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //原数组
        String[] music=new String[]{"Island","Ocean","Pretty","Sun"};
        String[] newMusic=new String[5];
        String musicname;
        System.out.print("插入前的数组为：");
        for(int i=0;i<music.length;i++){
            System.out.print(music[i]+" ");
        }
        for(int i=0;i<music.length;i++){
            newMusic[i]=music[i];
        }
        System.out.print("\n请输入歌曲名称：");
        musicname=scanner.nextLine();
        int index=newMusic.length;
        for(int j=0;j<newMusic.length;j++){
            if(newMusic[j].compareToIgnoreCase(musicname)>0){
                index=j;
                break;
            }
        }
        //数组后移
        for(int i=newMusic.length-1;i>index;i--){
            newMusic[i]=newMusic[i-1];
        }
        newMusic[index]=musicname;
        //显示完成的数组
        System.out.print("插入后的数组为：");
        for(int i=0;i<newMusic.length;i++){
            System.out.print(newMusic[i]+" ");
        }
    }
}
