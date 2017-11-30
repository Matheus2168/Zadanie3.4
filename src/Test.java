public class Test {


    public static void main(String[] args) {
        Procesor proc1 = new Procesor("Intel","i7",4.2);
        Memory mem1 = new Memory("Kingston","HyperX",2,1600);
        Computer pc1 = new Computer("HomePC",proc1,mem1);

        Procesor proc2 = new Procesor("AMD","Phenom",3.2);
        Memory mem2 = new Memory("ADATA","XPG",4,2400);
        Computer pc2 = new Computer("Workstation", proc2, mem2);


        System.out.println(pc1.getProperties());
        System.out.println(pc2.getProperties());


        Overclock turbo = new Overclock();

        turbo.increaseCpuClock(pc1,0.2);
        turbo.decreaseCpuClock(pc2, 0.4);

        System.out.println(pc1.getProperties());
        System.out.println(pc2.getProperties());


        ComputerAssembly ca = new ComputerAssembly();
        Computer AssembledPc = ca.assembly("PC-Mateusz","Intel","Xenon",3.5,
                "Corsair","Vengeance",4,3000);

        System.out.println(AssembledPc.getProperties());




    }





}
