package recursion;

public class Recursion {
    public static void main(String[] args) {
        task64(9);

        int a = task66(4, 8);
        System.out.println(a);

        int b = task68(3, 2);
        System.out.println(b);
    }

    private static void task64(int number){
        if(number == 1){
            System.out.println(number);
            return;
        }

        System.out.println(number);
        task64(number - 1);
    }

    private static int task66(int m, int n){
        if((m + 1) == n){
            return m + (m + 1);
        }
        return m + task66(++m, n);
    }

    private static int task68(int n, int m) {
        if (n==0)
            return m+1;
        else
        if ((n!=0)&&(m==0))
            return task68(n-1,1);
        else
            return task68(n-1, task68(n,m-1));
    }
}
