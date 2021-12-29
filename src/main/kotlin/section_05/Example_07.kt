package section_05

interface Element {
    val active: Boolean
}
class ActiveElement : Element {
    override val active: Boolean
        get() = false
}