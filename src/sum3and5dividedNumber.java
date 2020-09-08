public class sum3and5dividedNumber {
    public static void main(String[] args) {
        int count=0;
        int sum=0;

        for(int i=1;i<=1000;i++){
            if((i%3==0)&&(i%5==0)&&count<5){
                sum+=i;
                System.out.println("Found Number = "+i);
                count++;
            }
        }
        System.out.println("Sum = "+sum);
    }
}
