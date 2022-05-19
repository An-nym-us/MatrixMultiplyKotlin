class MatrixMultiply {
    var randomArray_1 = arrayOf<Array<Double>>();
    var randomArray_2 = arrayOf<Array<Double>>();
    var output_array_Seq = arrayOf<Array<Double>>();
    var timeout_MM: Long = 0;
    var timeout_MC : Long = 0


    fun create_2D_Matrix(size_of_Matrix: Int) {
        val currentTimestamp = System.currentTimeMillis();

        //assert(size_of_Matrix != 0);

        var rnds: Double = .5;
        // Create a 2D Array
        for (i in 0..size_of_Matrix) {
            var array = arrayOf<Double>();
            var array_2 = arrayOf<Double>();
            var array_output = arrayOf<Double>();
            for (j in 0..size_of_Matrix) {
                // Create a random Double IN range of -1.0 amd 1.0
                //rnds = ThreadLocalRandom.current().nextDouble(-1.0, 1.0);
                array += .5

                // Fill array 2
                //rnds = ThreadLocalRandom.current().nextDouble(-1.0, 1.0);
                array_2 += .5

                array_output += 0.0;

            }
            randomArray_1 += array;
            randomArray_2 += array_2;
            output_array_Seq += array_output;
        }


        val EndTimestamp = System.currentTimeMillis();
        timeout_MC = EndTimestamp - currentTimestamp;

    }

    fun get_Matrix_Multiply_time() : Long
    {
        return timeout_MM;
    }

    fun get_Matrix_Creation_time() : Long{
        return timeout_MC;
    }

    fun multiply_The_Arrays(size_of_Matrix: Int) {

        val currentTimestamp = System.currentTimeMillis();



        for (i in 0..size_of_Matrix) {
            for (j in 0..size_of_Matrix) {
                for (k in 0..size_of_Matrix) {
                    output_array_Seq[i][j] += randomArray_1[i][k] * randomArray_2[k][j];
                    //println(output_array_Seq[j][k]);
                };
            };
        };

        var size: Int = 0;
        for (j in 0..size_of_Matrix) {
            for (k in 0..size_of_Matrix) {
                //println(output_array_Seq[j][k]);
                size += 1;
            };
        };


        val EndTimestamp = System.currentTimeMillis();
        timeout_MM = EndTimestamp - currentTimestamp;


    }
}