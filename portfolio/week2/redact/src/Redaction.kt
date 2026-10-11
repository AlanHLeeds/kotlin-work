// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(text: String, sensitiveInfo: String, replacement: Char = 'X'): String {
    val temp = text.replace(sensitiveInfo, replacement.toString().repeat(sensitiveInfo.length))
    return temp
}