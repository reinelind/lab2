import model._
import slick.jdbc.PostgresProfile.api._

import scala.concurrent.{ExecutionContext, Future}

class Lab2_0(db: Database) {
  /** Creates all database schema */
  def create(implicit ec: ExecutionContext): Future[Unit] = ???

  /** Drops all database schema */
  def drop(implicit ec: ExecutionContext): Future[Unit] =  ???

  /** Creates new record */
  def createMovie(record: Movie)(implicit ec: ExecutionContext): Future[Int] = ???

  /** Gets all records */
  def getAllMovies(implicit ec: ExecutionContext): Future[Set[Movie]] = ???

  /** Updates record by id */
  def updateMovieById(id: Int, record: Movie)(implicit ec: ExecutionContext): Future[Int] = ???

  /** Deletes the record by id */
  def deleteMovieById(id: Int)(implicit ec: ExecutionContext): Future[Int] = ???

  /** Creates new record */
  def createReviewer(record: Reviewer)(implicit ec: ExecutionContext): Future[Int] = ???

  /** Gets all records */
  def getAllReviewers(implicit ec: ExecutionContext): Future[Set[Reviewer]] = ???

  /** Updates record by id */
  def updateReviewerById(id: Int, record: Reviewer)(implicit ec: ExecutionContext): Future[Int] = ???

  /** Deletes the record by id */
  def deleteReviewerById(id: Int)(implicit ec: ExecutionContext): Future[Int] = ???

  /** Creates new record */
  def createRating(record: Rating)(implicit ec: ExecutionContext): Future[Int] = ???

  /** Gets all records */
  def getAllRatings(implicit ec: ExecutionContext): Future[Set[Rating]] = ???

  /** Updates record by id */
  def updateRatingById(movieId: Int, reviewerId: Int, record: Rating)(implicit ec: ExecutionContext): Future[Int] = ???

  /** Deletes the record by id */
  def deleteRatingById(movieId: Int, reviewerId: Int)(implicit ec: ExecutionContext): Future[Int] = ???

  /** Creates new record */
  def createGenre(record: Genre)(implicit ec: ExecutionContext): Future[Int] = ???

  /** Gets all records */
  def getAllGenres(implicit ec: ExecutionContext): Future[Set[Genre]] = ???

  /** Updates record by id */
  def updateGenreById(id: Int, record: Genre)(implicit ec: ExecutionContext): Future[Int] = ???

  /** Deletes the record by id */
  def deleteGenreById(id: Int)(implicit ec: ExecutionContext): Future[Int] = ???

  /** Creates new record */
  def createMovieGenre(record: MovieGenre)(implicit ec: ExecutionContext): Future[Int] = ???

  /** Gets all records */
  def getAllMovieGenres(implicit ec: ExecutionContext): Future[Set[MovieGenre]] = ???

  /** Deletes the record by id */
  def deleteMovieGenreById(movieId: Int, genreId: Int)(implicit ec: ExecutionContext): Future[Int] = ???

  /** Creates new record */
  def createDirector(record: Director)(implicit ec: ExecutionContext): Future[Int] = ???

  /** Gets all records */
  def getAllDirectors(implicit ec: ExecutionContext): Future[Set[Director]] = ???

  /** Updates record by id */
  def updateDirectorById(id: Int, record: Director)(implicit ec: ExecutionContext): Future[Int] = ???

  /** Deletes the record by id */
  def deleteDirectorById(id: Int)(implicit ec: ExecutionContext): Future[Int] = ???

  /** Creates new record */
  def createMovieDirection(record: MovieDirection)(implicit ec: ExecutionContext): Future[Int] = ???

  /** Gets all records */
  def getAllMovieDirections(implicit ec: ExecutionContext): Future[Set[MovieDirection]] =  ???

  /** Deletes the record by id */
  def deleteMovieDirectionById(directorId: Int, movieId: Int)(implicit ec: ExecutionContext): Future[Int] = ???

  /** Creates new record */
  def createActor(record: Actor)(implicit ec: ExecutionContext): Future[Int] = ???

  /** Gets all records */
  def getAllActors(implicit ec: ExecutionContext): Future[Set[Actor]] = ???

  /** Updates record by id */
  def updateActorById(id: Int, record: Actor)(implicit ec: ExecutionContext): Future[Int] = ???

  /** Deletes the record by id */
  def deleteActorById(id: Int)(implicit ec: ExecutionContext): Future[Int] = ???

  /** Creates new record */
  def createMovieCast(record: MovieCast)(implicit ec: ExecutionContext): Future[Int] = ???

  /** Gets all records */
  def getAllMovieCasts(implicit ec: ExecutionContext): Future[Set[MovieCast]] = ???

  /** Updates record by id */
  def updateMovieCastById(actorId: Int, movieId: Int, record: MovieCast)(implicit ec: ExecutionContext): Future[Int] = ???

  /** Deletes the record by id */
  def deleteMovieCastById(actorId: Int, movieId: Int)(implicit ec: ExecutionContext): Future[Int] = ???

}