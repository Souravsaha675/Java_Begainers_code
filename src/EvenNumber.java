public class EvenNumber {
    public static void main(String[] args) {
        int number = 4;
        int finishedNumber = 20;
        int evenNumber = 0;

        while (number <= finishedNumber && evenNumber < 5) {
            number++;
            if (!isEvenNumber(number))
                continue;
            evenNumber++;
            System.out.println("Even Number " + number);
        }
        System.out.println("Total even numbers found = " + evenNumber);
    }

    public static boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }
}
