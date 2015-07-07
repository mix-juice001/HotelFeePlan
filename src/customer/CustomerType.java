package customer;

import fee.Fee;
import room.Room;

public enum CustomerType {
    ADULT(new Adult()),
    CHILD(new Child()),
    INFANT(new Infant()) {
        @Override
        public CustomerType withBed() {
            ((Infant) customer).withBed();
            return this;
        }

        @Override
        public CustomerType withMeal() {
            ((Infant) customer).withMeal();
            return this;
        }
    };

    Customer customer;

    CustomerType(Customer customer) {
        this.customer = customer;
    }

    public Fee charge(Room room) {
        return customer.charge(room);
    }

    public CustomerType withBed() {
        return this;
    }

    public CustomerType withMeal() {
        return this;
    }
}
