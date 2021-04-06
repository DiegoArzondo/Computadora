package Domain;

public class Keyboard extends InputDevices {
    private int idKeyboard;
    private static int keyboardCounter;

    public Keyboard(String inputType, String tradeMark) {
        super(inputType, tradeMark);
        this.idKeyboard=++Keyboard.keyboardCounter;
    }

    public int getIdKeyboard() {
        return this.idKeyboard;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ID Keyboard= ").append(idKeyboard);
        sb.append(super.toString());
        return sb.toString();
    }
}
