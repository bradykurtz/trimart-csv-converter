package com.trimart.csvconverter

data class CncSpec(
    val fileName: String,
    val sheetNumber: String, // Ignored
    val width: Float,
    val length: Float,
    val thickness: Float,
    val woodType: String,
    val folderName: String,
    val unknownNeededNumber1: Int = 1,
    val unknownNeededNumber2: Int = 0
) {
    fun convertToString(delimiter: String = ";") = "$woodType$delimiter$unknownNeededNumber1$delimiter$unknownNeededNumber2$delimiter$folderName$delimiter$fileName$delimiter$woodType$delimiter$length$delimiter$width$delimiter$thickness$delimiter$delimiter$delimiter"
}