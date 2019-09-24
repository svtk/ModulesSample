package module2
import module1.*

val a = 17
internal val m = 4
internal fun g(x: Int) = x * m * m
internal class Boat {
    override fun toString() = "Boat"
}

fun main() {
    println(
        "${module1.a} $a $m ${g(2)} ${Boat()}"
    )
    println(publicFun(1))
    println(PublicClass())
//    println(n) // Error: Cannot access 'n': it is internal in 'module1'
//    println(f(10)) // Error: Cannot access 'f': it is internal in 'module1'
//    println(Square()) // Error: Cannot access 'Square': it is internal in 'module1'
}
/* Output:
9 17 4 32 Boat
publicFun(1)
PublicClass
*/