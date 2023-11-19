// Animal ��
class Animal {
    public void eat() {
        System.out.println("�����ʳ");
    }

    public void sleep() {
        System.out.println("����˯��");
    }
}

// Cat ��
class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("è����");
    }

    @Override
    public void sleep() {
        System.out.println("è˯��");
    }
}

// Dog ��
class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("���й�ͷ");
    }

    @Override
    public void sleep() {
        System.out.println("������");
    }
}

// Pig ��
class Pig extends Animal {
    @Override
    public void eat() {
        System.out.println("�������");
    }

    @Override
    public void sleep() {
        System.out.println("����");
    }
}

// ������
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
