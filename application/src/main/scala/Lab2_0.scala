import model._
import slick.jdbc.PostgresProfile.api._

import scala.concurrent.Future

class Lab2_0(db: Database) {
  /** Creates all database schema */
  def create: Future[Unit] = ???

  /** Drops all database schema */
  def drop: Future[Unit] = ???

  /** Creates new record */
  def createMovie(record: Movie): Future[Int] = ???

  /** Updates record by id */
  def updateMovieById(id: Int, record: Movie): Future[Int] = ???

  /** Deletes the record by id */
  def deleteMovieById(id: Int): Future[Int] = ???

  /** Creates new record */
  def createReviewer(record: Reviewer): Future[Int] = ???

  /** Updates record by id */
  def updateReviewerById(id: Int, record: Reviewer): Future[Int] = ???

  /** Deletes the record by id */
  def deleteReviewerById(id: Int): Future[Int] = ???

  /** Creates new record */
  def createRating(record: Rating): Future[Int] = ???

  /** Updates record by id */
  def updateRatingById(id: Int, record: Rating): Future[Int] = ???

  /** Deletes the record by id */
  def deleteRatingById(id: Int): Future[Int] = ???

  /** Creates new record */
  def createGenre(record: Genre): Future[Int] = ???

  /** Updates record by id */
  def updateGenreById(id: Int, record: Genre): Future[Int] = ???

  /** Deletes the record by id */
  def deleteGenreById(id: Int): Future[Int] = ???

  /** Creates new record */
  def createMovieGenre(record: MovieGenre): Future[Int] = ???

  /** Updates record by id */
  def updateMovieGenreById(id: Int, record: MovieGenre): Future[Int] = ???

  /** Deletes the record by id */
  def deleteMovieGenreById(id: Int): Future[Int] = ???

  /** Creates new record */
  def createDirector(record: Director): Future[Int] = ???

  /** Updates record by id */
  def updateDirectorById(id: Int, record: Director): Future[Int] = ???

  /** Deletes the record by id */
  def deleteDirectorById(id: Int): Future[Int] = ???

  /** Creates new record */
  def createMovieDirection(record: MovieDirection): Future[Int] = ???

  /** Updates record by id */
  def updateMovieDirectionById(id: Int, record: MovieDirection): Future[Int] = ???

  /** Deletes the record by id */
  def deleteMovieDirectionById(id: Int): Future[Int] = ???

  /** Creates new record */
  def createActor(record: Actor): Future[Int] = ???

  /** Updates record by id */
  def updateActorById(id: Int, record: Actor): Future[Int] = ???

  /** Deletes the record by id */
  def deleteActorById(id: Int): Future[Int] = ???

  /** Creates new record */
  def createMovieCast(record: MovieCast): Future[Int] = ???

  /** Updates record by id */
  def updateMovieCastById(id: Int, record: MovieCast): Future[Int] = ???

  /** Deletes the record by id */
  def deleteMovieCastById(id: Int): Future[Int] = ???

}
