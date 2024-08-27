package en;

import iu.k;
import kotlin.jvm.internal.Intrinsics;
import s0.g;
import t0.n;
import t0.r;
import w.e;
import w.f1;
import w.p1;

/* loaded from: classes2.dex */
public final class a extends k implements hu.c {

    /* renamed from: b, reason: collision with root package name */
    public static final a f15743b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f15744c = new a(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15745a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10) {
        super(3);
        this.f15745a = i10;
    }

    public final f1 a(p1 p1Var, n nVar) {
        switch (this.f15745a) {
            case 0:
                Intrinsics.checkNotNullParameter(p1Var, "$this$null");
                r rVar = (r) nVar;
                rVar.b0(87515116);
                f1 v10 = e.v(g.f34069a, null, 7);
                rVar.s(false);
                return v10;
            default:
                Intrinsics.checkNotNullParameter(p1Var, "$this$null");
                r rVar2 = (r) nVar;
                rVar2.b0(-439090190);
                f1 v11 = e.v(g.f34069a, null, 7);
                rVar2.s(false);
                return v11;
        }
    }

    @Override // hu.c
    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f15745a) {
            case 0:
                ((Number) obj3).intValue();
                return a((p1) obj, (n) obj2);
            default:
                ((Number) obj3).intValue();
                return a((p1) obj, (n) obj2);
        }
    }
}
