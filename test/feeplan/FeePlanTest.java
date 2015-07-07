package feeplan;

import customer.*;
import fee.Fee;
import org.junit.Test;
import room.Room;
import room.ThreePeopleRoom;
import room.TwoPeopleRoom;
import season.Normal;
import season.Peak;
import season.Season;
import season.SeasonType;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FeePlanTest {

    @Test
    public void 大人2人でピークシーズンの2人部屋の合計料金() {

        Party party = new Party();
        party.add(CustomerType.ADULT);
        party.add(CustomerType.ADULT);

        Room room = new TwoPeopleRoom(SeasonType.PEAK);

        FeePlan feePlan = new FeePlan(party, room);
        Fee actual = feePlan.totalFee();
        Fee expected = new Fee("43200");
        assertThat(actual, is(expected));
    }

    @Test
    public void 大人1人子供2人幼児1人布団付で通常シーズンの特別室3人部屋の合計料金() {

        Party party = new Party();
        party.add(CustomerType.ADULT);
        party.add(CustomerType.CHILD);
        party.add(CustomerType.CHILD);
        party.add(CustomerType.INFANT.withBed());

        Room room = new ThreePeopleRoom(SeasonType.NORMAL).upgrade();

        FeePlan feePlan = new FeePlan(party, room);
        Fee actual = feePlan.totalFee();
        Fee expected = new Fee("50976");
        assertThat(actual, is(expected));
    }
}
