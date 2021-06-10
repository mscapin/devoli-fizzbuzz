package co.nz.devoli.fizzbuzz.api.v1

import co.nz.devoli.fizzbuzz.service.FizzbuzzService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1")
class FizzBuzzController {

    @Autowired
    lateinit var fizzBuzzService : FizzbuzzService

    @GetMapping("/fizzbuzz/{limit}")
    @ResponseBody
    fun createFizzBuzzString(@PathVariable limit: Int) : ResponseEntity<List<String>> {

        val fizzBuzzResult : List<String> = fizzBuzzService.createFizzBuzzString(limit)
        return ResponseEntity.ok(fizzBuzzResult)
    }
}