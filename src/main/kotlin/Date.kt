import java.util.*

data class Date(val year:Int = Calendar.getInstance().get(Calendar.YEAR), val month:Int = Calendar.getInstance().get(Calendar.MONTH), val day:Int = Calendar.getInstance().get(Calendar.DAY_OF_MONTH)) : Comparable<Date>{
    override operator fun compareTo(other: Date): Int {
        if (this.year > other.year) return 1
        if (this.year < other.year) return -1
        if (this.month > other.month) return 1
        if (this.month < other.month) return -1
        if (this.day > other.day) return 1
        if (this.day < other.day) return -1
        return 0
    }
}