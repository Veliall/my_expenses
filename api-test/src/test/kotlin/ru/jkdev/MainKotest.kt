package ru.jkdev

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class MainKotest : StringSpec(
    {
        "workTest should return correct text" {
            workTest() shouldBe ("Everything work! Great!")
        }
    }
)