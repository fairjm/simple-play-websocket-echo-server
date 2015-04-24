package actors

import akka.actor.Actor
import akka.actor.ActorRef
import akka.actor.Props

class EchoActor(out: ActorRef) extends Actor {

  override def preStart(): Unit = out ! "echo server by play"

  override def receive = {
    case s => out ! s
  }
}

object EchoActor {
  def props(out:ActorRef) = {
    Props(new EchoActor(out))
  }
}