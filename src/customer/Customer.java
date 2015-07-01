package customer;

import fee.Fee;
import room.Room;

public interface Customer {
    Fee charge(Room room);
}
