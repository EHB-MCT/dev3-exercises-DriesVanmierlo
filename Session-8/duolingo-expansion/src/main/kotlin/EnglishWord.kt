class EnglishWord(override val original: String,
                  override val translated: String,
                  override var difficulty: Int): Word(original, translated, difficulty, "en") {

}