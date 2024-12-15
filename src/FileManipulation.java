import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FileManipulation {
    //   public class checkForAbsloterOrRelative(){
//        File f1= new File("myfile.doc");
//        System.out.println(f1.isAbsoute());
//        File f2=new File("C\\temp");
//        System.out.println("f2.isAbsolute()");
//        File f3=new File(\\directory\\file.xml);
//        System.out.println(f4.getAbsolutPath());

    //    }
    public void accessDirAndFile() {
        String path = "C:\\temp";
        File dir = new File(path);
        System.out.println(dir.isDirectory());
        File[] filesWithPath = dir.listFiles();
        System.out.println(Arrays.toString(filesWithPath));

    }

    public void useFileClassMethods() {
        String path = "C:/Users/Downloads/testingFile.txt";
        File f = new File(path);
        System.out.println("File Name: " + f.getName());
        System.out.println("File Path: " + f.getPath());
        System.out.println("Is path absolute: " + f.isAbsolute());
        System.out.println("Return Absolute path of the File " + f.getAbsolutePath());
        System.out.println("Return Parent folder of the given File " + f.getParent());
        System.out.println("File is Exist " + f.exists());
        System.out.println(f.exists() ? "Yes file exists" : "file does not exist");
        if (f.exists()) // return true or False
        {
            System.out.println("File is Found");
            System.out.println("IS file Readable " + f.canRead());
            System.out.println("IS file Writable " + f.canWrite());
            System.out.println("File size in a bytes " + f.length()); // file size in byte
        }


    }
    public void createANewFile() {
        try{
            File f=new File("C:/Users/Downloads/testingFile.txt");
            if(f.createNewFile())
            {
                System.out.println("File exists");

            }else{
                System.out.println("File does not exist");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void createADirectory() {
        File f=new File("C:/Users/Downloads/myDirectory");
        System.out.println(f.mkdirs());

    }
    public void readFileDirctory (){
        try{
           String File = new File ("C:/Users/Hema/Downloads/testingFile.txt");
            Scanner sc = new Scanner(File);
            String data = "";
            while(sc.hasNextLine()){
                data = sc.nextLine();
                System.out.println(data);
            }
        }catch (FileNotFoundException e){
            System.out.println("File does not exist");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
