public class FirstNegative{
    public static void main(String[] args){
        BMW b = new BMW();
        b.color();
        b.color();
        b.torque();
        b.torque();
    }
}
class car{
    void color(){
        System.out.println("Black color");
    }
}

class BMW extends car{
    void torque(){
        System.out.println("470...");
    }
}