import javax.swing.plaf.PanelUI;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FishingTrip {
    public static double difference = 0.1;
    private Fish[] fish;
    private int amount;
    private int total_fish;
    public Fisher fisher;
    public FishingTrip(int maxAmount){
        this.fish = new Fish[maxAmount];
        amount = 0;
        total_fish = 0;
    }
    public FishingTrip(Fisher fisher){
        this.fisher = fisher;
        this.fisher.latest_trip = new FishingTrip(fisher.limit);
    }
    public int getTotal(){
        return total_fish;
    }
    public int getAmount(){
        return amount;
    }
    public double getTotalValue(){
        double sum = 0.0;
        for(int i=0; i<amount; i++){
            sum += fish[i].getValue();
        }
        return sum;
    }
    public double getTotalWeight(){
        double sum = 0;
        for(int i=0; i<amount; i++){
            sum += fish[i].getWeight();
        }
        return sum;
    }

    public boolean catchFish(Fish newFish){
//        fisher.setTrip(fisher.latest_trip);
        total_fish++;
//        System.out.println("CallingcatchFish ::::: " + total_fish);
        if(fish==null){
            return false;
        }
        if(amount < fish.length){
            fish[amount++] = newFish;
            total_fish++;
            return true;
        }
        return false;
    }
    public Fish releaseFish(int index){
        if(index < 0 || index >= amount) return null;
        Fish newFish = fish[index];
        for(int i=index; i+1 < amount; i++){
            fish[i] = fish[i+1];
        }
        amount--;
        return newFish;
    }
    public String toString(){
        if(getTotal() == 0 || getAmount() == 0){
            String tmp = "";
            tmp += "During this FishingTrip, " + getTotal()
                    + " total Fish were caught." + "\n" +
                    "Sadly, the boat is empty.";
            return tmp;
        }
        else {
            String tmp = "";
            tmp += "During this FishingTrip, " + getTotal()
                    + " total Fish were caught. and " + getAmount()
                    + "/" + fish.length + " were brought back:" + "\n";
            for (int i = 0; i < amount; i++) tmp += "> " + fish[i].toString() + "\n";
            return tmp;
        }
    }
    public boolean equals(Object object){
        FishingTrip fishingTrip = (FishingTrip) object;
        if(Math.abs(this.getTotalValue() - fishingTrip.getTotalValue()) < difference
                && Math.abs(this.getTotalWeight() - fishingTrip.getTotalWeight()) < difference
                && this.amount == fishingTrip.amount && this.total_fish == fishingTrip.total_fish) return true;
        else return false;
    }
}
