package com.example.isp.Fragments

import android.opengl.Visibility
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import com.example.isp.R
import com.example.isp.databinding.FragmentTeachersBinding


class TeachersFragment : Fragment() {

    private lateinit var binding: FragmentTeachersBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTeachersBinding.inflate(inflater,container,false)

        binding.one.Name.setText("Глускер Александр Игоревич (Основы алгоритмизации и программирования)")
        binding.two.Name.setText("Ларионова Елена Анатольевна (Основы проектирования баз данных)")
        binding.three.Name.setText("Кочетков Станислав Сафирович (Системное программирование)")
        binding.four.Name.setText("Плахутина Лариса Александровна (Компьютерные сети, Архитектура аппаратных средств)")
        binding.five.Name.setText("Озеркова Ирина Александровна (Операционные системы и среды)")
        binding.six.Name.setText("Ковалева Елена Вячеславовна (Элементы высшей математики)")
        binding.seven.Name.setText("Козлов Владимир Васильевич (Дискретная математика)")
        binding.eight.Name.setText("Чубарова Екатерина Владимировна (Иностранный язык)")
        binding.nine.Name.setText("Крылов Евгений Николаевич (История)")
        binding.ten.Name.setText("Надаева Нина Владимировна (Физическая культура)")

        binding.five.Mail.visibility = View.VISIBLE
        binding.five.Mail.setText("i.ozerkova@mgutm.ru")
        binding.two.Mail.visibility = View.VISIBLE
        binding.two.Mail.setText("ye.larionova@mgutm.ru")
        binding.four.Mail.visibility = View.VISIBLE
        binding.four.Mail.setText("lllara85@mail.ru")

        binding.one.Photo.setImageResource(R.drawable.glusker)
        binding.two.Photo.setImageResource(R.drawable.larionova)
        binding.three.Photo.setImageResource(R.drawable.no_photo)
        binding.four.Photo.setImageResource(R.drawable.plahutina)
        binding.five.Photo.setImageResource(R.drawable.no_photo)
        binding.six.Photo.setImageResource(R.drawable.kovaleva)
        binding.seven.Photo.setImageResource(R.drawable.kozlov)
        binding.eight.Photo.setImageResource(R.drawable.no_photo)
        binding.nine.Photo.setImageResource(R.drawable.krulov)
        binding.ten.Photo.setImageResource(R.drawable.nadaeva)


        return binding.root
    }

}