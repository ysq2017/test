package com.dafy.drools.constants;

/**
 * @author yangshaoqiang
 * @date 2018/10/16 11:57
 * 支出类别
 */
public enum ExpenseTypeEnum {
    EDUCATION((byte)0, "教育"),
    SUPPORT((byte)1, "赡养费"), //主要指老人
    HOME_LOAN((byte)2, "房贷"),
    CAR_LOAN((byte)3, "车贷"),
    LIVING_EXPENSES((byte)4, "生活开支");
    byte value;
    String desc;

    ExpenseTypeEnum(byte value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public static ExpenseTypeEnum getByValue(Byte value) {
        for (ExpenseTypeEnum expenseTypeEnum : ExpenseTypeEnum.values()) {
            if (expenseTypeEnum.value == value) {
                return expenseTypeEnum;
            }
        }
        return null;
    }

    public byte getValue() {
        return value;
    }

    public void setValue(byte value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
