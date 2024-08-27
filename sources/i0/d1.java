package i0;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.main.MainActivity;
import com.assetgro.stockgro.ui.main.MainViewModel;
import com.google.android.gms.common.api.Api;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m0.z4;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class d1 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18827a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18828b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18829c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18830d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f18831e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(int i10, dp.e eVar, MainActivity mainActivity, MainActivity mainActivity2) {
        super(1);
        this.f18827a = 6;
        this.f18830d = i10;
        this.f18828b = eVar;
        this.f18831e = mainActivity;
        this.f18829c = mainActivity2;
    }

    public final Boolean a(a2.e eVar) {
        int i10 = this.f18827a;
        int i11 = this.f18830d;
        Object obj = this.f18829c;
        Object obj2 = this.f18831e;
        Object obj3 = this.f18828b;
        switch (i10) {
            case 4:
                Boolean valueOf = Boolean.valueOf(androidx.compose.ui.focus.a.I((l1.t) obj3, (l1.t) obj2, i11, (Function1) obj));
                if (!valueOf.booleanValue() && eVar.a()) {
                    return null;
                }
                return valueOf;
            default:
                Boolean valueOf2 = Boolean.valueOf(androidx.compose.ui.focus.a.H(i11, (l1.t) obj3, (m1.d) obj2, (Function1) obj));
                if (!valueOf2.booleanValue() && eVar.a()) {
                    return null;
                }
                return valueOf2;
        }
    }

    public final void d(a2.z0 z0Var) {
        boolean z10;
        int i10 = this.f18827a;
        int i11 = this.f18830d;
        Object obj = this.f18829c;
        j2.e0 e0Var = null;
        Object obj2 = this.f18831e;
        Object obj3 = this.f18828b;
        switch (i10) {
            case 0:
                a2.o0 o0Var = (a2.o0) obj3;
                e1 e1Var = (e1) obj2;
                int i12 = e1Var.f18848c;
                p2.j0 j0Var = e1Var.f18849d;
                s2 s2Var = (s2) e1Var.f18850e.mo2invoke();
                if (s2Var != null) {
                    e0Var = s2Var.f19194a;
                }
                j2.e0 e0Var2 = e0Var;
                if (o0Var.getLayoutDirection() == w2.k.f38800b) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                a2.a1 a1Var = (a2.a1) obj;
                m1.d l10 = l1.l(o0Var, i12, j0Var, e0Var2, z10, a1Var.f29a);
                y.g1 g1Var = y.g1.f40724b;
                int i13 = a1Var.f29a;
                q2 q2Var = e1Var.f18847b;
                q2Var.a(g1Var, l10, i11, i13);
                a2.z0.g(z0Var, a1Var, Math.round(-q2Var.f19157a.i()), 0);
                return;
            default:
                a2.o0 o0Var2 = (a2.o0) obj3;
                c3 c3Var = (c3) obj2;
                int i14 = c3Var.f18816c;
                p2.j0 j0Var2 = c3Var.f18817d;
                s2 s2Var2 = (s2) c3Var.f18818e.mo2invoke();
                if (s2Var2 != null) {
                    e0Var = s2Var2.f19194a;
                }
                a2.a1 a1Var2 = (a2.a1) obj;
                m1.d l11 = l1.l(o0Var2, i14, j0Var2, e0Var, false, a1Var2.f29a);
                y.g1 g1Var2 = y.g1.f40723a;
                int i15 = a1Var2.f30b;
                q2 q2Var2 = c3Var.f18815b;
                q2Var2.a(g1Var2, l11, i11, i15);
                a2.z0.g(z0Var, a1Var2, 0, Math.round(-q2Var2.f19157a.i()));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10;
        int i11 = this.f18827a;
        Object obj2 = this.f18829c;
        int i12 = this.f18830d;
        Object obj3 = this.f18831e;
        Object obj4 = this.f18828b;
        switch (i11) {
            case 0:
                d((a2.z0) obj);
                return Unit.f23355a;
            case 1:
                d((a2.z0) obj);
                return Unit.f23355a;
            case 2:
                View view = (View) obj4;
                return new c.c(new z4(view, new lf.b0(view, (c2.x1) obj3, i12, (t0.e1) obj2)), 6);
            case 3:
                if (obj != ((t0.j0) obj4)) {
                    if (obj instanceof e1.y) {
                        t.y yVar = (t.y) obj2;
                        int i13 = ((b1.e) obj3).f3080a - i12;
                        int d10 = yVar.d(obj);
                        if (d10 >= 0) {
                            i10 = yVar.f34927c[d10];
                        } else {
                            i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                        }
                        int min = Math.min(i13, i10);
                        int c10 = yVar.c(obj);
                        if (c10 < 0) {
                            c10 = ~c10;
                        }
                        yVar.f34926b[c10] = obj;
                        yVar.f34927c[c10] = min;
                    }
                    return Unit.f23355a;
                }
                throw new IllegalStateException("A derived state calculation cannot read itself".toString());
            case 4:
                return a((a2.e) obj);
            case 5:
                return a((a2.e) obj);
            case 6:
                dp.a aVar = (dp.a) obj;
                if (aVar.f14426a == 2 && aVar.a(dp.m.a(i12)) != null) {
                    ((dp.e) obj4).getClass();
                    dp.e.c(aVar, i12, (Activity) obj3);
                } else if (aVar.f14427b == 11) {
                    ((MainViewModel) ((MainActivity) obj2).x()).P.postValue(Boolean.TRUE);
                } else {
                    MainActivity context = (MainActivity) obj2;
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter("App is already up to date", "text");
                    Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                    Object systemService = context.getSystemService("layout_inflater");
                    Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                    View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
                    w.k.c("App is already up to date", (TextView) inflate.findViewById(R.id.message), makeText, inflate);
                }
                return Unit.f23355a;
            default:
                p1.h Canvas = (p1.h) obj;
                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                t0.g1 g1Var = (t0.g1) obj4;
                if (((Number) g1Var.getValue()).floatValue() == 1.0f) {
                    g1Var.setValue(Float.valueOf(m1.f.c(Canvas.d()) * m1.f.e(Canvas.d())));
                }
                p1.h.z0(Canvas, (n1.h0) obj3, 0L, 0L, 0L, hl.f.k(i12, i12), s0.g.f34069a, null, 0, 1006);
                n1.p0 p0Var = (n1.p0) ((t0.g1) obj2).getValue();
                p1.b f02 = Canvas.f0();
                long b10 = f02.b();
                f02.a().h();
                f02.f30498a.f30504a.a().u(p0Var, 1);
                p1.h.A(Canvas, androidx.compose.ui.graphics.a.d(4294176255L), 0L, 0L, 0L, null, 254);
                f02.a().s();
                f02.c(b10);
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(Object obj, Object obj2, int i10, Object obj3, int i11) {
        super(1);
        this.f18827a = i11;
        this.f18828b = obj;
        this.f18831e = obj2;
        this.f18830d = i10;
        this.f18829c = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(Object obj, Object obj2, Object obj3, int i10, int i11) {
        super(1);
        this.f18827a = i11;
        this.f18828b = obj;
        this.f18831e = obj2;
        this.f18829c = obj3;
        this.f18830d = i10;
    }
}
