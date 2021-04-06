package Domain;

public class Order {
    private final int idOrder;
    private final Computer[] computers;
    private static int orderCounter;
    private int computerCounter;
    private static final int MAX_COMPUTER=10;


    public Order(){
        this.idOrder=++Order.orderCounter;
        this.computers = new Computer[MAX_COMPUTER];
    }

    public void addComputer(Computer computer){
        if(this.computerCounter<Order.MAX_COMPUTER){
            this.computers[this.computerCounter++]=computer;
        }
        else{
            System.out.println("Se alcanzo el maximo de productos por orden: " + Order.MAX_COMPUTER);
        }
    }

    public void showOrder(){
        System.out.println("ORDER: " + this.idOrder);
        System.out.println("Computers of the order " + this.idOrder);
        for (Computer com :computers ) {
            if (com!=null){
            System.out.println(com);
            }
        }
    }



}
