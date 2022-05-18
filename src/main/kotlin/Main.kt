import java.util.concurrent.TimeUnit
import java.util.Random












fun main(args: Array<String>) {
    println("Hello World!");
    //assert(false)
var instnace = MatrixMultiply();


    for ( i in 1..1)
    {
        val matrix_Size: Int = 700
        instnace.create_2D_Matrix(matrix_Size);
        println("Matrixs have been created")
        instnace.multiply_The_Arrays(matrix_Size);
    }



    var temp = List(0){MatrixMultiplyThreads("0")}
    for (i in 1..4)
    {
        temp += MatrixMultiplyThreads("Thread $i")

    }
    for (i in temp)
    {
        //println("Thread $i Created")
        i.start()
       //i.join()
    }






    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}");
}