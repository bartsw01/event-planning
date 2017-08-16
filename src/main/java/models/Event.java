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
    private String discountCode;
    private int discountedEventCost;


    public Event(String packageType, int numOfGuests, String food, String beverages, String entertainment){
        this.packageTypeName = packageType;
        this.eventNumOfGuests = numOfGuests;
        this.foodPackage = food;
        this.beveragePackage = beverages;
        this.entertainmentPackage = entertainment;
    }

    public String getPackageTypeName() {
        return packageTypeName;
    }

    public int getEventNumOfGuests() {
        return eventNumOfGuests;
    }

    public String getFoodPackage() {
        return foodPackage;
    }

    public String getBeveragePackage() {
        return beveragePackage;
    }

    public String getEntertainmentPackage() {
        return entertainmentPackage;
    }


    public Integer getPackageTypeCost() {

        if (packageTypeName.equals("wedding")) {
            packageTypeCost = 1000;
        } else if (packageTypeName.equals("corporate")) {
            packageTypeCost = 750;
        } else if (packageTypeName.equals("birthday")) {
            packageTypeCost = 500;
        } else if (packageTypeName.equals("reunion")) {
            packageTypeCost = 400;
        }

        return packageTypeCost;

    }

    public Integer getFoodPackageCost() {

        if (foodPackage.equals("steak dinner")) {
            foodPackageCost = 50;
        } else if (foodPackage.equals("chicken dinner")) {
            foodPackageCost = 25;
        } else if (foodPackage.equals("sandwiches")) {
            foodPackageCost = 10;
        }
        return foodPackageCost;

    }

    public Integer getBeveragePackageCost() {
        if (beveragePackage.equals("full bar")) {
            beveragePackageCost = 100;
        } else if (beveragePackage.equals("cash bar")) {
            beveragePackageCost = 20;
        } else if (beveragePackage.equals("no bar")) {
            beveragePackageCost = 5;
        }
        return beveragePackageCost;
    }

    public Integer getEntertainmentPackageCost() {


        if (entertainmentPackage.equals("live band")) {
            entertainmentPackageCost = 5000;
        } else if (entertainmentPackage.equals("dj")) {
            entertainmentPackageCost = 1000;
        } else if (entertainmentPackage.equals("background music")) {
            entertainmentPackageCost = 250;
        }
        return entertainmentPackageCost;

    }

    public Integer getEventCost() {

        eventCost = (((getFoodPackageCost() + getBeveragePackageCost()) * getEventNumOfGuests()) + getEntertainmentPackageCost() + getPackageTypeCost());
        return eventCost;

    }

    public Integer getDiscountedEventCost(String discountCode){
        if (discountCode.equals("guest250")){
            discountedEventCost = getEventCost()-1000;
        } else if (discountCode.equals("guest500")){
            discountedEventCost = getEventCost()-5000;
        } else if (discountCode.equals("guest1000")){
            return discountedEventCost = getEventCost()-getFoodPackageCost();
        }
        return discountedEventCost;
    }


}
