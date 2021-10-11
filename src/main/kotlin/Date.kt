import java.util.*

data class Date(val year:Int = Calendar.getInstance().get(Calendar.YEAR), val month:Int = Calendar.getInstance().get(Calendar.MONTH), val day:Int = Calendar.getInstance().get(Calendar.DAY_OF_MONTH)){

}