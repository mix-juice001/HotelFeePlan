package customer;

import fee.Fee;
import room.Room;

public class Adult implements Customer {

    @Override
    public Fee charge(Room room) {
        if (room.isUpgraded())
            return room.charge().add(room.upgradeCharge());
        return room.charge();
    }
}
