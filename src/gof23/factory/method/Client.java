package gof23.factory.method;

public class Client {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小李");
        Product card2 = factory.create("小王");
        Product card3 = factory.create("小张");
        
        card1.use();
        card2.use();
        card3.use();
        
        
    }
}
