package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class NewWordActivity : AppCompatActivity() {

    private lateinit var editWordView : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_word)

        editWordView = findViewById(R.id.edit_word)
        val button = findViewById<Button>(R.id.button_save)
        button.setOnClickListener {
            val replyIntent = Intent()
            val word = editWordView.text.toString()
            replyIntent.putExtra(EXTRA_REPLY, word)
            setResult(RESULT_OK, replyIntent)
            finish()
        }
    }

    companion object {
        const val EXTRA_REPLY = "com.example.android.wordlistsql.REPLY"
    }

}