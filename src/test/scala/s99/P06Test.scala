package s99

import org.scalatest.flatspec.AnyFlatSpec

class P06Test extends AnyFlatSpec {

  "isPalindrome関数" should "要素数偶数の配列が回文の場合はtrueを返す" in {
    val result = P06.isPalindrome(List(1, 2, 3, 3, 2, 1))
    assert(result === true)
  }

  it should "要素数奇数の配列が回文の場合はtrueを返す" in {
    val result = P06.isPalindrome(List(1, 2, 3, 2, 1))
    assert(result === true)
  }

  it should "要素数偶数の配列が回文ではない場合はfalseを返す" in {
    val result = P06.isPalindrome(List(1, 2, 3, 4, 3, 1))
    assert(result === false)
  }

  it should "要素数奇数の配列が回文ではない場合はfalseを返す" in {
    val result = P06.isPalindrome(List(1, 2, 3, 3, 1))
    assert(result === false)
  }

  it should "空のListを渡した場合はtrueを返す" in {
    val result = P06.isPalindrome(List())
    assert(result === true)
  }

}
