public class Mine {
    public static void main(String[] args) {
        Processor processor = new Processor(2.6,16, "Intel", 40);
        Memory memory = new Memory("DDR4", 64, 15);
        Storage storage = new Storage(StorageType.SSD,500,700);
        Display display = new Display(DisplayType.IPS, 32,2000);
        Keyboard keyboard = new Keyboard("Механическая", true, 300);
        Computer computer = new Computer("Samsung", "PC", processor, memory, storage, display, keyboard);
        System.out.println(computer);
    }
}
