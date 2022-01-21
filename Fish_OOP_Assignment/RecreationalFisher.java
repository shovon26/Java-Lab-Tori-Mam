public class RecreationalFisher extends Fisher {
    public int grand_total;
    public RecreationalFisher(String name) {
        super(name,0);
        this.grand_total = 0;
    }
    public RecreationalFisher(String name, int limit){
        super(name, limit);
    }
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getLimit() {
        return super.getLimit();
    }

    @Override
    public FishingTrip getTrip() {
        return super.getTrip();
    }

    @Override
    public void setTrip(FishingTrip trip) {
        super.setTrip(trip);
    }

    @Override
    public void fishCaught(Fish fish) {
//        System.out.println(fish.getWeight());
        grand_total += 1;
//        System.out.println(grand_total);
    }
    public int getGrandTotal(){
        System.out.println("SDdsfssefsfd : " + grand_total);
        return this.grand_total;
    }
    @Override
    public String toString() {
        return super.toString() + "\nIn total, this Fisher has caught: " + latest_trip.getTotal() + " fish.";
    }

    @Override
    public String describeLatestTrip() {
        return toString();
    }
}
