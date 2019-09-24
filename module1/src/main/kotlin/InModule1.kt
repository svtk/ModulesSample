package module1

val a = 9
internal val n = 10
internal fun f(x: Int) = x * n
internal class Square {
    override fun toString() = "Square"
}

fun publicFun(x: Int) = "publicFun($x)"
class PublicClass {
    override fun toString() = "PublicClass"
}

