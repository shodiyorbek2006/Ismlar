import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val name = arrayOf<String>("Ali","Bond","Alisa","Bill","Alex","Bony")
    val nameA = arrayOfNulls<String>(100)
    val nameB = arrayOfNulls<String>(100)
    var count = 0
    for (names in name.indices){
        if (name[names].startsWith("A")){
            nameA[count] = name[names]
            count++
        }
    }
    for (names in 0 until count){
        println(nameA[names])
    }
    count = 0
    println()
    for (names in name.indices){
        if (name[names].startsWith("B")) {
            nameA[count] = name[names]
            count++
        }
    }
    for (names in 0 until count){
        println(nameA[names])
    }
}



