class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton Instance Created");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        obj1.showMessage();
        System.out.println("obj1 and obj2 are same: " + (obj1 == obj2));
    }
}

/*
Output:
Singleton Instance Created
Hello from Singleton!
obj1 and obj2 are same: true
*/