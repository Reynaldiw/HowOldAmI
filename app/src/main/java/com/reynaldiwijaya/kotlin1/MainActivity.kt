package com.reynaldiwijaya.kotlin1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.reynaldiwijaya.kotlin1.R.id.*
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO: Sembunyikan txtAgeResult
        txtAgeResult.visibility = View.INVISIBLE

        //TODO: Beri Event Klik ke Button
        btnFindMyAge.setOnClickListener {
            // Mendapatkan tahun saat ini
            val tahunSekarang = Calendar.getInstance().get(Calendar.YEAR)

            //TODO: Hitung (Tahun Sekarang - Tahun Lahir
            val userAge = tahunSekarang - edtBirthYear.text.toString().toInt()

            //TODO: set hasil ke textview
            txtAgeResult.text = "Your Age is $userAge years old"

            //TODO: Menampilkan text Result
            txtAgeResult.visibility = View.VISIBLE
        }
    }
}
