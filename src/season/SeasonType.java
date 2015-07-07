package season;

import fee.Fee;
import room.OverFourPeopleRoom;
import room.ThreePeopleRoom;
import room.TwoPeopleRoom;

public enum SeasonType {
    PEAK(new Peak()),
    BUSY(new Busy()),
    NORMAL(new Normal()),
    LOW(new Low());

    Season season;
    SeasonType(Season season) {
        this.season = season;
    }

    public Fee charge(TwoPeopleRoom twoPeopleRoom) {
        return season.charge(twoPeopleRoom);
    }

    public Fee charge(ThreePeopleRoom threePeopleRoom) {
        return season.charge(threePeopleRoom);
    }

    public Fee charge(OverFourPeopleRoom fourPeopleRoom) {
        return season.charge(fourPeopleRoom);
    }
}
