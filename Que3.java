public class Que3 {
    public static void main(String[] args) {
        int largestNumber = findLargestNumber();
        System.out.println("The largest 4 digit number divisible by 10 and 13 is: " + largestNumber);
    }

    public static int findLargestNumber() {
        for (int i = 9999; i >= 1000; i--) {
            if (i % 10 == 0 && i % 13 == 0) {
                return i;
            }
        }
    return 0; 
    }
}
