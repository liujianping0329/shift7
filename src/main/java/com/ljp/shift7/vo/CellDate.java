package com.ljp.shift7.vo;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class CellDate {
    Date date;
    String dateStr;

    Integer yobi;
}
