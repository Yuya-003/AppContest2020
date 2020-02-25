package com.example.namarakujourney

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sub_spot_list.*
import java.lang.String
import java.util.*


class SubActivity_spot_list : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub_spot_list)

        val btnIntent_ramen : Button = BUTTON_RAMEN

        btnIntent_ramen.setOnClickListener {
            val start = "札幌大通駅"

            // 目的地
            val destination = "ら～めん共和国"

            // 移動手段：電車:r, 車:d, 歩き:w
            val dir = arrayOf("r", "d", "w")

            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.setClassName(
                "com.google.android.apps.maps",
                "com.google.android.maps.MapsActivity"
            )

            // 出発地, 目的地, 交通手段
            val str = String.format(
                Locale.US,
                "http://maps.google.com/maps?saddr=%s&daddr=%s&dirflg=%s",
                start, destination, dir[2]
            )

            intent.data = Uri.parse(str)
            startActivity(intent)
        }
    }
}
