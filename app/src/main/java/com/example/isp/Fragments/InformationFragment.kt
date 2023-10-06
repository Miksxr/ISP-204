package com.example.isp.Fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.FileProvider
import com.example.isp.R
import com.example.isp.databinding.FragmentHomeworkBinding
import com.example.isp.databinding.FragmentInformationBinding
import com.example.isp.homework
import java.io.File

class InformationFragment : Fragment() {

    private lateinit var binding: FragmentInformationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInformationBinding.inflate(inflater,container,false)

        homework(binding.one, "Учебники и презентации", R.string.Textbooks1, View.GONE,true, View.VISIBLE)
        binding.one.LessonOne.Check.visibility = View.GONE
        binding.one.LessonOne.Task.setOnClickListener {
            openLink("https://drive.google.com/drive/folders/175KW5cFKK8LyAczIl5qprFJ92fZoZOzy?usp=sharing")
        }
        binding.one.LessonTwo.Task.setText(R.string.Textbooks2)
        binding.one.LessonTwo.Task.setOnClickListener {
            openLink("https://drive.google.com/file/d/1yU0LiNhFx23Ndx3AkfproE1S5r8_Dlvm/view?usp=sharing")
        }
        homework(binding.two, "Практики", R.string.Practices, View.GONE,true, View.GONE)
        binding.two.LessonOne.Check.visibility = View.GONE
        binding.two.LessonOne.Task.setText(R.string.Practices)
        binding.two.LessonOne.Task.setOnClickListener {
            openLink("https://drive.google.com/file/d/1AXsCtJI0ZnpnRnhHfKT2ERAYOlXJkwU_/view")
        }
        homework(binding.three, "Инфа", R.string.Info, View.GONE,true, View.VISIBLE)
        binding.three.LessonTwo.Task.setText(R.string.Info2)
        binding.three.LessonTwo.Task.setOnClickListener {
            openLink("https://disk.yandex.ru/i/8pndXaV9sQLVig ")
        }


        return binding.root
    }

    private fun openLink(link: String) {
        val url = link
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}
