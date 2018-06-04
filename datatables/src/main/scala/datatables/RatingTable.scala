package datatables

import slick.jdbc.PostgresProfile.api._

class RatingTable (tag : Tag) extends Table[model.Rating] (tag, "Rating"){
  val movieId = column[Int]("mov_id")
  val reviewId = column[Int]("rev_id")
  val stars = column[Int]("rev_stars")
  val numORatings = column[Int]("nom_o_ratings")

  def * = (movieId,reviewId,stars,numORatings).mapTo[model.Rating]
}

object RatingTable {
  val table = TableQuery [RatingTable]

}
