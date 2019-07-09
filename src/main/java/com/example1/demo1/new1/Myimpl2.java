package com.example1.demo1.new1;

import com.example1.demo1.new2.Inn2;
import org.springframework.stereotype.Service;

@Service
public class Myimpl2 implements Inn2
{

    @Override
    public String checkDiandIoc()
    {
        return "Hiiii";
    }


}
