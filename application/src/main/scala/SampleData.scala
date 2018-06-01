import java.time.LocalDate

import model._

object SampleData {
  val movies = Set(
    Movie(901, "Vertigo", 1958, 128, "English", Option(LocalDate.parse("1958-08-24")), "UK"),
    Movie(902, "The Innocents", 1961, 100, "English", Option(LocalDate.parse("1962-02-19")), "SW"),
    Movie(903, "Lawrence of Arabia", 1962, 216, "English", Option(LocalDate.parse("1962-12-11")), "UK"),
    Movie(904, "The Deer Hunter", 1978, 183, "English", Option(LocalDate.parse("1979-03-08")), "UK"),
    Movie(905, "Amadeus", 1984, 160, "English", Option(LocalDate.parse("1985-01-07")), "UK"),
    Movie(906, "Blade Runner", 1982, 117, "English", Option(LocalDate.parse("1982-09-09")), "UK"),
    Movie(907, "Eyes Wide Shut", 1999, 159, "English", None, "UK"),
    Movie(908, "The Usual Suspects", 1995, 106, "English", Option(LocalDate.parse("1995-08-25")), "UK"),
    Movie(909, "Chinatown", 1974, 130, "English", Option(LocalDate.parse("1974-08-09")), "UK"),
    Movie(910, "Boogie Nights", 1997, 155, "English", Option(LocalDate.parse("1998-02-16")), "UK"),
    Movie(911, "Annie Hall", 1977, 93, "English", Option(LocalDate.parse("1977-04-20")), "USA"),
    Movie(912, "Princess Mononoke", 1997, 134, "Japanese ", Option(LocalDate.parse("2001-10-19")), "UK"),
    Movie(913, "The Shawshank Redemption", 1994, 142, "English", Option(LocalDate.parse("1995-02-17")), "UK"),
    Movie(914, "American Beauty", 1999, 122, "English", None, "UK"),
    Movie(915, "Titanic", 1997, 194, "English", Option(LocalDate.parse("1998-01-23")), "UK"),
    Movie(916, "Good Will Hunting", 1997, 126, "English", Option(LocalDate.parse("1998-06-03")), "UK"),
    Movie(917, "Deliverance", 1972, 109, "English", Option(LocalDate.parse("1982-10-05")), "UK"),
    Movie(918, "Trainspotting", 1996, 94, "English", Option(LocalDate.parse("1996-02-23")), "UK"),
    Movie(919, "The Prestige", 2006, 130, "English", Option(LocalDate.parse("2006-11-10")), "UK"),
    Movie(920, "Donnie Darko", 2001, 113, "English", None, "UK"),
    Movie(921, "Slumdog Millionaire", 2008, 120, "English", Option(LocalDate.parse("2009-01-09")), "UK"),
    Movie(922, "Aliens", 1986, 137, "English", Option(LocalDate.parse("1986-08-29")), "UK"),
    Movie(923, "Beyond the Sea", 2004, 118, "English", Option(LocalDate.parse("2004-11-26")), "UK"),
    Movie(924, "Avatar", 2009, 162, "English", Option(LocalDate.parse("2009-12-17")), "UK"),
    Movie(926, "Seven Samurai", 1954, 207, "Japanese ", Option(LocalDate.parse("1954-04-26")), "JP"),
    Movie(927, "Spirited Away", 2001, 125, "Japanese ", Option(LocalDate.parse("2003-09-12")), "UK"),
    Movie(928, "Back to the Future", 1985, 116, "English", Option(LocalDate.parse("1985-12-04")), "UK"),
    Movie(925, "Braveheart", 1995, 178, "English", Option(LocalDate.parse("1995-09-08")), "UK")
  )

  val movieCasts = Set(
    MovieCast(101, 901, "John Scottie Ferguson"),
    MovieCast(102, 902, "Miss Giddens"),
    MovieCast(103, 903, "T.E. Lawrence"),
    MovieCast(104, 904, "Michael"),
    MovieCast(105, 905, "Antonio Salieri"),
    MovieCast(106, 906, "Rick Deckard"),
    MovieCast(107, 907, "Alice Harford"),
    MovieCast(108, 908, "McManus"),
    MovieCast(110, 910, "Eddie Adams"),
    MovieCast(111, 911, "Alvy Singer"),
    MovieCast(112, 912, "San"),
    MovieCast(113, 913, "Andy Dufresne"),
    MovieCast(114, 914, "Lester Burnham"),
    MovieCast(115, 915, "Rose DeWitt Bukater"),
    MovieCast(116, 916, "Sean Maguire"),
    MovieCast(117, 917, "Ed"),
    MovieCast(118, 918, "Renton"),
    MovieCast(120, 920, "Elizabeth Darko"),
    MovieCast(121, 921, "Older Jamal"),
    MovieCast(122, 922, "Ripley"),
    MovieCast(114, 923, "Bobby Darin"),
    MovieCast(109, 909, "J.J. Gittes"),
    MovieCast(119, 919, "Alfred Borden")
  )

  val movieDirections = Set(
    MovieDirection(201, 901),
    MovieDirection(202, 902),
    MovieDirection(203, 903),
    MovieDirection(204, 904),
    MovieDirection(205, 905),
    MovieDirection(206, 906),
    MovieDirection(207, 907),
    MovieDirection(208, 908),
    MovieDirection(209, 909),
    MovieDirection(210, 910),
    MovieDirection(211, 911),
    MovieDirection(212, 912),
    MovieDirection(213, 913),
    MovieDirection(214, 914),
    MovieDirection(215, 915),
    MovieDirection(216, 916),
    MovieDirection(217, 917),
    MovieDirection(218, 918),
    MovieDirection(219, 919),
    MovieDirection(220, 920),
    MovieDirection(218, 921),
    MovieDirection(215, 922),
    MovieDirection(221, 923)
  )


  val movieGenres = Set(
    MovieGenre(922, 1001),
    MovieGenre(917, 1002),
    MovieGenre(903, 1002),
    MovieGenre(912, 1003),
    MovieGenre(911, 1005),
    MovieGenre(908, 1006),
    MovieGenre(913, 1006),
    MovieGenre(926, 1007),
    MovieGenre(928, 1007),
    MovieGenre(918, 1007),
    MovieGenre(921, 1007),
    MovieGenre(902, 1008),
    MovieGenre(923, 1009),
    MovieGenre(907, 1010),
    MovieGenre(927, 1010),
    MovieGenre(901, 1010),
    MovieGenre(914, 1011),
    MovieGenre(906, 1012),
    MovieGenre(904, 1013)
  )

  val ratings = Set(
    Rating(901, 9001, Option(8.40), Option(263575)),
    Rating(902, 9002, Option(7.90), Option(20207)),
    Rating(903, 9003, Option(8.30), Option(202778)),
    Rating(906, 9005, Option(8.20), Option(484746)),
    Rating(924, 9006, Option(7.30), None),
    Rating(908, 9007, Option(8.60), Option(779489)),
    Rating(909, 9008, None, Option(227235)),
    Rating(910, 9009, Option(3.00), Option(195961)),
    Rating(911, 9010, Option(8.10), Option(203875)),
    Rating(912, 9011, Option(8.40), None),
    Rating(914, 9013, Option(7.00), Option(862618)),
    Rating(915, 9001, Option(7.70), Option(830095)),
    Rating(916, 9014, Option(4.00), Option(642132)),
    Rating(925, 9015, Option(7.70), Option(81328)),
    Rating(918, 9016, None, Option(580301)),
    Rating(920, 9017, Option(8.10), Option(609451)),
    Rating(921, 9018, Option(8.00), Option(667758)),
    Rating(922, 9019, Option(8.40), Option(511613)),
    Rating(923, 9020, Option(6.70), Option(13091))
  )

  val reviewers = Set(
    Reviewer(9001, Option("Righty Sock")),
    Reviewer(9002, Option("Jack Malvern")),
    Reviewer(9003, Option("Flagrant Baronessa")),
    Reviewer(9004, Option("Alec Shaw")),
    Reviewer(9005, None),
    Reviewer(9006, Option("Victor Woeltjen")),
    Reviewer(9007, Option("Simon Wright")),
    Reviewer(9008, Option("Neal Wruck")),
    Reviewer(9009, Option("Paul Monks")),
    Reviewer(9010, Option("Mike Salvati")),
    Reviewer(9011, None),
    Reviewer(9012, Option("Wesley S. Walker")),
    Reviewer(9013, Option("Sasha Goldshtein")),
    Reviewer(9014, Option("Josh Cates")),
    Reviewer(9015, Option("Krug Stillo")),
    Reviewer(9016, Option("Scott LeBrun")),
    Reviewer(9017, Option("Hannah Steele")),
    Reviewer(9018, Option("Vincent Cadena")),
    Reviewer(9019, Option("Brandt Sponseller")),
    Reviewer(9020, Option("Richard Adams"))
  )

  val genres = Set(
    Genre(1001, "Action"),
    Genre(1002, "Adventure"),
    Genre(1003, "Animation"),
    Genre(1004, "Biography"),
    Genre(1005, "Comedy"),
    Genre(1006, "Crime"),
    Genre(1007, "Drama"),
    Genre(1008, "Horror"),
    Genre(1009, "Music"),
    Genre(1010, "Mystery"),
    Genre(1011, "Romance"),
    Genre(1012, "Thriller"),
    Genre(1013, "War")
  )

  val actors = Set(
    Actor(101, "James", "Stewart", "M"),
    Actor(102, "Deborah", "Kerr", "F"),
    Actor(103, "Peter", "OToole", "M"),
    Actor(104, "Robert", "De Niro", "M"),
    Actor(105, "F. Murray", "Abraham", "M"),
    Actor(106, "Harrison", "Ford", "M"),
    Actor(107, "Nicole", "Kidman", "F"),
    Actor(108, "Stephen", "Baldwin", "M"),
    Actor(109, "Jack", "Nicholson", "M"),
    Actor(110, "Mark", "Wahlberg", "M"),
    Actor(111, "Woody", "Allen", "M"),
    Actor(112, "Claire", "Danes", "F"),
    Actor(113, "Tim", "Robbins", "M"),
    Actor(114, "Kevin", "Spacey", "M"),
    Actor(115, "Kate", "Winslet", "F"),
    Actor(116, "Robin", "Williams", "M"),
    Actor(117, "Jon", "Voight", "M"),
    Actor(118, "Ewan", "McGregor", "M"),
    Actor(119, "Christian", "Bale", "M"),
    Actor(120, "Maggie", "Gyllenhaal", "F"),
    Actor(121, "Dev", "Patel", "M"),
    Actor(122, "Sigourney", "Weaver", "F"),
    Actor(123, "David", "Aston", "M"),
    Actor(124, "Ali", "Astin", "F")
  )

  val directors = Set(
    Director(201, "Alfred", "Hitchcock"),
    Director(202, "Jack", "Clayton"),
    Director(203, "David", "Lean"),
    Director(204, "Michael", "Cimino"),
    Director(205, "Milos", "Forman"),
    Director(206, "Ridley", "Scott"),
    Director(207, "Stanley", "Kubrick"),
    Director(208, "Bryan", "Singer"),
    Director(209, "Roman", "Polanski"),
    Director(210, "Paul", "Thomas Anderson"),
    Director(211, "Woody", "Allen"),
    Director(212, "Hayao", "Miyazaki"),
    Director(213, "Frank", "Darabont"),
    Director(214, "Sam", "Mendes"),
    Director(215, "James", "Cameron"),
    Director(216, "Gus", "Van Sant"),
    Director(217, "John", "Boorman"),
    Director(218, "Danny", "Boyle"),
    Director(219, "Christopher", "Nolan"),
    Director(220, "Richard", "Kelly"),
    Director(221, "Kevin", "Spacey"),
    Director(222, "Andrei", "Tarkovsky"),
    Director(223, "Peter", "Jackson")
  )
}
