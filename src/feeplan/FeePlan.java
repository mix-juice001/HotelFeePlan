package feeplan;

import customer.Party;
import fee.Fee;
import room.Room;

public class FeePlan {

    private Party party;
    private Room room;

    public FeePlan(Party party, Room room) {
        this.party = party;
        this.room = room;
    }

    public Fee totalFee() {
        return party.charge(room).addTax();
    }
}
