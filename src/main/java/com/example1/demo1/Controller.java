package com.example1.demo1;
import com.example1.demo1.new1.Myimpl2;
import com.example1.demo1.new1.Myimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    public class Controller {

        // @Autowired
        private Myimpl myImpl;

//    public MyController(MyImpl myImpl){
//        this.myImpl=myImpl;
//    }

        @Autowired
        public void setMyImpl(Myimpl myImpl) {
            this.myImpl = myImpl;
        }

        @Autowired
        private Myimpl2 myImpl2;

        @GetMapping(value = "/checkdata")
        public String checkData() {
            return myImpl2.checkDiandIoc();
        }


        @GetMapping(value = "/checkdata1")
        public String checkData1() {
            return myImpl.check1();
        }
    }
