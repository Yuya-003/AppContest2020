package com.example.namarakujourney

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import kotlinx.android.synthetic.main.activity_sub_calc.*

class SubActivity_calc : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub_calc)

        var intPurchaseTotal: Int? = 0

        editYenInput.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                print("入力前")
                textViewTotal.setText("入力中してください")
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                print("入力中")
                textViewTotal.setText("入力中...")
            }
            override fun afterTextChanged(s: Editable?) {
                print("入力後")
                var pr_10000: Int = 0
                var pr__5000: Int = 0
                var pr__1000: Int = 0
                var pr___500: Int = 0
                var pr___100: Int = 0
                var pr____50: Int = 0
                var pr____10: Int = 0
                var pr_____5: Int = 0
                var pr_____1: Int = 0

                print(s.toString())
                if (editYenInput == null){
                    textViewTotal.setText("0")
                } else {
                    var money: Int = 0
                    money = s.toString().toInt()
                    println(money)
                    textViewTotal.setText(s.toString())
                    if(money >= 10000){
                        pr_10000 = money/10000
                        money = money % (pr_10000*10000)
                    }
                    if(money >= 1000){
                        pr__1000 = money/1000
                        money = money % (pr__1000*1000)
                        if (pr__1000 > 5){
                            pr__5000 = 1
                            pr__1000 = pr__1000 - 5
                        }

                    }
                    if(money >= 100){
                        pr___100 = money/100
                        money = money % (pr___100*100)
                        if (pr___100 > 5){
                            pr___500 = 1
                            pr___100 = pr___100 - 5
                        }
                    }
                    if(money >= 10 ){
                        pr____10 = money/10
                        money = money % (pr____10*10)
                        if (pr____10 > 5){
                            pr____50 = 1
                            pr____10 = pr____10 - 5
                        }
                    }
                    if(money >= 1 ){
                        pr_____1 = money/1
                        if (pr_____1 > 5){
                            pr_____5 = 1
                            pr_____1 = pr_____1 - 5
                        }
                    }
                    v10000.setText(pr_10000.toString())
                    v5000.setText(pr__5000.toString())
                    v1000.setText(pr__1000.toString())
                    v500.setText(pr___500.toString())
                    v100.setText(pr___100.toString())
                    v50.setText(pr____50.toString())
                    v10.setText(pr____10.toString())
                    v5.setText(pr_____5.toString())
                    v1.setText(pr_____1.toString())
                }
            }
        })
    }
}