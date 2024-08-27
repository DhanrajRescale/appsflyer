package k;

import android.view.View;
import android.view.animation.Interpolator;
import d4.b2;
import d4.c2;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    public Interpolator f21803c;

    /* renamed from: d, reason: collision with root package name */
    public c2 f21804d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21805e;

    /* renamed from: b, reason: collision with root package name */
    public long f21802b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final k f21806f = new k(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f21801a = new ArrayList();

    public final void a() {
        if (!this.f21805e) {
            return;
        }
        Iterator it = this.f21801a.iterator();
        while (it.hasNext()) {
            ((b2) it.next()).b();
        }
        this.f21805e = false;
    }

    public final void b() {
        View view;
        if (this.f21805e) {
            return;
        }
        Iterator it = this.f21801a.iterator();
        while (it.hasNext()) {
            b2 b2Var = (b2) it.next();
            long j10 = this.f21802b;
            if (j10 >= 0) {
                b2Var.c(j10);
            }
            Interpolator interpolator = this.f21803c;
            if (interpolator != null && (view = (View) b2Var.f13721a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f21804d != null) {
                b2Var.d(this.f21806f);
            }
            View view2 = (View) b2Var.f13721a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f21805e = true;
    }
}
