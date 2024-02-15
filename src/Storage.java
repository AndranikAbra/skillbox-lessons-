public class Storage {
    private StorageType storageType;
    private int storageSize;
    private static double storageWeight;

    public Storage(StorageType storageType, int storageSize, double storageWeight) {
        this.storageType = storageType;
        this.storageSize = storageSize;
        Storage.storageWeight = storageWeight;
    }


    public int getStorageSize() {
        return storageSize;
    }

    public static double getStorageWeight() {
        return storageWeight;
    }

    public String toString() {
        return
                "HDD: " + "\n" +
                        "Тип: " + storageType + "\n" +
                        "Объем: " + storageSize + "\n" +
                        "Вес: " + storageWeight + " гр." + "\n";
    }
}
