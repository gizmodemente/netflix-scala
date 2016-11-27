package org.gizmosoft.scala.model

import com.couchbase.client.java.repository.annotation.Field
import org.hibernate.validator.constraints.NotEmpty
import org.springframework.data.annotation.Id
import org.springframework.data.couchbase.core.mapping.Document

import scala.beans.BeanProperty

/**
  * Created by gizmo on 27/11/16.
  */
@Document
class Player {

  @Id
  @BeanProperty
  @NotEmpty
  var name: String = _

  @Field
  @BeanProperty
  var team: String = _
}
