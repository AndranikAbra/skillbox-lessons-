public class Display {
    private int getDisplayWeight;
    private  DisplayType displayType;
    private  int displaySize;
    public double displayWeight;

    public Display(DisplayType displayType, int displaySize,
                   double displayWeight) {
        this.displayType = displayType;
        this.displaySize = displaySize;
        this.displayWeight = displayWeight;

    }

    public void setDisplayWeight(double displayWeight){
        this.displayWeight = displayWeight;
    }

    public DisplayType getDisplayType() {
        return displayType;
    }

    public int getDisplaySize() {
        return displaySize;
    }

    public double getDisplayWeight() {
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
