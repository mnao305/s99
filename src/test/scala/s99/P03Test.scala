package s99

import org.scalatest.flatspec.AnyFlatSpec

class P03Test extends AnyFlatSpec {

  "nth関数" should "渡された番号目の要素を返す" in {
    val result = P03.nth(2, List(1, 2, 4, 8, 16))
    assert(result === 4)
  }

  it should "存在しない数を渡した場合は NoSuchElementException を投げる" in {
    intercept[NoSuchElementException] {
      P03.nth(3, List(1, 2, 4))
    }
  }

  it should "空のListを渡した場合は NoSuchElementException を投げる" in {
    intercept[NoSuchElementException] {
      P03.nth(0, List())
    }
  }

}
