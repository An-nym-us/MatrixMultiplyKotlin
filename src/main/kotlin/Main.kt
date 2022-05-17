import java.util.concurrent.ThreadLocalRandom
import kotlin.coroutines.*


var randomArray_1 = arrayOf<Array<Double>>();
var randomArray_2 = arrayOf<Array<Double>>();
var output_array_Seq = arrayOf<Array<Double>>();


fun testing(passing: Double)
{
    println(passing);
    //passing = 500.0;
}
data class SomeObj(var x: Int = 0)

fun takeObject(o: SomeObj) {
    o.x = 1
}


class UserThread_1():Thread()
{
    override fun run()
    {

        var x: Long = 2
        println("Thread One Created and started")

        for (i in 1..1000000000)
        {
            println("Thread one $x")
            x++
        }
        println(x)
        println("Thread One Has Complteted Task")
    }
}

class UserThread_2():Thread()
{
    override fun run()
    {

        var x: Long = 2
        println("Thread Two Created and started")

        for (i in 1..1000000000)
        {
            println("Thread Two $x")
            x++
        }
        println(x)
        println("Thread Two Has Complteted Task")
    }
}

fun create_2D_Matrix(size_of_Matrix: Int)
{
    val currentTimestamp = System.currentTimeMillis();

    //assert(size_of_Matrix != 0);

    var rnds : Double = .5;
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


    var timeout = EndTimestamp - currentTimestamp ;
    println("$timeout  In miliseconds")
}


fun multiply_The_Arrays(size_of_Matrix: Int)
{
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



    println("====================================================================================");
    for (i in 0 .. size_of_Matrix)
    {
        for (j in 0.. size_of_Matrix )
        {
            for (k in 0.. size_of_Matrix )
            {
                output_array_Seq[i][j] += randomArray_1[i][k] * randomArray_2[k][j];
                //println(output_array_Seq[j][k]);
            };
        };
    };

    var size: Int = 0;
    for (j in 0.. size_of_Matrix )
    {
        for (k in 0.. size_of_Matrix )
        {
           //println(output_array_Seq[j][k]);
            size += 1;
        };
    };


    val EndTimestamp = System.currentTimeMillis();


    var timeout = EndTimestamp - currentTimestamp ;

    println(size)

    println("$timeout  In miliseconds")
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

    val matrix_Size: Int = 1000
    //create_2D_Matrix(matrix_Size);
    //println("Matrixs have been cvreated")
    //multiply_The_Arrays(matrix_Size);




    var t1= UserThread_1()
    var t2=UserThread_2()
    t1.start()
    t2.start()


    /*
    var passing: Double = 1000.0;
   testing(passing);


    val obj = SomeObj()
    takeObject(obj)
    println("obj after call: $obj") // SomeObj(x=1)
*/


    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}");
}