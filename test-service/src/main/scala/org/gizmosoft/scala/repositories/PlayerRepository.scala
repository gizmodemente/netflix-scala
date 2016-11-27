package org.gizmosoft.scala.repositories

import org.gizmosoft.scala.model.Player
import org.springframework.data.repository.CrudRepository

/**
  * Created by gizmo on 27/11/16.
  */
trait PlayerRepository extends CrudRepository[Player, String]
