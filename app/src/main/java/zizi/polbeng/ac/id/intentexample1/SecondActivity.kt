package zizi.polbeng.ac.id.intentexample1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_second2.*
import java.util.logging.Logger

class SecondActivity : AppCompatActivity() {

    val  Log = Logger.getLogger(SecondActivity::class.java.name)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)

        Log.info("onCreate")
        btnExitActivity.setOnLongClickListener(
            finish()
        )
    }

    override fun onStart() {
        super.onStart()
        Log.info("onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.info("onStop")
    }
}
