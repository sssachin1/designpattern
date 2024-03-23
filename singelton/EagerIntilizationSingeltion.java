package pratice.designpattern;

//Eager initialization to get the instance of the class.
//This is the simplest method to create a singleton class. In this method, the instance of the class is created at the time of class loading.
//It is the easiest method to create a singleton class but it has a drawback that instance is created even though client application might not be using it.
//This might be a considerable issue if your singleton class is using a lot of resources and you are creating the instance even though you are not using it.
//This method is used when the cost of creating the instance is not too large and the client application always creates an instance of the singleton class.
public class EagerIntilizationSingeltion {
    //Creating an instance of EagerIntilizationSingeltion class
    // instance will be created at the time of class loading.
    private static final EagerIntilizationSingeltion instance = new EagerIntilizationSingeltion();

    //Private constructor to restrict instantiation of the class from other classes.
    private EagerIntilizationSingeltion() {
    }

    //Public static method that returns the instance of the class.
    // this is the global access point for outer world to get the instance of the singleton class.
    public static EagerIntilizationSingeltion getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        //Getting the instance of EagerIntilizationSingeltion class
        EagerIntilizationSingeltion eagerIntilizationSingeltion = EagerIntilizationSingeltion.getInstance();
        //Getting another instance of EagerIntilizationSingeltion class
        EagerIntilizationSingeltion eagerIntilizationSingeltion1 = EagerIntilizationSingeltion.getInstance();
        System.out.println(eagerIntilizationSingeltion.hashCode());
        System.out.println(eagerIntilizationSingeltion1.hashCode());

        //Both the instances will have the same hashcode. which means both are same.
    }
}
