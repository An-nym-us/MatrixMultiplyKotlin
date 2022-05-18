import java.util.concurrent.TimeUnit
import java.util.Random



var randomArray_1 = arrayOf<Array<Double>>();
var randomArray_2 = arrayOf<Array<Double>>();
var output_array_Seq = arrayOf<Array<Double>>();




class UserThread1(thread: String) : Thread() {
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
        println("Thread $threadPassing Has Complteted Task In $timeout Milliseonds" )

    }

    fun runMatrixCalulations()
    {
        val matrix_Size: Int = 700
        create_2D_Matrix(matrix_Size);
        println("Matrixs have been cvreated")
        multiply_The_Arrays(matrix_Size);
    }
}


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
    var timeout = EndTimestamp - currentTimestamp;
    println("Finished Creation In $timeout  Miliseconds")
}


fun multiply_The_Arrays(size_of_Matrix: Int) {
    val currentTimestamp = System.currentTimeMillis();


    // Vomit 2D array
    /*
for (array in randomArray_1) {
    for (value in array) {
        print("$value ");
    };
    println();
}

println("====================================================================================");
for (array in randomArray_2) {
    for (value in array) {
        print("$value ");
    };
    println();
}

println("====================================================================================");
for (array in output_array_Seq) {
    for (value in array) {
        print("$value ");
    };
    println();
}
*/




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
    var timeout = EndTimestamp - currentTimestamp;
    println("Finsihed Multiplying In $timeout miliseconds")
    println("====================================================================================");
    /*
    if (timeout < 1000)
    {
        println("$timeout  In miliseconds")
    }
    else
    {
        timeout /= 1000;
        println("$timeout  In Seconds")
    }
*/


}


fun main(args: Array<String>) {
    println("Hello World!");
    //assert(false)

    for ( i in 1..4)
    {
        val matrix_Size: Int = 700
        create_2D_Matrix(matrix_Size);
        println("Matrixs have been created")
        multiply_The_Arrays(matrix_Size);
    }



    var temp = List(0){UserThread1("0")}
    for (i in 1..4)
    {
        temp += UserThread1("Thread $i")

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