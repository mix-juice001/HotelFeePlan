package room;

import fee.Fee;
import season.Season;

public class OverFourPeopleRoom implements Room {
    private Season season;
    private boolean upgraded;

    OverFourPeopleRoom(Season season) {
        this.season = season;
    }

    @Override
    public Room upgrade() {
        this.upgraded = true;
        return this;
    }

    @Override
    public Fee charge() {
        return season.charge(this);
    }

    @Override
    public Fee upgradeCharge() {
        return new Fee("3000");
    }

    @Override
    public boolean isUpgraded() {
        return upgraded;
    }
}
