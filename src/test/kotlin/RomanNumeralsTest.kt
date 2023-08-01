import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class RomanNumeralsTest {
    @Test
    fun `when 1 have 1, return "I`() {
        //given
        val total = 1
        val romanNumerals = RomanNumerals()
        //when
        val actual = romanNumerals.toRomanNumeral(total)
        //then
        assertEquals("I", actual)
    }
}

