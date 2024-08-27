package ut;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class w implements g, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public Function0 f37411a;

    /* renamed from: b, reason: collision with root package name */
    public Object f37412b;

    private final Object writeReplace() {
        return new e(getValue());
    }

    @Override // ut.g
    public final Object getValue() {
        if (this.f37412b == u.f37409a) {
            Function0 function0 = this.f37411a;
            Intrinsics.c(function0);
            this.f37412b = function0.mo2invoke();
            this.f37411a = null;
        }
        return this.f37412b;
    }

    public final String toString() {
        if (this.f37412b != u.f37409a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
