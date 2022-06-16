package simulations

import com.typesafe.config.{Config, ConfigFactory}

import scala.language.postfixOps

object ConfExtractor {

  def configGetter(subName: String): Config = {

    val config = ConfigFactory.load("application.conf").getConfig("application")
    val subConfig = config.getConfig(subName)

    if (subConfig != null) {
      subConfig
    } else {
      throw new Exception("Sub Config " + subName + " cannot be loaded")
    }
  }
}
