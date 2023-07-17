package s99

import org.scalatest.flatspec.AnyFlatSpec

class P04Test extends AnyFlatSpec {

  "length関数" should "渡されたListの要素数を返す" in {
    val result = P04.length(List(1, 2, 4, 8))
    assert(result === 4)
  }

  it should "空のListを渡した場合は0を返す" in {
    val result = P04.length(List())
    assert(result === 0)
  }

}
