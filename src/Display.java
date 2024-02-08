public class Display {
    private final DisplayType displayType;
    private final int displaySize;
    private static double displayWeight;

    public Display(DisplayType displayType, int displaySize, double displayWeight) {
        this.displayType = displayType;
        this.displaySize = displaySize;
        this.displayWeight = displayWeight;
    }

    public  DisplayType getDisplayType() {
        return displayType;
    }

    public int getDisplaySize() {
        return displaySize;
    }

    public static double getDisplayWeight() {
        return displayWeight;
    }

    public String toString() {
        return
                "Монитор: " + "\n" +
                        "Тип: " + displayType + "\n" +
                        "Диагональ: " + displaySize + "'" + "\n" +
                        "Вес: " + displayWeight + " гр." + "\n";
    }
}
