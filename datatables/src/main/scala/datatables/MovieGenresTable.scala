package datatables

import slick.jdbc.PostgresProfile.api._

class MovieGenreTable(tag: Tag) extends Table[model.MovieGenre](tag, "movie_genre") {
  val id = column[Int]("id", O.PrimaryKey, O.AutoInc)
  val movieId = column[Int]("movie_id")
  val genreId = column[Int]("genre_id")

  def * = (movieId, genreId).mapTo[model.MovieGenre]
}

object MovieGenreTable {
  val table = TableQuery[MovieGenreTable]
}