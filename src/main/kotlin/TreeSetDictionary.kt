import java.io.File
import java.util.*

object TreeSetDictionary: IDictionary{
    private val words = TreeSet<String>()
    init{
        val lines = File(IDictionary.FileName).readLines()
        for(i in 0..lines.size-1) {
            words.add(lines[i]);
        }
    }
    override fun add(word: String): Boolean{
        val s = words.size
        words.add(word)
        if(s < words.size ){
            return true
        }
        return false
    }

    override fun find(word: String): Boolean{
        return words.contains(word)
    }

    override fun size(): Int{
        return words.size
    }
}