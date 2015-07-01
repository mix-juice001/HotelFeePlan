package season;

import fee.Fee;
import room.OverFourPeopleRoom;
import room.ThreePeopleRoom;
import room.TwoPeopleRoom;

public class Low implements Season {
    @Override
    public Fee charge(TwoPeopleRoom twoPeopleRoom) {
        return new Fee("11000");
    }

    @Override
    public Fee charge(ThreePeopleRoom threePeopleRoom) {
        return new Fee("11000");
    }

    @Override
    public Fee charge(OverFourPeopleRoom fourPeopleRoom) {
        return new Fee("11000");
    }
}
