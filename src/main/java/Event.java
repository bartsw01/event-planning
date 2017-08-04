public class Event {
    public String packageTypeName;
    public int eventNumOfGuests;
    public String foodPackage;
    public String beveragePackage;
    public String entertainmentPackage;
    public int packageTypeCost;
    public int foodPackageCost;
    public int beveragePackageCost;
    public int entertainmentPackageCost;
    public int eventCost;

    public Event(String packageType, int numOfGuests, String food, String beverages, String entertainment){
        packageTypeName = packageType;
        eventNumOfGuests = numOfGuests;
        foodPackage = food;
        beveragePackage = beverages;
        entertainmentPackage = entertainment;
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
