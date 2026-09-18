package part2.task2;

public class task2 {
    public static void main(String[] args) {
        int n=7;
        print(n);
        return ;
    }
    // 2.1
    static boolean isLeapYear(int year) {
        if(year%4==0&&year%100!=0)
            return true;
        else if(year%400==0)
            return true;
        else
            return false;
    }
    //2.2
    static void print(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=0;j<n;j++){
                if((j==Math.abs((n+1)/2-i))||(j==n-(n+1)/2+i-1)||j==(n-i+(n+1)/2-1))
                    System.out.print("*");
                else
                    System.out.print(" ");
                }
                System.out.println();
        }
    }
    //2.3
    //循环
    static int fibonacci1(int n) {
        int temp1=1,temp2=1,temp3=0;
        for(int i=3;i<=n;i++) {
            temp3=temp1+temp2;
            temp1=temp2;
            temp2=temp3;
        }
        if(n==1||n==2)
            return 1;
        else
        return temp3;
    }
    //递归
    static int fibonacci2(int n) {
        if(n==1||n==2)
            return 1;
        else
            return fibonacci2(n-1)+fibonacci2(n-2);
    }

}
