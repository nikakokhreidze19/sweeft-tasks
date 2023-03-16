package tasks

fun main(){
    val result = minSplit(23)
    println(result)

}


fun minSplit(amount: Int): Int {
    val coins = intArrayOf(1, 5, 10, 20, 50)
    var ourAmount = amount
    var res = 0
    var i = coins.size - 1


    while (i >= 0) {
        while (ourAmount >= coins[i]) {
            ourAmount -= coins[i]
            res++
        }
        i--
    }
    return res
}