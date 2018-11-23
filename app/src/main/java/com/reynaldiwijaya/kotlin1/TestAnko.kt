package com.reynaldiwijaya.kotlin1

import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.view.*
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick
import java.util.*

class TestAnko: AppCompatActivity() {

    var tvHasil: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        //TODO: Menggunakan Anko Layout
        linearLayout{
            orientation = LinearLayout.VERTICAL
            val edtBirthYear = editText{
                hint = "Enter Your Birth Year"
            }
            button{
                text = "Find My Age"
                onClick {
                    //Mendapatkan tahun saat ini
                    val tahunSekarang = Calendar.getInstance().get(Calendar.YEAR)
                    val tahuLahir = edtBirthYear.text.toString()
                    var userAge = 0

                    if (tahuLahir.toIntOrNull() != null){
                        //TODO: Hitung Tahun Sekarang - Tahun Lahir
                        userAge = tahunSekarang - tahuLahir.toInt()
                    }else{

                    }
                    //TODO: Set Umur ke txtAgeResult
                    tvHasil?.text = "Your age is $userAge years old"
                }
            }
            tvHasil = textView{
                verticalPadding = dip(20)
                text = "Your age is 0 years old"
            }
        }
    }

}