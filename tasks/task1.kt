package tasks

fun main(){
    val numbers = intArrayOf(1,1,2,2,3)
    val result = singleNumber(numbers)
    println(result)


}

fun singleNumber(nums: IntArray): Int {
    val uniqueNumber = HashSet<Int>()
    var res = 0
    for (num in nums) {
        if (num in uniqueNumber) {
            uniqueNumber.remove(num)
            res -= num
        } else {
            uniqueNumber.add(num)
            res += num
        }
    }
    return res
}