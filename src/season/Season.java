package season;

import fee.Fee;
import room.OverFourPeopleRoom;
import room.ThreePeopleRoom;
import room.TwoPeopleRoom;

public interface Season {
    Fee charge(TwoPeopleRoom twoPeopleRoom);
    Fee charge(ThreePeopleRoom threePeopleRoom);
    Fee charge(OverFourPeopleRoom fourPeopleRoom);
}
