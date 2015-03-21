package com.ar.test

import com.ar.ObjetosTest.TableroParaTest
import org.scalatest.FlatSpec
import com.ar.clases.Tablero
import com.ar.clases.Celda

/**
 * Created by Griselda on 19/03/2015.
 */
class TestTablero extends FlatSpec {

  "tablero" should "have size 4" in {

    val celdaA1 = new Celda(2,List("B1","A2"), "A1")
    val celdaA2 = new Celda(2,List("A1","B2"), "A2")
    val celdaB1 = new Celda(2,List("A1","B2"), "B1")
    val celdaB2 = new Celda(2,List("A2","B1"), "B2")

    val tablero = new Tablero(2,List(celdaA1,celdaA2,celdaB1,celdaB2))

    assert(tablero.celdas.size == 4)
  }

  it should "devolver la celda B2" in {
    val tablero = new TableroParaTest()
    val celda = tablero.getCelda("B2")

    assert(celda.nombre == "B2")
  }

  it should "devolver las celdas A1 y B2" in {
    val tablero = new TableroParaTest()
    val nombres = List("A1","B2")
    val lista = tablero.getCeldas(nombres)
    assert(lista.head.nombre == "A1")
    assert(lista.tail.head.nombre == "B2")

  }

  it should "retornar que existen 2 personajes vecinos" in {

  }


}
