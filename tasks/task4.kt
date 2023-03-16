package tasks

fun main(){
    val  result = binaryAdd("101110","101101")
    println(result)

}




fun binaryAdd(a: String, b: String): String {

    var res = ""

    var lenghtOfa = a.length - 1
    var lenghtOfb = b.length - 1

    var summ = 0

    while (lenghtOfa >= 0 || lenghtOfb >= 0) {

        var sum = summ

        if (lenghtOfa >= 0) {
            sum += (a[lenghtOfa--] - '0')
        }

        if (lenghtOfb >= 0) {
            sum += (b[lenghtOfb--] - '0')
        }

        res = (sum % 2).toString() + res

        summ = (sum / 2)
    }

    if (summ > 0) {
        res = "1$res"
    }

    return res
}
