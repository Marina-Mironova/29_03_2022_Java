public class Fibonacci {
    public static void main(String[] args) {
        //1 1 2 3 5 8 13 21

        printFibonacci(5);
        printFibonacci(-661);
    }
    public static void printFibonacci(int n){
        if(n<=0){
            return;
        }
        if(n>0){
            System.out.println(1);

        }
        if(n>1){
            System.out.println(1);


        }
        int num1=1;
        int num2=1;
        for (int i=3; i<=n;i++){
            int fibonacci=num1+num2;
            System.out.println(fibonacci);
            num1=num2;
            num2=fibonacci;
        }
    }
}
