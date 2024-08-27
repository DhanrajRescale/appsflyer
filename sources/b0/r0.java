package b0;

import android.os.Build;
import android.view.View;
import d4.b3;
import d4.d3;
import d4.g2;
import d4.p2;
import java.util.List;

/* loaded from: classes.dex */
public final class r0 extends g2 implements Runnable, d4.d0, View.OnAttachStateChangeListener {

    /* renamed from: c, reason: collision with root package name */
    public final y1 f2983c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2984d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2985e;

    /* renamed from: f, reason: collision with root package name */
    public d3 f2986f;

    public r0(y1 y1Var) {
        super(!y1Var.f3061s ? 1 : 0);
        this.f2983c = y1Var;
    }

    @Override // d4.g2
    public final void a(p2 p2Var) {
        this.f2984d = false;
        this.f2985e = false;
        d3 d3Var = this.f2986f;
        if (p2Var.f13805a.a() != 0 && d3Var != null) {
            y1 y1Var = this.f2983c;
            y1Var.getClass();
            b3 b3Var = d3Var.f13731a;
            y1Var.f3060r.f(androidx.compose.foundation.layout.a.A(b3Var.f(8)));
            y1Var.f3059q.f(androidx.compose.foundation.layout.a.A(b3Var.f(8)));
            y1.a(y1Var, d3Var);
        }
        this.f2986f = null;
    }

    @Override // d4.g2
    public final void b() {
        this.f2984d = true;
        this.f2985e = true;
    }

    @Override // d4.g2
    public final d3 c(d3 d3Var, List list) {
        y1 y1Var = this.f2983c;
        y1.a(y1Var, d3Var);
        if (y1Var.f3061s) {
            return d3.f13730b;
        }
        return d3Var;
    }

    @Override // d4.g2
    public final tr.e d(tr.e eVar) {
        this.f2984d = false;
        return eVar;
    }

    @Override // d4.d0
    public final d3 g(View view, d3 d3Var) {
        this.f2986f = d3Var;
        y1 y1Var = this.f2983c;
        y1Var.getClass();
        b3 b3Var = d3Var.f13731a;
        y1Var.f3059q.f(androidx.compose.foundation.layout.a.A(b3Var.f(8)));
        if (this.f2984d) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f2985e) {
            y1Var.f3060r.f(androidx.compose.foundation.layout.a.A(b3Var.f(8)));
            y1.a(y1Var, d3Var);
        }
        if (y1Var.f3061s) {
            return d3.f13730b;
        }
        return d3Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f2984d) {
            this.f2984d = false;
            this.f2985e = false;
            d3 d3Var = this.f2986f;
            if (d3Var != null) {
                y1 y1Var = this.f2983c;
                y1Var.getClass();
                y1Var.f3060r.f(androidx.compose.foundation.layout.a.A(d3Var.f13731a.f(8)));
                y1.a(y1Var, d3Var);
                this.f2986f = null;
            }
        }
    }
}
