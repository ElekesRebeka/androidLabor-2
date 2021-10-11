fun main(){
    //val dict: IDictionary = ListDictionary
    val dict1 = DictionaryProvider.createDictionary(DictionaryType.TREE_SET)
    val dict2 = DictionaryProvider.createDictionary(DictionaryType.HASH_SET)
    println("Number of words: ${dict1.size()}")
    var word: String?
    while(true){
        print("What to find? ")
        word = readLine()
        if( word.equals("quit")){
            break
        }
        println("Result: ${word?.let { dict1.find(it) }}")
    }

    //Task 2 --> extension functions
    val name: String = "John Smith"
    println(name.monogram())
    val list = listOf( "apple", "pear", "melon")
    println(list.separate("#"))
    println(list.longest())

    //Task 3 --> Date
    val currentDate: Date = Date()
    val date:Date=Date(1900,2,21)
    println(date.isLeapYear())
    val date2:Date=Date(1012,2,21)
    println(date2.isLeapYear())

    var validDates=0
    var listOfValidDates = arrayListOf<Date>()
    while(validDates<10){
        val temp = generateRandom()
        if(temp.isValid()){
            listOfValidDates.add(temp)
            validDates++
        }
        else{
            println(temp)
        }
    }
    println("Valid dates: $validDates")
    listOfValidDates.forEach({println("Date: ${it}")})

    listOfValidDates.sort()
    println("Sorted:")
    listOfValidDates.forEach({println("Date: ${it}")})

    println("\nReverse:")
    listOfValidDates.reverse()
    listOfValidDates.forEach({println("Date: ${it}")})

    val comparator = ComparatorByDay()
    listOfValidDates.sortWith(comparator)
    println("\nList sorted with comparator")
    listOfValidDates.forEach({println("Date: ${it}")})
}

fun generateRandom(): Date{
    val y: Int = (1800..2100).random()
    val m: Int = (1..12).random()
    val d: Int = (1..31).random()
    var temp: Date = Date(y,m,d);
    return temp;
}

fun String.monogram(): String{
    return this.split(' ').toList().map{it[0]}.joinToString(separator = "")
}

fun List<Any>.separate(delimiter: String): String{
    return this.joinToString ( separator = delimiter )
}

fun List<String>.longest(): String{
    return this.sortedBy { it -> it.length }[size-1]
}

fun Date.isLeapYear(): Boolean{
    if(this.year % 400==0){
        return true;
    }
    else if(this.year % 100 == 0 ){
        return false
    }
    else if(this.year % 4 == 0 ){
        return true
    }
    return false
}

fun Date.isValid(): Boolean {
    if(this.isLeapYear()){
        if(this.month==2){
            if(this.day>29){return false}
        }
    }
    else{
        if(month == 2){
            if(this.day>28){
                return false;
            }
        }
        if(this.month==1 || this.month==3 || this.month==5 || this.month==7 || this.month==8 || this.month==10 || this.month==12){
            if(this.day>31){
                return false;
            }
        }
        else{
            if(this.day>30){
                return false;
            }
        }
    }
    if( this.year<1800 || this.year > 2100){
        return false;
    }
    return true
}

class ComparatorByDay: Comparator<Date>{
    override fun compare(o1: Date, o2: Date): Int {
        return o1.day.compareTo(o2.day)
    }
}