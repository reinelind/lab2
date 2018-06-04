package datatables


import slick.jdbc.PostgresProfile.api._


class MovieDirectionTable(tag: Tag) extends Table[model.MovieDirection](tag, "movie_direction") {
  val movieId = column[Int]("id")
  val directorId = column[Int]("id")

  val movieIdFk = foreignKey ("mov_id_FK", movieId, MovieTable.table)(_.id, ForeignKeyAction.Cascade, ForeignKeyAction.Cascade)
  val directorIdFk = foreignKey ("dir_id_FK", directorId, DirectorTable.table)(_.id, ForeignKeyAction.Cascade, ForeignKeyAction.Cascade)

  def * = (movieId, directorId).mapTo[model.MovieDirection]
}

object MovieDirectionTable {
  val table = TableQuery[MovieDirectionTable]
}