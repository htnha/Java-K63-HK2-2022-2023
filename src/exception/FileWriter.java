package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWriter {
    public static void write(String fileName, String s) {
        File file = new File(fileName);
        try {
            PrintWriter out = new PrintWriter(file);
            out.println(s);
            out.close();
        }catch (FileNotFoundException e){
            System.out.println("Khong tim thay file");
        }
    }

    public static String read(String fileName){
        Scanner in = null;//káhegka sdgljasdg
        try {
            File file = new File(fileName);
            in = new Scanner(file);
            String result = "";
            while (in.hasNext()){
                String line = in.nextLine();
                result += line + "\n";
            }
            return result;
        } catch (FileNotFoundException e) {
            System.out.println("File khong tim thay");
            return "";
        } finally {
            if (in!= null) {
                in.close();
            }
        }
    }

    public static void main(String[]args){
        //write("abc.txt", "Hello K63");
        String ketQua = read("xyz.txt");
        System.out.println(ketQua);
    }
}
