import slick.jdbc.PostgresProfile.api._

import scala.concurrent.Await
import scala.concurrent.ExecutionContext

import scala.concurrent.duration.Duration



object Main {
  def main(args: Array[String]): Unit = {
    val db = Database.forConfig("postgresql")
    implicit val c : ExecutionContext = ExecutionContext.global
    val lab20 = new Lab2_0(db)
    Await.result (lab20.drop, Duration.Inf)
    Thread.sleep(10000)

    db.close()

  }
}
