package x;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f39706a;

    /* renamed from: b, reason: collision with root package name */
    public final int f39707b;

    /* renamed from: c, reason: collision with root package name */
    public long f39708c = 0;

    /* renamed from: d, reason: collision with root package name */
    public EdgeEffect f39709d;

    /* renamed from: e, reason: collision with root package name */
    public EdgeEffect f39710e;

    /* renamed from: f, reason: collision with root package name */
    public EdgeEffect f39711f;

    /* renamed from: g, reason: collision with root package name */
    public EdgeEffect f39712g;

    /* renamed from: h, reason: collision with root package name */
    public EdgeEffect f39713h;

    /* renamed from: i, reason: collision with root package name */
    public EdgeEffect f39714i;

    /* renamed from: j, reason: collision with root package name */
    public EdgeEffect f39715j;

    /* renamed from: k, reason: collision with root package name */
    public EdgeEffect f39716k;

    public s0(Context context, int i10) {
        this.f39706a = context;
        this.f39707b = i10;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        float f10;
        boolean z10 = false;
        if (edgeEffect == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            f10 = t.f39720a.b(edgeEffect);
        } else {
            f10 = 0.0f;
        }
        if (f10 == s0.g.f34069a) {
            z10 = true;
        }
        return !z10;
    }

    public final EdgeEffect a() {
        EdgeEffect e1Var;
        int i10 = Build.VERSION.SDK_INT;
        Context context = this.f39706a;
        if (i10 >= 31) {
            e1Var = t.f39720a.a(context, null);
        } else {
            e1Var = new e1(context);
        }
        e1Var.setColor(this.f39707b);
        if (!w2.j.a(this.f39708c, 0L)) {
            long j10 = this.f39708c;
            e1Var.setSize((int) (j10 >> 32), (int) (j10 & 4294967295L));
        }
        return e1Var;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.f39710e;
        if (edgeEffect == null) {
            EdgeEffect a10 = a();
            this.f39710e = a10;
            return a10;
        }
        return edgeEffect;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f39711f;
        if (edgeEffect == null) {
            EdgeEffect a10 = a();
            this.f39711f = a10;
            return a10;
        }
        return edgeEffect;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.f39712g;
        if (edgeEffect == null) {
            EdgeEffect a10 = a();
            this.f39712g = a10;
            return a10;
        }
        return edgeEffect;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.f39709d;
        if (edgeEffect == null) {
            EdgeEffect a10 = a();
            this.f39709d = a10;
            return a10;
        }
        return edgeEffect;
    }
}
