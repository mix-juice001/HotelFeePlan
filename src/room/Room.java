package room;

import fee.Fee;

public interface Room {
    Fee charge();
    Fee upgradeCharge();
    boolean isUpgraded();
    Room upgrade();
}
