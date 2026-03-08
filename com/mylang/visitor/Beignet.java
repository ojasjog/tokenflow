package com.mylang.visitor;

public class Beignet extends Pastry{

    @Override
    void accept(PastryVisitor visitor) {
        visitor.visitBeignet(this);
    }
}
