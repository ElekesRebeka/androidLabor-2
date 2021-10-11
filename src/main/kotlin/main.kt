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
    val date:Date=Date(1900,2,21);
    println(date.isLeapYear());
    val date2:Date=Date(1012,2,21);
    println(date2.isLeapYear());


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
    return false;
}

fun Date.isValid(): Boolean {
    //return this.getTime() === this.getTime();
    return true
}