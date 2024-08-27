package k7;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final a1 f22651a = new Observable();

    /* renamed from: b, reason: collision with root package name */
    public boolean f22652b = false;

    /* renamed from: c, reason: collision with root package name */
    public y0 f22653c = y0.f22624a;

    public abstract int a();

    public long b(int i10) {
        return -1L;
    }

    public int c(int i10) {
        return 0;
    }

    public final void d() {
        this.f22651a.b();
    }

    public final void e(int i10) {
        this.f22651a.d(i10, 1, null);
    }

    public final void f(int i10, int i11) {
        this.f22651a.e(i10, i11);
    }

    public void g(RecyclerView recyclerView) {
    }

    public abstract void h(y1 y1Var, int i10);

    public abstract y1 i(int i10, RecyclerView recyclerView);

    public void j(RecyclerView recyclerView) {
    }

    public boolean k(y1 y1Var) {
        return false;
    }

    public void l(y1 y1Var) {
    }

    public void m(y1 y1Var) {
    }

    public void n(y1 y1Var) {
    }

    public final void o(b1 b1Var) {
        this.f22651a.registerObserver(b1Var);
    }
}
