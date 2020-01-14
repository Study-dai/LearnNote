package 多线程复习;
class Animal{}
class Bird extends Animal{}
class AnimalException extends Exception{}
class BirdException extends AnimalException{}

public class methodOverride {
    public Animal getAnimal() throws AnimalException{
        return null;
    }
}
class MethodOverrideChild extends methodOverride{
    @Override
    public Bird getAnimal() throws AnimalException{
        return null;
    }
}
