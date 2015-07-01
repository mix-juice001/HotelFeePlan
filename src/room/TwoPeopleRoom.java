package room;

import fee.Fee;
import season.Season;

public class TwoPeopleRoom implements Room {

        private Season season;
        private boolean upgraded;

        public TwoPeopleRoom(Season season) {
            this.season = season;
        }

        @Override
        public Room upgrade() {
            upgraded = true;
            return this;
        }

        @Override
        public Fee charge() {
            return season.charge(this);
        }

        @Override
        public Fee upgradeCharge() {
            return new Fee("3000");
        }

        @Override
        public boolean isUpgraded() {
            return upgraded;
        }
}
