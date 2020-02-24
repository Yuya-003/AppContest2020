package com.example.namarakujourney

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_sub_conv.*

class SubActivity_conv : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub_conv)

        val btnIntent_gree   : Button = BUTTON_GREE
        val btnIntent_dire   : Button = BUTTON_DIRE
        val btnIntent_meal   : Button = BUTTON_MEAL
        val btnIntent_trans  : Button = BUTTON_TRANS
        val btnIntent_hotel  : Button = BUTTON_HOTEL
        val btnIntent_events : Button = BUTTON_EVENTS
        val btnIntent_pay    : Button = BUTTON_PAY
        val btnIntent_other  : Button = BUTTON_OTHER

        btnIntent_gree.setOnClickListener {

        }

        btnIntent_dire.setOnClickListener {

        }

        btnIntent_meal.setOnClickListener {
            val intent = Intent(this@SubActivity_conv, SubActivity_kaiwa_::class.java)
            // オブジェクトから画面を起動
            startActivity(intent)
        }

        btnIntent_trans.setOnClickListener {

        }

        btnIntent_hotel.setOnClickListener {

        }

        btnIntent_events.setOnClickListener {

        }

        btnIntent_pay.setOnClickListener {

        }

        btnIntent_other.setOnClickListener {

        }

    }
}
