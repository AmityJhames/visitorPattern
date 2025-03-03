package visitorPattern;

public class TelcoPromo {
    public static void main(String[] args) {
        // Creating Telco instances
        TelcoSubscription smart = new Telco("Smart", 500, 15, false);
        TelcoSubscription globe = new Telco("Globe", 450, 10, true);
        TelcoSubscription ditto = new Telco("Ditto", 400, 8, true);

        // Creating visitor instances
        UsagePromo promo = new TelcoAllowance();
        UnliCallOffer unli = new UnliCallTextPackage();

        // Displaying data usage offers and prices
        System.out.println("Smart Data Usage Offer and price: " + smart.accept(promo));
        System.out.println("Globe Data Usage Offer and price: " + globe.accept(promo));
        System.out.println("Ditto Data Usage Offer and price: " + ditto.accept(promo));

        // Displaying unlimited call and text offers
        System.out.println("\nSmart unlimited calls and text package: " + smart.accept(unli));
        System.out.println("Globe unlimited calls and text package: " + globe.accept(unli));
        System.out.println("Ditto unlimited calls and text package: " + ditto.accept(unli));
    }
}
