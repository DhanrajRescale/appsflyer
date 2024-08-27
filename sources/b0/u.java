package b0;

import android.graphics.Path;
import androidx.lifecycle.t;
import com.assetgro.stockgro.ui.social.presentation.utils.VideoPlayer;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import r0.a3;
import r0.z2;
import t0.g1;
import t0.l3;

/* loaded from: classes.dex */
public final class u extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3010a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3011b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3012c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3014e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3015f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3016g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        super(1);
        this.f3010a = i10;
        this.f3011b = obj;
        this.f3012c = obj2;
        this.f3013d = obj3;
        this.f3014e = obj4;
        this.f3015f = obj5;
        this.f3016g = obj6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f10;
        Path path;
        int i10 = this.f3010a;
        int i11 = 2;
        Object obj2 = this.f3016g;
        Object obj3 = this.f3011b;
        Object obj4 = this.f3015f;
        Object obj5 = this.f3014e;
        Object obj6 = this.f3013d;
        Object obj7 = this.f3012c;
        switch (i10) {
            case 0:
                int i12 = 0;
                a2.z0 z0Var = (a2.z0) obj;
                a2.a1[] a1VarArr = (a2.a1[]) obj3;
                List list = (List) obj7;
                a2.o0 o0Var = (a2.o0) obj6;
                iu.x xVar = (iu.x) obj5;
                iu.x xVar2 = (iu.x) obj4;
                v vVar = (v) obj2;
                int length = a1VarArr.length;
                int i13 = 0;
                while (i12 < length) {
                    a2.a1 a1Var = a1VarArr[i12];
                    Intrinsics.d(a1Var, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    s.b(z0Var, a1Var, (a2.l0) list.get(i13), o0Var.getLayoutDirection(), xVar.f20558a, xVar2.f20558a, vVar.f3021a);
                    i12++;
                    i13++;
                }
                return Unit.f23355a;
            case 1:
                p1.h hVar = (p1.h) obj;
                float floor = (float) Math.floor(hVar.c0(m0.u0.f26871d));
                long j10 = ((n1.t) ((l3) obj7).getValue()).f28179a;
                long j11 = ((n1.t) ((l3) obj6).getValue()).f28179a;
                float c02 = hVar.c0(m0.u0.f26872e);
                float f11 = floor / 2.0f;
                p1.m mVar = new p1.m(floor, s0.g.f34069a, 0, 0, null, 30);
                float e10 = m1.f.e(hVar.d());
                boolean d10 = n1.t.d(j10, j11);
                p1.k kVar = p1.k.f30509a;
                if (d10) {
                    f10 = floor;
                    p1.h.A(hVar, j10, 0L, t0.t.j(e10, e10), t0.t.a(c02, c02), kVar, 226);
                } else {
                    f10 = floor;
                    long g10 = t0.t.g(f10, f10);
                    float f12 = e10 - (2 * f10);
                    long j12 = t0.t.j(f12, f12);
                    float max = Math.max(s0.g.f34069a, c02 - f10);
                    p1.h.A(hVar, j10, g10, j12, t0.t.a(max, max), kVar, 224);
                    float f13 = e10 - f10;
                    float f14 = c02 - f11;
                    p1.h.A(hVar, j11, t0.t.g(f11, f11), t0.t.j(f13, f13), t0.t.a(f14, f14), mVar, 224);
                }
                long j13 = ((n1.t) ((l3) obj5).getValue()).f28179a;
                float floatValue = ((Number) ((l3) obj4).getValue()).floatValue();
                float floatValue2 = ((Number) ((l3) obj2).getValue()).floatValue();
                m0.q0 q0Var = (m0.q0) obj3;
                p1.m mVar2 = new p1.m(f10, s0.g.f34069a, 2, 0, null, 26);
                float e11 = m1.f.e(hVar.d());
                float z02 = hl.f.z0(0.4f, 0.5f, floatValue2);
                float z03 = hl.f.z0(0.7f, 0.5f, floatValue2);
                float z04 = hl.f.z0(0.5f, 0.5f, floatValue2);
                float z05 = hl.f.z0(0.3f, 0.5f, floatValue2);
                ((n1.h) q0Var.f26662a).h();
                n1.p0 p0Var = q0Var.f26662a;
                n1.h hVar2 = (n1.h) p0Var;
                hVar2.f(0.2f * e11, z04 * e11);
                hVar2.e(z02 * e11, z03 * e11);
                hVar2.e(0.8f * e11, e11 * z05);
                n1.j jVar = q0Var.f26663b;
                if (p0Var != null) {
                    jVar.getClass();
                    if (p0Var instanceof n1.h) {
                        path = ((n1.h) p0Var).f28138a;
                    } else {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                } else {
                    path = null;
                }
                jVar.f28145a.setPath(path, false);
                n1.p0 p0Var2 = q0Var.f26664c;
                ((n1.h) p0Var2).h();
                jVar.a(s0.g.f34069a, jVar.f28145a.getLength() * floatValue, p0Var2);
                p1.h.C(hVar, q0Var.f26664c, j13, s0.g.f34069a, mVar2, 52);
                return Unit.f23355a;
            case 2:
                z2 z2Var = (z2) obj3;
                String str = (String) obj6;
                String str2 = (String) obj5;
                qu.f0 f0Var = (qu.f0) obj2;
                r0.p1 p1Var = new r0.p1((Function0) obj4, 0);
                ou.g[] gVarArr = h2.t.f17908a;
                h2.j jVar2 = (h2.j) ((h2.v) obj);
                jVar2.h(h2.i.f17843s, new h2.a((String) obj7, p1Var));
                a3 a3Var = (a3) z2Var.f32833c.f32721f.getValue();
                a3 a3Var2 = a3.f32326c;
                if (a3Var == a3Var2) {
                    jVar2.h(h2.i.f17841q, new h2.a(str, new c0.s(4, z2Var, f0Var, z2Var)));
                } else if (z2Var.f32833c.d().f32396a.containsKey(a3Var2)) {
                    jVar2.h(h2.i.f17842r, new h2.a(str2, new r0.s(i11, z2Var, f0Var)));
                }
                return Unit.f23355a;
            default:
                t0.o0 DisposableEffect = (t0.o0) obj;
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                final t0.g1 g1Var = (t0.g1) obj7;
                final l3 l3Var = (l3) obj6;
                final String str3 = (String) obj5;
                final t0.g1 g1Var2 = (t0.g1) obj4;
                androidx.lifecycle.r rVar = new androidx.lifecycle.r() { // from class: wb.f
                    @Override // androidx.lifecycle.r
                    public final void c(t tVar, androidx.lifecycle.m event) {
                        ut.p pVar;
                        VideoPlayer videoPlayer;
                        ut.p pVar2;
                        g1 videoPlayer2 = g1.this;
                        Intrinsics.checkNotNullParameter(videoPlayer2, "$videoPlayer");
                        String videoUrl = str3;
                        Intrinsics.checkNotNullParameter(videoUrl, "$videoUrl");
                        g1 playbackPosition$delegate = g1Var2;
                        Intrinsics.checkNotNullParameter(playbackPosition$delegate, "$playbackPosition$delegate");
                        Intrinsics.checkNotNullParameter(tVar, "<anonymous parameter 0>");
                        Intrinsics.checkNotNullParameter(event, "event");
                        int i14 = g.f38940a[event.ordinal()];
                        if (i14 != 1) {
                            String str4 = null;
                            if (i14 != 2) {
                                if (i14 == 3) {
                                    VideoPlayer videoPlayer3 = (VideoPlayer) videoPlayer2.getValue();
                                    if (videoPlayer3 != null) {
                                        videoPlayer3.j();
                                    }
                                    videoPlayer2.setValue(null);
                                    return;
                                }
                                return;
                            }
                            l3 l3Var2 = l3Var;
                            if (l3Var2 != null && (pVar2 = (ut.p) l3Var2.getValue()) != null) {
                                str4 = (String) pVar2.f37400a;
                            }
                            if (Intrinsics.a(str4, videoUrl) && (pVar = (ut.p) l3Var2.getValue()) != null && ((Boolean) pVar.f37402c).booleanValue() && (videoPlayer = (VideoPlayer) videoPlayer2.getValue()) != null) {
                                videoPlayer.k(((Number) playbackPosition$delegate.getValue()).longValue());
                                return;
                            }
                            return;
                        }
                        VideoPlayer videoPlayer4 = (VideoPlayer) videoPlayer2.getValue();
                        if (videoPlayer4 != null) {
                            videoPlayer4.i();
                        }
                    }
                };
                androidx.lifecycle.t tVar = (androidx.lifecycle.t) obj3;
                tVar.getLifecycle().a(rVar);
                return new wb.h(tVar, rVar, (Function2) obj2, str3, g1Var, 0);
        }
    }
}
