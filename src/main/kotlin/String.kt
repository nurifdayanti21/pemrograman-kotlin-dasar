/*fun main(args: Array<String>) {
    val myName: String = "Nur Ifdayanti"
    for(chr in myName){
        print(chr)
    }
    print('\n')
}

 */
/*fun main(args: Array<String>) {
    val s = "abc" + 1
    println(s + "def")
}

 */

//RAW STRING
/*fun main(args: Array<String>) {
    var text = """ 
        for (c in "foo") 
            print(c) 
    """
    println(text) }

 */

//MENGHAPUS SPASI YANG TIDAK DIPERLUKAN
fun main(args: Array<String>) {
    var text = """ 
            |Tell me and I forget. 
            |Teach me and I remember. 
            |Involve me and I learn. 
            |(Benjamin Franklin) 
            """.trimMargin()
    println(text)
}