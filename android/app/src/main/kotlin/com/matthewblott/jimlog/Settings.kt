package com.matthewblott.jimlog

object Settings {
  val current: Environment =
    if (BuildConfig.DEBUG) Environment.Local else Environment.Remote
  
  enum class Environment(val url: String) {
    Remote("https://jimlog.coderscoffeehouse.com"),
    Local("http://10.0.2.2:3000")
  }
}