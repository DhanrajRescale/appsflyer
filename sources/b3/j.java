package b3;

import a2.w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j implements w {

    /* renamed from: a, reason: collision with root package name */
    public final e f3124a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f3125b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3126c;

    public j(e eVar, Function1 function1) {
        this.f3124a = eVar;
        this.f3125b = function1;
        this.f3126c = eVar.f3112b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (Intrinsics.a(this.f3124a.f3112b, jVar.f3124a.f3112b) && Intrinsics.a(this.f3125b, jVar.f3125b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3125b.hashCode() + (this.f3124a.f3112b.hashCode() * 31);
    }

    @Override // a2.w
    public final Object q() {
        return this.f3126c;
    }
}
