import java.time.LocalDate

import model._
import datatables._
import slick.jdbc.PostgresProfile.api._

import scala.concurrent.{ExecutionContext, Future}

class Lab2_2(db: Database) {

  /** 1. Write a query in Slick to list all the information of the actors who played a role in the movie 'Annie Hall'. */
  def task1(implicit ec: ExecutionContext): Future[Set[Actor]] = ???

  /** 2. Write a query in Slick to find the name of the director (first and last names) who directed a movie that casted a role for 'Eyes Wide Shut'. */
  //dir_fname	dir_lname
  def task2(implicit ec: ExecutionContext): Future[Option[(String, String)]] = ???

  /** 3. Write a query in Slick to list all the movies which released in the country other than UK. */
  def task3(implicit ec: ExecutionContext): Future[Set[Movie]] = ???

  /** 4. Write a query in Slick to find the movie title, year, date of release, director and actor for those movies which reviewer is unknown. */
  //mov_title	mov_year	mov_dt_rel	dir_fname	dir_lname	act_fname	act_lname
  def task4(implicit ec: ExecutionContext)
  : Future[Set[(String, Int, LocalDate, String, String, String, String)]] = ???

  /** 5. Write a query in Slick to find the titles of all movies directed by the director whose first and last name are Woody Allen. */
  def task5(implicit ec: ExecutionContext): Future[Set[String]] = ???

  /** 6. Write a query in Slick to find all the years which produced at least one movie and that received a rating of more than 3 stars. Show the results in increasing order. */
  def task6(implicit ec: ExecutionContext): Future[Vector[Int]] = ???

  /** 7. Write a query in Slick to find the titles of all movies that have no ratings. */
  def task7(implicit ec: ExecutionContext): Future[Set[String]] = ???

  /** 8. Write a query in Slick to find the names of all reviewers who have ratings with a NULL value. */
  def task8(implicit ec: ExecutionContext): Future[Set[String]] = ???

  /** 9. Write a query in Slick to return the reviewer name, movie title, and stars for those movies which reviewed by a reviewer and must be rated. Sort the result by reviewer name, movie title, and number of stars. */
  def task9(
             implicit ec: ExecutionContext): Future[Vector[(String, String, Double)]] = ???

  /** 10. Write a query in Slick to find the reviewer's name and the title of the movie for those reviewers who rated more than one movies. */
  def task10(implicit ec: ExecutionContext): Future[Set[(String, String)]] = ???

  /** 11. Write a query in Slick to find the movie title, and the highest number of stars that movie received and arranged the result according to the group of a movie and the movie title appear alphabetically in ascending order. */
  def task11(implicit ec: ExecutionContext): Future[Vector[(String, Double)]] = ???

  /** 12. Write a query in Slick to find the names of all reviewers who rated the movie American Beauty. */
  def task12(implicit ec: ExecutionContext): Future[Set[String]] = ???

  /** 13. Write a query in Slick to find the titles of all movies which have been reviewed by anybody except by Paul Monks. */
  def task13(implicit ec: ExecutionContext): Future[Set[String]] = ???

  /** 14. Write a query in Slick to return the reviewer name, movie title, and number of stars for those movies which rating is the lowest one. */
  //rev_name	mov_title	rev_stars
  def task14(
              implicit ec: ExecutionContext): Future[Option[(String, String, Double)]] = ???

  /** 15. Write a query in Slick to find the titles of all movies directed by James Cameron. */
  def task15(implicit ec: ExecutionContext): Future[Set[String]] = ???

  /** 16. Write a query in Slick to find the name of those movies where one or more actors acted in two or more movies. */
  def task16(implicit ec: ExecutionContext): Future[Set[String]] = ???

}
