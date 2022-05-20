class MatrixMultiplyThreads(thread: String) : Thread() {
    override fun run() {
        runMatrixCalulations()
    }

    var timeout_MC : Long = 0



    fun runMatrixCalulations()
    {
        val currentTimestamp = System.currentTimeMillis();

        var temp: Long = 0;
        var instnace = MatrixMultiply()


        val matrix_Size: Int = 700
        instnace.create_2D_Matrix(matrix_Size);
        println("Matrixs have been created")

        temp = instnace.get_Matrix_Creation_time()
        println("Creation completed in $temp milliseconds")


        instnace.multiply_The_Arrays(matrix_Size);

        temp = instnace.get_Matrix_Multiply_time()
        println("Calculation completed in $temp milliseconds")


        val EndTimestamp = System.currentTimeMillis();
        timeout_MC = EndTimestamp - currentTimestamp;
    }


    fun get_Total_calculation_time() : Long
    {
        return timeout_MC;
    }

}