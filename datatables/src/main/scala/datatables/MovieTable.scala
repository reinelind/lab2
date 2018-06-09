package datatables
import slick.jdbc.PostgresProfile.api._

import java.time.LocalDate

import slick.jdbc.PostgresProfile.api._
import slick.lifted.Tag
import model._
import scala.concurrent.Future

class MovieTable(tag: Tag) extends Table[model.Movie](tag, "movies"){
  val id = column[Int]("id", O.PrimaryKey)
  val title = column[String]("title")
  val year = column[Int]("year")
  val time = column[Int]("time")
  val language = column[String]("language")
  val releaseDate = column[Option[LocalDate]]("release_date")
  val releaseCountry = column[String]("release_country")

  def * = (id, title, year, time, language, releaseDate, releaseCountry).mapTo[model.Movie]
}

object MovieTable {
  val table = TableQuery[MovieTable]
}

