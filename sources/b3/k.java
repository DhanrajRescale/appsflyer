package b3;

import a2.x0;
import d2.g2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k extends g2 implements x0 {

    /* renamed from: c, reason: collision with root package name */
    public final e f3127c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f3128d;

    public k(e eVar, Function1 function1) {
        super(d2.s.f13613k);
        this.f3127c = eVar;
        this.f3128d = function1;
    }

    public final boolean equals(Object obj) {
        k kVar;
        Function1 function1 = null;
        if (obj instanceof k) {
            kVar = (k) obj;
        } else {
            kVar = null;
        }
        if (kVar != null) {
            function1 = kVar.f3128d;
        }
        return Intrinsics.a(this.f3128d, function1);
    }

    @Override // a2.x0
    public final Object h() {
        return new j(this.f3127c, this.f3128d);
    }

    public final int hashCode() {
        return this.f3128d.hashCode();
    }
}
