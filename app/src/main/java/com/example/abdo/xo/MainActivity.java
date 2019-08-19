package com.example.abdo.xo;

import android.opengl.Visibility;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableRow;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String player="X";
    String Game_State="game_start";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );


        final Button a =findViewById( R.id.a11 );
        final Button b =findViewById( R.id.a12 );
        final Button c =findViewById( R.id.a13 );

        final Button d =findViewById( R.id.b21 );
        final Button e =findViewById( R.id.b22 );
        final Button f =findViewById( R.id.b23 );

        final Button g =findViewById( R.id.c31 );
        final Button h =findViewById( R.id.c32 );
        final Button i =findViewById( R.id.c33 );

        final Button reset=findViewById( R.id.reset );

        a.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a.setEnabled( false );
                if(player=="X"){
                    a.setText( "X" );
                    player="O";
                }else{
                    a.setText( "O" );
                    player="X";
                }



                if(a.getText().toString()=="X"&&b.getText().toString()=="X"&&c.getText().toString()=="X"||
                        d.getText().toString()=="X"&&e.getText().toString()=="X"&&f.getText().toString()=="X"||
                        g.getText().toString()=="X"&&h.getText().toString()=="X"&&i.getText().toString()=="X"){
                    Game_State="X is Winner";
                }else if(a.getText().toString()=="O"&&b.getText().toString()=="O"&&c.getText().toString()=="O"||
                        d.getText().toString()=="O"&&e.getText().toString()=="O"&&f.getText().toString()=="O"||
                        g.getText().toString()=="O"&&h.getText().toString()=="O"&&i.getText().toString()=="O"){
                    Game_State="O is Winner";
                }

                //conditions of columns...
                else if(a.getText().toString()=="O"&&d.getText().toString()=="O"&&g.getText().toString()=="O"||
                        b.getText().toString()=="O"&&e.getText().toString()=="O"&&h.getText().toString()=="O"||
                        c.getText().toString()=="O"&&f.getText().toString()=="O"&&i.getText().toString()=="O"){
                    Game_State="O is Winner";
                }
                else if(a.getText().toString()=="X"&&d.getText().toString()=="X"&&g.getText().toString()=="X"||
                        b.getText().toString()=="X"&&e.getText().toString()=="X"&&h.getText().toString()=="X"||
                        c.getText().toString()=="X"&&f.getText().toString()=="X"&&i.getText().toString()=="X"){
                    Game_State="X is Winner";
                }

                //conditions of diagonal...
                else if(a.getText().toString()=="X"&&e.getText().toString()=="X"&&i.getText().toString()=="X"||
                        c.getText().toString()=="X"&&e.getText().toString()=="X"&&g.getText().toString()=="X"){
                    Game_State="X is Winner";
                }
                else if(a.getText().toString()=="O"&&e.getText().toString()=="O"&&i.getText().toString()=="O"||
                        c.getText().toString()=="O"&&e.getText().toString()=="O"&&g.getText().toString()=="O"){
                    Game_State="O is Winner";
                }
                //condition of Draw...
                else if(Game_State!="game_start"&&a.getText().toString()!=""&&
                        b.getText().toString()!=""&&
                        c.getText().toString()!=""&&
                        d.getText().toString()!=""&&
                        e.getText().toString()!=""&&
                        f.getText().toString()!=""&&
                        g.getText().toString()!=""&&
                        h.getText().toString()!=""&&
                        i.getText().toString()!=""){
                    Game_State="Draw for X and O";
                }

                
                if(Game_State!="game_start"){
                    Toast.makeText( MainActivity.this,Game_State,Toast.LENGTH_LONG ).show();
                    a.setEnabled( false );
                    b.setEnabled( false );
                    c.setEnabled( false );
                    d.setEnabled( false );
                    e.setEnabled( false );
                    f.setEnabled( false );
                    g.setEnabled( false );
                    h.setEnabled( false );
                    i.setEnabled( false );
                }
                
            }
        } );



        b.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b.setEnabled( false );
                if(player=="X"){
                    b.setText( "X" );
                    player="O";
                }
                else{
                    b.setText( "O" );
                    player="X";
                }
                //conditions of rows...
                if(a.getText().toString()=="X"&&b.getText().toString()=="X"&&c.getText().toString()=="X"||
                        d.getText().toString()=="X"&&e.getText().toString()=="X"&&f.getText().toString()=="X"||
                        g.getText().toString()=="X"&&h.getText().toString()=="X"&&i.getText().toString()=="X"){
                    Game_State="X is Winner";
                }else if(a.getText().toString()=="O"&&b.getText().toString()=="O"&&c.getText().toString()=="O"||
                        d.getText().toString()=="O"&&e.getText().toString()=="O"&&f.getText().toString()=="O"||
                        g.getText().toString()=="O"&&h.getText().toString()=="O"&&i.getText().toString()=="O"){
                    Game_State="O is Winner";
                }

                //conditions of columns...
                else if(a.getText().toString()=="O"&&d.getText().toString()=="O"&&g.getText().toString()=="O"||
                        b.getText().toString()=="O"&&e.getText().toString()=="O"&&h.getText().toString()=="O"||
                        c.getText().toString()=="O"&&f.getText().toString()=="O"&&i.getText().toString()=="O"){
                    Game_State="O is Winner";
                }
                else if(a.getText().toString()=="X"&&d.getText().toString()=="X"&&g.getText().toString()=="X"||
                        b.getText().toString()=="X"&&e.getText().toString()=="X"&&h.getText().toString()=="X"||
                        c.getText().toString()=="X"&&f.getText().toString()=="X"&&i.getText().toString()=="X"){
                    Game_State="X is Winner";
                }

                //conditions of diagonal...
                else if(a.getText().toString()=="X"&&e.getText().toString()=="X"&&i.getText().toString()=="X"||
                        c.getText().toString()=="X"&&e.getText().toString()=="X"&&g.getText().toString()=="X"){
                    Game_State="X is Winner";
                }
                else if(a.getText().toString()=="O"&&e.getText().toString()=="O"&&i.getText().toString()=="O"||
                        c.getText().toString()=="O"&&e.getText().toString()=="O"&&g.getText().toString()=="O"){
                    Game_State="O is Winner";
                }
                //condition of Draw...
                else if(Game_State!="game_start"&&a.getText().toString()!=""&&
                        b.getText().toString()!=""&&
                        c.getText().toString()!=""&&
                        d.getText().toString()!=""&&
                        e.getText().toString()!=""&&
                        f.getText().toString()!=""&&
                        g.getText().toString()!=""&&
                        h.getText().toString()!=""&&
                        i.getText().toString()!=""){
                    Game_State="Draw for X and O";
                }
                if(Game_State!="game_start"){
                    Toast.makeText( MainActivity.this,Game_State,Toast.LENGTH_LONG ).show();
                    a.setEnabled( false );
                    b.setEnabled( false );
                    c.setEnabled( false );
                    d.setEnabled( false );
                    e.setEnabled( false );
                    f.setEnabled( false );
                    g.setEnabled( false );
                    h.setEnabled( false );
                    i.setEnabled( false );
                }
            }
        } );



        c.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.setEnabled( false );
                if(player=="X"){
                    c.setText( "X" );
                    player="O";
                }
                else{
                    c.setText( "O" );
                    player="X";
                }
                //conditions of rows...
        if(a.getText().toString()=="X"&&b.getText().toString()=="X"&&c.getText().toString()=="X"||
                d.getText().toString()=="X"&&e.getText().toString()=="X"&&f.getText().toString()=="X"||
                g.getText().toString()=="X"&&h.getText().toString()=="X"&&i.getText().toString()=="X"){
            Game_State="X is Winner";
        }else if(a.getText().toString()=="O"&&b.getText().toString()=="O"&&c.getText().toString()=="O"||
                d.getText().toString()=="O"&&e.getText().toString()=="O"&&f.getText().toString()=="O"||
                g.getText().toString()=="O"&&h.getText().toString()=="O"&&i.getText().toString()=="O"){
            Game_State="O is Winner";
        }

        //conditions of columns...
        else if(a.getText().toString()=="O"&&d.getText().toString()=="O"&&g.getText().toString()=="O"||
                b.getText().toString()=="O"&&e.getText().toString()=="O"&&h.getText().toString()=="O"||
                c.getText().toString()=="O"&&f.getText().toString()=="O"&&i.getText().toString()=="O"){
            Game_State="O is Winner";
        }
        else if(a.getText().toString()=="X"&&d.getText().toString()=="X"&&g.getText().toString()=="X"||
                b.getText().toString()=="X"&&e.getText().toString()=="X"&&h.getText().toString()=="X"||
                c.getText().toString()=="X"&&f.getText().toString()=="X"&&i.getText().toString()=="X"){
            Game_State="X is Winner";
        }

        //conditions of diagonal...
        else if(a.getText().toString()=="X"&&e.getText().toString()=="X"&&i.getText().toString()=="X"||
                c.getText().toString()=="X"&&e.getText().toString()=="X"&&g.getText().toString()=="X"){
            Game_State="X is Winner";
        }
        else if(a.getText().toString()=="O"&&e.getText().toString()=="O"&&i.getText().toString()=="O"||
                c.getText().toString()=="O"&&e.getText().toString()=="O"&&g.getText().toString()=="O"){
            Game_State="O is Winner";
        }
        //condition of Draw...
        else if(Game_State!="game_start"&&a.getText().toString()!=""&&
                b.getText().toString()!=""&&
                c.getText().toString()!=""&&
                d.getText().toString()!=""&&
                e.getText().toString()!=""&&
                f.getText().toString()!=""&&
                g.getText().toString()!=""&&
                h.getText().toString()!=""&&
                i.getText().toString()!=""){
            Game_State="Draw for X and O";
        }
                if(Game_State!="game_start"){
                    Toast.makeText( MainActivity.this,Game_State,Toast.LENGTH_LONG ).show();
                    a.setEnabled( false );
                    b.setEnabled( false );
                    c.setEnabled( false );
                    d.setEnabled( false );
                    e.setEnabled( false );
                    f.setEnabled( false );
                    g.setEnabled( false );
                    h.setEnabled( false );
                    i.setEnabled( false );
                }
            }
        } );



        d.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d.setEnabled( false );
                if(player=="X"){
                    d.setText( "X" );
                    player="O";
                }
                else{
                    d.setText( "O" );
                    player="X";
                }
                //conditions of rows...
        if(a.getText().toString()=="X"&&b.getText().toString()=="X"&&c.getText().toString()=="X"||
                d.getText().toString()=="X"&&e.getText().toString()=="X"&&f.getText().toString()=="X"||
                g.getText().toString()=="X"&&h.getText().toString()=="X"&&i.getText().toString()=="X"){
            Game_State="X is Winner";
        }else if(a.getText().toString()=="O"&&b.getText().toString()=="O"&&c.getText().toString()=="O"||
                d.getText().toString()=="O"&&e.getText().toString()=="O"&&f.getText().toString()=="O"||
                g.getText().toString()=="O"&&h.getText().toString()=="O"&&i.getText().toString()=="O"){
            Game_State="O is Winner";
        }

        //conditions of columns...
        else if(a.getText().toString()=="O"&&d.getText().toString()=="O"&&g.getText().toString()=="O"||
                b.getText().toString()=="O"&&e.getText().toString()=="O"&&h.getText().toString()=="O"||
                c.getText().toString()=="O"&&f.getText().toString()=="O"&&i.getText().toString()=="O"){
            Game_State="O is Winner";
        }
        else if(a.getText().toString()=="X"&&d.getText().toString()=="X"&&g.getText().toString()=="X"||
                b.getText().toString()=="X"&&e.getText().toString()=="X"&&h.getText().toString()=="X"||
                c.getText().toString()=="X"&&f.getText().toString()=="X"&&i.getText().toString()=="X"){
            Game_State="X is Winner";
        }

        //conditions of diagonal...
        else if(a.getText().toString()=="X"&&e.getText().toString()=="X"&&i.getText().toString()=="X"||
                c.getText().toString()=="X"&&e.getText().toString()=="X"&&g.getText().toString()=="X"){
            Game_State="X is Winner";
        }
        else if(a.getText().toString()=="O"&&e.getText().toString()=="O"&&i.getText().toString()=="O"||
                c.getText().toString()=="O"&&e.getText().toString()=="O"&&g.getText().toString()=="O"){
            Game_State="O is Winner";
        }
        //condition of Draw...
        else if(Game_State!="game_start"&&a.getText().toString()!=""&&
                b.getText().toString()!=""&&
                c.getText().toString()!=""&&
                d.getText().toString()!=""&&
                e.getText().toString()!=""&&
                f.getText().toString()!=""&&
                g.getText().toString()!=""&&
                h.getText().toString()!=""&&
                i.getText().toString()!=""){
            Game_State="Draw for X and O";
        }
                if(Game_State!="game_start"){
                    Toast.makeText( MainActivity.this,Game_State,Toast.LENGTH_LONG ).show();
                    a.setEnabled( false );
                    b.setEnabled( false );
                    c.setEnabled( false );
                    d.setEnabled( false );
                    e.setEnabled( false );
                    f.setEnabled( false );
                    g.setEnabled( false );
                    h.setEnabled( false );
                    i.setEnabled( false );
                }
            }
        } );



        e.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e.setEnabled( false );
                if(player=="X"){
                    e.setText( "X" );
                    player="O";
                }
                else{
                    e.setText( "O" );
                    player="X";
                }
                //conditions of rows...
        if(a.getText().toString()=="X"&&b.getText().toString()=="X"&&c.getText().toString()=="X"||
                d.getText().toString()=="X"&&e.getText().toString()=="X"&&f.getText().toString()=="X"||
                g.getText().toString()=="X"&&h.getText().toString()=="X"&&i.getText().toString()=="X"){
            Game_State="X is Winner";
        }else if(a.getText().toString()=="O"&&b.getText().toString()=="O"&&c.getText().toString()=="O"||
                d.getText().toString()=="O"&&e.getText().toString()=="O"&&f.getText().toString()=="O"||
                g.getText().toString()=="O"&&h.getText().toString()=="O"&&i.getText().toString()=="O"){
            Game_State="O is Winner";
        }

        //conditions of columns...
        else if(a.getText().toString()=="O"&&d.getText().toString()=="O"&&g.getText().toString()=="O"||
                b.getText().toString()=="O"&&e.getText().toString()=="O"&&h.getText().toString()=="O"||
                c.getText().toString()=="O"&&f.getText().toString()=="O"&&i.getText().toString()=="O"){
            Game_State="O is Winner";
        }
        else if(a.getText().toString()=="X"&&d.getText().toString()=="X"&&g.getText().toString()=="X"||
                b.getText().toString()=="X"&&e.getText().toString()=="X"&&h.getText().toString()=="X"||
                c.getText().toString()=="X"&&f.getText().toString()=="X"&&i.getText().toString()=="X"){
            Game_State="X is Winner";
        }

        //conditions of diagonal...
        else if(a.getText().toString()=="X"&&e.getText().toString()=="X"&&i.getText().toString()=="X"||
                c.getText().toString()=="X"&&e.getText().toString()=="X"&&g.getText().toString()=="X"){
            Game_State="X is Winner";
        }
        else if(a.getText().toString()=="O"&&e.getText().toString()=="O"&&i.getText().toString()=="O"||
                c.getText().toString()=="O"&&e.getText().toString()=="O"&&g.getText().toString()=="O"){
            Game_State="O is Winner";
        }
        //condition of Draw...
        else if(Game_State!="game_start"&&a.getText().toString()!=""&&
                b.getText().toString()!=""&&
                c.getText().toString()!=""&&
                d.getText().toString()!=""&&
                e.getText().toString()!=""&&
                f.getText().toString()!=""&&
                g.getText().toString()!=""&&
                h.getText().toString()!=""&&
                i.getText().toString()!=""){
            Game_State="Draw for X and O";
        }
                if(Game_State!="game_start"){
                    Toast.makeText( MainActivity.this,Game_State,Toast.LENGTH_LONG ).show();
                    a.setEnabled( false );
                    b.setEnabled( false );
                    c.setEnabled( false );
                    d.setEnabled( false );
                    e.setEnabled( false );
                    f.setEnabled( false );
                    g.setEnabled( false );
                    h.setEnabled( false );
                    i.setEnabled( false );
                }
            }
        } );



        f.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f.setEnabled( false );
                if(player=="X"){
                    f.setText( "X" );
                    player="O";
                }
                else{
                    f.setText( "O" );
                    player="X";
                }
                //conditions of rows...
        if(a.getText().toString()=="X"&&b.getText().toString()=="X"&&c.getText().toString()=="X"||
                d.getText().toString()=="X"&&e.getText().toString()=="X"&&f.getText().toString()=="X"||
                g.getText().toString()=="X"&&h.getText().toString()=="X"&&i.getText().toString()=="X"){
            Game_State="X is Winner";
        }else if(a.getText().toString()=="O"&&b.getText().toString()=="O"&&c.getText().toString()=="O"||
                d.getText().toString()=="O"&&e.getText().toString()=="O"&&f.getText().toString()=="O"||
                g.getText().toString()=="O"&&h.getText().toString()=="O"&&i.getText().toString()=="O"){
            Game_State="O is Winner";
        }

        //conditions of columns...
        else if(a.getText().toString()=="O"&&d.getText().toString()=="O"&&g.getText().toString()=="O"||
                b.getText().toString()=="O"&&e.getText().toString()=="O"&&h.getText().toString()=="O"||
                c.getText().toString()=="O"&&f.getText().toString()=="O"&&i.getText().toString()=="O"){
            Game_State="O is Winner";
        }
        else if(a.getText().toString()=="X"&&d.getText().toString()=="X"&&g.getText().toString()=="X"||
                b.getText().toString()=="X"&&e.getText().toString()=="X"&&h.getText().toString()=="X"||
                c.getText().toString()=="X"&&f.getText().toString()=="X"&&i.getText().toString()=="X"){
            Game_State="X is Winner";
        }

        //conditions of diagonal...
        else if(a.getText().toString()=="X"&&e.getText().toString()=="X"&&i.getText().toString()=="X"||
                c.getText().toString()=="X"&&e.getText().toString()=="X"&&g.getText().toString()=="X"){
            Game_State="X is Winner";
        }
        else if(a.getText().toString()=="O"&&e.getText().toString()=="O"&&i.getText().toString()=="O"||
                c.getText().toString()=="O"&&e.getText().toString()=="O"&&g.getText().toString()=="O"){
            Game_State="O is Winner";
        }
        //condition of Draw...
        else if(Game_State!="game_start"&&a.getText().toString()!=""&&
                b.getText().toString()!=""&&
                c.getText().toString()!=""&&
                d.getText().toString()!=""&&
                e.getText().toString()!=""&&
                f.getText().toString()!=""&&
                g.getText().toString()!=""&&
                h.getText().toString()!=""&&
                i.getText().toString()!=""){
            Game_State="Draw for X and O";
        }
                if(Game_State!="game_start"){
                    Toast.makeText( MainActivity.this,Game_State,Toast.LENGTH_LONG ).show();
                    a.setEnabled( false );
                    b.setEnabled( false );
                    c.setEnabled( false );
                    d.setEnabled( false );
                    e.setEnabled( false );
                    f.setEnabled( false );
                    g.setEnabled( false );
                    h.setEnabled( false );
                    i.setEnabled( false );
                }
            }
        } );



        g.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                g.setEnabled( false );
                if(player=="X"){
                    g.setText( "X" );
                    player="O";
                }
                else{
                    g.setText( "O" );
                    player="X";
                }
                //conditions of rows...
        if(a.getText().toString()=="X"&&b.getText().toString()=="X"&&c.getText().toString()=="X"||
                d.getText().toString()=="X"&&e.getText().toString()=="X"&&f.getText().toString()=="X"||
                g.getText().toString()=="X"&&h.getText().toString()=="X"&&i.getText().toString()=="X"){
            Game_State="X is Winner";
        }else if(a.getText().toString()=="O"&&b.getText().toString()=="O"&&c.getText().toString()=="O"||
                d.getText().toString()=="O"&&e.getText().toString()=="O"&&f.getText().toString()=="O"||
                g.getText().toString()=="O"&&h.getText().toString()=="O"&&i.getText().toString()=="O"){
            Game_State="O is Winner";
        }

        //conditions of columns...
        else if(a.getText().toString()=="O"&&d.getText().toString()=="O"&&g.getText().toString()=="O"||
                b.getText().toString()=="O"&&e.getText().toString()=="O"&&h.getText().toString()=="O"||
                c.getText().toString()=="O"&&f.getText().toString()=="O"&&i.getText().toString()=="O"){
            Game_State="O is Winner";
        }
        else if(a.getText().toString()=="X"&&d.getText().toString()=="X"&&g.getText().toString()=="X"||
                b.getText().toString()=="X"&&e.getText().toString()=="X"&&h.getText().toString()=="X"||
                c.getText().toString()=="X"&&f.getText().toString()=="X"&&i.getText().toString()=="X"){
            Game_State="X is Winner";
        }

        //conditions of diagonal...
        else if(a.getText().toString()=="X"&&e.getText().toString()=="X"&&i.getText().toString()=="X"||
                c.getText().toString()=="X"&&e.getText().toString()=="X"&&g.getText().toString()=="X"){
            Game_State="X is Winner";
        }
        else if(a.getText().toString()=="O"&&e.getText().toString()=="O"&&i.getText().toString()=="O"||
                c.getText().toString()=="O"&&e.getText().toString()=="O"&&g.getText().toString()=="O"){
            Game_State="O is Winner";
        }
        //condition of Draw...
        else if(Game_State!="game_start"&&a.getText().toString()!=""&&
                b.getText().toString()!=""&&
                c.getText().toString()!=""&&
                d.getText().toString()!=""&&
                e.getText().toString()!=""&&
                f.getText().toString()!=""&&
                g.getText().toString()!=""&&
                h.getText().toString()!=""&&
                i.getText().toString()!=""){
            Game_State="Draw for X and O";
        }
                if(Game_State!="game_start"){
                    Toast.makeText( MainActivity.this,Game_State,Toast.LENGTH_LONG ).show();
                    a.setEnabled( false );
                    b.setEnabled( false );
                    c.setEnabled( false );
                    d.setEnabled( false );
                    e.setEnabled( false );
                    f.setEnabled( false );
                    g.setEnabled( false );
                    h.setEnabled( false );
                    i.setEnabled( false );
                }
            }
        } );



        h.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                h.setEnabled( false );
                if(player=="X"){
                    h.setText( "X" );
                    player="O";
                }
                else{
                    h.setText( "O" );
                    player="X";
                }
                //conditions of rows...
        if(a.getText().toString()=="X"&&b.getText().toString()=="X"&&c.getText().toString()=="X"||
                d.getText().toString()=="X"&&e.getText().toString()=="X"&&f.getText().toString()=="X"||
                g.getText().toString()=="X"&&h.getText().toString()=="X"&&i.getText().toString()=="X"){
            Game_State="X is Winner";
        }else if(a.getText().toString()=="O"&&b.getText().toString()=="O"&&c.getText().toString()=="O"||
                d.getText().toString()=="O"&&e.getText().toString()=="O"&&f.getText().toString()=="O"||
                g.getText().toString()=="O"&&h.getText().toString()=="O"&&i.getText().toString()=="O"){
            Game_State="O is Winner";
        }

        //conditions of columns...
        else if(a.getText().toString()=="O"&&d.getText().toString()=="O"&&g.getText().toString()=="O"||
                b.getText().toString()=="O"&&e.getText().toString()=="O"&&h.getText().toString()=="O"||
                c.getText().toString()=="O"&&f.getText().toString()=="O"&&i.getText().toString()=="O"){
            Game_State="O is Winner";
        }
        else if(a.getText().toString()=="X"&&d.getText().toString()=="X"&&g.getText().toString()=="X"||
                b.getText().toString()=="X"&&e.getText().toString()=="X"&&h.getText().toString()=="X"||
                c.getText().toString()=="X"&&f.getText().toString()=="X"&&i.getText().toString()=="X"){
            Game_State="X is Winner";
        }

        //conditions of diagonal...
        else if(a.getText().toString()=="X"&&e.getText().toString()=="X"&&i.getText().toString()=="X"||
                c.getText().toString()=="X"&&e.getText().toString()=="X"&&g.getText().toString()=="X"){
            Game_State="X is Winner";
        }
        else if(a.getText().toString()=="O"&&e.getText().toString()=="O"&&i.getText().toString()=="O"||
                c.getText().toString()=="O"&&e.getText().toString()=="O"&&g.getText().toString()=="O"){
            Game_State="O is Winner";
        }
        //condition of Draw...
        else if(Game_State!="game_start"&&a.getText().toString()!=""&&
                b.getText().toString()!=""&&
                c.getText().toString()!=""&&
                d.getText().toString()!=""&&
                e.getText().toString()!=""&&
                f.getText().toString()!=""&&
                g.getText().toString()!=""&&
                h.getText().toString()!=""&&
                i.getText().toString()!=""){
            Game_State="Draw for X and O";
        }
                if(Game_State!="game_start"){
                    Toast.makeText( MainActivity.this,Game_State,Toast.LENGTH_LONG ).show();
                    a.setEnabled( false );
                    b.setEnabled( false );
                    c.setEnabled( false );
                    d.setEnabled( false );
                    e.setEnabled( false );
                    f.setEnabled( false );
                    g.setEnabled( false );
                    h.setEnabled( false );
                    i.setEnabled( false );
                }
            }
        } );



        i.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i.setEnabled( false );
                if(player=="X"){
                    i.setText( "X" );
                    player="O";
                }
                else{
                    i.setText( "O" );
                    player="X";
                }
                //conditions of rows...
        if(a.getText().toString()=="X"&&b.getText().toString()=="X"&&c.getText().toString()=="X"||
                d.getText().toString()=="X"&&e.getText().toString()=="X"&&f.getText().toString()=="X"||
                g.getText().toString()=="X"&&h.getText().toString()=="X"&&i.getText().toString()=="X"){
            Game_State="X is Winner";
        }else if(a.getText().toString()=="O"&&b.getText().toString()=="O"&&c.getText().toString()=="O"||
                d.getText().toString()=="O"&&e.getText().toString()=="O"&&f.getText().toString()=="O"||
                g.getText().toString()=="O"&&h.getText().toString()=="O"&&i.getText().toString()=="O"){
            Game_State="O is Winner";
        }

        //conditions of columns...
        else if(a.getText().toString()=="O"&&d.getText().toString()=="O"&&g.getText().toString()=="O"||
                b.getText().toString()=="O"&&e.getText().toString()=="O"&&h.getText().toString()=="O"||
                c.getText().toString()=="O"&&f.getText().toString()=="O"&&i.getText().toString()=="O"){
            Game_State="O is Winner";
        }
        else if(a.getText().toString()=="X"&&d.getText().toString()=="X"&&g.getText().toString()=="X"||
                b.getText().toString()=="X"&&e.getText().toString()=="X"&&h.getText().toString()=="X"||
                c.getText().toString()=="X"&&f.getText().toString()=="X"&&i.getText().toString()=="X"){
            Game_State="X is Winner";
        }

        //conditions of diagonal...
        else if(a.getText().toString()=="X"&&e.getText().toString()=="X"&&i.getText().toString()=="X"||
                c.getText().toString()=="X"&&e.getText().toString()=="X"&&g.getText().toString()=="X"){
            Game_State="X is Winner";
        }
        else if(a.getText().toString()=="O"&&e.getText().toString()=="O"&&i.getText().toString()=="O"||
                c.getText().toString()=="O"&&e.getText().toString()=="O"&&g.getText().toString()=="O"){
            Game_State="O is Winner";
        }
        //condition of Draw...
        else if(Game_State!="game_start"&&a.getText().toString()!=""&&
                b.getText().toString()!=""&&
                c.getText().toString()!=""&&
                d.getText().toString()!=""&&
                e.getText().toString()!=""&&
                f.getText().toString()!=""&&
                g.getText().toString()!=""&&
                h.getText().toString()!=""&&
                i.getText().toString()!=""){
            Game_State="Draw for X and O";
        }
                if(Game_State!="game_start"){
                    Toast.makeText( MainActivity.this,Game_State,Toast.LENGTH_LONG ).show();
                    a.setEnabled( false );
                    b.setEnabled( false );
                    c.setEnabled( false );
                    d.setEnabled( false );
                    e.setEnabled( false );
                    f.setEnabled( false );
                    g.setEnabled( false );
                    h.setEnabled( false );
                    i.setEnabled( false );
                }
            }
        } );



        reset.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a.setEnabled( true );
                b.setEnabled( true );
                c.setEnabled( true );
                d.setEnabled( true );
                e.setEnabled( true );
                f.setEnabled( true );
                g.setEnabled( true );
                h.setEnabled( true );
                i.setEnabled( true );

                a.setText("");
                b.setText("");
                c.setText("");
                d.setText("");
                e.setText("");
                f.setText("");
                g.setText("");
                h.setText("");
                i.setText("");
                Game_State="game_start";
                }
        } );


        
    }
}
