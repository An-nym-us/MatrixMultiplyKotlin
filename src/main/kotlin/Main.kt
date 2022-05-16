import java.util.concurrent.ThreadLocalRandom

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




fun create_2D_Matrix(size_of_Matrix: Int)
{


    //assert(size_of_Matrix != 0);

    var rnds : Double = 0.0;
        // Create a 2D Array
    for (i in 0..size_of_Matrix) {
        var array = arrayOf<Double>();
        var array_2 = arrayOf<Double>();
        var array_output = arrayOf<Double>();
        for (j in 0..size_of_Matrix) {
            // Create a random Double IN range of -1.0 amd 1.0
            rnds = ThreadLocalRandom.current().nextDouble(-1.0, 1.0);
            array += rnds;

            // Fill array 2
            rnds = ThreadLocalRandom.current().nextDouble(-1.0, 1.0);
            array_2 += rnds;

            array_output += 0.0;

        }
        randomArray_1 += array;
        randomArray_2 += array_2;
        output_array_Seq += array_output;
    }

    // Vomit 2D array
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


}


fun multiply_The_Arrays()
{

}





fun main(args: Array<String>) {
    println("Hello World!");


    create_2D_Matrix(5);

    multiply_The_Arrays();

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