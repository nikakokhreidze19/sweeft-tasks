package tasks

fun main(){
    val array = intArrayOf(1,7,3,4,5,9)
    val result = notContains(array)
    println(result)

}



fun notContains(arr: IntArray): Int {
    var res = 1
    val size = arr.size
    var i = 0
    while (i < size && res <= size) {
        if (arr[i] == res) {
            res++
            i = 0
        } else {
            i++
        }
    }
    return res
}
