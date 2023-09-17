class Polygone(var vertices: Array<Point>) // создание класса
{
    fun moveX(distance: Double) // функция для перемещения вершин по оси х
    {
        for (point in vertices)
        {
            point.moveX(distance); // перемещение точки
        }
    }
    fun moveY(distance:Double) // функция для перемещения вершин по оси y
    {
        for (point in vertices)
        {
            point.moveY(distance); // перемещение точки
        }
    }
    fun moveXY(distanceX: Double, distanceY: Double) // функция для перемещения вершин по обеим осям
    {
        for (point in vertices)
        {
            point.moveXY(distanceX, distanceY); // перемещение точки
        }
    }
    open  fun printlnInfo() // функция для вывода информации о многоугольнике
    {
        println("Многоугольник = количество вершин :${vertices.size}"); // вывод информации
        for (i in 0 until vertices.size) // условие для вывода вершин
        {
            println("Вершины $i: (${vertices[i].x}, ${vertices[i].y}"); // вывод информации

        }
    }

}