package com.pose.base;

import java.util.Stack;

/**
 * Created by poseture on 2016/11/6.
 */
public class Evaluate {

    public static String[] getArray(String s){
        String[] array = new String[s.length()];
        for(int i=0;i<s.length();i++){
            array[i] = s.charAt(i)+"";
        }
        return array;
    }

    public static void main(String[] args) {
        String form = "(1+((2+3)*(4*5)))";
        String[] array = getArray(form);
        for(int i =0 ;i<array.length;i++){
            System.out.println(array[i]);
        }

        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();
        for(int i=0;i<array.length;i++){
            if(array[i].equals("("));
            else if(array[i].equals("+")){
                ops.push(array[i]);
            }else if(array[i].equals("-")){
                ops.push(array[i]);
            }else if(array[i].equals("*")){
                ops.push(array[i]);
            }else if(array[i].equals("/")){
                ops.push(array[i]);
            }else if(array[i].equals(")")){
                String op = ops.pop();
                Double val = vals.pop();

                if(op.equals("+")){
                    val = vals.pop()+val;
                }else if(op.equals("-")){
                    val = vals.pop()-val;
                }else if(op.equals("*")){
                    val = vals.pop()*val;
                }else if(op.equals("/")){
                    val = vals.pop()/val;
                }
                vals.push(val);
            }else{
                vals.push(Double.parseDouble(array[i]));
            }
        }
        System.out.println(vals.pop());
    }
}
