package customer;

import fee.Fee;
import room.Room;

import java.util.Optional;

public class Infant implements Customer {
    private Fee basicFee = Fee.ZERO;
    private Optional<Bed> bed = Optional.ofNullable(null);
    private Optional<Meal> meal = Optional.ofNullable(null);

    public Infant() {
    }

    public Infant withBed() {
        this.bed = Optional.ofNullable(new Bed());
        return this;
    }

    public Infant withMeal() {
        this.meal = Optional.ofNullable(new Meal());
        return this;
    }

    @Override
    public Fee charge(Room room) {
        return basicFee
                .add(bed.map(b -> b.fee()).orElse(Fee.ZERO)
                        .add(meal.map(m -> m.fee()).orElse(Fee.ZERO)));
    }
}
