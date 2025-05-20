public class Question6 {
    public static void main(String[] args) {
        int n = 5;  

        for (int i = 1; i <= n; i++) {
            int num = 5;

            
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num--;
            }

            
            for (int k = i + 1; k <= n; k++) {
                System.out.print((num + 1) + " ");
            }

            System.out.println();
        }
    }
}
