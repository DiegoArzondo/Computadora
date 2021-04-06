package Domain;

public class Mouse extends InputDevices{
    private int idMouse;
    private static int mouseCounter;

    public Mouse(String inputType, String tradeMark) {
        super(inputType, tradeMark);
        this.idMouse=++Mouse.mouseCounter;
    }

    public int getIdMouse() {
        return idMouse;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ID Mouse= ").append(idMouse);
        sb.append(super.toString());//imprimis lo de InputDevices
        return sb.toString();
    }
}

