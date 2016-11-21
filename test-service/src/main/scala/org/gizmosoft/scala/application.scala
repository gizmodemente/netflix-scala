package org.gizmosoft.scala

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

/**
  * Created by gizmo on 21/11/16.
  */
@SpringBootApplication
@EnableEurekaClient
class application

object Application extends App {
  SpringApplication.run(classOf[application]);
}
