public class ComputerAssembly {

    Computer assembly(String name,
                      String procesorProducer, String procesorModel, double cpuClock,
                      String memoryProducer, String memoryModel, int memoryQuantity, int ramClock  ){

        return new Computer(name,
                            new Procesor(procesorProducer,procesorModel,cpuClock),
                            new Memory(memoryProducer,memoryModel,memoryQuantity,ramClock));
    }
}
