package com.ar.test

import com.ar.clases.{Personaje, Jugador}
import com.ar.com.ar.politicaDeAtaque.EvitarProblema
import com.ar.politicaDePersonaje.Pancho
import org.scalatest.FlatSpec

import scala.collection.mutable.ListBuffer

/**
 * Created by Griselda on 19/03/2015.
 */
class TestJugador extends FlatSpec {

  "jugador" should "have name" in {
    val pancho = new Pancho
    var eviProblem = new EvitarProblema()
    var personajes = ListBuffer[Personaje]()

    val jugadorA = new Jugador("a", pancho, eviProblem, personajes)
    val jugadorB = new Jugador("b", pancho, eviProblem, personajes)


    assert(jugadorA.nombre == "a")
    assert(jugadorB.nombre == "b")
  }


}
