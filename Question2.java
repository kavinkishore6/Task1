public class Question2 {
    public static void main(String[] args) {
        int givenNumber =   Integer.parseInt(args[0]);
        int reversedNumber=0;
         while (givenNumber != 0) {
            int digit = givenNumber % 10;      
            reversedNumber = reversedNumber * 10 + digit;
            givenNumber= givenNumber / 10;                
        }
        System.out.println(reversedNumber);
    }
    
}
