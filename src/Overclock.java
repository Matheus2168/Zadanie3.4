public class Overclock {

    void increaseCpuClock(Computer computer, double moreGHz){
        computer.procesor.cpuClock += moreGHz;
    }

    void decreaseCpuClock(Computer computer, double lessGHz){
        computer.procesor.cpuClock -= lessGHz;
    }


}
