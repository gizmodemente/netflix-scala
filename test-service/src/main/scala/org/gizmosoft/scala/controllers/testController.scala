package org.gizmosoft.scala.controllers

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, ResponseBody, RestController}

/**
  * Created by gizmo on 27/11/16.
  */
@RestController
@RequestMapping(Array("/tests"))
class testController {

  @RequestMapping(method = Array(RequestMethod.GET), produces = Array(MediaType.APPLICATION_JSON_VALUE))
  @ResponseBody
  def test (): String = {
    "{ \"status\": \"ok\" }"
  }

}
