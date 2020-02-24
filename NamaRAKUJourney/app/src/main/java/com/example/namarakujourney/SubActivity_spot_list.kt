package com.example.namarakujourney

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sub_spot_list.*

class SubActivity_spot_list : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub_spot_list)

        val btnIntent_ramen : Button = BUTTON_RAMEN

        btnIntent_ramen.setOnClickListener {
            val intent = Intent(this@SubActivity_spot_list, SubActivity_spot_details::class.java)
            // オブジェクトから画面を起動
            startActivity(intent)
        }
    }
}
