package morteza.packag.com.kotlinapp6

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sportAdapter = SportAdapter(this@MainActivity)
        gridView.adapter = sportAdapter

    }
}
