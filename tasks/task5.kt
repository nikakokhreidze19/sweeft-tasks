package tasks

fun main(){
    val result = variantOfCount(4)
    println( result)

}

fun variantOfCount(n: Int): Int {

    if (n == 0 || n == 1) {
        return 1
    }
    else {
        return variantOfCount(n-1) + variantOfCount(n-2)
    }
}
