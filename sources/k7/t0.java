package k7;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes.dex */
public abstract class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final i1 f22577a;

    /* renamed from: b, reason: collision with root package name */
    public int f22578b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f22579c = new Rect();

    public t0(i1 i1Var) {
        this.f22577a = i1Var;
    }

    public static s0 a(i1 i1Var, int i10) {
        if (i10 != 0) {
            int i11 = 1;
            if (i10 == 1) {
                return new s0(i1Var, i11);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return new s0(i1Var, 0);
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public final int h() {
        if (Integer.MIN_VALUE == this.f22578b) {
            return 0;
        }
        return g() - this.f22578b;
    }

    public abstract int i(View view);

    public abstract int j(View view);

    public abstract void k(int i10);
}
