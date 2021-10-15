package com.example.odev1_figma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.databinding.adapters.TextViewBindingAdapter.setText
import com.example.odev1_figma.databinding.ActivityLiveDataExampleBinding

class LiveDataExample : AppCompatActivity() {

    val model = BindingViewModel()
    val editText by lazy { findViewById<EditText>(R.id.editTextNumber) }
    val textView by lazy {findViewById<TextView>(R.id.textView)}
    val textView2 by lazy {findViewById<TextView>(R.id.textView2)}
    val button by lazy { findViewById<Button>(R.id.button)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data_example)

        val binding = DataBindingUtil.setContentView<ActivityLiveDataExampleBinding>(
            this,
            R.layout.activity_live_data_example
        )
        button.setOnClickListener{
            val value = editText?.text
            textView.text = value

        }

        editText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun afterTextChanged(p0: Editable?) {
                model.name.value = p0.toString()
                button.isEnabled = true

            }

        })

        model.name.observe(this) {name ->
            binding.name = name

            }

            }





        }








