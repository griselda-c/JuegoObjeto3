package com.ar.ObjetosTest

import com.ar.clases.{Personaje, Tablero, Celda}

import scala.collection.mutable.ListBuffer

/**
 * Created by Griselda on 20/03/2015.
 */
class TableroParaTest {

  val personajes = ListBuffer[Personaje]()
  val celdaA1 = new Celda(2,List("B1","A2"), "A1")
  val celdaA2 = new Celda(2,List("A1","B2"), "A2")
  val celdaB1 = new Celda(2,List("A1","B2"), "B1")
  val celdaB2 = new Celda(2,List("A2","B1"), "B2")

  var tablero :Tablero = new Tablero(2,List(celdaA1,celdaA2,celdaB1,celdaB2))

  def getCelda(nombre:String): Celda ={
    return tablero.getCelda(nombre)
  }

  def getCeldas(nombres:List[String]) : List[Celda] ={
    return tablero.getCeldas(nombres)
  }
}
