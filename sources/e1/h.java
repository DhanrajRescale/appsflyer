package e1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import vt.g0;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14877a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ut.d f14878b;

    public /* synthetic */ h(androidx.compose.foundation.layout.e eVar, int i10) {
        this.f14877a = i10;
        this.f14878b = eVar;
    }

    public final void a() {
        switch (this.f14877a) {
            case 0:
                Function2 function2 = (Function2) this.f14878b;
                synchronized (p.f14905b) {
                    p.f14910g = g0.H(p.f14910g, function2);
                    Unit unit = Unit.f23355a;
                }
                return;
            default:
                Function1 function1 = (Function1) this.f14878b;
                synchronized (p.f14905b) {
                    p.f14911h = g0.H(p.f14911h, function1);
                    Unit unit2 = Unit.f23355a;
                }
                p.e(o.f14901b);
                return;
        }
    }
}
