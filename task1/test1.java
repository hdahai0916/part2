package part2.task1;

public class test1{
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = (++a) + (b++);
        System.out.println(c);
        System.out.println(a + " " + b);
    }
}