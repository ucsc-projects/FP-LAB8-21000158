object Q1 {

  def main(args: Array[String]): Unit = {
    val calculateInterest: Double => Double = depositAmount =>
      if (depositAmount <= 20000) 0.02 * depositAmount
      else if (depositAmount <= 200000) 0.04 * depositAmount
      else if (depositAmount <= 2000000) 0.035 * depositAmount
      else 0.065 * depositAmount


    print("Enter the deposit amount: ")
    val deposit = scala.io.StdIn.readDouble()
    val interest = calculateInterest(deposit)
    println(f"The interest earned in a year: $interest%.2f")

  }

}
