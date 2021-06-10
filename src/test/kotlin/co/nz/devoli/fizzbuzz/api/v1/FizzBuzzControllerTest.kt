package co.nz.devoli.fizzbuzz.api.v1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForEntity
import org.springframework.http.HttpStatus

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class FizzBuzzControllerTest(@Autowired val restTemplate: TestRestTemplate) {

    @Test
    fun `assert fizzbuzz content and status code`() {
        val entity = restTemplate
            .withBasicAuth("user", "fizzbuzz")
            .getForEntity<String>("/api/v1/fizzbuzz/4")

        assertEquals(HttpStatus.OK, entity.statusCode)
        assertEquals("[\"1\",\"2\",\"Fizz\",\"4\"]",entity.body)
    }

}
