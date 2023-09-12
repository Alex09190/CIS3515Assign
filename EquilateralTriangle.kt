class EquilateralTriangle(_equilateralTriangle: String, _side: Double) : Dimensionable {
    var name = _equilateralTriangle
    var side = _side

    fun setDimensions ( ) {



    }
    fun getArea(): Double {
        val s = 0.5 * side * side * side
        var area = 0.0

        area = sqrt(( s - side ) * ( s - side ) * ( s - side))
    }
}
