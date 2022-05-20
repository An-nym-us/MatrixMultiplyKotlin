fun run_seq_Matrix()
{
    var instnace = MatrixMultiply();
    var storeTotalPocessTime: Long = 0

    for ( i in 1..2)
    {
        var temp: Long = 0;

        val matrix_Size: Int = 700
        instnace.create_2D_Matrix(matrix_Size);
        println("Matrix number $i has been created")

        temp = instnace.get_Matrix_Creation_time()
        storeTotalPocessTime += temp


        println("Matrix created in $temp miliseconds")
        instnace.multiply_The_Arrays(matrix_Size);

        temp = instnace.get_Matrix_Multiply_time()
        println("Matrix Multiply time completed in $temp miliseconds")

        storeTotalPocessTime += temp
    }
    println("START REPORT ================================================")
    println("Total completion of these process was $storeTotalPocessTime miliseconds")
    println("END REPORT ================================================")


}



fun run_Epic()
{
    var storeTotalPocessTime: Long = 0;
    var temp = List(0){MatrixMultiplyThreads("0")}

    for (i in 1..6)
    {
        temp += MatrixMultiplyThreads("Thread $i")
    }
    for (i in temp)
    {
        i.start()
        //i.join()
    }


    var isvalid: Boolean = true;
    while(isvalid == true)
    {


        for (i in temp)
        {
            if (!i.isAlive)
            {
                isvalid = false;

                for (i in temp)
                {
                    if (i.get_Total_calculation_time() > storeTotalPocessTime)
                    {
                        storeTotalPocessTime = i.get_Total_calculation_time();
                    }
                }
            }
        }


    }


    println("START REPORT ================================================")
    println("Total completion of these process was $storeTotalPocessTime miliseconds")
    println("END REPORT ================================================")


}

fun main(args: Array<String>) {
    println("Hello World!");
    //assert(false)

    run_seq_Matrix()  ;
    run_Epic()


    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}");
}