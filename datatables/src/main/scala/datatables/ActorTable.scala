package datatables

import slick.jdbc.PostgresProfile.api._

class ActorTable (tag: Tag) extends Table[model.Actor](tag, "Actor") {
  val id = column[Int]("act_id", O.PrimaryKey)
  val fname = column[String]("act_fname", O.Length(20,true))
  val lname = column[String]("act_lname", O.Length(20,true))
  val gender = column[String]("act_gender",O.Length(1,true))

  def * = (id,fname,lname,gender).mapTo[model.Actor]
}

object ActorTable {
  val table = TableQuery[ActorTable]
}
