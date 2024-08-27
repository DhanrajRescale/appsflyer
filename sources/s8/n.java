package s8;

import kotlin.jvm.internal.Intrinsics;
import p8.o;

/* loaded from: classes.dex */
public final class n extends e {

    /* renamed from: a, reason: collision with root package name */
    public final o f34347a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34348b;

    /* renamed from: c, reason: collision with root package name */
    public final p8.f f34349c;

    public n(o oVar, String str, p8.f fVar) {
        this.f34347a = oVar;
        this.f34348b = str;
        this.f34349c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (Intrinsics.a(this.f34347a, nVar.f34347a) && Intrinsics.a(this.f34348b, nVar.f34348b) && this.f34349c == nVar.f34349c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f34347a.hashCode() * 31;
        String str = this.f34348b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return this.f34349c.hashCode() + ((hashCode + i10) * 31);
    }
}
