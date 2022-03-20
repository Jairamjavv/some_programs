import java.util.Scanner;

public class Main {
    public static int nthPoint(int N){
        // Using Dynammic Programming
        int[] steps = new int[N+1];
        steps[0] = 1;
        steps[1] = 1;
        for(int i=2;i<=N;i++){
            steps[i] = steps[i-1]+steps[i-2];
        }
        return (int) (steps[N]%Math.pow(10,4));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int in=0;
        in = scan.nextInt();
        System.out.println(nthPoint(in));
    }
}
