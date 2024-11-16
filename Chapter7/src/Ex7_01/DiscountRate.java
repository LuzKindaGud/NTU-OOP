package Ex7_01;

public class DiscountRate {
    private static double serviceDiscoutPremium = 0.2;
    private static double serviceDiscoutGold = 0.15;
    private static double serviceDiscoutSilver = 0.1;
    private static double productDiscoutPremium = 0.1;
    private static double productDiscoutGold = 0.1;
    private static double productDiscoutSilver = 0.1;

    public DiscountRate(){
    }

    public static double getServiceDiscountRate(String type){
        switch( type ){
            case "Premium":
                return serviceDiscoutPremium;
            case "Gold":
                return serviceDiscoutGold;
            case "Silver":
                return serviceDiscoutSilver;
            default:
                return 0.0;
        }
    }

    public static double getProductDiscountRate(String type){
        switch( type ){
            case "Premium":
                return productDiscoutPremium;
            case "Gold":
                return productDiscoutGold;
            case "Silver":
                return productDiscoutSilver;
            default:
                return 0.0;
        }
    }
}
