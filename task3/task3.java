package part2.task3;
import java.io.File;
import java.io.FileNotFoundException;
import part2.task3.Exception.EmptyFileException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class task3 {
    public static void main(String[] args) {
        System.out.println(average(readFile(".\\part2\\task3\\data.txt")));
        return ;
    }

    static int[] readFile(String filename) {
        int[] arr = new int[100];
        Scanner scanner = null;
        try {
            File file = new File(filename);
            scanner = new Scanner(file);
            if(!scanner.hasNextLine()) {
                throw new EmptyFileException("文件为空");
            }
            int temp=0;
            int i=0;
            while(scanner.hasNextLine()) {
                temp = scanner.nextInt();
                arr[i] = temp;
                i++;
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("文件不存在");
        }
        catch(InputMismatchException e) {
            System.out.println("文件中出现无法解析为整数的内容");
        }
        catch(EmptyFileException e) {
            System.out.println(e.getMessage());
        }
        finally{
            if (scanner != null) {
                scanner.close();
            }
        }
        return arr;
    }

    static double average(int[] arr) {
        double sum=0;
        int count=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]!=0) {
                sum+=arr[i];
                count++;
            }
        }
        return sum/count;
    }
}

