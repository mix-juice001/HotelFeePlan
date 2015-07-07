package room;

import fee.Fee;
import season.SeasonType;

public class OverFourPeopleRoom extends Room{

    OverFourPeopleRoom(SeasonType season) {
        this.season = season;
    }

    @Override
    public Fee charge() {
        return season.charge(this);
    }
}
