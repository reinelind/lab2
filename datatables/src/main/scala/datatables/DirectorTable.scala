package datatables

import slick.jdbc.PostgresProfile.api._

class DirectorTable (tag: Tag) extends Table[model.Director](tag, "Director"){
  val id = column[Int] ("dir_id", O.PrimaryKey)
  val fname = column[String] ("dir_fname", O.Length(20, true))
  val lname = column[String] ("dir_lname", O.Length(20, true))

  def * =  (id,fname,lname).mapTo[model.Director]
}

object DirectorTable {
  val table = TableQuery[DirectorTable]
}




