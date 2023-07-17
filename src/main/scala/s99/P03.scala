package s99

object P03 {
  /**
    * 渡されたListのk番目の要素を返す
    * https://aperiodic.net/phil/scala/s-99/#p03
    */
  def nth[T](i: Int, ls: List[T]): T =
    ls match {
      // iが0なら先頭の要素を返す
      case x::_ if i == 0 => x
      // iが0になるまで繰り返す
      case x :: tail => nth(i - 1, tail)
      // 何も一致しない場合はエラー
      case _ => throw new NoSuchElementException
    }

}
