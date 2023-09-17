class ColoredLine(startPoint: Point, endPoint: Point,
                  var color :String): Line(startPoint, endPoint) // создание класса
{
    override fun printlnInfo() // функция для вывода информации о линии
    {
        super.printlnInfo(); // отсылка на конструктор
        println("Цвет линии : $color"); // вывод информации
    }
}