package com.airbnb.lottie.issues

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieProperty
import com.airbnb.lottie.issues.databinding.IssueReproActivityBinding
import com.airbnb.lottie.model.KeyPath

class IssueReproActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = IssueReproActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val shirt = KeyPath("Shirt", "Group 5", "Fill 1")
        val leftArm = KeyPath("LeftArmWave", "LeftArm", "Group 6", "Fill 1")
        val rightArm = KeyPath("RightArm", "Group 6", "Fill 1")
        val gradient3 = KeyPath("Shape Layer 1", "Ellipse 1", "Gradient Stroke 1")

        binding.animationView.addValueCallback(leftArm, LottieProperty.COLOR) { 0x55ff5a5f }
        binding.animationView.addValueCallback(leftArm, LottieProperty.OPACITY) { 0 }
        binding.animationView.addValueCallback(shirt, LottieProperty.COLOR) { 0x55ff5a5f }
        binding.animationView.addValueCallback(shirt, LottieProperty.OPACITY) { 70 }
        binding.animationView.addValueCallback(rightArm, LottieProperty.COLOR) { 0x55ff5a5f }
        binding.animationView.addValueCallback(rightArm, LottieProperty.OPACITY) { 100 }

        binding.animationView2.addValueCallback(gradient3, LottieProperty.OPACITY) { 10 }
    }
}
