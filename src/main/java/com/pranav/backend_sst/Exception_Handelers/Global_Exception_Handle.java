package com.pranav.backend_sst.Exception_Handelers;

import com.pranav.backend_sst.Dtos.Exception_Dto;
import com.pranav.backend_sst.Exceptions.ProductException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Global_Exception_Handle {
    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<Exception_Dto> handleArithmeticException() {
        Exception_Dto dto = new Exception_Dto();
        dto.setMessage("Something went wrong");
        dto.setResolution("ArithmeticException");
        ResponseEntity<Exception_Dto> response = new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
        return response;
    }

    @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
    public ResponseEntity<Exception_Dto> handleArrayIndexOutOfBoundsException() {
        Exception_Dto dto = new Exception_Dto();
        dto.setMessage("Something went wrong");
        dto.setResolution("ArrayIndexOutOfBoundsException");
        ResponseEntity<Exception_Dto> response = new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
        return response;
    }

//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<ExceptionDto> handleGeneralException() {
//        ExceptionDto dto = new ExceptionDto();
//        dto.setMessage("Something went wrong");
//        dto.setResolution("Exception");
//        ResponseEntity<ExceptionDto> response = new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
//        return response;
//    }


    @ExceptionHandler(ProductException.class)
    public ResponseEntity<Exception_Dto> handleProductNotFoundException(ProductException productNotFoundException) {
        Exception_Dto dto = new Exception_Dto();
        dto.setMessage("Invalid product Id " + productNotFoundException.getId() + " passed");
        dto.setResolution("ProductNotFoundException caught");
        ResponseEntity<Exception_Dto> response = new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
        return response;
    }
}