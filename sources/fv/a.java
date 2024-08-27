package fv;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f16269a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16270b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f16271c;

    public a(int i10, String event, Function1 function1) {
        Intrinsics.e(event, "event");
        this.f16269a = event;
        this.f16270b = i10;
        this.f16271c = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.a(this.f16269a, aVar.f16269a) && this.f16270b == aVar.f16270b && Intrinsics.a(this.f16271c, aVar.f16271c);
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f16269a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int f10 = da.e.f(this.f16270b, i10 * 31, 31);
        Function1 function1 = this.f16271c;
        if (function1 != null) {
            i11 = function1.hashCode();
        }
        return f10 + i11;
    }

    public final String toString() {
        return "Binding(event=" + this.f16269a + ", ref=" + this.f16270b + ", callback=" + this.f16271c + ")";
    }
}
