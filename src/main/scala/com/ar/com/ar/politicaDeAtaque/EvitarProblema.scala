package com.ar.com.ar.politicaDeAtaque

import com.ar.clases.{Celda, PoliticaDeAtaque}

/**
 * Created by Griselda on 19/03/2015.
 */

class EvitarProblema extends PoliticaDeAtaque{


  override  def celdaRecomendada: Celda = {


    val celdaA1 = new Celda(2,List("B1","A2"), "A1")

    return celdaA1
  }
}
