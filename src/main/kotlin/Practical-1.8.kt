import java.util.*

fun main()
{
    print("Array using arrayOf :")
    var a= arrayOf(12,15,24,67,56)
    println(Arrays.deepToString(a))

    print("Array using Array<datatype>(length){value } :")
    var b=Array<String>(5){"Jaydip"}
    println(Arrays.deepToString(b))

    var c=Array<Int>(4){i:Int->i}
    println(Arrays.deepToString(c))

    print("Array using CharArray :")
    var d=CharArray(5){'J'}
    println(Arrays.toString(d))

    for (i in 0..4)
    {
        print(d[i]+" ")
    }
    println()

    var e= intArrayOf(10,20,50,95,65)
    println(Arrays.toString(e))

    print("multi-dimension Array :")
    var mul= arrayOf(intArrayOf(1,4,7), intArrayOf(2,5,8), intArrayOf(3,6,9))
    for(row in mul){
        print(row.contentToString())
    }
    println()

    //create own lamda function
    fun xyz(g:(Int)->Int){
        var j=g(12)
        println(j)
    }

    xyz({i:Int -> i+1})



    println("Enter the size of range")
    var size= readln().toInt()

    var array1=IntArray(size)

    for (i in 0..size-1)
    {
        println("Enter the value of index ${i} :" )
        array1[i]=readln().toInt();
    }

    fun printarray()
    {
        for (i in 0..size-1)
        {
            println("Values at index ${i} is ${array1[i]}")
        }
    }
    printarray()


    println("Sorted array is")
    var sortarray=array1.sort()
    printarray()


    fun bubblesort(b: IntArray) {
        var n = b.size
        for (i in 0 until n - 1) {
            for (j in 0 until n - i - 1) {
                if (b[j] > b[j + 1]) {
                    var temp = b[j]
                    b[j] = b[j + 1]
                    b[j + 1] = temp
                }
            }
        }
    }
    var sortedarray= bubblesort(array1)
    println("Array after sorted using bubble sort")
    printarray()

}