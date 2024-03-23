package pratice.designpattern;

//Lazy initialization method to implement Singleton pattern creates the instance in the global access method.
//The instance is created only if it is needed. This method is used when the instance of the class is not required to be created at the time of class loading.
//This method is thread-safe using synchronized keyword and double-checked locking.
//double-checked locking is used to avoid the overhead of synchronization every time the method is invoked.
//In this approach, performance is improved by only locking the object when the object is not initialized.
public class DoubleCheckSIngelton {
    private static DoubleCheckSIngelton instance;

    private DoubleCheckSIngelton() {
    }
    private static  DoubleCheckSIngelton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSIngelton.class) {
                if (instance == null) {
                    System.out.println("Creating Thread Safe instance");
                    instance = new DoubleCheckSIngelton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        DoubleCheckSIngelton doubleCheckSIngelton = DoubleCheckSIngelton.getInstance();
        DoubleCheckSIngelton doubleCheckSIngelton1 = DoubleCheckSIngelton.getInstance();
        System.out.println(doubleCheckSIngelton.hashCode());
        System.out.println(doubleCheckSIngelton1.hashCode());
        DoubleCheckSIngelton doubleCheckSIngelton2 = DoubleCheckSIngelton.getInstance();
        System.out.println(doubleCheckSIngelton2.hashCode());
    }
}
