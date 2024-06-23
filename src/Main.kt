import java.lang.ScopedValue.where

const val PI = 3.14
fun main() {

    print("enter val A:")
    var inp = readln()!!.toInt()
    var x=1; var y=1
    while(x<=inp)y *= x++
    println("Factorial = $y ")

    print("enter price:")
    inp = readln()!!.toInt()
    for(i  in 1..10)
    println("Sum for $i kg of candies = ${inp*i} $ ")

    print("enter A and B:")
    val(A, B) = readln()!!.split(" ").map(String::toInt);
    var str : String = "created row: ";
    for(i in A..B) str +=" $i"; println(str)

    print("enter natural number:")
    inp = readln()!!.toInt()
    while(inp > 0){
        print(" ${ inp % 10 }"); inp /=10;
    };  println();

    var n =0;
    for(n in 1..20)when(n)
    {
        n%2-> continue;
        19 -> break;
        else -> if (n%2==0){
            var x=n
            if(n%4==0) x=4;
            println(x)
        }
    }
}