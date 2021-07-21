//given a random non-negative number, you have to return the digits of this number within an array in reverse order. using kotling



fun rearranged() {
    var num2 = 123456789
    var reversedOrder = 0

    while (num2 != 0) {
        val digit = num2 % 10
        reversedOrder = reversedOrder * 10 + digit
        num2 /= 10
    }

    println("Reversed  Number: $reversedOrder")

}

fun main() {
    rearranged()

}


