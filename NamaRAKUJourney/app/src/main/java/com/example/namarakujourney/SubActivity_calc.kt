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
                if (intPurchaseTotal == null){
                    textViewTotal.setText("0")
                } else{
                    var money: Int = 0
                    money = s.toString().toInt()
                    textViewTotal.setText(s.toString())
                    if(money > 10000) {
                        v10000.setText((money / 10000).toString())
                    }
                    while (money == 0){
                        if(money > 10000) {
                            pr_10000++
                            money - 10000
                        }else if(money > 5000){
                            ++pr__5000
                            money - 5000
                        }else if(money > 1000){
                            ++pr__1000
                            money - 1000
                        }else if(money > 500){
                            ++pr___500
                            money - 500
                        }else if(money > 100){
                            ++pr___100
                            money - 100
                        }else if(money > 50){
                            ++pr____50
                            money - 50
                        }else if(money > 10){
                            ++pr____10
                            money - 10
                        }else if(money > 5){
                            ++pr_____5
                            money - 5
                        }else if(money > 1){
                            pr_____1 = money
                            money = 0
                        }
                    }
                    textViewTotal.setText("finished_caliculate")
                    //v10000.setText(pr_10000.toString())
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