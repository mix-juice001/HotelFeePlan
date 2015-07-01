package season;

import fee.Fee;
import room.OverFourPeopleRoom;
import room.ThreePeopleRoom;
import room.TwoPeopleRoom;

public class Normal implements Season {
    @Override
    public Fee charge(TwoPeopleRoom twoPeopleRoom) {
        return new Fee("16000");
    }

    @Override
    public Fee charge(ThreePeopleRoom threePeopleRoom) {
        return new Fee("14000");
    }

    @Override
    public Fee charge(OverFourPeopleRoom fourPeopleRoom) {
        return new Fee("13000");
    }
}
