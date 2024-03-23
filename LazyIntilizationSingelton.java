package pratice.designpattern;

//Lazy initialization method to implement Singleton pattern creates the instance in the global access method.
//The instance is created only if it is needed. This method is used when the instance of the class is not required to be created at the time of class loading.
//This method is not thread-safe and it can be used in a single-threaded environment only.
//If multiple threads will access the getInstance() method at the same time, it can create multiple instances of the class.
public class LazyIntilizationSingelton {

    private static LazyIntilizationSingelton instance;

    private LazyIntilizationSingelton() {
    }

    public static LazyIntilizationSingelton getInstance() {
        if (instance == null) {
            System.out.println("Creating instance");
            instance = new LazyIntilizationSingelton();
        }
        return instance;
    }

    public static void main(String[] args) {
        LazyIntilizationSingelton lazyIntilizationSingelton = LazyIntilizationSingelton.getInstance();
        LazyIntilizationSingelton lazyIntilizationSingelton1 = LazyIntilizationSingelton.getInstance();
        System.out.println(lazyIntilizationSingelton.hashCode());
        System.out.println(lazyIntilizationSingelton1.hashCode());
        LazyIntilizationSingelton lazyIntilizationSingelton2 = LazyIntilizationSingelton.getInstance();
        System.out.println(lazyIntilizationSingelton2.hashCode());
    }
}
