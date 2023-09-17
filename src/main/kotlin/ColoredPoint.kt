class ColoredPoint(x: Double, y: Double): Point(x, y) // создание класса
{
    var color :String="Black" // создание переменной с изначальным значением
    constructor(x:Double, y: Double, color:String): this(x, y) /* создание конструктора
                                                                для изменения цвета точки*/
    {
        this.color = color; // изменение цвета
    }
    fun printlInfo() // функция для вывода информации о точке
    {
        println(" Цвет точки : $color") // вывод информации
    }
}