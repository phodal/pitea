package sample

import chapi.domain.core.CodeDataStruct

expect class Sample() {
    fun checkMe(): Int
}

expect object Platform {
    val name: String
}

fun hello(): String  {
    val codeDataStruct = CodeDataStruct()
    codeDataStruct.NodeName = "hello.world"
    return "Hello sfrom ${Platform.name}"
}
