import com.sun.source.util.Trees
import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>) {

    val random = Random()
    var strike:Int = 0
    var ball:Int = 0
    var ballCount:Int = 0



    while(true) {
        // 랜덤으로 각각 다른 숫자 생성
        var quizNum = mutableListOf<Int>()
        while(quizNum.size < 3) {
            val ranNum = random.nextInt(10) +1
            if(quizNum.contains(ranNum)) {
                continue
            }
            quizNum.add(ranNum)
        }
        //랜덤 각각 다른 숫자 입력
        var w = 0
        var chance = 9
        while(w < 10) {
            var inputNum = mutableListOf<Int>()
            while(inputNum.size < 3) {
                println("숫자를 입력해주세요")
                val ranNum:Int = readLine()?.toInt()!!
                if(inputNum.contains(ranNum)) {
                    println("중복입력을 불가능합니다. 다른 숫자를 입력해주세요.")
                    continue
                }
                inputNum.add(ranNum)
            }
            //숫자 비교
            when(quizNum[0]) {
                inputNum[0] -> strike++
                inputNum[1] -> ballCount++
                inputNum[2] -> ballCount++
            }

            when(quizNum[1]) {
                inputNum[0] -> ballCount++
                inputNum[1] -> strike++
                inputNum[2] -> ballCount++
            }

            when(quizNum[2]) {
                inputNum[0] -> ballCount++
                inputNum[1] -> ballCount++
                inputNum[2] -> strike++
            }

            if(ballCount > 0) {
                ball++
            }

            println("${strike}strike ${ball}ball")
            if(strike == 3) {
                println("game clear")
                break
            }
            strike = 0
            ball = 0

            println("기회는 ${chance--}번 남았습니다.")
            w++
            if(w==9) {
                println("10회 모두 사용하였습니다. 다시 하시겠습니까?")
                val ch:Int = readLine()?.toInt()!!
                if(ch == 1) {
                    w=0
                }else {
                    println("수고하셨습니다.")
                    break
                }

            }

        }


    }



}
