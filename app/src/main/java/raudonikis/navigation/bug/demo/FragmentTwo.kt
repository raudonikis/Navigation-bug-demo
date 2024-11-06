package raudonikis.navigation.bug.demo

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FragmentTwo : Fragment(R.layout.layout_fragment_two) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.fragmentTwoButton).setOnClickListener {
//            findNavController().navigateUp()
            // Same issue with popBackStack
            findNavController().popBackStack()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(javaClass.name, "onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onDestroy() {
        Log.d(javaClass.name, "onDestroy")
        super.onDestroy()
    }

    override fun onDestroyView() {
        Log.d(javaClass.name, "onDestroyView")
        super.onDestroyView()
    }
}