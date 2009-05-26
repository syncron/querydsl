/*
 * Copyright (c) 2009 Mysema Ltd.
 * All rights reserved.
 * 
 */
package com.mysema.query.types.quant;

import com.mysema.query.types.CollectionType;
import com.mysema.query.types.expr.ESimple;
import com.mysema.query.types.expr.Expr;
import com.mysema.query.types.operation.Op;

/**
 * The Class Simple.
 */
public class QSimple<Q> extends ESimple<Q> implements Quant<Q> {

    private final Expr<?> col;

    private final Op<?> op;

    public QSimple(Class<Q> type, Op<?> op, CollectionType<Q> col) {
        super(type);
        this.op = op;
        this.col = (Expr<?>) col;
    }

    public Op<?> getOperator() {
        return op;
    }

    public Expr<?> getTarget() {
        return col;
    }
}