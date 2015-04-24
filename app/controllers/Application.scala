package controllers

import play.api._
import play.api.mvc._
import actors.EchoActor
import play.api.Play.current

object Application extends Controller {

  def echo = WebSocket.acceptWithActor[String, String] { request =>
    out =>
      EchoActor.props(out)
  }

}