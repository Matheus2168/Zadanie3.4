public class Procesor {
    String producer;
    String model;
    double cpuClock; //GHz

    public Procesor(String producer, String model, double cpuClock) {
        this.producer = producer;
        this.model = model;
        this.cpuClock = cpuClock;
    }
}
