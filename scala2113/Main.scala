package si8899

object Main {

  def main(args: Array[String]): Unit = {
    val a = new MyMap(Map.empty[Int, Int])
    a.filter(_ => true)
  }

}
