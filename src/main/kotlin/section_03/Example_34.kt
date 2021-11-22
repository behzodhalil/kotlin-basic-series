package section_03

class SpotifyUser private constructor(val spotifyUserName: String) {
    companion object {
        fun newSubscribingUser(email: String) =
            SpotifyUser(email.substringBefore("@"))
        fun newSubscribingId(id: Int) = "$id"
    }
}