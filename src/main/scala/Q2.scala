object Q2 {

  def main(args: Array[String]): Unit = {
    print("Enter an integer:")
    val input = scala.io.StdIn.readInt()

    val checkNumber: Int => String = {
      case n if n <= 0 => "Negative/Zero"
      case n if n % 2 == 0 => "Even number"
      case _ => "Odd number"
    }

    val result = checkNumber(input)
    println(result)
  }
}
