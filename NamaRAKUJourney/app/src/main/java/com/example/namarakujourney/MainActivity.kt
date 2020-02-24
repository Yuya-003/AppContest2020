package com.example.namarakujourney

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.namarakujourney.SubActivity_calc

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ボタンの取得
        val btnIntent_calc = findViewById<Button>(R.id.BTN_CALC)
        val btnIntent_conv = findViewById<Button>(R.id.BTN_CONV)
        val btnIntent_spot = findViewById<Button>(R.id.BTN_SPOT)


        // ボタンにリスナを登録
        btnIntent_calc.setOnClickListener (object : View.OnClickListener {
            override fun onClick(v: View?) {
                // Intent<Class>のオブジェクト生成
                val intent = Intent(this@MainActivity, SubActivity_calc::class.java)
                // オブジェクトから画面を起動
                startActivity(intent)
            }
        })
        btnIntent_conv.setOnClickListener (object : View.OnClickListener {
            override fun onClick(v: View?) {
                // Intent<Class>のオブジェクト生成
                val intent = Intent(this@MainActivity, SubActivity_conv::class.java)
                // オブジェクトから画面を起動
                startActivity(intent)
            }
        })
        btnIntent_spot.setOnClickListener (object : View.OnClickListener {
            override fun onClick(v: View?) {
                // Intent<Class>のオブジェクト生成
                val intent = Intent(this@MainActivity, SubActivity_spot::class.java)
                // オブジェクトから画面を起動
                startActivity(intent)
            }
        })

    }
}
