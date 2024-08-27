package ok;

import android.graphics.drawable.Drawable;
import rk.k;

/* loaded from: classes.dex */
public abstract class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public final int f30099a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30100b;

    /* renamed from: c, reason: collision with root package name */
    public nk.b f30101c;

    public c() {
        if (k.h(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            this.f30099a = Integer.MIN_VALUE;
            this.f30100b = Integer.MIN_VALUE;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
    }

    @Override // ok.g
    public final void b(f fVar) {
        ((nk.g) fVar).o(this.f30099a, this.f30100b);
    }

    @Override // ok.g
    public final void c(Drawable drawable) {
    }

    @Override // ok.g
    public final void d(f fVar) {
    }

    @Override // ok.g
    public final void e(nk.b bVar) {
        this.f30101c = bVar;
    }

    @Override // ok.g
    public final void f(Drawable drawable) {
    }

    @Override // ok.g
    public final nk.b g() {
        return this.f30101c;
    }

    @Override // lk.e
    public final void onDestroy() {
    }

    @Override // lk.e
    public final void onStart() {
    }

    @Override // lk.e
    public final void onStop() {
    }
}
