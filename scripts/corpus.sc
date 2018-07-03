import edu.holycross.shot.cite._
import edu.holycross.shot.ohco2._

val cex = "editions/tacitus.annales.cex"

val  annals = TextRepositorySource.fromCexFile(cex).corpus
