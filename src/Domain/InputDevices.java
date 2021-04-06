package Domain;

public class InputDevices {
    private String inputType;
    private String tradeMark;

    public InputDevices(String inputType, String tradeMark) {
        this.inputType = inputType;
        this.tradeMark = tradeMark;
    }

    public String getInputType() {
        return inputType;
    }

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    public String getTradeMark() {
        return tradeMark;
    }

    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(", Input Type= ").append(inputType);
        sb.append(", TradeMark= ").append(tradeMark);
        return sb.toString();
    }
}
