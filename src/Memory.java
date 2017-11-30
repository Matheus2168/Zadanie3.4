public class Memory {
    String producer;
    String model;
    int quantity;
    int ramClock; //MHz

    public Memory(String producer, String model, int quantity, int ramClock) {
        this.producer = producer;
        this.model = model;
        this.quantity = quantity;
        this.ramClock = ramClock;
    }
}
