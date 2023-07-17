package s99

import org.scalatest.flatspec.AnyFlatSpec

class P02Test extends AnyFlatSpec {

  "penultimate関数" should "リストの最後から2つ目の要素を返す" in {
    val result = P02.penultimate(List(1, 2, 4, 8, 16))
    assert(result === 8)
  }

  it should "要素数1のListを渡した場合は NoSuchElementException を投げる" in {
    intercept[NoSuchElementException] {
      P02.penultimate(List(1))
    }
  }

  it should "空のListを渡した場合は NoSuchElementException を投げる" in {
    intercept[NoSuchElementException] {
      P02.penultimate(List())
    }
  }

}
