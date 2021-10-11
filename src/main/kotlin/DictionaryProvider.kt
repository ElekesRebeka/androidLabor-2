object DictionaryProvider {
    fun createDictionary(type: DictionaryType): IDictionary{
        when(type){
            DictionaryType.ARRAY_LIST -> return ListDictionary;
            DictionaryType.TREE_SET -> return TreeSetDictionary;
            DictionaryType.HASH_SET -> return HashSetDictionary;
        }

    }
}