package com.mylang.visitor;

public class Cruller extends Pastry {


    @Override
    void accept(PastryVisitor visitor) {
        visitor.visitCruller(this);
    }
}
