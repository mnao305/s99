package s99

import org.scalatest.flatspec.AnyFlatSpec

class P05Test extends AnyFlatSpec {

  "reverse関数" should "渡されたListを反転して返す" in {
    val result = P05.reverse(List(1, 2, 4, 8))
    assert(result === List(8, 4, 2, 1))
  }

  it should "空のListを渡した場合はそのまま空の配列が返る" in {
    val result = P05.reverse(List())
    assert(result === Nil)
  }

}
