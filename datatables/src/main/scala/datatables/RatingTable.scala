package datatables

import slick.jdbc.PostgresProfile.api._

class RatingTable (tag : Tag) extends Table[model.Rating] (tag, "Rating"){
  val movieId = column[Int]("mov_id")
  val reviewId = column[Int]("rev_id")

  val movieIdFk = foreignKey ("mov_id_FK", movieId, MovieTable.table)(_.id, ForeignKeyAction.Cascade, ForeignKeyAction.Cascade)
  val reviewIdFk = foreignKey ("rev_id_FK", reviewId, ReviewerTable.table)(_.id, ForeignKeyAction.Cascade, ForeignKeyAction.Cascade)
  val stars = column[Option[Double]]("rev_stars")
  val numORatings = column[Option[Int]]("nom_o_ratings")

  def * = (movieId,reviewId, stars,numORatings).mapTo[model.Rating]
}



object RatingTable {
  lazy val table = TableQuery [RatingTable]

}
