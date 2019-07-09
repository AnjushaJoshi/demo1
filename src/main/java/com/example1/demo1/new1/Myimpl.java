package com.example1.demo1.new1;


import com.example1.demo1.new2.Inn;
import org.springframework.stereotype.Service;

@Service
public class Myimpl implements Inn
{
    public String check1()
    {
        return "Hello Spring";

    }
}
