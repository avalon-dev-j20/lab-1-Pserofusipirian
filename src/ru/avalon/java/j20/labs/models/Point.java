package ru.avalon.java.j20.labs.models;

/**
 * Модель представления о точке.
 */
public class Point<P extends Number> {
    /**
     * Абсцисса точки.
     */
    private final P x;
    /**
     * Ордината точки.
     */
    private final P y;

    /**
     * Основной конструктор класса.
     *
     * @param x абсцисса точки
     * @param y ордината точки
     */
    public Point(P x, P y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Возвращает абсциссу точки.
     *
     * @return x-координата точки.
     */
    public P getX() {
        return x;
    }

    /**
     * Возвращает ординату точки.
     *
     * @return y-координата точки.
     */
    public P getY() {
        return y;
    }

    /**
     * Возвращает дистанцию от точки до точки.
     *
     * @param point точка, до которой следует вычислить
     *              дистанцию.
     * @return дистанция между точками
     */
    public double distanceTo(Point point) {
        //Почему x.doubleValue() возвращает значение 1.2300000190734863, при том, что x = 1.23,
        //Как с этим бороться и зачем вообще этот метод doubleValue() нужен c такими особенностями?
        //Приходится через строку конвертировать, но даже при этом 2.32 - 3.0 с типами Double возвращает -0.6800000000000002        
        double dx = Double.valueOf(x.toString()) - Double.valueOf(point.x.toString());
        double dy = Double.valueOf(y.toString()) - Double.valueOf(point.y.toString());
        //float dx = x.doubleValue() - point.x.doubleValue();
        //float dy = y.doubleValue() - point.y.doubleValue();
        return Math.sqrt(dx * dx + dy * dy);
    }
}
