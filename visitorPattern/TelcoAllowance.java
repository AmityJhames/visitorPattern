package visitorPattern;

import java.util.*;

public class TelcoAllowance implements UsagePromo {
    private static Map<String, Integer> allowances = new HashMap<>();

    static {
        allowances.put("Smart", 15);
        allowances.put("Globe", 10);
        allowances.put("Ditto", 8);
    }

    @Override
    public String showAllowance(String telcoName, double money) {
        Integer allowance = allowances.getOrDefault(telcoName, 0);
        return allowance + " GB for a price of " + money + " pesos per month.";
    }
}
