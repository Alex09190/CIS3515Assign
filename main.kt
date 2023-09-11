fun main(args: Array<String>) {






    val shape1 = Circle("Circle", 2 )
    val shape2 = Square("Square" , 2, 1, )
    val shape3 = Triangle("Triangle", 2,2,2 )
    val shape4 = EquilateralTriangle("Square" , 3)

    //println("Hello World!")
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    //println("Program arguments: ${args.joinToString()}")


}



interface Dimensionable {
    fun printDimensions() {
        println( this. )
    }

}

abstract class Shape (_name : String) : Dimensionable {
    var name = _name

    init { }


    fun setDimensions ( ) {

    }
    fun getArea(): Double {
        return 0.0
    }
}

class Circle (_circle: String, _radius: Int) :  Dimensionable {
    var name = _circle
    var radius = _radius


    fun setDimensions ( ) {

    }
    fun getArea() : Double{
        return 0.0
    }
}

class Square (_square : String, _length : Int, _height : Int) : Dimensionable {
    var name = _square
    var lenght = _length
    var height = _height
    fun setDimensions ( ) {

    }
    fun getArea() : Double{


        return 0.0
    }
}

class Triangle (_triangle : String, _side1 : Int,  _side2 : Int, _side3: Int) : Dimensionable {
    var name = _triangle
    var side1 = _side1
    var side2 = _side2
    var side3 = _side3

    fun setDimensions ( ) {

    }
    fun getArea() : Double{
        return 0.0
    }

}

class EquilateralTriangle(_equilateralTriangle : String, _side : Int) : Dimensionable {
    var name = _equilateralTriangle
    var side = 0

    fun setDimensions ( ) {

    }
    fun getArea(): Double {
        return 0.0
    }
}




