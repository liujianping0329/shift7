package com.ljp.shift7.vo;

import lombok.Data;

import java.util.List;

@Data
public class Info {
    private String date;
    private List<PersonInfo> labels;
}
