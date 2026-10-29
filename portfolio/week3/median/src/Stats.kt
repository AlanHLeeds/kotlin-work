// Task 7.7.1: statistics functions
fun median(data: List<Float>): Float {
    val sortedData = data.sorted()
    val size = sortedData.size
    return if (size % 2 == 0) {
        (sortedData[size / 2 - 1] + sortedData[size / 2]) / 2
    } 
    else {
        sortedData[size / 2]
    }
}

fun stats(data: List<Float>): Float {
    val mean = data.average().toFloat()
    val max = data.max().toFloat()
    val min = data.min().toFloat()
    val medianValue = median(data)
    println("Mean: $mean")
    println("Max: $max")
    println("Min: $min")
    println("Median: $medianValue")
    return mean
}