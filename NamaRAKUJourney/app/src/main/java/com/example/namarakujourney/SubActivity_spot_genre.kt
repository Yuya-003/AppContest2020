package com.example.namarakujourney

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_sub_spot_senre.*

class SubActivity_spot_genre : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub_spot_senre)

        val btnIntent_food : Button = BUTTON_FOOD

        btnIntent_food.setOnClickListener {
            val intent = Intent(this@SubActivity_spot_genre, SubActivity_spot_list::class.java)
            // オブジェクトから画面を起動
            startActivity(intent)
        }
    }
}
