package az.devedu.gameforandroid


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import az.devedu.gameforandroid.MindController
import az.devedu.gameforandroid.R
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.reflect.Array
import kotlin.Array as Array1

class MainActivity : AppCompatActivity() {

    public lateinit var loginList: Array1<out String>
    public lateinit var passwordList: Array1<out String>
    lateinit var editLogin: EditText
    lateinit var editPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loginList = resources.getStringArray(R.array.login_list)
        passwordList = resources.getStringArray(R.array.passwords_list)

    }

    fun Btn(view: View) {
        var editLogin = findViewById<EditText>(R.id.edLogin).text.toString()
        var editPassword = findViewById<EditText>(R.id.edPass).text.toString()
        Log.d("enter", "Edit Login = $editLogin, Password = $editPassword")
        if (!editLogin.isEmpty()&&!editPassword.isEmpty()) {
            cheked(editLogin, editPassword)

        } else
            Toast.makeText(this, "By", Toast.LENGTH_SHORT).show()
    }

    fun cheked(userName: String, userPassword: String): String {
        var usernametrue: Boolean = false
        var userIndex: Int = 0
        for (user in loginList) {
            Log.d("loop", "User = $user")
            if (user == userName) {
                Log.d("loop", "UserName = $userName User = $user ")
                userIndex = loginList.indexOf(userName)
                //Log.d("UserIndex", "User Index is $userIndex")
                usernametrue = true
                break
            } else {
                Log.d("loop", "Else UserName = $userName User = $user ")
            }
            Log.d("loop", "UserName equal User stop work")
        }
        if (usernametrue && userPassword == passwordList[userIndex] ) {
            Log.d("UserIndex", "User Index is $userIndex")
            val intent = Intent(this, MindController::class.java)
            intent.putExtra("FirstName", userName)
            startActivity(intent)
        }
        return userName
    }

    fun signUp(view: View){
        /*var createLogin = findViewById<EditText>(R.id.edCreateLogin).text.toString()
        var createPass = findViewById<EditText>(R.id.edCreatePass).text.toString()
        Log.d("Create", "Create new Login $createLogin and Password $createPass")
        if(!createLogin.isEmpty()&&!createPass.isEmpty())
        {
            val newUsers = mutableListOf<Array>(loginList)

        }*/

    }
}
