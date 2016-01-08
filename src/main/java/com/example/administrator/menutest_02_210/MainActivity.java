package com.example.administrator.menutest_02_210;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import javax.security.auth.Subject;

public class MainActivity extends Activity {
    // 定义字体大小菜单项的标识
    final int FONT_10 = 0x111;
    final int FONT_12 = 0x112;
    final int FONT_14 = 0x113;
    final int FONT_16 = 0x114;
    final int FONT_18 = 0x115;
    // 定义普通菜单项的标识
    final int PLAIN_ITEM = 0x11b;
    // 定义字体颜色菜单项的标识
    final int FONT_RED = 0x116;
    final int FONT_BLUE = 0x117;
    final int FONT_GREEN = 0x118;
    private EditText edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit = (EditText)findViewById(R.id.txt);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        /*getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;*/
        //
        SubMenu fontMenu = menu.addSubMenu("字体大小");
        fontMenu.setIcon(R.drawable.font);
        fontMenu.setHeaderIcon(R.drawable.font);
        fontMenu.setHeaderTitle("选择字体大小");
        fontMenu.add(0, FONT_10, 0, "10号字体");
        fontMenu.add(0, FONT_12, 0, "12号字体");
        fontMenu.add(0, FONT_14, 0, "14号字体");
        fontMenu.add(0, FONT_16, 0, "16号字体");
        fontMenu.add(0,FONT_18,0,"18号字体");
        //向menu中添加“普通菜单项”
        menu.add(0, PLAIN_ITEM, 0, "普通菜单项");
        //
        SubMenu colorMenu = menu.addSubMenu("字体颜色");
        colorMenu.setIcon(R.drawable.color);
        colorMenu.setHeaderIcon(R.drawable.color);
        colorMenu.setHeaderTitle(R.string.font_select_color);
        colorMenu.add(0, FONT_RED, 0, "红色");
        colorMenu.add(0, FONT_GREEN, 0, "绿色");
        colorMenu.add(0,FONT_BLUE,0,"蓝色");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        /*// Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);*/
        switch (item.getItemId()){
            case FONT_10:edit.setTextSize(10*2);break;
            case FONT_12:edit.setTextSize(12*2);break;
            case FONT_14:edit.setTextSize(14*2);break;
            case FONT_16:edit.setTextSize(16*2);break;
            case FONT_18:edit.setTextSize(18*2);break;
            case FONT_RED:edit.setTextColor(Color.RED);break;
            case FONT_GREEN:edit.setTextColor(Color.GREEN);break;
            case FONT_BLUE:edit.setTextColor(Color.BLUE);break;
            case PLAIN_ITEM:
                Toast.makeText(MainActivity.this,"您单击了普通菜单项",Toast.LENGTH_SHORT).show();
                break;

        }
        return true;
    }
}
