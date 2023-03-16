package tasks
fun main() {
    val set = DeletableSet()
    set.add(1)
    set.add(2)
    set.add(3)
    println(set.contains(2))
    set.delete(2)
    println(set.contains(2))
    println(set.isDeleted(2))
}



class DeletableSet {
    private val items = mutableSetOf<Int>()
    private val deletedItems = mutableSetOf<Int>()

    fun add(item: Int) {
        items.add(item)
    }

    fun contains(item: Int): Boolean {
        return items.contains(item)
    }

    fun delete(item: Int) {
        items.remove(item)
        deletedItems.add(item)
    }

    fun isDeleted(item: Int): Boolean {
        return deletedItems.contains(item)
    }
}
