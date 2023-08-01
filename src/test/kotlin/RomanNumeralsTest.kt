import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class RomanNumeralsTest {
    @Test
    fun `when 1 have 1, return "I`() {
        //given
        val total = 1
        //when
        val actual = toRomanNumeral(total)
        //then
        assertEquals("I", actual)
    }

    private fun toRomanNumeral(total: Int) {

    }
}

