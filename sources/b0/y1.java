package b0;

import android.os.Build;
import android.view.View;
import com.assetgro.stockgro.prod.R;
import d4.b3;
import d4.d3;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class y1 {

    /* renamed from: v, reason: collision with root package name */
    public static final WeakHashMap f3042v = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final c f3043a = g0.a(4, "captionBar");

    /* renamed from: b, reason: collision with root package name */
    public final c f3044b;

    /* renamed from: c, reason: collision with root package name */
    public final c f3045c;

    /* renamed from: d, reason: collision with root package name */
    public final c f3046d;

    /* renamed from: e, reason: collision with root package name */
    public final c f3047e;

    /* renamed from: f, reason: collision with root package name */
    public final c f3048f;

    /* renamed from: g, reason: collision with root package name */
    public final c f3049g;

    /* renamed from: h, reason: collision with root package name */
    public final c f3050h;

    /* renamed from: i, reason: collision with root package name */
    public final c f3051i;

    /* renamed from: j, reason: collision with root package name */
    public final v1 f3052j;

    /* renamed from: k, reason: collision with root package name */
    public final t1 f3053k;

    /* renamed from: l, reason: collision with root package name */
    public final v1 f3054l;

    /* renamed from: m, reason: collision with root package name */
    public final v1 f3055m;

    /* renamed from: n, reason: collision with root package name */
    public final v1 f3056n;

    /* renamed from: o, reason: collision with root package name */
    public final v1 f3057o;

    /* renamed from: p, reason: collision with root package name */
    public final v1 f3058p;

    /* renamed from: q, reason: collision with root package name */
    public final v1 f3059q;

    /* renamed from: r, reason: collision with root package name */
    public final v1 f3060r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f3061s;

    /* renamed from: t, reason: collision with root package name */
    public int f3062t;

    /* renamed from: u, reason: collision with root package name */
    public final r0 f3063u;

    public y1(View view) {
        View view2;
        Object obj;
        c a10 = g0.a(128, "displayCutout");
        this.f3044b = a10;
        c a11 = g0.a(8, "ime");
        this.f3045c = a11;
        c a12 = g0.a(32, "mandatorySystemGestures");
        this.f3046d = a12;
        this.f3047e = g0.a(2, "navigationBars");
        this.f3048f = g0.a(1, "statusBars");
        c a13 = g0.a(7, "systemBars");
        this.f3049g = a13;
        c a14 = g0.a(16, "systemGestures");
        this.f3050h = a14;
        c a15 = g0.a(64, "tappableElement");
        this.f3051i = a15;
        v1 v1Var = new v1(new v0(0, 0, 0, 0), "waterfall");
        this.f3052j = v1Var;
        this.f3053k = new t1(new t1(new t1(a13, a11), a10), new t1(new t1(new t1(a15, a12), a14), v1Var));
        this.f3054l = g0.b(4, "captionBarIgnoringVisibility");
        this.f3055m = g0.b(2, "navigationBarsIgnoringVisibility");
        this.f3056n = g0.b(1, "statusBarsIgnoringVisibility");
        this.f3057o = g0.b(7, "systemBarsIgnoringVisibility");
        this.f3058p = g0.b(64, "tappableElementIgnoringVisibility");
        this.f3059q = g0.b(8, "imeAnimationTarget");
        this.f3060r = g0.b(8, "imeAnimationSource");
        Object parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        if (view2 != null) {
            obj = view2.getTag(R.id.consume_window_insets_tag);
        } else {
            obj = null;
        }
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        this.f3061s = bool != null ? bool.booleanValue() : true;
        this.f3063u = new r0(this);
    }

    public static void a(y1 y1Var, d3 d3Var) {
        u3.c cVar;
        y1Var.f3043a.f(d3Var, 0);
        y1Var.f3045c.f(d3Var, 0);
        y1Var.f3044b.f(d3Var, 0);
        y1Var.f3047e.f(d3Var, 0);
        y1Var.f3048f.f(d3Var, 0);
        y1Var.f3049g.f(d3Var, 0);
        y1Var.f3050h.f(d3Var, 0);
        y1Var.f3051i.f(d3Var, 0);
        y1Var.f3046d.f(d3Var, 0);
        y1Var.f3054l.f(androidx.compose.foundation.layout.a.A(d3Var.f13731a.g(4)));
        b3 b3Var = d3Var.f13731a;
        y1Var.f3055m.f(androidx.compose.foundation.layout.a.A(b3Var.g(2)));
        y1Var.f3056n.f(androidx.compose.foundation.layout.a.A(b3Var.g(1)));
        y1Var.f3057o.f(androidx.compose.foundation.layout.a.A(b3Var.g(7)));
        y1Var.f3058p.f(androidx.compose.foundation.layout.a.A(b3Var.g(64)));
        d4.m e10 = b3Var.e();
        if (e10 != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                cVar = u3.c.c(d4.l.b(e10.f13778a));
            } else {
                cVar = u3.c.f36703e;
            }
            y1Var.f3052j.f(androidx.compose.foundation.layout.a.A(cVar));
        }
        yq.b.m();
    }
}
