import kotlin.math.floor
import kotlin.math.roundToInt

fun main() {
val result= isValidSudoku( listOf(
    listOf('5', '5', '4', '6', '7', '8', '9', '1', '2'),
    listOf('6', '7', '7', '1', '9', '5', '3', '4', '8'),
    listOf('1', '9', '8', '3', '4', '2', '5', '6', '7'),
    listOf('8', '5', '9', '7', '6', '1', '4', '2', '3'),
    listOf('4', '2', '6', '8', '5', '3', '7', '9', '1'),
    listOf('7', '1', '3', '9', '2', '4', '8', '5', '6'),
    listOf('9', '6', '1', '5', '3', '7', '2', '8', '4'),
    listOf('2', '8', '7', '4', '1', '9', '6', '3', '5'),
    listOf('3', '4', '5', '2', '8', '6')))
    println(result)

}
fun isValidSudoku(board: List<List<Char>>): Boolean {
    val size = board.size
    for (i in 0 until size){
      if (  board[i].size !=size){
          return false
      }
    }
    val isSqured :Double = Math.sqrt(size.toDouble())
    var boxSize =0;
    if (floor(isSqured) ==isSqured){
        boxSize = Math.sqrt(size.toDouble()).toInt()
    }
    else
    {

        return false;
    }


    for (i in 0 until size) {
        if (!isValidGroup(board[i])) return false
        if (!isValidGroup(board.map { it[i] })) return false
    }

    for (row in 0 until size step boxSize) {
        for (col in 0 until size step boxSize) {
            val box = mutableListOf<Char>()
            for (r in 0 until boxSize) {
                for (c in 0 until boxSize) {
                    box.add(board[row + r][col + c])
                }
            }
            if (!isValidGroup(box)) return false
        }
    }

    return true
}

    fun isValidGroup(group: List<Char>): Boolean {
        val list = mutableSetOf<Char>()
        for (item in group) {
            if (!item.equals('-')) {
                val num = item.toString().toIntOrNull() ?: return false
            }
            if (item != '-' && !list.add(item)) return false
        }
        return true
    }