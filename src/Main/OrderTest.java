package Main;

import Domain.*;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        Monitor samsung= new Monitor("Samsung",24);
        Keyboard keyboard1= new Keyboard("USB","Razer Ornata");
        Mouse mouse1= new Mouse("USB","Noga Thanatos");
        Computer computer1= new Computer("Corsair Carbide",samsung,keyboard1,mouse1);

        Monitor lg= new Monitor("LG",21);
        Keyboard keyboard2= new Keyboard("USB","Razer Black Widow");
        Mouse mouse2= new Mouse("USB","Razer");
        Computer computer2= new Computer("NXZ PHANTOM",lg,keyboard2,mouse2);

        order.addComputer(computer1);
        order.addComputer(computer2);

        order.showOrder();
    }
}
