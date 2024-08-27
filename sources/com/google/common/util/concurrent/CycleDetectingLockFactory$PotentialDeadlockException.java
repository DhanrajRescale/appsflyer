package com.google.common.util.concurrent;

import java.util.Objects;
import kp.j;
import lp.g0;
import lp.v0;

/* loaded from: classes2.dex */
public final class CycleDetectingLockFactory$PotentialDeadlockException extends IllegalStateException {
    static {
        v0.p(3, j.class.getName(), "com.google.common.util.concurrent.CycleDetectingLockFactory$PotentialDeadlockException", g0.class.getName());
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        Objects.requireNonNull(message);
        return new StringBuilder(message).toString();
    }
}
