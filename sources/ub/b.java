package ub;

import b0.e0;
import b0.g0;
import b0.y1;
import g1.l;
import iu.k;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kp.j;
import n1.s0;
import s0.g;
import t0.n;
import t0.r;

/* loaded from: classes.dex */
public final class b extends k implements hu.c {

    /* renamed from: b, reason: collision with root package name */
    public static final b f37042b = new b(0);

    /* renamed from: c, reason: collision with root package name */
    public static final b f37043c = new b(1);

    /* renamed from: d, reason: collision with root package name */
    public static final b f37044d = new b(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37045a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10) {
        super(3);
        this.f37045a = i10;
    }

    public final void a(c0.c item, n nVar, int i10) {
        l lVar = l.f16404b;
        switch (this.f37045a) {
            case 0:
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i10 & 81) == 16) {
                    r rVar = (r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, j.R(16, nVar)), nVar);
                return;
            case 1:
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i10 & 81) == 16) {
                    r rVar2 = (r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                pp.b.c(androidx.compose.foundation.a.e(androidx.compose.foundation.layout.d.g(lVar, (float) 0.5d), androidx.compose.ui.graphics.a.d(4289965485L), s0.f28162a), 0L, g.f34069a, g.f34069a, nVar, 6, 14);
                return;
            default:
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i10 & 81) == 16) {
                    r rVar3 = (r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                r rVar4 = (r) nVar;
                rVar4.b0(-1990981160);
                WeakHashMap weakHashMap = y1.f3042v;
                y1 c10 = g0.c(rVar4);
                rVar4.s(false);
                androidx.compose.foundation.layout.a.c(new e0(c10.f3055m), nVar);
                return;
        }
    }

    @Override // hu.c
    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f37045a) {
            case 0:
                a((c0.c) obj, (n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            case 1:
                a((c0.c) obj, (n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
            default:
                a((c0.c) obj, (n) obj2, ((Number) obj3).intValue());
                return Unit.f23355a;
        }
    }
}
