package g1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class i implements o {

    /* renamed from: b, reason: collision with root package name */
    public final o f16400b;

    /* renamed from: c, reason: collision with root package name */
    public final o f16401c;

    public i(o oVar, o oVar2) {
        this.f16400b = oVar;
        this.f16401c = oVar2;
    }

    @Override // g1.o
    public final Object b(Object obj, Function2 function2) {
        return this.f16401c.b(this.f16400b.b(obj, function2), function2);
    }

    @Override // g1.o
    public final boolean c(Function1 function1) {
        if (this.f16400b.c(function1) && this.f16401c.c(function1)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (Intrinsics.a(this.f16400b, iVar.f16400b) && Intrinsics.a(this.f16401c, iVar.f16401c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f16401c.hashCode() * 31) + this.f16400b.hashCode();
    }

    public final String toString() {
        return nn.d.n(new StringBuilder("["), (String) b(HttpUrl.FRAGMENT_ENCODE_SET, h.f16399a), ']');
    }
}
