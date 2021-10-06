fun main(){
    //val dict: IDictionary = ListDictionary
    val dict: IDictionary = TreeSetDictionary
    println("Number of words: ${dict.size()}")
    var word: String?
    while(true){
        print("What to find? ")
        word = readLine()
        if( word.equals("quit")){
            break
        }
        println("Result: ${word?.let { dict.find(it) }}")
    }

    //Task 2 --> extension functions
    val name: String = "John Smith"
    println(name.monogram())
    val list = listOf( "apple", "pear", "melon")
    println(list.separate("#"))
    println(list.longest())

    //Task 3 --> 

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