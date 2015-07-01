package customer;

import fee.Fee;
import room.Room;

import java.util.ArrayList;
import java.util.List;

public class Party {
    private List<Customer> customers = new ArrayList<>();

    public Fee charge(Room room) {
        return customers.stream()
                .map(customer -> customer.charge(room))
                .reduce((fee1, fee2) -> fee1.add(fee2))
                .orElse(Fee.ZERO);
    }

    public void add(Customer customer) {
        customers.add(customer);
    }
}
