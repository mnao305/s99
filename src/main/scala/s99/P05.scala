package s99

object P05 {
  /**
    * 渡されたListを反転して返す
    * https://aperiodic.net/phil/scala/s-99/#p05
    */
  def reverse[T](ls: List[T]): List[T] =
    ls match {
      case Nil => Nil
      // 再帰的に先頭の要素を末尾に置いていく
      case x :: tail => reverse(tail) :+ x
    }
}
