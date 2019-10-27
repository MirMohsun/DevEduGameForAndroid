package az.devedu.gameforandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Switch
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_mind_controller.*

class MindController : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mind_controller)
        val firstName  = intent.getStringExtra("FirstName")
        Log.d("name", "FirstName is $firstName")

        val tv = findViewById<TextView>(R.id.tvWelcome)
        tv.text = "Welcome $firstName please make a number"
    }

    fun getResult(view: View)
    {
        var num = 0
        var col1 = findViewById<Switch>(R.id.firstSwitch)
        var col2 = findViewById<Switch>(R.id.secSwitch)
        var col3 = findViewById<Switch>(R.id.thirdSwitch)
        var col4 = findViewById<Switch>(R.id.fourthSwitch)
        var col5 = findViewById<Switch>(R.id.fifthSwitch)

        if (col1.isChecked)
        {
            num = num + 1
        }
        if (col2.isChecked)
        {
            num = num + 2
        }
        if (col3.isChecked)
        {
            num = num + 4
        }
        if (col4.isChecked)
        {
            num = num + 8
        }
        if (col5.isChecked)
        {
            num = num + 16
        }

        tvResult.text = num.toString()
    }
}
