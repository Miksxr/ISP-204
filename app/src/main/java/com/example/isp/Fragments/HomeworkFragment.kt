package com.example.isp.Fragments

import android.graphics.Color
import android.graphics.Paint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.example.isp.R
import com.example.isp.databinding.FragmentHomeworkBinding
import com.example.isp.databinding.FragmentTeachersBinding
import com.example.isp.databinding.HomeworkBinding
import com.example.isp.homework


class HomeworkFragment : Fragment() {

    private lateinit var binding: FragmentHomeworkBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeworkBinding.inflate(inflater,container,false)

        homework(binding.one, "Основы алгоритмизации и программирования", R.string.oneTask,View.VISIBLE,false, View.GONE)
        homework(binding.two, "Основы проектирования баз данных", R.string.twoTask,View.VISIBLE,false, View.GONE)
        homework(binding.three,"Системное программирование", R.string.threeTask,View.VISIBLE,false, View.GONE)
        homework(binding.four, "Компьютерные сети", R.string.fourTask,View.VISIBLE,false, View.GONE)
        homework(binding.five, "Архитектура аппаратных средств", R.string.fiveTask,View.VISIBLE,false, View.GONE)
        homework(binding.six, "Операционные системы", R.string.sixTask,View.VISIBLE,false, View.GONE)
        homework(binding.seven, "Элементы высшей математики", R.string.sevenTask,View.VISIBLE,false, View.GONE)
        homework(binding.eight, "Дискретная математика", R.string.eightTask,View.VISIBLE,false, View.GONE)
        homework(binding.nine, "Иностранный язык", R.string.nineTask,View.VISIBLE,false, View.GONE)
        homework(binding.ten, "История", R.string.tenTask,View.VISIBLE,false, View.GONE)
        homework(binding.eleven, "Физическая культура", R.string.elevenTask,View.VISIBLE,false, View.GONE)

        return binding.root
    }


}