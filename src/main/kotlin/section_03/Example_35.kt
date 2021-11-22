package section_03

import section_02.name

class PersonWithJson(val name: String) {
    companion object Loader {
        fun fromJson(jsonText : String) : String {
            return "$name"
        }
        fun toJson(name: String) : String {
            return fromJson(name)
        }
    }
}
