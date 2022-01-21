public class SportFisher extends RecreationalFisher {
    public double total_weight;

    public SportFisher(String name, int limit) {
        super(name, limit);
        this.total_weight = 0;
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
    public double getTotalWeight(){
        return this.total_weight;
    }

    @Override
    public void setTrip(FishingTrip trip) {
        super.setTrip(trip);
    }

    @Override
    public void fishCaught(Fish object) {
        super.fishCaught(object);
    }

    @Override
    public String toString() {
        return super.toString() + "\nIn total, this Fisher has caught: " + String.format("%.2f", this.total_weight)+" pounds of fish.";
    }

    @Override
    public String describeLatestTrip() {
        return super.toString();
    }
}