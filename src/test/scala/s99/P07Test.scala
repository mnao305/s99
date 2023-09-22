package s99

import org.scalatest.flatspec.AnyFlatSpec

class P07Test extends AnyFlatSpec {

  "flatten関数" should "渡したリストを平坦化して返す" in {
    val result = P07.flatten(List(List(1, 1), 2, List(3, List(5, 8))))
    assert(result === List(1, 1, 2, 3, 5, 8))
  }

}
