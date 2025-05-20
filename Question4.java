public class Question4 {
    
    public static void main(String[] numbers) {
      //  int givenNumber =   Integer.parseInt(args[0]);
        int minNumber   =   0;
        for (String number : numbers) {
            int currentNumber   =  Integer.parseInt(number); 
            if(minNumber==0)
            {
                minNumber=currentNumber;
            }
            else if (minNumber>currentNumber)
            {
                minNumber=currentNumber;
            }
        }
        System.out.println("The Minimum number is"+minNumber);

    }
    
}
