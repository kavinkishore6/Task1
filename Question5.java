public class Question5 {
    
    public static void main(String[] args) {
        int givenPrice =   Integer.parseInt(args[0]);
        if(givenPrice<500)
        {
            System.out.println("Sorry no discount,the price is  "+givenPrice);

        }
        else if (givenPrice>=500 && givenPrice<=1000)
        {
            int discountedValue =   (givenPrice/100)*10;
            int newPrice    =   givenPrice-discountedValue;
            System.out.println("The Price after discount is  "+newPrice);
        }
        else if (givenPrice>1000)
        {
            int discountedValue =   (givenPrice/100)*20;
            int newPrice    =   givenPrice-discountedValue;
            System.out.println("The Price after discount is  "+newPrice);
        }


    }
    
}
