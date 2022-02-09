package com.example.baseballgame

class Baseball {
    var ranNum:IntArray = IntArray(3)
    var clear:Boolean = false

    constructor() {
        clear = false
    }

    // 랜덤 숫자 뽑기
    fun random(): IntArray {
        var switch = BooleanArray(10)
        for(i in switch.indices) {
            switch[i] = false
        }

        var w = 0
        while(w<3) {
            var r = (Math.random() * 10).toInt()
            if(switch[r] == false) {
                switch[r] = true
                ranNum[w] = r+1
                w++
            }
        }
        return ranNum
        for(i in ranNum.indices) {
            println("ranNum[$i] = ${ranNum[i]}")
        }
    }

    // 판정
    fun finding(userNum:Array<Int>): Result {
        var strike:Int = 0
        var ball:Int = 0

        // ball
        for(i in userNum.indices) {
            for(j in userNum.indices) {
                if(userNum[i] == ranNum[j] && i != j) {
                    ball++
                }
            }
        }

        //strike
        for(i in userNum.indices) {
            if(userNum[i] == ranNum[i]) {
                strike++
            }
        }
        return Result(strike,ball)
    }

    //결과
    fun resultString(): String {
        if(clear == true) {
            return "축하합니다 게임 클리어"
        }else {
            return "아쉽습니다 다시 도전하십시오"
        }
    }

}
class Result(val strike:Int, val ball:Int)