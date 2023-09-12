fun main(args: Array<String>) {
    println("Hello, World!")


    val shape1 = Circle("Circle", 2.0 )
    val shape2 = Square("Square" , 2.0, 1.0, )
    val shape3 = Triangle("Triangle", 2.0,2.0,2.0 )
    val shape4 = EquilateralTriangle("Square" , 3.0)

    println( shape1.name )

    shape1.printDimensions( shape1 )

    shape2.printDimensions( shape2 )

    shape3.printDimensions( shape3 )

    shape4.printDimensions( shape4 )



}











