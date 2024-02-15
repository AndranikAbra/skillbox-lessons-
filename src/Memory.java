import java.lang.management.MemoryType;
public class Memory {
    private String memoryType;
    private int memorySize;
    private static double memoryWeight;

    public Memory(String memoryType, int memorySize, double memoryWeight) {
        this.memoryType = memoryType;
        this.memorySize = memorySize;
        Memory.memoryWeight = memoryWeight;
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
    public void setMemoryType(String memoryType) {
        this.memoryType = memoryType;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public static void setMemoryWeight(double memoryWeight) {
        Memory.memoryWeight = memoryWeight;
    }

    public String toString() {
        return
                "ОЗУ: " + "\n" +
                        "Тип: " + memoryType + "\n" +
                        "Объем: " + memorySize + " Гб." + "\n" +
                        "Вес: " + memoryWeight +  " гр." + "\n";
    }
}
