abstract class Product {
    abstract void use();
}

class ConcreteProductA extends Product {
    void use() {
        System.out.println("Using Product A");
    }
}

class ConcreteProductB extends Product {
    void use() {
        System.out.println("Using Product B");
    }
}

abstract class Creator {
    abstract Product factoryMethod();
}

class CreatorA extends Creator {
    Product factoryMethod() {
        return new ConcreteProductA();
    }
}

class CreatorB extends Creator {
    Product factoryMethod() {
        return new ConcreteProductB();
    }
}

public class FactoryPatternDemo {
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
Using Product A
Using Product B
*/