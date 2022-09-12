public class Car {
    private int ID;
    private int NumberAuto;

    public Car(int ID, int numberAuto) {
        this.ID = ID;
        NumberAuto = numberAuto;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getNumberAuto() {
        return NumberAuto;
    }

    public void setNumberAuto(int numberAuto) {
        NumberAuto = numberAuto;
    }

    @Override
    public String toString() {
        return
                "ID = " + ID +
                "\nNumberAuto = " + NumberAuto;
    }
}
