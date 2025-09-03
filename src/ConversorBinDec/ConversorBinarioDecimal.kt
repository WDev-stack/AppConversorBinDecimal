fun main (args: Array<String>) {

    var numeroBinario: Long

    do {
        println("Digite o número binário que será convertido em decimal: ")
        numeroBinario = readlnOrNull()?.toLongOrNull() ?: -1

        if (numeroBinario <= 0) {
            println("Erro: Esse número não corresponde a um número Binário!")
        }

    } while (numeroBinario.toInt() <= 0)

    var numeroDecimal: Int = 0
    numeroDecimal = conversorBinarioDecimal(numeroBinario)

    println("Número binário $numeroBinario = $numeroDecimal")
}

fun conversorBinarioDecimal (numeroBinario: Long):Int {

    var numeroBinario = numeroBinario
    var numeroDecimal = 0
    var i = 0
    var numeroTemporario: Long

    while (numeroBinario.toInt() != 0) {

        numeroTemporario = numeroBinario % 10
        numeroBinario /= 10
        numeroDecimal += (numeroTemporario * Math.pow(2.0,i.toDouble())).toInt()
        i++
    }

    return numeroDecimal
}
