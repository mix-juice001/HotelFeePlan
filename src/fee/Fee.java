package fee;

import java.math.BigDecimal;

public class Fee {

    public static final Fee ZERO = new Fee(BigDecimal.ZERO);
    final BigDecimal value;
    private Fee(BigDecimal fee) {
        value = fee.setScale(0);
    }

    public Fee(String fee) {
       value = new BigDecimal(fee);
    }

    public Fee add(Fee fee) {
        return new Fee(value.add(fee.value));
    }

    public Fee multiply(ChildRate rate) {
        return new Fee(value.multiply(rate.value));
    }

    public Fee addTax() {
        return new Fee(value.multiply(TaxRate.getInstance().value));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fee fee = (Fee) o;

        return !(value != null ? !value.equals(fee.value) : fee.value != null);

    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Fee{" +
                "value=" + value +
                '}';
    }
}
