package package1222;

import java.io.*;
/*
class Person implements Serializable{
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class SerializeDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        {
            Person person1=new Person("dai",18);
            Person person2=new Person("dai",18);
            OutputStream os=new FileOutputStream("Person对象.bin");
            ObjectOutputStream oos=new ObjectOutputStream(os);
            oos.writeObject(person1);
            oos.writeObject(person2);
            oos.close();
        }{
            InputStream is=new FileInputStream("Person对象.bin");
            ObjectInputStream ois= new ObjectOutputStream(is);
            Person p;
            p=(Person)ois.readObject();
            System.out.println(p);
            p=(Person)ois.readObject();
            System.out.println(p);
            ois.close();
        }
    }
}
*/