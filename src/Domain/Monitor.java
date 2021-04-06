package Domain;

public class Monitor {
    private int idMonitor;
    private String tradeMark;
    private double size;
    private static int monitorCounter;

    public Monitor(){
        this.idMonitor=++Monitor.monitorCounter;
    }

    public Monitor(String tradeMark, double size){
        this();
        this.tradeMark=tradeMark;
        this.size=size;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getTradeMark() {
        return tradeMark;
    }

    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ID Monitor= ").append(idMonitor);
        sb.append(", TradeMark= ").append(tradeMark);
        sb.append(", Size=").append(size);
        return sb.toString();
    }
}
