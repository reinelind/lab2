package datatables
import slick.jdbc.PostgresProfile.api._

class GenresTable (tag: Tag) extends Table[model.Genre](tag, "Genres") {
  val id = column [Int]("gen_id", O.PrimaryKey, O.AutoInc)
  val title = column [String] ("gen_title", O.Length(20,true))

  val movie_cast

  def * = (id,title).mapTo[model.Genre]
}
object GenresTable {
  val table = TableQuery[GenresTable]
}

