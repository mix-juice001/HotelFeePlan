package room;

import fee.Fee;

public interface RoomCharge {
    Fee charge();
    Fee basicCharge();
    Fee upgradeCharge();
}
