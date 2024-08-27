package os;

import android.view.MotionEvent;
import android.view.View;
import ls.n0;

/* loaded from: classes2.dex */
public final class k implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public long f30344a = -1;

    /* renamed from: b, reason: collision with root package name */
    public long f30345b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f30346c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f30347d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f30348e = false;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0 f30349f;

    public k(n0 n0Var) {
        this.f30349f = n0Var;
    }

    public final void a() {
        this.f30345b = -1L;
        this.f30344a = -1L;
        this.f30346c = 0;
        this.f30347d = -1L;
        this.f30348e = false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 2) {
            a();
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        if (this.f30348e) {
                            this.f30345b = System.currentTimeMillis();
                        } else {
                            a();
                        }
                    }
                } else if (System.currentTimeMillis() - this.f30345b < 100) {
                    if (System.currentTimeMillis() - this.f30347d > 1000) {
                        a();
                    }
                    this.f30344a = System.currentTimeMillis();
                    this.f30348e = true;
                } else {
                    a();
                }
            } else if (System.currentTimeMillis() - this.f30345b < 100) {
                long currentTimeMillis = System.currentTimeMillis() - this.f30344a;
                n0 n0Var = this.f30349f;
                if (currentTimeMillis >= 2500) {
                    if (this.f30346c == 3) {
                        if (!n0Var.i()) {
                            n0Var.m("$ab_gesture1", null);
                        }
                        a();
                    }
                    this.f30346c = 0;
                } else {
                    this.f30347d = System.currentTimeMillis();
                    int i10 = this.f30346c;
                    if (i10 < 4) {
                        this.f30346c = i10 + 1;
                    } else if (i10 == 4) {
                        if (!n0Var.i()) {
                            n0Var.m("$ab_gesture2", null);
                        }
                        a();
                    } else {
                        a();
                    }
                }
            }
        } else {
            this.f30345b = System.currentTimeMillis();
        }
        return false;
    }
}
