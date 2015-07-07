package room;

import fee.Fee;
import season.SeasonType;

abstract public class Room implements RoomCharge {
    protected SeasonType season;
    protected boolean upgraded;

    abstract public Fee charge();

    @Override
    public Fee upgradeCharge() {
        return new Fee("3000");
    }

    public Room upgrade() {
        this.upgraded = true;
        return this;
    }

    public boolean isUpgraded() {
        return upgraded;
    }
}
