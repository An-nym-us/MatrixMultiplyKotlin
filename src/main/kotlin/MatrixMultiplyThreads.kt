class MatrixMultiplyThreads(thread: String) : Thread() {
    override fun run() {

        //runCalulation()
        runMatrixCalulations()
    }

    val currentTimestamp = System.currentTimeMillis();
    public var threadPassing: String = thread;
    fun runCalulation() {
        //var passing: String = threadPassing;
        var x: Long = 0
        println("Thread $threadPassing started")

        for (i in 1..20000000000) {
            //println("Thread $threadPassing $x")
            x++
        }


        //println(x)


        val EndTimestamp = System.currentTimeMillis()
        var timeout = EndTimestamp - currentTimestamp;
        println("Thread $threadPassing Has Complteted Task In $timeout Milliseonds")

    }


    fun runMatrixCalulations()
    {
        var instnace = MatrixMultiply()

        val matrix_Size: Int = 700
        instnace.create_2D_Matrix(matrix_Size);
        println("Matrixs have been cvreated")
        instnace.multiply_The_Arrays(matrix_Size);
    }


}