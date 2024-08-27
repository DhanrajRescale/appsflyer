package a2;

import d2.g2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w0 extends g2 implements v0 {

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f126c;

    /* renamed from: d, reason: collision with root package name */
    public long f127d;

    public w0(Function1 function1) {
        super(d2.s.f13613k);
        this.f126c = function1;
        this.f127d = hl.f.k(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        return Intrinsics.a(this.f126c, ((w0) obj).f126c);
    }

    public final int hashCode() {
        return this.f126c.hashCode();
    }
}
