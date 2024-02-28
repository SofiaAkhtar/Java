public class EvenOrOdd {
    public static void main(String[] args) {
        EvenOrOdd checker = new EvenOrOdd();
        int numberToCheck = 7;
        checker.checkEvenOdd(numberToCheck);
    }

    public void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}
