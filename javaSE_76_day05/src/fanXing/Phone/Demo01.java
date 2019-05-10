package fanXing.Phone;

public class Demo01 {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Factory<Phone> factory = new Factory<> ();
        Phone  p =factory.fix(phone);
        p.call();

        Computer computer = new Computer();
        Factory<Computer> computerFactory = new Factory<>();
        Computer computer1 = computerFactory.fixAll(computer);
        computer1.fix1();

    }


}
