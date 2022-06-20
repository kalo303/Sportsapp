package morteza.packag.com.kotlinapp6

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sport_detail.*

class SportDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sport_detail)

        val receivedData = intent.extras

        val sportImage = receivedData.getInt("image")
        val sportDetail = receivedData.getString("detail")

        detailImage.setImageResource(sportImage)
        detailText.text = sportDetail

    }
}
