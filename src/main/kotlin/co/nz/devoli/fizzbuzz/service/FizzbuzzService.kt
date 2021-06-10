package co.nz.devoli.fizzbuzz.service

import org.springframework.stereotype.Service

@Service
class FizzbuzzService {

    fun getFizzBuzzOrNumber(index: Int): String {
        return when {
            index % 15 == 0 -> "Fizz Buzz"
            index % 3 == 0 -> "Fizz"
            index % 5 == 0 -> "Buzz"
            else -> index.toString()
        }
    }

    fun createFizzBuzzString(limit: Int): List<String> {

        val result = mutableListOf<String>();

        for (i in 1..limit) {
            result.add(getFizzBuzzOrNumber(i))
        }

        return result.toList()
    }
}