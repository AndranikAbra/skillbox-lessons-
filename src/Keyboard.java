public class Keyboard {
    private final String keyboardType;
    private final boolean keyboardLed;
    private static double keyboardWeight;

    public Keyboard(String keyboardType, boolean keyboardLed, double keyboardWeight) {
        this.keyboardType = keyboardType;
        this.keyboardLed = keyboardLed;
        this.keyboardWeight = keyboardWeight;
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
                        "Тип: " + keyboardType + "\n" +
                        "Подсветка: " + keyboardLed + "\n" +
                        "Вес: " + keyboardWeight + " гр." + "\n";
    }
}
