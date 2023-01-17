public class Main {
    public static void main(String[] args) {
        int S = 0;
        int [][] A = {{2,1,3,7}, {4,9,6,5}};
        for (int k = 0; k<=3;k++)
        {
            S = S + A[1][k] - A[0][k];
        }
        System.out.println(S);
    }
}