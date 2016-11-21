package org.gizmosoft.scala

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

/**
  * Created by gizmo on 21/11/16.
  */
@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
class application

object EurekaApplication extends App {
  SpringApplication.run(classOf[application]);
}
