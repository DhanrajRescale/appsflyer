package x;

import android.app.Activity;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.data.model.UserChatGroup;
import com.assetgro.stockgro.ui.notifications.NotificationsActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p2 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39676a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39677b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f39678c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f39679d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(int i10, ChatMessage chatMessage, rd.m mVar) {
        super(1);
        this.f39676a = 4;
        this.f39678c = mVar;
        this.f39679d = chatMessage;
        this.f39677b = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10;
        int i11;
        long j10;
        long a10;
        float e10;
        long j11;
        t0.u uVar;
        t0.u uVar2;
        int i12;
        boolean z10;
        t0.k0 k0Var;
        int i13 = this.f39676a;
        Object obj2 = this.f39679d;
        Object obj3 = this.f39678c;
        int i14 = this.f39677b;
        switch (i13) {
            case 0:
                a2.z0 z0Var = (a2.z0) obj;
                q2 q2Var = (q2) obj3;
                int i15 = 0;
                int f10 = kotlin.ranges.d.f(q2Var.f39697n.f39653a.i(), 0, i14);
                if (q2Var.f39698o) {
                    i10 = f10 - i14;
                } else {
                    i10 = -f10;
                }
                boolean z11 = q2Var.f39699p;
                if (z11) {
                    i11 = 0;
                } else {
                    i11 = i10;
                }
                if (z11) {
                    i15 = i10;
                }
                a2.z0.h(z0Var, (a2.a1) obj2, i11, i15);
                return Unit.f23355a;
            case 1:
                long j12 = ((m1.c) obj).f27237a;
                y.j2 j2Var = (y.j2) obj3;
                w1.g d10 = j2Var.f40801f.d();
                if (d10 != null) {
                    j10 = d10.I(i14, j12);
                } else {
                    j10 = m1.c.f27233b;
                }
                long g10 = m1.c.g(j12, j10);
                y.g1 g1Var = j2Var.f40797b;
                y.g1 g1Var2 = y.g1.f40724b;
                if (g1Var == g1Var2) {
                    a10 = m1.c.a(g10, 1);
                } else {
                    a10 = m1.c.a(g10, 2);
                }
                if (j2Var.f40799d) {
                    a10 = m1.c.i(a10, -1.0f);
                }
                if (j2Var.f40797b == g1Var2) {
                    e10 = m1.c.d(a10);
                } else {
                    e10 = m1.c.e(a10);
                }
                long d11 = j2Var.d(((y.q1) obj2).a(e10));
                if (j2Var.f40799d) {
                    d11 = m1.c.i(d11, -1.0f);
                }
                long g11 = m1.c.g(g10, d11);
                w1.d dVar = j2Var.f40801f;
                int i16 = this.f39677b;
                w1.g d12 = dVar.d();
                if (d12 != null) {
                    j11 = d12.l0(i16, d11, g11);
                } else {
                    j11 = m1.c.f27233b;
                }
                return new m1.c(m1.c.h(m1.c.h(j10, d11), j11));
            case 2:
                t0.u uVar3 = (t0.u) obj;
                t0.x1 x1Var = (t0.x1) obj3;
                if (x1Var.f35246e == i14) {
                    t.y yVar = (t.y) obj2;
                    if (Intrinsics.a(yVar, x1Var.f35247f) && (uVar3 instanceof t0.y)) {
                        long[] jArr = yVar.f34925a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i17 = 0;
                            while (true) {
                                long j13 = jArr[i17];
                                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i18 = 8;
                                    int i19 = 8 - ((~(i17 - length)) >>> 31);
                                    int i20 = 0;
                                    while (i20 < i19) {
                                        if ((j13 & 255) < 128) {
                                            int i21 = (i17 << 3) + i20;
                                            Object obj4 = yVar.f34926b[i21];
                                            if (yVar.f34927c[i21] != i14) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            if (z10) {
                                                t0.y yVar2 = (t0.y) uVar3;
                                                uVar2 = uVar3;
                                                yVar2.f35256g.b(obj4, x1Var);
                                                if (obj4 instanceof t0.k0) {
                                                    k0Var = (t0.k0) obj4;
                                                } else {
                                                    k0Var = null;
                                                }
                                                if (k0Var != null) {
                                                    if (!yVar2.f35256g.f37656a.b(k0Var)) {
                                                        yVar2.f35258i.c(k0Var);
                                                    }
                                                    t.z zVar = x1Var.f35248g;
                                                    if (zVar != null) {
                                                        zVar.i(k0Var);
                                                        if (zVar.f34935e == 0) {
                                                            x1Var.f35248g = null;
                                                        }
                                                    }
                                                }
                                            } else {
                                                uVar2 = uVar3;
                                            }
                                            if (z10) {
                                                yVar.g(i21);
                                            }
                                            i12 = 8;
                                        } else {
                                            uVar2 = uVar3;
                                            i12 = i18;
                                        }
                                        j13 >>= i12;
                                        i20++;
                                        i18 = i12;
                                        uVar3 = uVar2;
                                    }
                                    uVar = uVar3;
                                    if (i19 != i18) {
                                    }
                                } else {
                                    uVar = uVar3;
                                }
                                if (i17 != length) {
                                    i17++;
                                    uVar3 = uVar;
                                }
                            }
                        }
                        if (yVar.f34929e == 0) {
                            x1Var.f35247f = null;
                        }
                    }
                }
                return Unit.f23355a;
            case 3:
                long j14 = ((m1.c) obj).f27237a;
                ((Function2) obj3).invoke(Integer.valueOf(i14), (UserChatGroup) obj2);
                return Unit.f23355a;
            case 4:
                ChatMessage it = (ChatMessage) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                rd.m mVar = (rd.m) obj3;
                if (mVar != null) {
                    mVar.d((ChatMessage) obj2);
                }
                return Unit.f23355a;
            default:
                dp.a aVar = (dp.a) obj;
                if (aVar.f14426a == 2 && aVar.a(dp.m.a(i14)) != null) {
                    ((dp.e) obj3).getClass();
                    dp.e.c(aVar, i14, (Activity) obj2);
                }
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(int i10, NotificationsActivity notificationsActivity, dp.e eVar) {
        super(1);
        this.f39676a = 5;
        this.f39677b = i10;
        this.f39678c = eVar;
        this.f39679d = notificationsActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p2(Object obj, int i10, Object obj2, int i11) {
        super(1);
        this.f39676a = i11;
        this.f39678c = obj;
        this.f39677b = i10;
        this.f39679d = obj2;
    }
}
