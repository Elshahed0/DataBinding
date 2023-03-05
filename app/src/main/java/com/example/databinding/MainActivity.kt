package com.example.databinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // here we create an object of DataBinding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        binding.button.setOnClickListener {
//            display()
            displayWithScope()
        }
    }


    //  this function to display what we want
    // we no longer need a findviewByid

    private fun display() {
        binding.textView.text = "Welcome " + binding.editTextTextPersonName.text

    }


    // we can use apply scope to reduce the repetition of bataBinding word
    // both are true
    private fun displayWithScope(){

        binding.apply {
            textView.text = "Welcome " + editTextTextPersonName.text

        }
    }

}