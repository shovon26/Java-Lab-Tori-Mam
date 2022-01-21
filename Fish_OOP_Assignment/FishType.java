public class FishType {
    private String fish_name;
    public String fish_type;
    private double price;
    private int age_restrict;
    public static double difference = 0.005;
    public FishType(String fish_name, String fish_type, double price, int age_restrict){
        this.fish_name = fish_name;
        this.fish_type = fish_type;
        this.price = price;
        this.age_restrict = age_restrict;
    }
    public String getRarity(){
        return this.fish_type;
    }
    public double getPrice(){
        return this.price;
    }
    public int getRestriction(){
        return this.age_restrict;
    }
    public void changePrice(double P){
        this.price = P;
    }
    public String getDescription(){
        return this.fish_name + " (" + this.fish_type + ")";
    }
    public String toString(){
        return this.fish_name + " (" + this.fish_type + ")" + " $" + String.format("%.2f", this.price) + " " + "(" + this.age_restrict + ")";
    }
    public boolean equals(FishType Fish2){
        if(this.fish_name == Fish2.fish_name && this.fish_type == Fish2.fish_type
           && this.age_restrict == Fish2.age_restrict
           && Math.abs(this.price - Fish2.price) <= difference) return true;
        else return false;
    }
}
