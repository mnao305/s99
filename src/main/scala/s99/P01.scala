package s99

object P01 {
  /**
    * 渡されたListの最後の要素を返す
    * https://aperiodic.net/phil/scala/s-99/#p01
    */
  def last[T](ls: List[T]): T =
    ls match {
      // lsと先頭の要素のみのListが一致していたらその要素を返す
      case x :: Nil => x
      // lsと先頭の要素と残りの要素のListが一致していたら、残りの要素でlastを呼び出す
      case x :: tail => last(tail)
      // 何も一致しない場合はエラー
      case _ => throw new NoSuchElementException
    }

}
