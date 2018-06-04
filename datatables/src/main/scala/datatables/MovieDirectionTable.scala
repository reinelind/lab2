package datatables


import slick.jdbc.PostgresProfile.api._


class MovieDirectionTable(tag: Tag) extends Table[model.MovieDirection](tag, "movie_direction") {
  val id = column[Int]("id", O.PrimaryKey, O.AutoInc)
  val movieId = column[Int]("movie_id")
  val directorId = column[Int]("director_id")

  def * = (movieId, directorId).mapTo[model.MovieDirection]
}

object MovieDirectionTable {
  val table = TableQuery[MovieDirectionTable]
}