package ru.avalon.java.j20.labs.models;

import java.util.Objects;

/**
 * Представление о человеке.
 */
public class Person {
    /**
     * Имя.
     */
    private final String name;
    /**
     * Фамилия.
     */
    private final String surname;

    /**
     * Создаёт экземпляр класса на основании имени и даты
     * рождения.
     *
     * @param name имя человека
     * @param surname дата рождения человека
     */
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    /**
     * возвращает имя человека.
     *
     * @return имя человека
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает фамилию человека.
     *
     * @return фамилия человека
     */
    public String getSurname() {
        return surname;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            //Теплое с мягким
            return false;
        }
        Person eqPerson = (Person)obj;
        return getName().equals(eqPerson.getName()) && getSurname().equals(eqPerson.getSurname());
    }

    //Этот метод переопределился автоматически с помощью подсказки при заполнении метода equals.
    //Я понятия не имею, зачем нужно именно 79*7, но решил не мешать NetBeans делать свою работу.
    @Override
    public int hashCode() {
        //Можно было this.name.hashCode()+this.surname.hashCode() возвращать, но NetBeans говорит, так лучше.        
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hashCode(this.surname);
        return hash;
    }
}
