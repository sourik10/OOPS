//single level inheritance in Java
class Bike{
    Bike(){
        System.out.println("bikeConstructor");
    }
    void func1(){
        System.out.println("func1 called");
    }
}
class Honda extends Bike{
    Honda(){}
    void func2(){
        System.out.println("func2 called");
    }
}
class HelloWorld {
    public static void main(String[] args) {
        Honda h1=new Honda();
        h1.func1();
        h1.func2();
    }
}
