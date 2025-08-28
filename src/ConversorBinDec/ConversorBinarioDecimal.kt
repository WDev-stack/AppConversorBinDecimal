fun main (args: Array<String>) {

    println("Digite o número binário que será convertido em decimal: ")
    var numeroBinario: Long = readlnOrNull()?.toLong() ?: 0

    while (numeroBinario.toInt() <= 0) {
        println("Digite um valor válido: ")
        numeroBinario = readlnOrNull()?.toLongOrNull() ?: 0
    }
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
        ++i

    }

    return numeroDecimal
}
