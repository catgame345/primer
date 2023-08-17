class Math(x: Int, y: Int) {
    def sum(): Unit = {
        val s = x+y
        println(s"La suma de $x + $y es $s")
    }
    def res(): Unit = {
        if (x >= y) {
            val re = x -y
            println(s"La resta de $x - $y es $re")
        } else {
            val ri = y-x
            println(s"La resta de $y - $x es $ri")
        }
    }
    def mul(): Unit = {
        val mu = x*y
        println(s"La multiplicacion de $x * $y es $mu")
    }
    def div(): Unit = {
        if (x >= y) {
            var k: Double = x/y
            println(s"La division de $x / $y es $k")
        } else {
            var b: Double = y/x
            println(s"La division de $y / $x es $b")
        }
    }
}

object primer {
    def main(args:Array[String]): Unit = {
        println("Ingrese el primer numero: ")
        val xi = scala.io.StdIn.readLine()
        val x = xi.toInt
        println("Ingrese el segundo numero: ")
        val yi = scala.io.StdIn.readLine()
        val y = yi.toInt
        val math = new Math(x, y)
        math.sum()
        math.res()
        math.mul()
        math.div()
    }
}
