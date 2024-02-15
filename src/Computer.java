public class Computer {
    private Processor processor;
    private Memory memory;
    private Storage storage;
    private Display display;
    private Keyboard keyboard;


    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Storage getStorage() {
        return storage;
    }

    public Display getDisplay() {
        return display;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public final String vendor;
    public final String name;
    public double totalWeight;

    public Computer(String vendor, String name, Processor processor,
                    Memory memory, Storage storage, Display display,
                    Keyboard keyboard) {
        this.processor = processor;
        this.memory = memory;
        this.storage = storage;
        this.display = display;
        this.keyboard = keyboard;
        this.vendor = vendor;
        this.name = name;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public double getTotalWeight() {
        return totalWeight = Processor.getWeight() +
                Memory.getMemoryWeight() +
                Storage.getStorageWeight()  +
                Keyboard.getKeyboardWeight();
    }

    public String toString() {
        return
                "Мой ПК: " + "\n" +
                        "Производитель: " + vendor + "\n" +
                        "Название: " + name + "\n" +
                        processor + "\n" +
                        memory + "\n" +
                        storage + "\n" +
                        display + "\n" +
                        keyboard + "\n" +
                        "Общий вес: " + getTotalWeight();
    }
}
