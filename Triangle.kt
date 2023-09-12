class Triangle(_triangle: String, _side1: Double, _side2: Double, _side3: Double) : Dimensionable {
    var name = _triangle
    var side1 = _side1
    var side2 = _side2
    var side3 = _side3

    fun setDimensions ( ) {

    }
    fun getArea() : Double{

        val s = 0.5 * side1 * side2 * side3
        var area = 0.0

        area = sqrt (( s - side1 ) * ( s - side2 ) * ( s - side3))


        return area
    }

}