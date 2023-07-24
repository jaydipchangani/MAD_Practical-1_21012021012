fun main() {
    println("Enter Number : ")
    var num = readln().toInt()
    var result : Int = fact(num)
    println("Factorial of $num = $result")
    println("By TailRec Keyword, Factorial of $num = $result")
}

tailrec fun fact(n: Int): Int {
    return if (n == 1){
        n
    }
    else {
        n * fact(n-1)
    }
}