interface IDictionary {
    companion object {
        val FileName="dictionary.txt"
    }
    fun add(word: String): Boolean;
    fun find(word: String): Boolean;
    fun size(): Int;
}