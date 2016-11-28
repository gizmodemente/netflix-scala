package org.gizmosoft.scala.services.impl

import org.gizmosoft.scala.model.Player
import org.gizmosoft.scala.repositories.PlayerRepository
import org.gizmosoft.scala.services.TestService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service

import scala.collection.JavaConverters
import scala.collection.JavaConverters._

/**
  * Created by gizmo on 27/11/16.
  */
@Service
class TestServiceDefault @Autowired()(private val playerRepository : PlayerRepository) extends TestService{
//  override def getAllPlayers(): Iterable[Player] = {
//    JavaConverters.asScalaIterator[Player](playerRepository.findAll().iterator()).toIterable
//  }

  override def savePlayer(player: Player): Player = playerRepository.save(player)

  @Cacheable(Array("players"))
  override def getOnePlayer(id: String): Player = playerRepository.findOne(id)
}
