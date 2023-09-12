class Square(_square: String, _length: Double, _height: Double) : Dimensionable {
    var name = _square
    var lenght = _length
    var height = _height
    fun setDimensions ( ) {

    }
    fun getArea() : Double{

        val temp = lenght * height

        return temp
    }
}