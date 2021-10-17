package kr.co.lee.databindingpractice

import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    val name = "Grace"
    val lastName = "Hopper"
    var likes = 0

    fun likeUpdate() {
        likes++
    }
}