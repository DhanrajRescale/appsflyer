package m;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class t0 extends t3.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f25724e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f25725f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ WeakReference f25726g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z0 f25727h;

    public t0(z0 z0Var, int i10, int i11, WeakReference weakReference) {
        this.f25727h = z0Var;
        this.f25724e = i10;
        this.f25725f = i11;
        this.f25726g = weakReference;
    }

    @Override // t3.b
    public final void e(int i10) {
    }

    @Override // t3.b
    public final void f(Typeface typeface) {
        int i10;
        boolean z10;
        if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f25724e) != -1) {
            if ((this.f25725f & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            typeface = y0.a(typeface, i10, z10);
        }
        z0 z0Var = this.f25727h;
        if (z0Var.f25824m) {
            z0Var.f25823l = typeface;
            TextView textView = (TextView) this.f25726g.get();
            if (textView != null) {
                WeakHashMap weakHashMap = d4.n1.f13788a;
                if (d4.y0.b(textView)) {
                    textView.post(new u0(z0Var, textView, typeface, z0Var.f25821j));
                } else {
                    textView.setTypeface(typeface, z0Var.f25821j);
                }
            }
        }
    }
}
