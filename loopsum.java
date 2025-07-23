package javalabs;

public class loopsum {

    public static void main(String[] args) {
        System.out.println("Odd numbers from 1 to 50:");

        for (int i = 1; i <= 50; i++) {
        	
            if (i % 2 == 0) {
                continue;
            }
            
            System.out.print(i + " ");
        }
    }
}
