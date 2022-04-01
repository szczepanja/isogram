import org.scalatest._
import flatspec._
import matchers._

class IsogramSpec extends AnyFlatSpec with should.Matchers {

  import Isogram._

  "isIsogram" should "return true" in {
    isIsogram("lumberjacks") shouldBe true
  }
  "isIsogram" should "return false" in {
    isIsogram("isogram") shouldBe false
  }
}