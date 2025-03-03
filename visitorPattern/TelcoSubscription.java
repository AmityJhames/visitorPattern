package visitorPattern;
// TelcoSubscription interface
public interface TelcoSubscription {
    public String accept(UsagePromo promo);
    public String accept(UnliCallOffer unli);
    public String getTelcoName();
    public double getPromoPrice();
    public Integer getDataAllowance();
    public boolean getUnliCallText();
}
