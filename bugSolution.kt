fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.removeAll { it % 2 == 0 }
    println(list) // Output: [1, 3, 5]

    val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    set.removeAll { it % 2 == 0 }
    println(set) // Output: [1, 3, 5]

    //Alternative solution for consistency
    fun <T> MutableCollection<T>.removeIfConsistent(predicate: (T) -> Boolean): Boolean {
        val toRemove = this.filter(predicate)
        return this.removeAll(toRemove)
    }

    val list2 = mutableListOf<Int>(1,2,3,4,5)
    list2.removeIfConsistent {it % 2 == 0}
    println(list2) //Output: [1, 3, 5]

    val set2 = mutableSetOf<Int>(1,2,3,4,5)
    set2.removeIfConsistent {it % 2 == 0}
    println(set2) //Output: [1,3,5]
}