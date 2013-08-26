package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    Ok("v 1")
  }
  
  def test = Action {
    Ok("?")
  }

}