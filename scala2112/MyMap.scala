package si8899

class MyMap[A, B](self: Map[A, B]) extends scala.collection.immutable.Map[A, B]{
  def +[B1 >: B](kv: (A, B1)) = self + kv
  def -(key: A) = self - key
  def get(key: A) = self get key
  def iterator = self.iterator
}
