abstract class Product {
    abstract void use();
}

class ConcreteProductA extends Product {
    @Override
    void use() {
        System.out.println("Using Product A");
    }
}

class ConcreteProductB extends Product {
    @Override
    void use() {
        System.out.println("Using Product B");
    }
}

abstract class Creator {
    abstract Product factoryMethod();
}

class CreatorA extends Creator {
    @Override
    Product factoryMethod() {
        return new ConcreteProductA();
    }
}

class CreatorB extends Creator {
    @Override
    Product factoryMethod() {
        return new ConcreteProductB();
    }
}

public class Exercise3_SortOrders {
    public static void main(String[] args) {
        Creator creator = new CreatorA();
        Product product = creator.factoryMethod();
        product.use();

        creator = new CreatorB();
        product = creator.factoryMethod();
        product.use();
    }
}

/*
Output:
After Bubble Sort:
Bob - 300.0
Alice - 500.0
Charlie - 700.0
After Quick Sort:
Bob - 300.0
Alice - 500.0
Charlie - 700.0
*/