package room;

import fee.Fee;
import season.SeasonType;

public class ThreePeopleRoom extends Room {

    public ThreePeopleRoom(SeasonType season) {
        this.season = season;
    }

    @Override
    public Fee charge() {
        return season.charge(this);
    }
}
