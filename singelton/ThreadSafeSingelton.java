package pratice.designpattern;

//Lazy initialization method to implement Singleton pattern creates the instance in the global access method.
//The instance is created only if it is needed. This method is used when the instance of the class is not required to be created at the time of class loading.
//This method is thread-safe using synchronized keyword but synchronized is a costly operation and it can decrease the performance of the system.
//So if performance is not an issue, this is the best method to use.
public class ThreadSafeSingelton {
    private static ThreadSafeSingelton instance;

    private ThreadSafeSingelton() {
    }
    private static synchronized ThreadSafeSingelton getInstance() {
        if (instance == null) {
            System.out.println("Creating Thread Safe instance");
            instance = new ThreadSafeSingelton();
        }
        return instance;
    }
    public static void main(String[] args) {
        ThreadSafeSingelton threadSafeSingelton = ThreadSafeSingelton.getInstance();
        ThreadSafeSingelton threadSafeSingelton1 = ThreadSafeSingelton.getInstance();
        System.out.println(threadSafeSingelton.hashCode());
        System.out.println(threadSafeSingelton1.hashCode());
        ThreadSafeSingelton threadSafeSingelton2 = ThreadSafeSingelton.getInstance();
        System.out.println(threadSafeSingelton2.hashCode());
    }
}
