package section_03

interface UserWithName {
    val email: String
    val nickname: String get() = email.substringBefore('@')
}

