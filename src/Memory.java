import java.lang.management.MemoryType;
public class Memory {
    private final String memoryType;
    private final int memorySize;
    private static double memoryWeight;

    public Memory(String memoryType, int memorySize, double memoryWeight) {
        this.memoryType = memoryType;
        this.memorySize = memorySize;
        this.memoryWeight = memoryWeight;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public static double getMemoryWeight() {
        return memoryWeight;
    }

    public String toString() {
        return
                "ОЗУ: " + "\n" +
                        "Тип: " + memoryType + "\n" +
                        "Объем: " + memorySize + " Гб." + "\n" +
                        "Вес: " + memoryWeight + " гр." + "\n";
    }
}
