package TestCase.CostingSupplierPortal;

import java.util.Random;

public class GeneratingCostingNumber {
    public static String Costing() {
        Random random = new Random();
        int Costing = 100000 + random.nextInt(900000);
        return String.valueOf(Costing);
    }
    public static void main(String[] args){
        String randomNumber = Costing();
        System.out.println(randomNumber);
    }


}
