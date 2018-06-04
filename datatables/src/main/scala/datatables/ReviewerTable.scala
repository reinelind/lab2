package datatables

import slick.jdbc.PostgresProfile.api._

class ReviewerTable (tag: Tag) extends Table[model.Reviewer](tag, "Reviewer") {
  val id = column[Int]("rev_id", O.PrimaryKey, O.AutoInc)
  val name = column[Option[String]] ("rev_name", O.Length(30,true))

  def * = (id, name).mapTo[model.Reviewer]
}

object ReviewerTable {
  val table = TableQuery[ReviewerTable]
}

