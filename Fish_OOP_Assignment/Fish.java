public class Fish {
    FishType type;
    private double weight;
    private int age;
    public static double difference = 0.01;
    public Fish(FishType types, double weight, int age){
        this.type = types;
        this.weight = weight;
        this.age = age;
    }
    public double getWeight(){
        return this.weight;
    }
    public String getType(){
        return this.type.getDescription() + " $" + String.format("%.2f", type.getPrice()) + " (" + this.getAge() + ")";
    }
    public int getAge(){
        return this.age;
    }
    public double getValue(){
        return type.getPrice() * weight;
    }
    public boolean isValid(){
        return (age >= type.getRestriction());
    }

    @Override
    public String toString(){
        return  type.getDescription() +", " + String.format("%.2f", this.weight) + " pounds ($" + String.format("%.2f", getValue()) + "), "
                + (isValid() == true ? "This is a legal catch" : "We should release this fish");
    }
    public boolean equals(Fish fish){
        if(type.fish_type == fish.getType() &&
        Math.abs(weight - fish.weight) < difference &&
        isValid() == fish.isValid()) return true;
        else return false;
    }
}
