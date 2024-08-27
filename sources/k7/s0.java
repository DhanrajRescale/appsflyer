package k7;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class s0 extends t0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22566d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(i1 i1Var, int i10) {
        super(i1Var);
        this.f22566d = i10;
    }

    @Override // k7.t0
    public final int b(View view) {
        int i10 = this.f22566d;
        i1 i1Var = this.f22577a;
        switch (i10) {
            case 0:
                j1 j1Var = (j1) view.getLayoutParams();
                i1Var.getClass();
                return view.getRight() + ((j1) view.getLayoutParams()).f22431b.right + ((ViewGroup.MarginLayoutParams) j1Var).rightMargin;
            default:
                j1 j1Var2 = (j1) view.getLayoutParams();
                i1Var.getClass();
                return view.getBottom() + ((j1) view.getLayoutParams()).f22431b.bottom + ((ViewGroup.MarginLayoutParams) j1Var2).bottomMargin;
        }
    }

    @Override // k7.t0
    public final int c(View view) {
        int i10 = this.f22566d;
        i1 i1Var = this.f22577a;
        switch (i10) {
            case 0:
                j1 j1Var = (j1) view.getLayoutParams();
                i1Var.getClass();
                return i1.A(view) + ((ViewGroup.MarginLayoutParams) j1Var).leftMargin + ((ViewGroup.MarginLayoutParams) j1Var).rightMargin;
            default:
                j1 j1Var2 = (j1) view.getLayoutParams();
                i1Var.getClass();
                return i1.z(view) + ((ViewGroup.MarginLayoutParams) j1Var2).topMargin + ((ViewGroup.MarginLayoutParams) j1Var2).bottomMargin;
        }
    }

    @Override // k7.t0
    public final int d(View view) {
        int i10 = this.f22566d;
        i1 i1Var = this.f22577a;
        switch (i10) {
            case 0:
                j1 j1Var = (j1) view.getLayoutParams();
                i1Var.getClass();
                return (view.getLeft() - ((j1) view.getLayoutParams()).f22431b.left) - ((ViewGroup.MarginLayoutParams) j1Var).leftMargin;
            default:
                j1 j1Var2 = (j1) view.getLayoutParams();
                i1Var.getClass();
                return (view.getTop() - ((j1) view.getLayoutParams()).f22431b.top) - ((ViewGroup.MarginLayoutParams) j1Var2).topMargin;
        }
    }

    @Override // k7.t0
    public final int e() {
        int i10 = this.f22566d;
        i1 i1Var = this.f22577a;
        switch (i10) {
            case 0:
                return i1Var.f22417n - i1Var.F();
            default:
                return i1Var.f22418o - i1Var.D();
        }
    }

    @Override // k7.t0
    public final int f() {
        int i10 = this.f22566d;
        i1 i1Var = this.f22577a;
        switch (i10) {
            case 0:
                return i1Var.E();
            default:
                return i1Var.G();
        }
    }

    @Override // k7.t0
    public final int g() {
        int i10 = this.f22566d;
        i1 i1Var = this.f22577a;
        switch (i10) {
            case 0:
                return (i1Var.f22417n - i1Var.E()) - i1Var.F();
            default:
                return (i1Var.f22418o - i1Var.G()) - i1Var.D();
        }
    }

    @Override // k7.t0
    public final int i(View view) {
        int i10 = this.f22566d;
        Rect rect = this.f22579c;
        i1 i1Var = this.f22577a;
        switch (i10) {
            case 0:
                i1Var.K(view, rect);
                return rect.right;
            default:
                i1Var.K(view, rect);
                return rect.bottom;
        }
    }

    @Override // k7.t0
    public final int j(View view) {
        int i10 = this.f22566d;
        Rect rect = this.f22579c;
        i1 i1Var = this.f22577a;
        switch (i10) {
            case 0:
                i1Var.K(view, rect);
                return rect.left;
            default:
                i1Var.K(view, rect);
                return rect.top;
        }
    }

    @Override // k7.t0
    public final void k(int i10) {
        int i11 = this.f22566d;
        i1 i1Var = this.f22577a;
        switch (i11) {
            case 0:
                i1Var.Q(i10);
                return;
            default:
                i1Var.R(i10);
                return;
        }
    }

    public final int l(View view) {
        int i10 = this.f22566d;
        i1 i1Var = this.f22577a;
        switch (i10) {
            case 0:
                j1 j1Var = (j1) view.getLayoutParams();
                i1Var.getClass();
                return i1.z(view) + ((ViewGroup.MarginLayoutParams) j1Var).topMargin + ((ViewGroup.MarginLayoutParams) j1Var).bottomMargin;
            default:
                j1 j1Var2 = (j1) view.getLayoutParams();
                i1Var.getClass();
                return i1.A(view) + ((ViewGroup.MarginLayoutParams) j1Var2).leftMargin + ((ViewGroup.MarginLayoutParams) j1Var2).rightMargin;
        }
    }
}
