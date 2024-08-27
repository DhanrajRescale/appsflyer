package hk;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes.dex */
public final class c implements ak.e0, ak.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18522a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f18523b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f18524c;

    public c(Bitmap bitmap, bk.d dVar) {
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        }
        this.f18523b = bitmap;
        if (dVar == null) {
            throw new NullPointerException("BitmapPool must not be null");
        }
        this.f18524c = dVar;
    }

    public static c e(Bitmap bitmap, bk.d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new c(bitmap, dVar);
    }

    @Override // ak.b0
    public final void a() {
        switch (this.f18522a) {
            case 0:
                ((Bitmap) this.f18523b).prepareToDraw();
                return;
            default:
                ak.e0 e0Var = (ak.e0) this.f18524c;
                if (e0Var instanceof ak.b0) {
                    ((ak.b0) e0Var).a();
                    return;
                }
                return;
        }
    }

    @Override // ak.e0
    public final void b() {
        int i10 = this.f18522a;
        Object obj = this.f18524c;
        switch (i10) {
            case 0:
                ((bk.d) obj).b((Bitmap) this.f18523b);
                return;
            default:
                ((ak.e0) obj).b();
                return;
        }
    }

    @Override // ak.e0
    public final int c() {
        switch (this.f18522a) {
            case 0:
                return rk.k.c((Bitmap) this.f18523b);
            default:
                return ((ak.e0) this.f18524c).c();
        }
    }

    @Override // ak.e0
    public final Class d() {
        switch (this.f18522a) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // ak.e0
    public final Object get() {
        int i10 = this.f18522a;
        Object obj = this.f18523b;
        switch (i10) {
            case 0:
                return (Bitmap) obj;
            default:
                return new BitmapDrawable((Resources) obj, (Bitmap) ((ak.e0) this.f18524c).get());
        }
    }

    public c(Resources resources, ak.e0 e0Var) {
        if (resources == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.f18523b = resources;
        if (e0Var == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.f18524c = e0Var;
    }
}
