import org.scalatest._
import flatspec._
import matchers._

class IsogramSpec extends AnyFlatSpec with should.Matchers {

  import Isogram._

  "isIsogram" should "return true" in {
    isIsogram("isogram") shouldBe true
    isIsogram("six-year-old") shouldBe true
  }

  "isIsogram" should "return false" in {
    isIsogram("isograms") shouldBe false
    isIsogram("six-years-old") shouldBe false
  }

}
