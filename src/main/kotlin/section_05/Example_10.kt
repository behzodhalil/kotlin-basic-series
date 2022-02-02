package section_05

class CovarianceSample<T>

fun main() {
    // val firstSample: CovarianceSample<Any> = CovarianceSample<Int>()
    val secondSample: CovarianceSample<out Any> = CovarianceSample<String>()
    // val thirdSample: CovarianceSample<out String> = CovarianceSample<Any>()
}