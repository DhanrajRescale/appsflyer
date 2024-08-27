package m;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class s3 implements l.c0 {

    /* renamed from: a, reason: collision with root package name */
    public l.o f25718a;

    /* renamed from: b, reason: collision with root package name */
    public l.q f25719b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f25720c;

    public s3(Toolbar toolbar) {
        this.f25720c = toolbar;
    }

    @Override // l.c0
    public final void b(l.o oVar, boolean z10) {
    }

    @Override // l.c0
    public final boolean c(l.q qVar) {
        Toolbar toolbar = this.f25720c;
        toolbar.c();
        ViewParent parent = toolbar.f1117h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f1117h);
            }
            toolbar.addView(toolbar.f1117h);
        }
        View actionView = qVar.getActionView();
        toolbar.f1119i = actionView;
        this.f25719b = qVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f1119i);
            }
            t3 h10 = Toolbar.h();
            h10.f17573a = (toolbar.f1129n & 112) | 8388611;
            h10.f25736b = 2;
            toolbar.f1119i.setLayoutParams(h10);
            toolbar.addView(toolbar.f1119i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((t3) childAt.getLayoutParams()).f25736b != 2 && childAt != toolbar.f1107a) {
                toolbar.removeViewAt(childCount);
                toolbar.E.add(childAt);
            }
        }
        toolbar.requestLayout();
        qVar.C = true;
        qVar.f23676n.p(false);
        KeyEvent.Callback callback = toolbar.f1119i;
        if (callback instanceof k.c) {
            ((k.c) callback).c();
        }
        toolbar.x();
        return true;
    }

    @Override // l.c0
    public final void d(boolean z10) {
        if (this.f25719b != null) {
            l.o oVar = this.f25718a;
            if (oVar != null) {
                int size = oVar.f23641f.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f25718a.getItem(i10) == this.f25719b) {
                        return;
                    }
                }
            }
            m(this.f25719b);
        }
    }

    @Override // l.c0
    public final boolean e() {
        return false;
    }

    @Override // l.c0
    public final void g(Parcelable parcelable) {
    }

    @Override // l.c0
    public final int getId() {
        return 0;
    }

    @Override // l.c0
    public final void j(Context context, l.o oVar) {
        l.q qVar;
        l.o oVar2 = this.f25718a;
        if (oVar2 != null && (qVar = this.f25719b) != null) {
            oVar2.d(qVar);
        }
        this.f25718a = oVar;
    }

    @Override // l.c0
    public final Parcelable k() {
        return null;
    }

    @Override // l.c0
    public final boolean l(l.i0 i0Var) {
        return false;
    }

    @Override // l.c0
    public final boolean m(l.q qVar) {
        Toolbar toolbar = this.f25720c;
        KeyEvent.Callback callback = toolbar.f1119i;
        if (callback instanceof k.c) {
            ((k.c) callback).e();
        }
        toolbar.removeView(toolbar.f1119i);
        toolbar.removeView(toolbar.f1117h);
        toolbar.f1119i = null;
        ArrayList arrayList = toolbar.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f25719b = null;
        toolbar.requestLayout();
        qVar.C = false;
        qVar.f23676n.p(false);
        toolbar.x();
        return true;
    }
}
