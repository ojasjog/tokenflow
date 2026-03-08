package com.mylang.visitor;

abstract class Pastry {
    abstract void accept(PastryVisitor visitor);
}
