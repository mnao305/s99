package s99

object P07 {
  /**
    * ネストされたリストを平坦化する
    * https://aperiodic.net/phil/scala/s-99/#p07
    */
  def flatten(ls: List[Any]): List[Any] =
    ls match {
      case Nil => Nil
      case (head: List[Any]) :: next => flatten(head) ::: flatten(next)
      case head :: next => head :: flatten(next)
    }
}
