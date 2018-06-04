package datatables

import slick.jdbc.PostgresProfile.api._

class MovieGenreTable(tag: Tag) extends Table[model.MovieGenre](tag, "movie_genre") {

  val movieId = column[Int]("mov_id")
  val genreId = column[Int]("genreId")
  val movieIdFk = foreignKey ("mov_id_FK", movieId, MovieTable.table)(_.id, ForeignKeyAction.Cascade, ForeignKeyAction.Cascade)
  val genreIdFk = foreignKey ("gen_id_FK", genreId, GenresTable.table)(_.id, ForeignKeyAction.Cascade, ForeignKeyAction.Cascade)

  def * = (movieId, genreId).mapTo[model.MovieGenre]
}

object MovieGenreTable {
  val table = TableQuery[MovieGenreTable]
}