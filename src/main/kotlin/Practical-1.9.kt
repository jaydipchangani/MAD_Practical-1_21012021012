fun main()
{
    println("Enter the length of array: ")
    var length =readln().toInt()

    var array=IntArray(length)

    for (i in 0 .. length-1)
    {
        println("Enter value of index ${i}:")
        array[i]=readln().toInt()

    }
    var max=array[1]

    for (i in 0 .. length-1)
    {
        if(array[i]>max)
        {
            max=array[i]
        }
    }

    println("Maximum number is ${max}")
}