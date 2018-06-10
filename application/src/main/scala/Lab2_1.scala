import datatables._
import slick.jdbc.PostgresProfile.api._

import scala.concurrent.{ExecutionContext, Future}

class Lab2_1(db: Database) {

  /** 1.1 Write a query in Slick to find the name and year of the movies. */
  //mov_title	mov_year
  def task1(implicit ec: ExecutionContext): Future[Set[(String, Int)]] = db.run(MovieTable.table.map(x => (x.title, x.year)).result).map(_.toSet)

  /** 1.2. Write a query in Slick to find the year when the movie American Beauty released. */
  def task2(implicit ec: ExecutionContext): Future[Option[Int]] = db.run(MovieTable.table.filter(_.title === "American Beauty").map(_.year).result).map(_.headOption)

  /** 1.3. Write a query in Slick to find the movies which was released in the year 1999. */
  //mov_title
  def task3(implicit ec: ExecutionContext): Future[Set[String]] = db.run (MovieTable.table.filter(_.year === 1999).map(_.title).result).map(_.toSet)

  /** 1.4. Write a query in Slick to find the movies which was released before 1998. */
  //mov_title
  def task4(implicit ec: ExecutionContext): Future[Set[String]] = db.run (MovieTable.table.filter(_.year < 1998).map(_.title).result).map(_.toSet)

  /** 1.5. Write a query in Slick to return the name of all reviewers and name of movies together in a single list. */
  def task5(implicit ec: ExecutionContext): Future[Set[String]] = {
    db.run((MovieTable.table.map(_.title) ++
      ReviewerTable.table.filter(_.name.nonEmpty).map(_.name.getOrElse("")))result).map(_.toSet)


  }

  /** 1.6. Write a query in Slick to find the name of all reviewers who have rated 7 or more stars to their rating. */
  def task6(implicit ec: ExecutionContext): Future[Set[String]] =
    db.run ((RatingTable.table join ReviewerTable.table on (_.reviewId === _.id ))
        .filter(_._1.stars.getOrElse(0.0) >= 7.0)
        .filterNot(_._2.name.isEmpty)
        .map (_._2.name.getOrElse(""))

        .result
    ).map(_.toSet)




  /** 1.7. Write a query in Slick to find the titles of all movies that have no ratings. */
  def task7(implicit ec: ExecutionContext): Future[Set[String]] =
    db.run((RatingTable.table joinRight MovieTable.table on (_.movieId === _.id))
    .filter(_._1.isEmpty)
    .map (_._2.title)
    .result
    ).map(_.toSet)


  /** 1.8. Write a query in Slick to find the titles of the movies with ID 905, 907, 917. */
  def task8(implicit ec: ExecutionContext): Future[Set[String]] =
    db.run(MovieTable.table
      .filter(x=> x.id === 905 || x.id === 907 || x.id === 917)
      .map (_.title)
      .result
    ).map(_.toSet)
  /** 1.9. Write a query in Slick to find the list of all those movies with year which include the words Boogie Nights. */
  //mov_id	mov_title	mov_year
  def task9(implicit ec: ExecutionContext): Future[Set[(Int, String, Int)]] =
    db.run(MovieTable.table
      .map(mov => (mov.id, mov.title, mov.year)).result)
      .map(_.toSet.filter(_._2.contains("Boogie Nights")))

  /** 1.10. Write a query in Slick to find the ID number for the actor whose first name is 'Woody' and the last name is 'Allen'. */
  def task10(implicit ec: ExecutionContext): Future[Option[Int]] =
    db.run(ActorTable.table
      .filter(actor => actor.fname === "Woody" && actor.lname === "Allen")
      .map(_.id).result.headOption)

}
