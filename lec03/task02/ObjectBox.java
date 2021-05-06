package task02;

import java.util.Collection;

/**
 * Класс для хранения объектов в коллекции.
 */
public class ObjectBox {
    Collection<Object> objects;

    /**
     * Конструктор
     * @param collection коллекция объектов
     */
    public ObjectBox(Collection<Object> collection) {
        this.objects = collection;
    }

    /**
     * Добавляет новый объект
     *
     * @param o добовляемый объект
     * @return true усли объект был добавлен
     */
    public boolean addObject(Object o){
        return this.objects.add(o);
    }

    /**
     * Удаляет объект
     *
     * @param o удаляемый объект
     * @return true усли объект был удален
     */
    public boolean deleteObject(Object o){
        return this.objects.remove(o);
    }

    /**
     * Выводит содержимое соллекции в строку.
     */
    public void dump(){
        System.out.println(this.objects.toString());
    }
}
