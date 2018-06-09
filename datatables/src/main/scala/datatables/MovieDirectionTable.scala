package datatables


import slick.jdbc.PostgresProfile.api._


class MovieDirectionTable(tag: Tag) extends Table[model.MovieDirection](tag, "movie_direction") {
  val directorId = column[Int]("dir_id")
  val movieId = column[Int]("mov_id")


  val movieIdFk = foreignKey ("mov_id_FK", movieId, MovieTable.table)(_.id, ForeignKeyAction.Cascade, ForeignKeyAction.Cascade)
  val directorIdFk = foreignKey ("dir_id_FK", directorId, DirectorTable.table)(_.id, ForeignKeyAction.Cascade, ForeignKeyAction.Cascade)

  def * = (directorId,movieId).mapTo[model.MovieDirection]
}

object MovieDirectionTable {
  val table = TableQuery[MovieDirectionTable]
}