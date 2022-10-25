package com.example.aparienciaestilostemas

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fab: View = findViewById(R.id.fab)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG).setAction("Action", null)
                .show()
        }

        val btn: View = findViewById(R.id.btnSinBorde1)
        btn.setOnClickListener {
            Toast.makeText(this, "Si es un boton", Toast.LENGTH_LONG).show()
        }
    }

}