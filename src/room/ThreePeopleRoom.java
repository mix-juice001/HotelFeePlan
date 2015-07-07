package room;

import fee.Fee;
import season.SeasonType;

public class ThreePeopleRoom extends Room {

    public ThreePeopleRoom(SeasonType season) {
        this.season = season;
    }

    @Override
    public Fee basicCharge() {
        return season.charge(this);
    }
}
