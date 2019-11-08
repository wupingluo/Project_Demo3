import akka.actor._

case class AddParty()
case class RemoveParty()
case class BattleStarted()
case object Update
case class Turn()

class battle_system extends Actor{
  def receive:Receive={
    case Update =>
  }
}
