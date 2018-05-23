package com.example.ceisutb14.apptercerparcial

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader


class MainActivity : Activity() {

    private  lateinit var  btn0 : Button // variable de almacenamiento del boton 0
    private  lateinit var  btn1 : Button // variable de almacenamiento del boton 1
    private  lateinit var  btn2 : Button // variable de almacenamiento del boton 2
    private  lateinit var  btn3 : Button // variable de almacenamiento del boton 3
    private  lateinit var  btn4 : Button // variable de almacenamiento del boton 4
    private  lateinit var  btn5 : Button // variable de almacenamiento del boton 5
    private  lateinit var  btn6 : Button // variable de almacenamiento del boton 6
    private  lateinit var  btn7 : Button // variable de almacenamiento del boton 7
    private  lateinit var  btn8 : Button // variable de almacenamiento del boton 8
    private  lateinit var  btn9 : Button // variable de almacenamiento del boton 9

    // variables de alamcenamiento de los botones operadores //

    private  lateinit var  btnSuma : Button
    private  lateinit var  btnResta : Button
    private  lateinit var  btnMulti : Button
    private  lateinit var  btnDivi : Button
    private  lateinit var  btnMod : Button
    private  lateinit var  btnIgual : Button

    // variable de alamcenamiento del TextView //
    private lateinit var textRespuesta: TextView
    private lateinit var textDepured: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //enlazamos los recursos de la interfaz de usuario de la aplicación, con las variables en el código //
        btn0 = findViewById(R.id.btn0)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        btn6 = findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7)
        btn8 = findViewById(R.id.btn8)
        btn9 = findViewById(R.id.btn9)

        btnSuma = findViewById(R.id.btnSum)
        btnResta = findViewById(R.id.btnRes)
        btnMulti = findViewById(R.id.btnMul)
        btnDivi = findViewById(R.id.btnDiv)
        btnMod = findViewById(R.id.btnMod)
        btnIgual = findViewById(R.id.btnIgual)

        textRespuesta = findViewById(R.id.textResp)
        textDepured = findViewById(R.id.textDepure)


        // Realiza  el bloque que contiene //
        btn1.setOnClickListener{

            textRespuesta.text = btn1.text

        }
        btn2.setOnClickListener{

            textRespuesta.text = btn2.text

        }
        btn3.setOnClickListener{

            textRespuesta.text = btn3.text

        }
        btn4.setOnClickListener{

            textRespuesta.text = btn4.text

        }
        btn5.setOnClickListener{

            textRespuesta.text = btn5.text

        }
        btn6.setOnClickListener{

            textRespuesta.text = btn6.text

        }
        btn7.setOnClickListener{

            textRespuesta.text = btn7.text

        }
        btn8.setOnClickListener{

            textRespuesta.text = btn8.text

        }
        btn9.setOnClickListener{

            textRespuesta.text = btn9.text

        }




        /*
        try {
            val process = Runtime.getRuntime().exec("logcat -d")
            val bufferedReader = BufferedReader(
                    InputStreamReader(process.inputStream))

            val log = StringBuilder()
            var line: String = bufferedReader.readLine()
            while (line != null) {
                log.append(line)
            }
            textDepured = findViewById(R.id.textDepure)
            textDepured.text = log.toString()
        } catch (e: IOException) {
            // Handle Exception
        }
*/

    }
}
