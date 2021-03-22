package com.example.thanhtai.myapplication;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.PaintDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Stack;

import org.w3c.dom.Text;

import java.util.Stack;


public class MainActivity extends Activity {

    enum State{
        init,
        nhapDau,
        nhapSo,
        nhapTt,
        error,
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button    button1         =   findViewById(R.id.button1);
        final Button    button2         =   findViewById(R.id.button2);
        final Button    button3         =   findViewById(R.id.button3);
        final Button    button4         =   findViewById(R.id.button4);
        final Button    button5         =   findViewById(R.id.button5);
        final Button    button6         =   findViewById(R.id.button6);
        final Button    button7         =   findViewById(R.id.button7);
        final Button    button8         =   findViewById(R.id.button8);
        final Button    button9         =   findViewById(R.id.button9);
        final Button    button0         =   findViewById(R.id.button0);
        final Button    buttonPoint     =   findViewById(R.id.buttonPoint);
        final Button    buttonEqu       =   findViewById(R.id.buttonEqu);
        final Button    buttonAdd       =   findViewById(R.id.buttonAdd);
        final Button    buttonSub       =   findViewById(R.id.buttonSub);
        final Button    buttonMul       =   findViewById(R.id.buttonMul);
        final Button    buttonDiv       =   findViewById(R.id.buttonDiv);
        final Button    buttonRight     =   findViewById(R.id.buttonRight);
        final Button    buttonLeft      =   findViewById(R.id.buttonLeft);
        final Button    buttonBb        =   findViewById(R.id.buttonBp);
        final Button    buttonAC        =   findViewById(R.id.buttonAC);
        final TextView  text1           =   findViewById(R.id.text1);
        //final MainActivity mm = new MainActivity();
        //mm.result=0;
        //mm.tf=1;
        //mm.isFist=1;
        text1.setText("0");

        //button 0
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strA=text1.getText().toString();
                if(strA=="0"){
                    text1.setText("0");
                }
                else {
                    text1.setText(strA+"0");
                }
            }
        });
        //button 1
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strA=text1.getText().toString();
                if(strA=="0"){
                    text1.setText("1");
                }
                else {
                    text1.setText(strA+"1");
                }
            }
        });
        //button 2
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strA=text1.getText().toString();
                if(strA=="0"){
                    text1.setText("2");
                }
                else {
                    text1.setText(strA+"2");
                }
            }
        });
        //button 3
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strA=text1.getText().toString();
                if(strA=="0"){
                    text1.setText("3");
                }
                else {
                    text1.setText(strA+"3");
                }
            }
        });
        //button 4
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strA=text1.getText().toString();
                if(strA=="0"){
                    text1.setText("4");
                }
                else {
                    text1.setText(strA+"4");
                }
            }
        });
        //button 5
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strA=text1.getText().toString();
                if(strA=="0"){
                    text1.setText("5");
                }
                else {
                    text1.setText(strA+"5");
                }
            }
        });
        //button 6
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strA=text1.getText().toString();
                if(strA=="0"){
                    text1.setText("6");
                }
                else {
                    text1.setText(strA+"6");
                }
            }
        });
        //button 7
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strA=text1.getText().toString();
                if(strA=="0"){
                    text1.setText("7");
                }
                else {
                    text1.setText(strA+"7");
                }
            }
        });
        //button 8
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strA=text1.getText().toString();
                if(strA=="0"){
                    text1.setText("8");
                }
                else {
                    text1.setText(strA+"8");
                }
            }
        });
        //button 9
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strA=text1.getText().toString();
                if(strA=="0"){
                    text1.setText("9");
                }
                else {
                    text1.setText(strA+"9");
                }
            }
        });
        //button x
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strA=text1.getText().toString();
                text1.setText(strA+'x');
            }
        });
        //button :
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strA=text1.getText().toString();
                text1.setText(strA+':');
            }
        });
        //button +
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strA=text1.getText().toString();
                text1.setText(strA+'+');
            }
        });
        //button -
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strA=text1.getText().toString();
                text1.setText(strA+'-');
            }
        });
        //button (
        buttonLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strA=text1.getText().toString();
                if(strA=="0"){
                    text1.setText("(");
                }
                else {
                    text1.setText(strA+"(");
                }
            }
        });
        //button )
        buttonRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strA=text1.getText().toString();
                if(strA=="0"){
                    text1.setText(")");
                }
                else {
                    text1.setText(strA+")");
                }
            }
        });
        //button .
        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strA=text1.getText().toString();
                text1.setText(strA+'.');
            }
        });
        //button Backspace
        buttonBb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strA=text1.getText().toString();
                if(strA.length()==1){
                    text1.setText("0");
                }
                else {
                    text1.setText(strA.substring(0,strA.length()-1));
                }
            }
        });
        //button AC
        buttonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText("0");
            }
        });
        //button =
        buttonEqu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String strA=text1.getText().toString();
                State state = State.init;
                int lengthA = strA.length();
                Stack<Double> stNum = new Stack<>();
                Stack<Character> stTt = new Stack<>();
                int dau = 1;
                //stNum.push(0);
                boolean brkE = false;
                int error_code;
                int erFlags = 0;
                int num = 0;
                boolean isDigit;
                char charA;
                boolean special_case=false;

                for (int i = 0; i < lengthA; i++) {
                    charA = strA.charAt(i);
                    isDigit = Character.isDigit(charA);
                    switch (state) {
                        case init:
                            if (isDigit) {
                                //update num
                                state = State.nhapSo;
                                num = Integer.parseInt(String.valueOf(charA));
                            } else if (charA == 'x' || charA == ':' || charA == ')') {
                                //error
                                state = State.error;
                                error_code=1;

                            } else if (charA == '+' || charA == '-') {
                                state=State.nhapTt;
                                stNum.push(0.0);
                                stTt.push(charA=='+'?'+':'-');
                            } else if (charA == '(') {
                                state=State.nhapTt;
                                stTt.push('(');
                            }
                            break;
                        case nhapDau:
                            if(isDigit){
                                state=State.nhapSo;
                                num=Integer.parseInt(String.valueOf(charA));
                            }
                            else if(charA=='+'||charA=='-'){
                                if(charA=='-') dau=-dau;
                            }
                            else if(charA=='x'||charA==':'||charA==')'){
                                state=State.error;
                            }
                            else if(charA=='('){
                                state=State.nhapTt;
                                stTt.push('(');
                            }
                            break;
                        case nhapSo:
                            if(isDigit){
                                state=State.nhapSo;
                                num=10*num+Integer.parseInt(String.valueOf(charA));
                            }
                            else if(charA=='+'||charA=='-'){
                                state=State.nhapTt;
                                stNum.push((double)num*dau);
                                num=0;
                                dau=1;
                                boolean chiacho0=false;
                                while (!stTt.empty()){
                                    char tt=stTt.pop();
                                    if (tt=='('){
                                        stTt.push(tt);
                                        break;
                                    }
                                    double a=stNum.pop();
                                    double b=stNum.pop();
                                    switch (tt){
                                        case '+':
                                            stNum.push(a+b);
                                            break;
                                        case '-':
                                            stNum.push(b-a);
                                            break;
                                        case 'x':
                                            stNum.push(a*b);
                                            break;
                                        case ':':
                                            if (a==0){
                                                state=State.error;
                                                error_code=0;
                                                chiacho0=true;
                                                break;
                                            }
                                            stNum.push(b/a);
                                            break;
                                    }
                                    if (chiacho0) break;
                                }
                                stTt.push(charA=='+'?'+':'-');
                            }
                            else if(charA=='x'||charA==':'){
                                state=State.nhapTt;
                                stNum.push((double)num*dau);
                                num=0;
                                dau=1;
                                if(!stTt.empty()){
                                    char tt=stTt.pop();
                                    switch (tt){
                                        case 'x':
                                            double a=stNum.pop();
                                            double b=stNum.pop();
                                            stNum.push(a*b);
                                            break;
                                        case ':':
                                            double aa=stNum.pop();
                                            double bb=stNum.pop();
                                            if(aa==0){
                                                state=State.error;
                                                error_code=0;
                                                break;
                                            }
                                            stNum.push(bb/aa);
                                            break;
                                        default:
                                            stTt.push(tt);
                                            break;
                                    }
                                }
                                stTt.push(charA=='x'?'x':':');
                            }
                            else if(charA=='('){
                                state=State.nhapTt;
                                stNum.push((double)num*dau);
                                num=0;
                                dau=1;
                                if(!stTt.empty()){
                                    char tt=stTt.pop();
                                    switch (tt){
                                        case 'x':
                                            double a=stNum.pop();
                                            double b=stNum.pop();
                                            stNum.push(a*b);
                                            break;
                                        case ':':
                                            double aa=stNum.pop();
                                            double bb=stNum.pop();
                                            if(aa==0){
                                                state=State.error;
                                                error_code=0;
                                                break;
                                            }
                                            stNum.push(bb/aa);
                                            break;
                                        default:
                                            stTt.push(tt);
                                            break;
                                    }
                                }
                                stTt.push('x');
                                stTt.push('(');
                            }
                            else if(charA==')'){
                                state=State.nhapTt;
                                special_case=true;
                                stNum.push((double)num*dau);
                                num=0;
                                dau=1;
                                char tt;
                                double a,b;
                                boolean err=false;
                                int songoac=0;
                                while(!stTt.empty()){
                                    tt=stTt.pop();
                                    if(tt=='(') {
                                        if (++songoac == 2){
                                            stTt.push('(');
                                            break;
                                        }
                                    }
                                    a=stNum.pop();
                                    b=stNum.pop();
                                    switch (tt){
                                        case 'x':
                                            stNum.push(a*b);
                                            break;
                                        case ':':
                                            if(a==0){
                                                state=State.error;
                                                err=true;
                                                error_code=0;
                                                break;
                                            }
                                            stNum.push(b/a);
                                            break;
                                        case '+':
                                            stNum.push(a+b);
                                            break;
                                        case '-':
                                            stNum.push(b-a);
                                            break;
                                        default:
                                            stNum.push(b);
                                            stNum.push(a);
                                            break;
                                    }
                                }
                            }
                            break;
                        case nhapTt:
                            if(isDigit){
                                state=State.nhapSo;
                                num=num*10+Integer.parseInt(String.valueOf(charA));
                            }
                            else if(charA==':'||charA=='x'||charA==')'){
                                state=State.error;
                                error_code=3;
                            }
                            else if(charA=='+'||charA=='-'){
                                if (special_case){
                                    special_case=false;
                                    state=State.nhapTt;
                                    stTt.push(charA=='+'?'+':'-');
                                }
                                else {
                                    state = State.nhapDau;
                                    if (charA == '-') dau = -dau;
                                }
                            }
                            else if(charA=='('){
                                state=State.nhapTt;
                                stTt.push('(');
                            }
                            break;
                        case error:
                            break;
                    }
                    if(i==(lengthA-1) && state!=State.error){
                        if(isDigit||charA==')'){
                            if(state==State.nhapSo){
                                stNum.push((double)num*dau);
                            }
                            char tt;
                            double a,b;
                            while (!stTt.empty()){
                                tt=stTt.pop();
                                a=stNum.pop();
                                b=stNum.pop();
                                if(tt=='('){
                                    state=State.error;
                                    error_code=4;
                                    break;
                                }
                                switch (tt){
                                    case 'x':
                                        stNum.push(a*b);
                                        break;
                                    case ':':
                                        if(a==0){
                                            state=State.error;
                                            error_code=0;
                                            break;
                                        }
                                        stNum.push(b/a);
                                        break;
                                    case '+':
                                        stNum.push(a+b);
                                        break;
                                    case '-':
                                        stNum.push(b-a);
                                        break;
                                }
                            }
                        }
                        else {
                            state=State.error;
                        }
                    }
                }
                if(state!=State.error){
                    String strB=Double.toString(stNum.pop());
                    text1.setText(strB);
                }
                else {
                    text1.setText("error!");
                }
            }
        });



    }


}
