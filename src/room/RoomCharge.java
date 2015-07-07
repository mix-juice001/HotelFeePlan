package room;

import fee.Fee;

public interface RoomCharge {
    Fee charge();
    Fee upgradeCharge();
}
