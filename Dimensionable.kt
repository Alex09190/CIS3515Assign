interface Dimensionable {
    fun printDimensions(_shape : Shape) {

        println( "Its a Shape!" )
    }


    fun printDimensions(_shape : Circle) {

        var temp: Double = 0.0

        temp = _shape.getArea()

        println( temp )
    }

    fun printDimensions(_shape : Square) {

        var temp: Double = 0.0

        temp = _shape.getArea()

        println( temp )
    }

    fun printDimensions(_shape : Triangle) {

        var temp: Double = 0.0

        temp = _shape.getArea()

        println( temp )
    }

    fun printDimensions(_shape : EquilateralTriangle) {

        var temp: Double = 0.0

        temp = _shape.getArea()

        println( temp )
    }


}