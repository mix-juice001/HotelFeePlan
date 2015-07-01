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

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FeePlanTest {

    @Test
    public void 大人2人でピークシーズンの2人部屋の合計料金() {
        Customer adult1 = new Adult();
        Customer adult2 = new Adult();

        Party party = new Party();
        party.add(adult1);
        party.add(adult2);

        Season peak = new Peak();
        Room room = new TwoPeopleRoom(peak);

        FeePlan feePlan = new FeePlan(party, room);
        Fee actual = feePlan.totalFee();
        Fee expected = new Fee("43200");
        assertThat(actual, is(expected));
    }

    @Test
    public void 大人1人子供2人幼児1人布団付で通常シーズンの特別室3人部屋の合計料金() {
        Customer adult = new Adult();
        Customer child1 = new Child();
        Customer child2 = new Child();
        Customer infant = new Infant().withBed();

        Party party = new Party();
        party.add(adult);
        party.add(child1);
        party.add(child2);
        party.add(infant);

        Season peak = new Normal();
        Room room = new ThreePeopleRoom(peak).upgrade();

        FeePlan feePlan = new FeePlan(party, room);
        Fee actual = feePlan.totalFee();
        Fee expected = new Fee("50976");
        assertThat(actual, is(expected));
    }
}
