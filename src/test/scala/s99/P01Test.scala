package s99

import org.scalatest.flatspec.AnyFlatSpec

class P01Test extends AnyFlatSpec {

  "last関数" should "リストの最後の要素を返す" in {
    val result = P01.last(List(1, 2, 4, 8, 16))
    assert(result === 16)
  }

  it should "要素数1のリストの最後の要素を返す" in {
    val result = P01.last(List(1))
    assert(result === 1)
  }

  it should "空のListを渡した場合は NoSuchElementException を投げる" in {
    intercept[NoSuchElementException] {
      P01.last(List())
    }
  }

}
