package FileHandling;
import java.io.*;
import java.util.Scanner;

public class filehandling {
    public static void main(String args[]) throws Exception{

        CreateFile cf = new CreateFile();
        System.out.println("Enter file name to create");
        Scanner sc = new Scanner(System.in);
        String filename = sc.nextLine();
        System.out.println(filename+" file created");
        try{
            cf.create(filename);
        }
        catch (Exception e){
            System.out.println("Error");
        }
        sc.close();
        WriteFile wf = new WriteFile();
        
        try{
            wf.write(filename,"newline");
        }
        catch (Exception e){
            System.out.println("Error");
        }
        System.out.println("Reading file");
        ReadFile Rf = new ReadFile();
        Rf.read(filename);
        
        
    }
}


class CreateFile{
    public void create(String filename) throws Exception{
        File fileobject = new File(filename);
        fileobject.createNewFile();
    }

}

class WriteFile{
    public void write(String filename, String sentences) throws Exception{
        FileWriter wr = new FileWriter(filename);
        wr.write(sentences);
        wr.close();
    }
}

class ReadFile{
    public void read(String filename) throws Exception{
        File rd = new File(filename);
        Scanner myReader = new Scanner(rd);
        while(myReader.hasNextLine()) System.out.println(myReader.nextLine());
        myReader.close();
    }

}