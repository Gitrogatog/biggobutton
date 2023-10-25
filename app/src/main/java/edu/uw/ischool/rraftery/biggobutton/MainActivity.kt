package edu.uw.ischool.rraftery.biggobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var button : Button;
    var clickNum : Int = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = this.findViewById<Button>(R.id.btnGo)
        button.setOnClickListener {
            onClickButton(button)
        } //callback : (Button) -> Unit

    }

    fun onClickButton(btn : Button) {
        clickNum++
        var time = "times"
        if(clickNum == 1){
            time = "time"
        }

        btn.text = "You have pushed me " + clickNum.toString() + " " + time + "!"
    }
}