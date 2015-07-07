package room;

import fee.Fee;
import season.SeasonType;

abstract public class Room implements RoomCharge {
    protected SeasonType season;
    protected boolean upgraded;

    @Override
    public Fee charge() {
        if (upgraded) return basicCharge().add(upgradeCharge());
        return basicCharge();
    }

    @Override
    abstract public Fee basicCharge();

    @Override
    public Fee upgradeCharge() {
        return new Fee("3000");
    }

    public Room upgrade() {
        this.upgraded = true;
        return this;
    }

}
