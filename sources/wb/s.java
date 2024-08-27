package wb;

import androidx.lifecycle.t;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import t0.g1;
import t0.n0;
import t0.o0;

/* loaded from: classes.dex */
public final class s extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38994a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f38995b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f38996c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f38997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f38998e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, Function2 function2, String str, g1 g1Var) {
        super(1);
        this.f38995b = tVar;
        this.f38997d = function2;
        this.f38998e = str;
        this.f38996c = g1Var;
    }

    public final n0 a(o0 DisposableEffect) {
        int i10 = this.f38994a;
        t tVar = this.f38995b;
        g1 g1Var = this.f38996c;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                Function2 function2 = this.f38997d;
                String str = this.f38998e;
                d4.t tVar2 = new d4.t(1, function2, str, g1Var);
                tVar.getLifecycle().a(tVar2);
                return new r(function2, str, tVar, tVar2);
            default:
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                androidx.navigation.p pVar = new androidx.navigation.p(g1Var, 3);
                tVar.getLifecycle().a(pVar);
                return new h(this.f38995b, pVar, this.f38997d, this.f38998e, this.f38996c, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f38994a) {
            case 0:
                return a((o0) obj);
            default:
                return a((o0) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, g1 g1Var, Function2 function2, String str) {
        super(1);
        this.f38995b = tVar;
        this.f38996c = g1Var;
        this.f38997d = function2;
        this.f38998e = str;
    }
}
