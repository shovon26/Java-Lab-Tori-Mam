public class Main {
    public static void main(String args[]) {
        FishType fishType1;
        FishType fishType2;

        //Make some FishTypes:
        fishType1 = new FishType("Ayu, Sweetfish", "Common", 0.25, 1);
        fishType2 = new FishType("Bicolor Goatfish,", "Uncommon", 10, 2);

        Fish fish1 = new Fish(fishType1, 2.1, 3);
        Fish fish2 = new Fish(fishType1, 2.11, 1);
        Fish fish3 = new Fish(fishType1, 1.1, 0);
        Fish fish4 = new Fish(fishType2, 4.7, 2);
        Fish fish5 = new Fish(fishType2, 1.51, 1);
        Fish fish6 = new Fish(fishType2, 3.25, 5);

        Fisher fisher1 = new RecreationalFisher("Gabriel");
        Fisher fisher2 = new SportFisher("Jon", 2);
        Fisher fisher3 = new CommercialFisher("Frédéric", 5);

        FishingTrip trip1 = new FishingTrip(fisher1);
        FishingTrip trip2 = new FishingTrip(fisher2);
        FishingTrip trip3 = new FishingTrip(fisher3);

        //Print the Fishers:
        System.out.println("Created three Fisher instances, let's see how they look:");
        System.out.println("Fisher1: " + fisher1 + "\n");
        System.out.println("Fisher2: " + fisher2 + "\n");
        System.out.println("Fisher3: " + fisher3 + "\n");
        System.out.println();


        //RecreationalFisher
        //Catch some Fish for trip1, attached to a RecreationalFisher
        System.out.println("Catch a Fish for trip1, attached to a Recreational Fisher, they should all be false:");
        System.out.println("Trip1 is trying to catch a fish, can it be brought back? " + trip1.catchFish(fish1));
        System.out.println("Trip1 is trying to catch a fish, can it be brought back? " + trip1.catchFish(fish2));
        System.out.println();
        System.out.println("Fisher1 should now have two fish caught in total: \n" + fisher1 + "\n");

        System.out.println("Fisher1 grand total: " + ((RecreationalFisher)fisher1).getGrandTotal() + "\n");
//        FishType fishType1;
//        FishType fishType2;
//
//        //Make some FishTypes:
//        fishType1 = new FishType("Ayu, Sweetfish", "Common", 0.25, 1);
//        fishType2 = new FishType("Bicolor Goatfish,", "Uncommon", 10, 2);
//
//        Fish fish1 = new Fish(fishType1, 2.1, 3);
//        Fish fish2 = new Fish(fishType1, 2.11, 1);
//        Fish fish3 = new Fish(fishType1, 1.1, 0);
//        Fish fish4 = new Fish(fishType2, 4.7, 2);
//        Fish fish5 = new Fish(fishType2, 1.51, 1);
//
//        FishingTrip trip1 = new FishingTrip(5);
//        FishingTrip trip2 = new FishingTrip(99);
//        FishingTrip trip3 = new FishingTrip(15);
//
//
//        //Print the FishingTrips:
//        System.out.println("Created three FishingStrip instances, let's see how they look:");
//        System.out.println("Trip1: " + trip1);
//        System.out.println("Trip2: " + trip2);
//        System.out.println("Trip3: " + trip3);
//        System.out.println();
//
//
//
//        //Catch some Fish for trip1, for simplicity ignore the fact it is the same fish 6 times:
//        System.out.println("Trip1 is trying to catch a fish, can it be brought back? " + trip1.catchFish(fish1));
//        System.out.println("Trip1 is trying to catch a fish, can it be brought back? " + trip1.catchFish(fish1));
//        System.out.println("Trip1 is trying to catch a fish, can it be brought back? " + trip1.catchFish(fish1));
//        System.out.println("Trip1 is trying to catch a fish, can it be brought back? " + trip1.catchFish(fish1));
//        System.out.println("Trip1 is trying to catch a fish, can it be brought back? " + trip1.catchFish(fish1));
//        System.out.println("Trip1 is trying to catch a fish, can it be brought back? " + trip1.catchFish(fish1));
//        System.out.println();
//
//        //Catch some Fish for trip2:
//        trip2.catchFish(fish1);
//        trip2.catchFish(fish2);
//        trip2.catchFish(fish3);
//        trip2.catchFish(fish4);
//        trip2.catchFish(fish5);
//
//        //Catch some Fish for trip3, for simplicity ignore the fact it is the same fish 4 times:
//        trip3.catchFish(fish1);
//        trip3.catchFish(fish1);
//        trip3.catchFish(fish1);
//        trip3.catchFish(fish1);
//        trip3.catchFish(fish2);
//
//        System.out.println("Let's check the total value of the FishingTrips:");
//        System.out.printf("Trip1: $%.2f.\n", trip1.getTotalValue());
//        System.out.printf("Trip2: $%.2f.\n", trip2.getTotalValue());
//        System.out.printf("Trip3: $%.2f.\n", trip3.getTotalValue());
//        System.out.println();
//
//        System.out.println("Let's check the total weight of the FishingTrips:");
//        System.out.printf("Trip1: %.2f pounds.\n", trip1.getTotalWeight());
//        System.out.printf("Trip2: %.2f pounds.\n", trip2.getTotalWeight());
//        System.out.printf("Trip3: %.2f pounds.\n", trip3.getTotalWeight());
//        System.out.println();
//
//
//        System.out.println("Let's see how they look now:");
//        System.out.println("Trip1: " + trip1);
//        System.out.println();
//        System.out.println("Trip2: " + trip2);
//        System.out.println();
//        System.out.println("Trip3: " + trip3);
//        System.out.println();
//
//        // Try out releasing some fish
//        System.out.println("Time to try out releasing some fish:");
//        System.out.println("Release the fist invalid Fish in Trip2: " + trip2.releaseFish(2) );
//        System.out.println("Release the second invalid Fish in Trip2: " + trip2.releaseFish(3) );
//        System.out.println("Try to release an invalid Fish in Trip2: " + trip2.releaseFish(10) );
//        System.out.println();
//        System.out.println("Check Trip2: \n" + trip2 );
//        System.out.println();
//        System.out.println("Let's release all the Fish in Trip2" );
//        System.out.println();
//        trip2.releaseFish(0);
//        trip2.releaseFish(0);
//        trip2.releaseFish(0);
//        System.out.println("Check Trip2 again: \n" + trip2 );
//        System.out.println();
//
//        // Try out the equals method
//        System.out.println("Let's take the Equals method for a test drive:");
//        System.out.println("Are Trip1 and Trip2 equal? They should NOT be: " + trip1.equals(trip2) );
//        System.out.println("Are Trip1 and Trip3 equal? They should NOT be: " + trip1.equals(trip3));
//        trip3.catchFish(fish1);
//        trip3.releaseFish(trip3.getAmount()-1);
//        System.out.println("Are Trip1 and Trip3 equal? They should be now: " + trip1.equals(trip3) );
//        System.out.println();
    }
}
