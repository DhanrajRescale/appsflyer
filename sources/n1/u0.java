package n1;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u0 implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public int f28181a;

    /* renamed from: b, reason: collision with root package name */
    public float f28182b;

    /* renamed from: c, reason: collision with root package name */
    public float f28183c;

    /* renamed from: d, reason: collision with root package name */
    public float f28184d;

    /* renamed from: e, reason: collision with root package name */
    public float f28185e;

    /* renamed from: f, reason: collision with root package name */
    public float f28186f;

    /* renamed from: g, reason: collision with root package name */
    public float f28187g;

    /* renamed from: h, reason: collision with root package name */
    public long f28188h;

    /* renamed from: i, reason: collision with root package name */
    public long f28189i;

    /* renamed from: j, reason: collision with root package name */
    public float f28190j;

    /* renamed from: k, reason: collision with root package name */
    public float f28191k;

    /* renamed from: l, reason: collision with root package name */
    public float f28192l;

    /* renamed from: m, reason: collision with root package name */
    public float f28193m;

    /* renamed from: n, reason: collision with root package name */
    public long f28194n;

    /* renamed from: o, reason: collision with root package name */
    public x0 f28195o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f28196p;

    /* renamed from: q, reason: collision with root package name */
    public int f28197q;

    /* renamed from: r, reason: collision with root package name */
    public long f28198r;

    /* renamed from: s, reason: collision with root package name */
    public w2.b f28199s;

    @Override // w2.b
    public final float Y() {
        return this.f28199s.Y();
    }

    public final void a(float f10) {
        if (this.f28184d == f10) {
            return;
        }
        this.f28181a |= 4;
        this.f28184d = f10;
    }

    @Override // w2.b
    public final float b() {
        return this.f28199s.b();
    }

    public final void c(long j10) {
        if (!t.d(this.f28188h, j10)) {
            this.f28181a |= 64;
            this.f28188h = j10;
        }
    }

    public final void e(float f10) {
        if (this.f28190j == f10) {
            return;
        }
        this.f28181a |= 256;
        this.f28190j = f10;
    }

    public final void f(float f10) {
        if (this.f28191k == f10) {
            return;
        }
        this.f28181a |= 512;
        this.f28191k = f10;
    }

    public final void g(float f10) {
        if (this.f28192l == f10) {
            return;
        }
        this.f28181a |= UserMetadata.MAX_ATTRIBUTE_SIZE;
        this.f28192l = f10;
    }

    public final void i(float f10) {
        if (this.f28182b == f10) {
            return;
        }
        this.f28181a |= 1;
        this.f28182b = f10;
    }

    public final void j(float f10) {
        if (this.f28183c == f10) {
            return;
        }
        this.f28181a |= 2;
        this.f28183c = f10;
    }

    public final void l(float f10) {
        if (this.f28187g == f10) {
            return;
        }
        this.f28181a |= 32;
        this.f28187g = f10;
    }

    public final void m(x0 x0Var) {
        if (!Intrinsics.a(this.f28195o, x0Var)) {
            this.f28181a |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
            this.f28195o = x0Var;
        }
    }

    public final void n(long j10) {
        if (!t.d(this.f28189i, j10)) {
            this.f28181a |= 128;
            this.f28189i = j10;
        }
    }

    public final void q(long j10) {
        long j11 = this.f28194n;
        int i10 = b1.f28121c;
        if (j11 != j10) {
            this.f28181a |= 4096;
            this.f28194n = j10;
        }
    }

    public final void r(float f10) {
        if (this.f28185e == f10) {
            return;
        }
        this.f28181a |= 8;
        this.f28185e = f10;
    }

    public final void z(float f10) {
        if (this.f28186f == f10) {
            return;
        }
        this.f28181a |= 16;
        this.f28186f = f10;
    }
}
