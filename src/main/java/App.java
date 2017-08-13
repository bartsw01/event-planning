import models.Event;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter event type:  wedding  corporate  birthday  reunion");
        try {
            String packageType = bufferedReader.readLine();
            System.out.println("How many guests expected?");
            int numOfGuests = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Please choose your meal package:  steak dinner  chicken dinner  sandwiches");
            String food = bufferedReader.readLine();
            System.out.println("Please choose your beverage package:  full bar  cash bar  no bar");
            String beverage = bufferedReader.readLine();
            System.out.println("Please choose your entertainment package:  live band  dj  background music");
            String entertainment = bufferedReader.readLine();

            Event newEvent = new Event(packageType, numOfGuests, food, beverage, entertainment);
            int totalCost = newEvent.getEventCost();

            if (numOfGuests >= 250 && numOfGuests <= 499){
                System.out.println("Based on the number of your guests, you are eligible for a discount. Please use discount code: guest250");
            } else if (numOfGuests >= 500 && numOfGuests <= 999){
                System.out.println("Based on the number of your guests, you are eligible for a discount. Please use discount code: guest500");
            } else if (numOfGuests >= 1000){
                System.out.println("Based on the number of your guests, you are eligible for a discount. Please use discount code: guest1000");
            }

            System.out.println("The total cost of your event will be $" + totalCost + ".");

            if (numOfGuests >= 250){
                System.out.println("Please enter your discount code to apply your discount to the total cost of your event");
                String discountCode = bufferedReader.readLine();
                System.out.println("This is the updated cost of your event after applying your discount. $"  + newEvent.getDiscountedEventCost(discountCode));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
