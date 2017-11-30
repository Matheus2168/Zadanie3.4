public class Computer {
    String name;
    Procesor procesor;
    Memory memory;

    public Computer(String name, Procesor procesor, Memory memory) {
        this.name = name;
        this.procesor = procesor;
        this.memory = memory;
    }

    String getProperties(){
        return name +" "+procesor.producer+" "+procesor.model+" "+procesor.cpuClock
                    +" "+memory.producer+" "+memory.model+" "+memory.quantity+" "+memory.ramClock;
    }
}
