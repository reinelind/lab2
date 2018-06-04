package datatables

import slick.jdbc.PostgresProfile.api._

class ReviewerTable (tag: Tag) extends Table[model.Reviewer](tag, "Reviewer") {
  val id = column[Int]("rev_id", O.PrimaryKey)
  val name = column[String] ("rev_name", O.Length(30,true))

  def * = (id, name).mapTo[model.Reviewer]
}

object ReviewerTable {
  val table = TableQuery[ReviewerTable]
}

