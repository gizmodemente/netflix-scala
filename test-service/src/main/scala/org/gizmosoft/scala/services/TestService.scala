package org.gizmosoft.scala.services

import org.gizmosoft.scala.model.Player

/**
  * Created by gizmo on 27/11/16.
  */
trait TestService {

//  def getAllPlayers (): Iterable[Player]

  def savePlayer (player : Player): Player

  def getOnePlayer (id : String): Player
}
