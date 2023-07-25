
fun main()
{
    var s1 =student("Jaydip","21012021012")
    println("Student name is ${s1.name}")
    println("Student Enrollment no is ${s1.en}")
}

class student<string>(var name:string,er:string) {

    var en: string = er
    init {
        println("This is init class")
    }


}


