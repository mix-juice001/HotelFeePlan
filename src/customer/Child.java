package customer;

import fee.Fee;
import room.Room;

import java.math.BigDecimal;

public class Child implements Customer {
    private BigDecimal rate = new BigDecimal("0.8");

    @Override
    public Fee charge(Room room) {
        if (room.isUpgraded())
            return room.charge().add(room.upgradeCharge()).multiply(rate);
        return room.charge().multiply(rate);
    }
}
