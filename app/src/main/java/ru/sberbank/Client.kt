package ru.sberbank

import android.app.AlertDialog
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.navigation.NavigationView


class Client : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_client)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        val builder = AlertDialog.Builder(this)
        val fab: FloatingActionButton = findViewById(R.id.fab)
        fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show()
            edit_personal_info(view)
        }
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.client, menu)
        return true
    }



    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_settings -> {
                val intent = Intent(this, Settings::class.java)
                startActivity(intent)
                return true
            }
            R.id.action_history -> {
                val intent = Intent(this, History::class.java)
                startActivity(intent)
                return true
            }
            R.id.action_about -> {
                val intent = Intent(this, About::class.java)
                startActivity(intent)
                return true
            }
            R.id.action_map -> {
                val intent = Intent(this, SetMap::class.java)
                startActivity(intent)
                return true
            }

        }
        return super.onOptionsItemSelected(item)
    }

     override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    fun goto_browser(v: View){
        val url = "https://www.penzainform.ru/news/social/2020/06/05/penzentci_stali_rezhe_pokupat_gribi_u_ulichnih_prodavtcov.html"
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(url)
        startActivity(i)
    }

    fun edit_personal_info(v: View){
        val intent = Intent(this, PersonalInformationEdit::class.java)
        startActivity(intent)
    }

    fun show_punkts(v: View){
        val intent = Intent(this, Punkts::class.java)
        startActivity(intent)
    }

    fun show_details_punkt_from_map(v:View){
        val intent = Intent(this, PunktDetails::class.java)
        startActivity(intent)
    }

    fun show_notify(v:View){
        val builder = AlertDialog.Builder(this@Client)

        // Set the alert dialog title
        builder.setTitle("Поступление наличных")

        // Display a message on alert dialog
        builder.setMessage("По акту закупки №123/1 получен перевод в размере 12000руб. от ООО Прогресс.")

        // Set a positive button and its click listener on alert dialog
        builder.setPositiveButton("Ок"){dialog, which ->
            // Do something when user press the positive button
            Toast.makeText(applicationContext,"Сделка успешно завершена.",Toast.LENGTH_SHORT).show()

//            // Change the app background color
//            activity_client.setBackgroundColor(Color.RED)
        }


        // Display a negative button on alert dialog
        builder.setNegativeButton("Открыть спор"){dialog,which ->
            Toast.makeText(applicationContext,"Вы открываете спор, поскольку пришла некорректная сумма.",Toast.LENGTH_SHORT).show()
        }


        // Display a neutral button on alert dialog
        builder.setNeutralButton("Перейти в СБОЛ"){_,_ ->
            Toast.makeText(applicationContext,"Переход в Сбербанк Онлайн.",Toast.LENGTH_SHORT).show()
        }

        // Finally, make the alert dialog using builder
        val dialog: AlertDialog = builder.create()

        // Display the alert dialog on app interface
        dialog.show()
    }

    fun show_notify_1(v:View){
        val builder = AlertDialog.Builder(this@Client)

        // Set the alert dialog title
        builder.setTitle("На подпись")

        // Display a message on alert dialog
        builder.setMessage("Подписать акт закупки №123/1 на сумму 12000руб. от Длиннофамильного за 1л земляники, 2л черники и 10л брусники")

        // Set a positive button and its click listener on alert dialog
        builder.setPositiveButton("Ок"){dialog, which ->
            // Do something when user press the positive button
            Toast.makeText(applicationContext,"Сделка успешно завершена.",Toast.LENGTH_SHORT).show()

//            // Change the app background color
//            activity_client.setBackgroundColor(Color.RED)
        }


        // Display a negative button on alert dialog
        builder.setNegativeButton("Открыть спор"){dialog,which ->
            Toast.makeText(applicationContext,"Вы открываете спор.",Toast.LENGTH_SHORT).show()
        }


        // Display a neutral button on alert dialog
        builder.setNeutralButton("Перейти в СББОЛ"){_,_ ->
            Toast.makeText(applicationContext,"Переход в Сбербанк Бизнес Онлайн.",Toast.LENGTH_SHORT).show()
        }

        // Finally, make the alert dialog using builder
        val dialog: AlertDialog = builder.create()

        // Display the alert dialog on app interface
        dialog.show()
    }

}