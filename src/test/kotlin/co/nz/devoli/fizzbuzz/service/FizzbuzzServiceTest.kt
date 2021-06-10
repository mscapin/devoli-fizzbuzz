package co.nz.devoli.fizzbuzz.service

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FizzbuzzServiceTest {

    private val fizzbuzzService = FizzbuzzService()

    private val LIMIT_FIFTEEN_LIST = listOf<String>("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "Fizz Buzz")

    @Test
    fun `Should return '1' when limit is 1`(){
        Assertions.assertEquals("1", fizzbuzzService.getFizzBuzzOrNumber(1))
    }
    @Test
    fun `Should return '2' when limit is 2`(){
        Assertions.assertEquals("2", fizzbuzzService.getFizzBuzzOrNumber(2))
    }
    @Test
    fun `Should return 'fuzz' when limit is 3`(){
        Assertions.assertEquals("Fizz", fizzbuzzService.getFizzBuzzOrNumber(3))
    }
    @Test
    fun `Should return 'buzz' when limit is 5`(){
        Assertions.assertEquals("Buzz", fizzbuzzService.getFizzBuzzOrNumber(5))
    }
    @Test
    fun `Should return 'fizzbuzz' when limit is 15`(){
        Assertions.assertEquals("Fizz Buzz", fizzbuzzService.getFizzBuzzOrNumber(15))
    }

    @Test
    fun `Should return correct String list when limit is 15`() {
        val result = fizzbuzzService.createFizzBuzzString(15)

        Assertions.assertEquals(LIMIT_FIFTEEN_LIST,result)
    }

    @Test
    fun `Should return empty list when limit is 0`() {
        val result = fizzbuzzService.createFizzBuzzString(0)

        Assertions.assertTrue(result.isEmpty())
    }
    @Test
    fun `Should return empty list when limit is a negative number`() {
        val result = fizzbuzzService.createFizzBuzzString(-10)

        Assertions.assertTrue(result.isEmpty())
    }
}