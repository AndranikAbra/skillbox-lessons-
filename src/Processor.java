public class Processor {
    private double mhz;
    private int coreNum;

    public void setMhz(double mhz) {
        this.mhz = mhz;
    }

    public void setCoreNum(int coreNum) {
        this.coreNum = coreNum;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public static void setWeight(int weight) {
        Processor.weight = weight;
    }

    private String processor;
    private static int weight;

    public Processor(double mhz, int coreNum,
                     String processor, int weight) {
        this.mhz = mhz;
        this.coreNum = coreNum;
        this.processor = processor;
        Processor.weight = weight;
    }
   /* public Processor setMhz(double mhz) {
        return new Processor(mhz, coreNum, processor, weight);
    }

    public Processor setCoreNum(int coreNum) {
        return new Processor(mhz, coreNum, processor, weight);
    }

    public Processor setManufacture(String processor) {
        return new Processor(mhz, coreNum, processor, weight);
    }

    public Processor setWeight(int weight) {
        return new Processor(mhz, coreNum, processor, weight);
    }
*/
    public double getMhz() {
        return mhz;
    }

    public int getCoreNum() {
        return coreNum;
    }

    public String getProcessor() {
        return processor;
    }

    public static int getWeight() {
        return weight;
    }

    public String toString() {
        return
                "\n" + "Процессор: " + "\n" +
                        "Производитель: " + processor +
                        "\n" + "Тактовая частота: " + mhz + " Mhz" +
                        "\n" + "Количество ядер: " + coreNum +
                        "\n" + "Вес: " + weight + " гр." + "\n";
    }
}
