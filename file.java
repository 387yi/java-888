package text_6_6;

import java.io.File;

public class file {
    public static void main(String[] args) {
        File f=new File("G:\\我的Java2.0");
        File[] fle=f.listFiles();
        for(File str:fle){
            if (f.isDirectory()){
                System.out.println(str);
            }
        }
    }
}
