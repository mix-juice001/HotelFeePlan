package customer;

import fee.ChildRate;
import fee.Fee;
import room.Room;

import java.math.BigDecimal;

public class Child implements Customer {
    private ChildRate rate = new ChildRate();

    @Override
    public Fee charge(Room room) {
        if (room.isUpgraded())
            return room.charge().add(room.upgradeCharge()).multiply(rate);
        return room.charge().multiply(rate);
    }
}
