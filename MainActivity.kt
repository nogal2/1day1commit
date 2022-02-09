package com.example.baseballgame

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.baseballgame.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var baseball:Baseball? = null
    var w=0
    var count = 9
    var ranNum:IntArray = IntArray(3)

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setupSpinner()

        baseball = Baseball()
        //랜덤 숫자 뽑기
        baseball!!.random()

        binding.btnReset.setOnClickListener {
            reset()
            baseball!!.random()
        }

        binding.btnStart.setOnClickListener {
            action()
            w++
            val toast = Toast.makeText(this.applicationContext,"기회는 ${count--}번 남았습니다.", Toast.LENGTH_SHORT)
            toast.show()
            if(w == 9) {
                var ans1 = baseball!!.random()[0]
                var ans2 = baseball!!.random()[1]
                var ans3 = baseball!!.random()[2]
                AlertDialog.Builder(this@MainActivity)
                    .setTitle("결과")
                    .setMessage("기회 10번을 다 사용하셨습니다. 더 하시겠습니까?")
                    .setCancelable(false)
                    .setPositiveButton("더 하기", DialogInterface.OnClickListener{dialog, which ->
                        w = 0
                        count=9
                    })
                    .setPositiveButton("정답 보기", DialogInterface.OnClickListener{dialog, which ->
                        AlertDialog.Builder(this@MainActivity)
                            .setTitle("정답")
                            .setMessage("첫째: ${ans1}, 둘째: ${ans2}, 셋째:${ans3}")
                            .setCancelable(false)
                            .setNeutralButton("닫기", DialogInterface.OnClickListener{dialog, which->}).show()
                    })
                    .setNeutralButton("닫기", DialogInterface.OnClickListener{dialog, which->
                        reset()
                    }).show()
            }
       }




    }

    fun reset() {
        binding.textView.text = "Welcome"
        setupSpinner()
        var w=0
        count=9
    }
    fun action() {

        val num1 = binding.spinner1.selectedItem.toString().toInt()
        val num2 = binding.spinner2.selectedItem.toString().toInt()
        val num3 = binding.spinner3.selectedItem.toString().toInt()

        var spinnerArr = arrayOf<Int>(num1, num2, num3)
        val result: Result? = baseball?.finding(spinnerArr)

        if (result != null) {
            if (result.strike == 3) {
                baseball?.clear = true
                binding.textView.text = baseball?.resultString()

            } else {
                binding.textView.text = "${result.strike} 스트라이크 ${result.ball} 볼입니다."

            }

        }

    }

    fun setupSpinner() {
        var countArr = arrayOf(1,2,3,4,5,6,7,8,9,10)
        val adapter = ArrayAdapter(this, R.layout.item_spinner, countArr)
        binding.spinner1.adapter = adapter
        binding.spinner2.adapter = adapter
        binding.spinner3.adapter = adapter
    }




}