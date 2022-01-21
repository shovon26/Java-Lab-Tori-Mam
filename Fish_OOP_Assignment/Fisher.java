public abstract class Fisher {
    public String name;
    public int limit;
    public FishingTrip latest_trip;
    public Fisher(String name){
        this.name = name;
    }
    public Fisher(String name, int limit){
        this.name = name;
        this.limit = limit;
    }
    public String getName() {
        return name;
    }
    public int getLimit(){
        return limit;
    }
    public FishingTrip getTrip(){
        return latest_trip;
    }
    public void setTrip(FishingTrip trip){
        this.latest_trip = trip;
    }
    public abstract void fishCaught(Fish fish);
    public String toString(){
        String tmp = "";
        tmp += name + ", Limited to " + limit + " fish." + "\n" +
                "Latest Trip: During this FishingTrip, " + latest_trip.getTotal() +
                " total Fish were caught.";
        tmp += "\n";
        if(latest_trip.getAmount() == 0) tmp += "Sadly, the boat is empty.";
        return tmp;
    }
    public abstract String describeLatestTrip();
    public boolean equals(Object object){
        Fisher fisher = (Fisher) object;
        return (this.name == fisher.name && this.limit == fisher.limit);
    }
}
