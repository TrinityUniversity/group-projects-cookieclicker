package models
import collection.mutable
object cookieClickerMemoryModel {
  //this will be replaced with a db when we learn it 

private val userData = mutable.Map[(String, String),String] (("noah", "pass") -> "Noahs data here")
}
