fun main(){
    val arrayNumList: ArrayList<Int> = arrayListOf(25, 24, 23, 22, 21, 20, 19)
    println(reverse(arrayNumList))

}

fun reverse (arrayNum: ArrayList<Int>): ArrayList<Int> {
    val result: ArrayList<Int> = arrayListOf()
    for (i: Int in arrayNum.size - 1 downTo  0) {
        result.add (arrayNum[i])
    }
    return result
}