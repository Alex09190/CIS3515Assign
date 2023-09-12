class Circle (_circle: String, _radius: Double) :  Dimensionable {
    var name = _circle
    var radius = _radius


    fun setDimensions ( ) {

    }
    fun getArea(radius: Double): Double {

        val temp = radius

        return (temp * temp * 3.14)
    }
}
