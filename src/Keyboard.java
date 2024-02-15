public class Keyboard {
    private  String keyboardType;
    private  boolean keyboardLed;
    private static double keyboardWeight;

    public Keyboard(String keyboardType, boolean keyboardLed, double keyboardWeight) {
        this.setKeyboardType(keyboardType);
        this.setKeyboardLed(keyboardLed);
        Keyboard.setKeyboardWeight(keyboardWeight);
    }

    public String getKeyboardType() {
        return keyboardType;
    }

    public boolean isKeyboardLed() {
        return keyboardLed;
    }

    public static double getKeyboardWeight() {
        return keyboardWeight;
    }

    public String toString() {
        return
                "Клавиатура: " + "\n" +
                        "Тип: " + getKeyboardType() + "\n" +
                        "Подсветка: " + isKeyboardLed() + "\n" +
                        "Вес: " + getKeyboardWeight() + " гр." + "\n";
    }

    public void setKeyboardType(String keyboardType) {
        this.keyboardType = keyboardType;
    }

    public void setKeyboardLed(boolean keyboardLed) {
        this.keyboardLed = keyboardLed;
    }

    public static void setKeyboardWeight(double keyboardWeight) {
        Keyboard.keyboardWeight = keyboardWeight;
    }
}
