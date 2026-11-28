package com.example;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class TestClass{
private String name;
private int value;

public TestClass(String name,int value){
this.name=name;
this.value=value;
}

public String getName(){return name;}
public void setName(String name){this.name=name;}

public int getValue(){return value;}
public void setValue(int value){this.value=value;}
}
