public class ValidateFields {
    public static void main(String[] args) {
        int[] ages = {34, 65, 56, 77, 45, 19, 3, 657, 7888};
        int smallestAge = ages[0];
        int secondSmallestAge = ages[0];
        for (int i : ages) {
            if (i < smallestAge) {
                smallestAge = i;
            }
        }
        for (int i : ages) {
            if (i < secondSmallestAge && i > smallestAge ) {
                secondSmallestAge = i;
            }
        }


        System.out.println("Smallest number must be " + smallestAge);
        System.out.println("Smallest number must be " + secondSmallestAge);


    }
}




