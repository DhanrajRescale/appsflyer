package k7;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.api.Api;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class x1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public int f22615a;

    /* renamed from: b, reason: collision with root package name */
    public int f22616b;

    /* renamed from: c, reason: collision with root package name */
    public OverScroller f22617c;

    /* renamed from: d, reason: collision with root package name */
    public Interpolator f22618d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22619e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22620f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f22621g;

    public x1(RecyclerView recyclerView) {
        this.f22621g = recyclerView;
        l4.d dVar = RecyclerView.f2378c1;
        this.f22618d = dVar;
        this.f22619e = false;
        this.f22620f = false;
        this.f22617c = new OverScroller(recyclerView.getContext(), dVar);
    }

    public final void a(int i10, int i11) {
        RecyclerView recyclerView = this.f22621g;
        recyclerView.setScrollState(2);
        this.f22616b = 0;
        this.f22615a = 0;
        Interpolator interpolator = this.f22618d;
        l4.d dVar = RecyclerView.f2378c1;
        if (interpolator != dVar) {
            this.f22618d = dVar;
            this.f22617c = new OverScroller(recyclerView.getContext(), dVar);
        }
        this.f22617c.fling(0, 0, i10, i11, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        b();
    }

    public final void b() {
        if (this.f22619e) {
            this.f22620f = true;
            return;
        }
        RecyclerView recyclerView = this.f22621g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = d4.n1.f13788a;
        d4.v0.m(recyclerView, this);
    }

    public final void c(int i10, int i11, int i12, Interpolator interpolator) {
        boolean z10;
        int height;
        RecyclerView recyclerView = this.f22621g;
        if (i12 == Integer.MIN_VALUE) {
            int abs = Math.abs(i10);
            int abs2 = Math.abs(i11);
            if (abs > abs2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
            }
            if (!z10) {
                abs = abs2;
            }
            i12 = Math.min((int) (((abs / height) + 1.0f) * 300.0f), CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
        }
        int i13 = i12;
        if (interpolator == null) {
            interpolator = RecyclerView.f2378c1;
        }
        if (this.f22618d != interpolator) {
            this.f22618d = interpolator;
            this.f22617c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f22616b = 0;
        this.f22615a = 0;
        recyclerView.setScrollState(2);
        this.f22617c.startScroll(0, 0, i10, i11, i13);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean awakenScrollBars;
        boolean z10;
        boolean z11;
        boolean z12;
        int i14;
        RecyclerView recyclerView = this.f22621g;
        if (recyclerView.f2402n == null) {
            recyclerView.removeCallbacks(this);
            this.f22617c.abortAnimation();
            return;
        }
        this.f22620f = false;
        this.f22619e = true;
        recyclerView.p();
        OverScroller overScroller = this.f22617c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i15 = currX - this.f22615a;
            int i16 = currY - this.f22616b;
            this.f22615a = currX;
            this.f22616b = currY;
            int o10 = RecyclerView.o(i15, recyclerView.I, recyclerView.f2385e0, recyclerView.getWidth());
            int o11 = RecyclerView.o(i16, recyclerView.J, recyclerView.f2387f0, recyclerView.getHeight());
            int[] iArr = recyclerView.L0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean v10 = recyclerView.v(o10, o11, 1, iArr, null);
            int[] iArr2 = recyclerView.L0;
            if (v10) {
                o10 -= iArr2[0];
                o11 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.n(o10, o11);
            }
            if (recyclerView.f2400m != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.h0(o10, o11, iArr2);
                int i17 = iArr2[0];
                int i18 = iArr2[1];
                int i19 = o10 - i17;
                int i20 = o11 - i18;
                p0 p0Var = recyclerView.f2402n.f22408e;
                if (p0Var != null && !p0Var.f22525d && p0Var.f22526e) {
                    int b10 = recyclerView.f2424y0.b();
                    if (b10 == 0) {
                        p0Var.i();
                    } else if (p0Var.f22522a >= b10) {
                        p0Var.f22522a = b10 - 1;
                        p0Var.g(i17, i18);
                    } else {
                        p0Var.g(i17, i18);
                    }
                }
                i13 = i17;
                i10 = i19;
                i11 = i20;
                i12 = i18;
            } else {
                i10 = o10;
                i11 = o11;
                i12 = 0;
                i13 = 0;
            }
            if (!recyclerView.f2405p.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.L0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            int i21 = i12;
            recyclerView.w(i13, i12, i10, i11, null, 1, iArr3);
            int i22 = i10 - iArr2[0];
            int i23 = i11 - iArr2[1];
            if (i13 != 0 || i21 != 0) {
                recyclerView.x(i13, i21);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            if (overScroller.getCurrX() == overScroller.getFinalX()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (overScroller.getCurrY() == overScroller.getFinalY()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!overScroller.isFinished() && ((!z10 && i22 == 0) || (!z11 && i23 == 0))) {
                z12 = false;
            } else {
                z12 = true;
            }
            p0 p0Var2 = recyclerView.f2402n.f22408e;
            if ((p0Var2 == null || !p0Var2.f22525d) && z12) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i22 < 0) {
                        i14 = -currVelocity;
                    } else if (i22 > 0) {
                        i14 = currVelocity;
                    } else {
                        i14 = 0;
                    }
                    if (i23 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i23 <= 0) {
                        currVelocity = 0;
                    }
                    if (i14 < 0) {
                        recyclerView.z();
                        if (recyclerView.I.isFinished()) {
                            recyclerView.I.onAbsorb(-i14);
                        }
                    } else if (i14 > 0) {
                        recyclerView.A();
                        if (recyclerView.f2385e0.isFinished()) {
                            recyclerView.f2385e0.onAbsorb(i14);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.B();
                        if (recyclerView.J.isFinished()) {
                            recyclerView.J.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.y();
                        if (recyclerView.f2387f0.isFinished()) {
                            recyclerView.f2387f0.onAbsorb(currVelocity);
                        }
                    }
                    if (i14 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = d4.n1.f13788a;
                        d4.v0.k(recyclerView);
                    }
                }
                if (RecyclerView.f2376a1) {
                    p2.m mVar = recyclerView.f2422x0;
                    int[] iArr4 = (int[]) mVar.f30592e;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    mVar.f30591d = 0;
                }
            } else {
                b();
                d0 d0Var = recyclerView.f2420w0;
                if (d0Var != null) {
                    d0Var.a(recyclerView, i13, i21);
                }
            }
        }
        p0 p0Var3 = recyclerView.f2402n.f22408e;
        if (p0Var3 != null && p0Var3.f22525d) {
            p0Var3.g(0, 0);
        }
        this.f22619e = false;
        if (this.f22620f) {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = d4.n1.f13788a;
            d4.v0.m(recyclerView, this);
        } else {
            recyclerView.setScrollState(0);
            recyclerView.p0(1);
        }
    }
}
