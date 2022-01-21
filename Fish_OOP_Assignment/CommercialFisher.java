public class CommercialFisher extends Fisher {
    public double grand_total;

    public CommercialFisher(String name, int limit) {
        super(name, limit);
        this.grand_total = 0;
    }
    public double getTotalValue(){
        return this.grand_total;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void fishCaught(Fish object) {
        grand_total += object.getValue();
    }

    @Override
    public String toString() {
        return super.toString() +"\nIn total, this Fisher has caught: $"+String.format("%.2f", this.grand_total) +" worth of fish." ;
    }

    @Override
    public String describeLatestTrip() {
        return "Total value of the Fish : " + getTotalValue();
    }
}