package Domain;


public class Computer {
    private  int idComputer;
    private String tradeMark;
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;
    private static int computerCounter;

    public Computer(){
        this.idComputer=++Computer.computerCounter;
    }

    public Computer(String tradeMark,Monitor monitor,Keyboard keyboard,Mouse mouse){
        this();
        this.tradeMark=tradeMark;
        this.monitor=monitor;
        this.keyboard=keyboard;
        this.mouse=mouse;
    }

    public int getIdComputer() {
        return idComputer;
    }

    public String getTradeMark() {
        return tradeMark;
    }

    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("\nID Computer= ").append(idComputer);
        sb.append("\nTradeMark= ").append(tradeMark);
        sb.append("\nMonitor= ").append(monitor);
        sb.append("\nKeyboard= ").append(keyboard);
        sb.append("\nMouse= ").append(mouse);
        return sb.toString();
    }
}

