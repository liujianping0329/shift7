package com.ljp.shift7.vo;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class PersonInfoOneDay {
    String date;
    @Builder.Default
    List<PersonInfo> labels=new ArrayList<>();
}
