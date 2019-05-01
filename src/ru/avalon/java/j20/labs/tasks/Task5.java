package ru.avalon.java.j20.labs.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.core.RandomArrayFactory;

import java.util.List;
import java.util.Set;

/**
 * Задание №5.
 *
 * <p>Тема: "Изучение отличия между списками и наборами".
 */
public class Task5 implements Task {

    /**
     * Фабрика, генерирующая массивы чисел случайного характера.
     */
    private final RandomArrayFactory arrayFactory = new RandomArrayFactory();

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        final int[] array = arrayFactory.getInstance(20);
        
        //Лучше было бы изменить метод getInstance, чтоб он возвращал Integer[], а не int[],
        //но не ясно можно ли это делать согласно заданию. Поэтому копируется в новый массив Integer[]
        Integer[] arrayNew = Arrays.stream(array).boxed().toArray(Integer[]::new);
        
        //List<Integer> list = new ArrayList<Integer>();
        List<Integer> list = Arrays.asList(arrayNew);
        
        //Set<Integer> set = new HashSet<>(list);
        Set<Integer> set = new LinkedHashSet<>(list);
        
       //Ненужное в мусор
        arrayNew = null;
        
        /**
         * TODO(Студент): Выполните задание №5
         *
         * 1. Проинициализируйте переменные list и set объектами
         *    подходящих классов.
         *
         * 2. В обе коллекции поместите элементы массива array.
         *
         * 3. С использованием отладчика проверьте корректность
         *    выполнения задания.
         */
    }
}
