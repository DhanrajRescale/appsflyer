package fr;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f16214a;

    public d() {
        this.f16214a = null;
    }

    public final Object a() {
        Object obj = this.f16214a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean b() {
        return this.f16214a != null;
    }

    public d(Object obj) {
        if (obj == null) {
            throw new NullPointerException("value for optional is empty.");
        }
        this.f16214a = obj;
    }
}
