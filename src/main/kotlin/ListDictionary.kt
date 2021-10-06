import java.io.File

object ListDictionary: IDictionary {
    private val words = arrayListOf<String>()
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
        val res = words.indexOf(word)
        if(res == -1){return false}
        return true
    }

    override fun size(): Int{
        return words.size
    }
}