package s99

import P05.reverse

object P06 {

  /**
   * 渡されたListが回文かどうかを判定する
   * https://aperiodic.net/phil/scala/s-99/#p06
   */
  def isPalindrome[T](ls: List[T]): Boolean =
    ls == reverse(ls)
}
