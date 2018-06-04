package datatables
import slick.jdbc.PostgresProfile.api._

class MoviecastTable(tag: Tag) extends Table[model.MovieCast](tag, "movie_cast") {
  val id = column[Int]("id", O.PrimaryKey, O.AutoInc)
  val actorId = column[Int]("actor_id")
  val movieId = column[Int]("movie_id")
  val role = column[String]("role")

  def * = (actorId, movieId, role).mapTo[model.MovieCast]
}



object MoviecastTable {
  val table = TableQuery[MoviecastTable]
}