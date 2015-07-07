package room;

import fee.Fee;
import season.SeasonType;

public class TwoPeopleRoom extends Room {

    public TwoPeopleRoom(SeasonType season) {
        this.season = season;
    }

    @Override
    public Fee charge() {
        return season.charge(this);
    }
}
