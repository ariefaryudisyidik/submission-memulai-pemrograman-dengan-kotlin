/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah struktur kode yang sudah ada. Kecuali:
 *    - Untuk melakukan improvisasi kode
 *    - Mengikuti perintah yang ada
 *
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */

fun main() {
    // TODO 1
    val vehicle = mapOf(
            "type" to "Motorcycle",
            "maxSpeed" to "230Km/s",
            "maxTank" to "10Ltr"
    )

    // TODO 2
    val type = "${vehicle["type"]}"
    val maxSpeed = "${vehicle["maxSpeed"]}"
    val maxTank = "${vehicle["maxTank"]}"

    // TODO 3
    println("""
        Vehicle
        Type: $type
        Maximal Speed: $maxSpeed
        Maximal Tank: $maxTank
    """.trimIndent())
}

/*
   output:
       Vehicle
       Type: Motorcycle
       Maximal Speed: 230Km/s
       Maximal Tank: 10Ltr
*/

