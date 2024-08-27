package k7;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class g1 implements h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22360a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i1 f22361b;

    public /* synthetic */ g1(i1 i1Var, int i10) {
        this.f22360a = i10;
        this.f22361b = i1Var;
    }

    public final int a(View view) {
        int i10 = this.f22360a;
        i1 i1Var = this.f22361b;
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

    public final int b(View view) {
        int i10 = this.f22360a;
        i1 i1Var = this.f22361b;
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
}
