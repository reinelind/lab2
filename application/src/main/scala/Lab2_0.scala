import datatables._
import model._
import slick.jdbc.PostgresProfile.api._

import scala.concurrent.{ExecutionContext, Future}

class Lab2_0(db: Database) {
  /** Creates all database schema */
  def create(implicit ec: ExecutionContext): Future[Unit] = for {
    _ <- db.run(ActorTable.table.schema.create)
    _ <- db.run(DirectorTable.table.schema.create)
    _ <- db.run(GenresTable.table.schema.create)
    _ <- db.run(MovieTable.table.schema.create)
    _ <- db.run(ReviewerTable.table.schema.create)
    _ <- db.run(MoviecastTable.table.schema.create)
    _ <- db.run(MovieDirectionTable.table.schema.create)
    _ <- db.run(MovieGenreTable.table.schema.create)
    _ <- db.run(RatingTable.table.schema.create)

  } yield ()

  /** Drops all database schema */
  def drop(implicit ec: ExecutionContext): Future[Unit] =  for {
    _ <- db.run(RatingTable.table.schema.drop)
    _ <- db.run(MoviecastTable.table.schema.drop)
    _ <- db.run(MovieDirectionTable.table.schema.drop)
    _ <- db.run(MovieGenreTable.table.schema.drop)
    _ <- db.run(ActorTable.table.schema.drop)
    _ <- db.run(DirectorTable.table.schema.drop)
    _ <- db.run(GenresTable.table.schema.drop)
    _ <- db.run(MovieTable.table.schema.drop)
    _ <- db.run(ReviewerTable.table.schema.drop)
  } yield ()



  /** Creates new record */
  def createMovie(record: Movie)(implicit ec: ExecutionContext): Future[Int] = db.run(MovieTable.table += record)

  /** Gets all records */
  def getAllMovies(implicit ec: ExecutionContext): Future[Set[Movie]] = db.run (MovieTable.table.result).map(x => x.toSet)
  /** Updates record by id */
  def updateMovieById(id: Int, record: Movie)(implicit ec: ExecutionContext): Future[Int] =
    db.run (MovieTable.table
      .filter(_.id === id)
      .update(record))

  /** Deletes the record by id */
  def deleteMovieById(id: Int)(implicit ec: ExecutionContext): Future[Int] =
    db.run (MovieTable.table
    .filter(_.id === id)
    .delete)

  /** Creates new record */
  def createReviewer(record: Reviewer)(implicit ec: ExecutionContext): Future[Int] = db.run(ReviewerTable.table += record)

  /** Gets all records */
  def getAllReviewers(implicit ec: ExecutionContext): Future[Set[Reviewer]] =
    db.run (ReviewerTable.table.result)
      .map(x => x.toSet)

  /** Updates record by id */
  def updateReviewerById(id: Int, record: Reviewer)(implicit ec: ExecutionContext): Future[Int] =
    db.run (ReviewerTable.table
    .filter(_.id === id)
    .update(record))

  /** Deletes the record by id */
  def deleteReviewerById(id: Int)(implicit ec: ExecutionContext): Future[Int] =
    db.run (ReviewerTable.table
    .filter(_.id === id)
    .delete)

  /** Creates new record */
  def createRating(record: Rating)(implicit ec: ExecutionContext): Future[Int] = db.run(RatingTable.table += record)

  /** Gets all records */
  def getAllRatings(implicit ec: ExecutionContext): Future[Set[Rating]] = db.run (RatingTable.table.result).map(x => x.toSet)

  /** Updates record by id */
  def updateRatingById(movieId: Int, reviewerId: Int, record: Rating)(implicit ec: ExecutionContext): Future[Int] =
    db.run(RatingTable.table
        .filter(x=> x.movieId === movieId &&  x.reviewId === reviewerId )
        .update (record))



  /** Deletes the record by id */
  def deleteRatingById(movieId: Int, reviewerId: Int)(implicit ec: ExecutionContext): Future[Int] =
    db.run(RatingTable.table
      .filter(x=> x.movieId === movieId &&  x.reviewId === reviewerId )
      .delete)

  /** Creates new record */
  def createGenre(record: Genre)(implicit ec: ExecutionContext): Future[Int] = db.run(GenresTable.table += record)
  /** Gets all records */
  def getAllGenres(implicit ec: ExecutionContext): Future[Set[Genre]] = db.run(GenresTable.table.result).map(x => x.toSet)

  /** Updates record by id */
  def updateGenreById(id: Int, record: Genre)(implicit ec: ExecutionContext): Future[Int] =
    db.run(GenresTable.table
        .filter (_.id === id)
        .update(record))

  /** Deletes the record by id */
  def deleteGenreById(id: Int)(implicit ec: ExecutionContext): Future[Int] = db.run(GenresTable.table
    .filter (_.id === id)
    .delete)

  /** Creates new record */
  def createMovieGenre(record: MovieGenre)(implicit ec: ExecutionContext): Future[Int] = db.run(MovieGenreTable.table += record)

  /** Gets all records */
  def getAllMovieGenres(implicit ec: ExecutionContext): Future[Set[MovieGenre]] = db.run(MovieGenreTable.table.result).map(x => x.toSet)


  /** Deletes the record by id */
  def deleteMovieGenreById(movieId: Int, genreId: Int)(implicit ec: ExecutionContext): Future[Int] = db.run(MovieGenreTable.table
    .filter ( x => x.movieId === movieId && x.genreId === genreId)
    .delete)

  /** Creates new record */
  def createDirector(record: Director)(implicit ec: ExecutionContext): Future[Int] = db.run(DirectorTable.table += record)

  /** Gets all records */
  def getAllDirectors(implicit ec: ExecutionContext): Future[Set[Director]] = db.run(DirectorTable.table.result).map(_.toSet)

  /** Updates record by id */
  def updateDirectorById(id: Int, record: Director)(implicit ec: ExecutionContext): Future[Int] = db.run (DirectorTable.table
      .filter (_.id === id)
      .update (record)
  )

  /** Deletes the record by id */
  def deleteDirectorById(id: Int)(implicit ec: ExecutionContext): Future[Int] = db.run (DirectorTable.table
    .filter (_.id === id)
    .delete
  )

  /** Creates new record */
  def createMovieDirection(record: MovieDirection)(implicit ec: ExecutionContext): Future[Int] = db.run(MovieDirectionTable.table += record)

  /** Gets all records */
  def getAllMovieDirections(implicit ec: ExecutionContext): Future[Set[MovieDirection]] =  db.run(MovieDirectionTable.table.result).map(x => x.toSet)

  /** Deletes the record by id */
  def deleteMovieDirectionById(directorId: Int, movieId: Int)(implicit ec: ExecutionContext): Future[Int] = db.run (MovieDirectionTable.table
      .filter (_.directorId === directorId)
      .delete
  )

  /** Creates new record */
  def createActor(record: Actor)(implicit ec: ExecutionContext): Future[Int] = db.run(ActorTable.table += record)

  /** Gets all records */
  def getAllActors(implicit ec: ExecutionContext): Future[Set[Actor]] = db.run(ActorTable.table.result).map(x => x.toSet)

  /** Updates record by id */
  def updateActorById(id: Int, record: Actor)(implicit ec: ExecutionContext): Future[Int] = db.run(ActorTable.table
      .filter(_.id === id)
      .update(record)
  )

  /** Deletes the record by id */
  def deleteActorById(id: Int)(implicit ec: ExecutionContext): Future[Int] = db.run(ActorTable.table
    .filter(_.id === id)
    .delete)

  /** Creates new record */
  def createMovieCast(record: MovieCast)(implicit ec: ExecutionContext): Future[Int] = db.run(MoviecastTable.table += record)

  /** Gets all records */
  def getAllMovieCasts(implicit ec: ExecutionContext): Future[Set[MovieCast]] = db.run(MoviecastTable.table.result).map(x => x.toSet)

  /** Updates record by id */
  def updateMovieCastById(actorId: Int, movieId: Int, record: MovieCast)(implicit ec: ExecutionContext): Future[Int] = db.run(MoviecastTable.table
    .filter(x=> x.actorId === actorId && x.movieId === movieId)
    .update(record))


  /** Deletes the record by id */
  def deleteMovieCastById(actorId: Int, movieId: Int)(implicit ec: ExecutionContext): Future[Int] =
    db.run(MoviecastTable.table
      .filter(x=> x.actorId === actorId && x.movieId === movieId)
      .delete)

}