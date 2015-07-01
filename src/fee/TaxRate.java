package fee;

import java.math.BigDecimal;

public class TaxRate {

    BigDecimal value = new BigDecimal("1.08");
    private static TaxRate ourInstance = new TaxRate();

    public static TaxRate getInstance() {
        return ourInstance;
    }

    private TaxRate() {
    }
}
