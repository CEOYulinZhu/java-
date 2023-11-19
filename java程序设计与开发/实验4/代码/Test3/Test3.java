// Animal 类
class Animal {
    public void eat() {
        System.out.println("动物进食");
    }

    public void sleep() {
        System.out.println("动物睡眠");
    }
}

// Cat 类
class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void sleep() {
        System.out.println("猫睡觉");
    }
}

// Dog 类
class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }

    @Override
    public void sleep() {
        System.out.println("狗打盹");
    }
}

// Pig 类
class Pig extends Animal {
    @Override
    public void eat() {
        System.out.println("猪吃饲料");
    }

    @Override
    public void sleep() {
        System.out.println("猪打滚");
    }
}

// 测试类
public class Test3 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Pig();

        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
            System.out.println("------------");
        }
    }
}
