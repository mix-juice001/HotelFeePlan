package customer;

import fee.Fee;
import room.Room;

public class Adult implements Customer {

    @Override
    public Fee charge(Room room) {
        return room.charge();
    }
}
