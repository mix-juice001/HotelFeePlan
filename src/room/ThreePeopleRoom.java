package room;

import fee.Fee;
import season.Season;
import season.SeasonType;

public class ThreePeopleRoom implements Room {
    private SeasonType season;
    private boolean upgraded;

    public ThreePeopleRoom(SeasonType season) {
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
