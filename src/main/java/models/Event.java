package models;

public class Event {
    private String packageTypeName;
    private int eventNumOfGuests;
    private String foodPackage;
    private String beveragePackage;
    private String entertainmentPackage;
    private int packageTypeCost;
    private int foodPackageCost;
    private int beveragePackageCost;
    private int entertainmentPackageCost;
    private int eventCost;

    public Event(String packageType, int numOfGuests, String food, String beverages, String entertainment){
        this.packageTypeName = packageType;
        this.eventNumOfGuests = numOfGuests;
        this.foodPackage = food;
        this.beveragePackage = beverages;
        this.entertainmentPackage = entertainment;
    }


    public Integer calculateEventCost(){

        if (packageTypeName.equals("wedding")){
            packageTypeCost = 1000;
        } else if (packageTypeName.equals("corporate")){
            packageTypeCost = 750;
        } else if (packageTypeName.equals("birthday")){
            packageTypeCost = 500;
        } else if(packageTypeName.equals("reunion")){
            packageTypeCost = 400;
        }

        if (foodPackage.equals("steak dinner")){
            foodPackageCost = 50;
        } else if (foodPackage.equals("chicken dinner")){
            foodPackageCost = 25;
        } else if(foodPackage.equals("sandwiches")){
            foodPackageCost = 10;
        }
        if (beveragePackage.equals("full bar")){
            beveragePackageCost = 100;
        } else if (beveragePackage.equals("cash bar")){
            beveragePackageCost = 20;
        } else if(beveragePackage.equals("no bar")){
            beveragePackageCost = 5;
        }
        if (entertainmentPackage.equals("live band")){
            entertainmentPackageCost = 1000;
        }else if (entertainmentPackage.equals("dj")){
            entertainmentPackageCost = 500;
        } else if(entertainmentPackage.equals("background music")){
            entertainmentPackageCost = 100;
        }

        eventCost = (((foodPackageCost + beveragePackageCost)*eventNumOfGuests) + entertainmentPackageCost);
        return eventCost;
    }

}