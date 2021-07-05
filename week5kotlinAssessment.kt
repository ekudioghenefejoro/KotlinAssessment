fun main(args: Array<String>) {
    var display1: String = "Hello Issy, Hooe you are good"
    println("The Original Sentence is: $display1")
    var display2: String = removeVowels("Hello Issy, hope you are good")
    println("When the removeVowels function is use: $display2")
}

fun removeVowels(str: String): String {
    var display: String = ""
    var c: Char
    for (x in 0 until str.length) {
        c = str[x]
        if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')){
            display += c
        }
    }
    return display
}