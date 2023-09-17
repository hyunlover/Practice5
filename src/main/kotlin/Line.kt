open class Line(x1:Double, y1:Double, x2:Double, y2:Double) // создание класса
{
    var startPoint: Point = Point(x1, y1); // создание переменной со значение начала линии
    var endPoint:Point=Point(x2,y2); // создание переменной со значением конца линии
    constructor(startPoint: Point, endPoint:Point): this (startPoint.x, startPoint.y, endPoint.x, endPoint.y); /* создание конструктора, который
                                                                                                             принимает координаты и объекты класса */
    open fun printlnInfo() //  функция для вывода информации о линии
    {
        println("Линия = точка1 : (${startPoint.x},${startPoint.y}), точка 2: (${endPoint.x},${endPoint.y})"); // вывод информации

    }
}