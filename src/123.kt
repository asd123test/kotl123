fun main (){
    val num1 = readLine()?.toFloat()!!
    val znak = readLine()!!
    val num2 = readLine()!!.toInt()
    println(calculator(num1, num2, znak))
}
fun calculator (first_number:Float, second_number:Int, pes_patron:String) :String {
    var num: String = ""
    when (pes_patron) {
        "-" -> {
            num = (first_number - second_number).toString()
        }
        "+" -> {
            num = (first_number + second_number).toString()
        }
        "*" -> {
            num = (first_number * second_number).toString()
        }
        "/" -> {
            num = (first_number / second_number).toString()
        }
        else -> "nepravilno"
    }
    return num
}