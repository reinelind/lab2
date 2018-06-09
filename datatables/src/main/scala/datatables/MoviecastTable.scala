package datatables
import slick.jdbc.PostgresProfile.api._

class MoviecastTable(tag: Tag) extends Table[model.MovieCast](tag, "movie_cast") {
  val actorId = column[Int]("act_id")
  val movieId = column[Int]("mov_id")

  val actorIdFk = foreignKey ("act_id_FK", actorId, ActorTable.table)(_.id, ForeignKeyAction.Cascade, ForeignKeyAction.Cascade)
  val movieIdFk = foreignKey ("mov_id_FK", movieId, MovieTable.table)(_.id, ForeignKeyAction.Cascade, ForeignKeyAction.Cascade)
  val role = column[String]("role")



  def * = (actorId, movieId, role).mapTo[model.MovieCast]


}
object MoviecastTable {
  val table = TableQuery[MoviecastTable]
}