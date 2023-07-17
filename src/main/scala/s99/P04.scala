package s99

object P04 {
  /**
    * 渡されたListの要素数を返す
    * https://aperiodic.net/phil/scala/s-99/#p04
    */
  def length[T](ls: List[T]): Int =
    ls match {
      // 空だったら0
      case Nil => 0
      // 再帰した回数を返す == 要素数を返せる
      case _ :: tail => 1 + length(tail)
    }
}
