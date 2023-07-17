package s99

object P02 {
  /**
    * 渡されたListの最後から2つ目の要素を返す
    * https://aperiodic.net/phil/scala/s-99/#p02
    */
  def penultimate[T](ls: List[T]): T =
    ls match {
      // lsと先頭2つの要素のみのListが一致していたら先頭要素を返す
      case x :: y :: Nil => x
      // lsと先頭2つの要素と残りの要素のListが一致していたら、先頭2つ目と残りの要素でpenultimateを呼び出す
      case x :: y :: tail => penultimate(y :: tail)
      // 何も一致しない場合はエラー
      case _ => throw new NoSuchElementException
    }

}
