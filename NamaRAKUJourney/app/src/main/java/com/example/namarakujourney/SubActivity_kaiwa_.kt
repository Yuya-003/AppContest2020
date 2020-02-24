package com.example.namarakujourney

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SubActivity_kaiwa_ : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub_kaiwa_eat)

        val btnIntent_hm = findViewById<Button>(R.id.BTN_HM)


        // ボタンにリスナを登録
        btnIntent_hm.setOnClickListener (object : View.OnClickListener {
            override fun onClick(v: View?) {
                // Intent<Class>のオブジェクト生成
                val intent = Intent(this@SubActivity_kaiwa_, SubActivity_calc::class.java)
                // オブジェクトから画面を起動
                startActivity(intent)
            }
        })
    }
}
