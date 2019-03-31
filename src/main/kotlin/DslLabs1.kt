package io.x0A.experiment

import kotlin.reflect.KProperty

object x0A {

    val labs = object {

    }
}

infix fun KProperty<Any>.ayuda(any: Any) {

}

class Lista {
    operator fun <T: Thing> T.unaryPlus() = this

    operator fun <T: Thing> T.unaryMinus() = this
}

fun a(block: Lista.() -> Unit) {

}

sealed class Thing

object mejorar: Thing()

object aprender: Thing()

object estres: Thing()

object aburrimiento: Thing()

object validar: Thing() {

    infix fun ideas(adjective: Adjective) {

    }
}

object probar: Thing() {

    infix fun herramientas(adjective: Adjective) {

    }
}

object crear: Thing() {

    infix fun equipo(adjective: Adjective) {

    }
}

sealed class Adjective

object nuevas: Adjective()

object fuerte: Adjective()

fun main() {

    x0A::labs ayuda a {
        + mejorar
        + aprender
        + probar herramientas nuevas
        + validar ideas nuevas
        + crear equipo fuerte
        - estres
        - aburrimiento
    }

}