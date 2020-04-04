package com.javacourses.lesson_practice.reflectionAPI;


import java.lang.reflect.Field;

public class ReflectionExample {
    public static void main(String[] args) {
        Person person1 = new Person("Ilya", 11);
        Person person2 = copyObject(person1);
        System.out.println(person2);
        System.out.println(person1 != person2);
    }
private static <T> T copyObject(T object)  {
    Class<T> clazz = (Class<T>) object.getClass();
    T toCopy = null;
        try {
            toCopy = clazz.newInstance();
            Field nameField = clazz.getField("name");
            nameField.setAccessible(true);
            nameField.set(toCopy, "Vasya");
            nameField.setAccessible(false);
        }catch (IllegalAccessException | InstantiationException | NoSuchFieldException e){
            e.printStackTrace();
        }
return toCopy;
}




//    Person person = new Person("Person1", 11);
//        System.out.println(person);
//
//
//    Class<Person> personClass = Person.class;
//        try {
//        Field nameField = personClass.getDeclaredField("name");
//        nameField.setAccessible(true);
//        nameField.set(person, "Peter");
//        nameField.setAccessible(false);
//        System.out.println(person);
//    } catch (NoSuchFieldException | IllegalAccessException e) {
//        e.printStackTrace();
//    }



//        try {
//            person = (Person) Class.forName("com.secorse.reflection.Person").newInstance();
//        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
//            e.printStackTrace();
//        }
//        Field[] fields = personClass.getDeclaredFields();
//        for (Field field : fields) {
//            System.out.println(field.getName());
//        }
}
