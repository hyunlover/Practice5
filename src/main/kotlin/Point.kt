open class Point( var x:Double, var y:Double) // создание базового класса
{
    open fun moveX(distance:Double) // функция для перемещения точки по оси х
    {
        x+=distance;
    }
    open fun moveY(distance: Double) // функция для перемещения точки по оси y
    {
        y+=distance;
    }
    open fun moveXY(distanceX: Double,distanceY: Double) // функция для перемещения точки по обеим осям
    {
        x+=distanceX;
        y+=distanceY;
    }
    fun printlnInfo() // функция для вывода информации о точке
    {
        println(" Координаты точки: ($x,$y)"); // вывод информации

    }
}