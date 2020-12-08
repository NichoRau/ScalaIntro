import scala.math._
object Solution extends App {

    def isPalindrome(x: Int): Boolean = {
        
        if (x < 0) {return false}
        if (x < 10) {return true}
        
        var length = (log10(x) - (log10(x)%1) + 1).toInt
        var digiArray = new Array[Int](length)
        var n = x
        
        for (a <- 0 to (length-1)) {
            digiArray(a) = n % 10
            n = n/10
        }
        
        for (a <- 0 to (length-1)/2) {
            if (digiArray(a) != digiArray(length-(a+1))) {
                return false
            }
        }
        return true
    }
    System.out.println(isPalindrome(args(0).toInt))
}
