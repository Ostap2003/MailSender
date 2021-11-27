package client;

import lombok.Getter;

@Getter
public class Client {
    private String name;
    private int age;
    private int id;
    private Gender sex;

    public Client(String name, int age, Gender sex){
        this.id = idGenerator.generateId();
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public static class idGenerator {
        private static int id = 0;

        public static int generateId() {
            id++;
            return id;
        }
    }
}
