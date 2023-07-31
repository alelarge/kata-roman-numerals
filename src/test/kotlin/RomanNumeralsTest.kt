import org.junit.jupiter.api.Test

class RomanNumeralsTest {
    @Test
    fun `most commonly used Roman symbols`() {
        //given
        val commonlyRomanSymbols = mapOf(
            1 to "I",
            5 to "V",
            10 to "X",
            50 to "L",
            100 to "C",
            500 to "D",
            1000 to "M",
        )
        //when
        commonlyRomanSymbols.forEach { (input, expected) ->
            assertEquals<String>(expected, RomanNumerals.NumeralConverter.convertToRoman(input))
        }
    }

    private fun <T> assertEquals(expected: T, actual: Unit) {

    }
}



    
