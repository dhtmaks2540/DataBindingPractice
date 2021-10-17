package kr.co.lee.databindingpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import kr.co.lee.databindingpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var dataBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ViewModel 클래스 생성
        // 아래와 같은 코드로 생성해야 ViewModel의 생명주기를 시스템이 관리한다
        val viewModel = ViewModelProvider(this)[MainViewModel::class.java]
    }
}