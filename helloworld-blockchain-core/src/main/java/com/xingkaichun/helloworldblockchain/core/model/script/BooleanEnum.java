package com.xingkaichun.helloworldblockchain.core.model.script;

public enum BooleanEnum {
    TRUE(new byte[0x00]),
    FALSE(new byte[0x01]);

    private byte[] code;
    BooleanEnum(byte[] code) {
        this.code = code;
    }

    public byte[] getCode() {
        return code;
    }
}