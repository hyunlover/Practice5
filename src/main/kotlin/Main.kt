fun main(args: Array<String>)
{
    val point1=Point(2.0,5.0); // создание константы, присваивание значения точки
    val coloredPoint1=ColoredPoint(2.0,3.0,"Red"); // создание константы, присваивание значения цветной точки
    point1.moveX(3.0); // перемещение точки по оси OX на 3
    coloredPoint1.moveY(1.0); // перемещение точки по оси OY на 1
    point1.printlnInfo();           // вывод информации
    coloredPoint1.printlnInfo();
    val line1=Line(Point(3.0,4.0),Point(6.0,6.0)); // создание константы для линии
    val coloredLine1=ColoredLine(Point(2.0,3.0),Point(3.0,4.0),"Green"); // создание константы для цветной линии
    line1.printlnInfo();           // вывод информации
    coloredLine1.printlnInfo();
    val polygon1=Polygone(arrayOf (Point(2.0,4.0),Point(5.0,5.0),Point(4.0,5.0))); /* создание константы для
                                                                                                                 многоугольника*/
    polygon1.moveXY(3.0,1.0); // перемещение многоугольника по осям OX и OY
    polygon1.printlnInfo(); // вывод информации

}