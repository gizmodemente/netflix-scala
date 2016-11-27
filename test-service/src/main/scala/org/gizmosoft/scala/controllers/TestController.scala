package org.gizmosoft.scala.controllers

import org.gizmosoft.scala.model.Player
import org.gizmosoft.scala.services.TestService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation._

/**
  * Created by gizmo on 27/11/16.
  */
@RestController
@RequestMapping(Array("/players"))
class TestController @Autowired()(private val testService : TestService ) {

  @RequestMapping(value = Array("/status"),
    method = Array(RequestMethod.GET),
    produces = Array(MediaType.APPLICATION_JSON_VALUE))
  @ResponseBody
  def test (): String = {
    "{ \"status\": \"ok\" }"
  }

  @RequestMapping(method = Array(RequestMethod.POST),
    consumes = Array(MediaType.APPLICATION_JSON_VALUE),
    produces = Array(MediaType.APPLICATION_JSON_VALUE))
  @ResponseBody
  def savePlayer(@Validated @RequestBody player: Player): Player = {
    testService.savePlayer(player)
  }

//  @RequestMapping(method = Array(RequestMethod.GET),
//    produces = Array(MediaType.APPLICATION_JSON_VALUE))
//  @ResponseBody
//  def getAllPlayers() : Iterable[Player] = {
//    testService.getAllPlayers()
//  }

  @RequestMapping(value = Array("/{id}"),
    method = Array(RequestMethod.GET),
    produces = Array(MediaType.APPLICATION_JSON_VALUE))
  @ResponseBody
  def getOnePlayer(@PathVariable("id") id : String) : Player = {
    testService.getOnePlayer(id)
  }
}
