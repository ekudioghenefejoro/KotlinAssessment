fun main() {
    var display1 = evenSpacing(2,4,6)
    var display2 = evenSpacing(4,6,2)
    var display3 = evenSpacing(4,6,3)
    println(display1)
    println(display2)
    println(display3)
}

fun evenSpacing(a: Int, b: Int, c: Int): Boolean{
    var large = a.coerceAtLeast(b.coerceAtLeast(c))
    var small = a.coerceAtMost(b.coerceAtMost(c))
    var medium = (a + b + c) - large - small
    return (large - medium) == (medium - small)
}
