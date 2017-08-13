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

            System.out.println("The total cost of your event will be $" + totalCost + ".");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
