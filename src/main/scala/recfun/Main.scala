package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if(c == 0 || r == c)
      {
        return 1
      }
      pascal(c-1, r-1)+pascal(c, r-1)
    }

  /**
   * Exercise 2
   */
    var normalizer: Int = 0
    def balance(chars: List[Char]): Boolean = {
      if(chars.isEmpty)
      {
        return normalizer == 0
      }
      if(chars.head.equals('('))
      {
        normalizer = normalizer + 1
      }
      else if(chars.head.equals(')'))
      {
        normalizer = normalizer - 1
      }
      if (normalizer<0)
      {
        return false
      }
      balance(chars.tail)

    }

  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {

      def sum(f: Int => Int)(a: Int, b: Int): Int = ???
      sum(x => x+1)(2,3)
      if (money < 0 || coins.isEmpty)
        return 0
      if (money == 0)
        return 1

      countChange(money - coins.head, coins) + countChange(money, coins.tail)
    }
  }
