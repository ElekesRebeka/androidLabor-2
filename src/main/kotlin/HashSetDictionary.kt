import java.io.File
import java.util.*
import kotlin.collections.HashSet

object HashSetDictionary: IDictionary {
    private val words = HashSet<String>()
    init{
        val lines = File(IDictionary.FileName).readLines()
        for(i in 0..lines.size-1) {
            words.add(lines[i]);
        }
    }
    override fun add(word: String): Boolean{
        return words.add(word)
    }

    override fun find(word: String): Boolean{
        return words.contains(word)
    }

    override fun size(): Int{
        return words.size
    }
}