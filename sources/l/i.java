package l;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.assetgro.stockgro.prod.R;
import d4.n1;
import d4.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import m.k2;
import m.o2;

/* loaded from: classes.dex */
public final class i extends x implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public boolean A;

    /* renamed from: b, reason: collision with root package name */
    public final Context f23595b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23596c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23597d;

    /* renamed from: e, reason: collision with root package name */
    public final int f23598e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f23599f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f23600g;

    /* renamed from: j, reason: collision with root package name */
    public final e f23603j;

    /* renamed from: k, reason: collision with root package name */
    public final f f23604k;

    /* renamed from: o, reason: collision with root package name */
    public View f23608o;

    /* renamed from: p, reason: collision with root package name */
    public View f23609p;

    /* renamed from: q, reason: collision with root package name */
    public int f23610q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f23611r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f23612s;

    /* renamed from: t, reason: collision with root package name */
    public int f23613t;

    /* renamed from: u, reason: collision with root package name */
    public int f23614u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f23616w;

    /* renamed from: x, reason: collision with root package name */
    public b0 f23617x;

    /* renamed from: y, reason: collision with root package name */
    public ViewTreeObserver f23618y;

    /* renamed from: z, reason: collision with root package name */
    public PopupWindow.OnDismissListener f23619z;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f23601h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f23602i = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final e.l f23605l = new e.l(this, 4);

    /* renamed from: m, reason: collision with root package name */
    public int f23606m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f23607n = 0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f23615v = false;

    public i(Context context, View view, int i10, int i11, boolean z10) {
        this.f23603j = new e(this, r1);
        this.f23604k = new f(this, r1);
        this.f23595b = context;
        this.f23608o = view;
        this.f23597d = i10;
        this.f23598e = i11;
        this.f23599f = z10;
        WeakHashMap weakHashMap = n1.f13788a;
        this.f23610q = w0.d(view) != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f23596c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f23600g = new Handler();
    }

    @Override // l.g0
    public final boolean a() {
        ArrayList arrayList = this.f23602i;
        if (arrayList.size() <= 0 || !((h) arrayList.get(0)).f23572a.f25583z.isShowing()) {
            return false;
        }
        return true;
    }

    @Override // l.c0
    public final void b(o oVar, boolean z10) {
        int i10;
        ArrayList arrayList = this.f23602i;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                if (oVar == ((h) arrayList.get(i11)).f23573b) {
                    break;
                } else {
                    i11++;
                }
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 < 0) {
            return;
        }
        int i12 = i11 + 1;
        if (i12 < arrayList.size()) {
            ((h) arrayList.get(i12)).f23573b.c(false);
        }
        h hVar = (h) arrayList.remove(i11);
        hVar.f23573b.r(this);
        boolean z11 = this.A;
        o2 o2Var = hVar.f23572a;
        if (z11) {
            k2.b(o2Var.f25583z, null);
            o2Var.f25583z.setAnimationStyle(0);
        }
        o2Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f23610q = ((h) arrayList.get(size2 - 1)).f23574c;
        } else {
            View view = this.f23608o;
            WeakHashMap weakHashMap = n1.f13788a;
            if (w0.d(view) == 1) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            this.f23610q = i10;
        }
        if (size2 == 0) {
            dismiss();
            b0 b0Var = this.f23617x;
            if (b0Var != null) {
                b0Var.b(oVar, true);
            }
            ViewTreeObserver viewTreeObserver = this.f23618y;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    this.f23618y.removeGlobalOnLayoutListener(this.f23603j);
                }
                this.f23618y = null;
            }
            this.f23609p.removeOnAttachStateChangeListener(this.f23604k);
            this.f23619z.onDismiss();
            return;
        }
        if (z10) {
            ((h) arrayList.get(0)).f23573b.c(false);
        }
    }

    @Override // l.c0
    public final void d(boolean z10) {
        Iterator it = this.f23602i.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((h) it.next()).f23572a.f25560c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((l) adapter).notifyDataSetChanged();
        }
    }

    @Override // l.g0
    public final void dismiss() {
        ArrayList arrayList = this.f23602i;
        int size = arrayList.size();
        if (size > 0) {
            h[] hVarArr = (h[]) arrayList.toArray(new h[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                h hVar = hVarArr[i10];
                if (hVar.f23572a.f25583z.isShowing()) {
                    hVar.f23572a.dismiss();
                }
            }
        }
    }

    @Override // l.c0
    public final boolean e() {
        return false;
    }

    @Override // l.g0
    public final void f() {
        boolean z10;
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f23601h;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            x((o) it.next());
        }
        arrayList.clear();
        View view = this.f23608o;
        this.f23609p = view;
        if (view != null) {
            if (this.f23618y == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f23618y = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f23603j);
            }
            this.f23609p.addOnAttachStateChangeListener(this.f23604k);
        }
    }

    @Override // l.c0
    public final void g(Parcelable parcelable) {
    }

    @Override // l.g0
    public final ListView h() {
        ArrayList arrayList = this.f23602i;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((h) jr.h.l(arrayList, 1)).f23572a.f25560c;
    }

    @Override // l.c0
    public final void i(b0 b0Var) {
        this.f23617x = b0Var;
    }

    @Override // l.c0
    public final Parcelable k() {
        return null;
    }

    @Override // l.c0
    public final boolean l(i0 i0Var) {
        Iterator it = this.f23602i.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (i0Var == hVar.f23573b) {
                hVar.f23572a.f25560c.requestFocus();
                return true;
            }
        }
        if (i0Var.hasVisibleItems()) {
            n(i0Var);
            b0 b0Var = this.f23617x;
            if (b0Var != null) {
                b0Var.e(i0Var);
            }
            return true;
        }
        return false;
    }

    @Override // l.x
    public final void n(o oVar) {
        oVar.b(this, this.f23595b);
        if (a()) {
            x(oVar);
        } else {
            this.f23601h.add(oVar);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        h hVar;
        ArrayList arrayList = this.f23602i;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                hVar = (h) arrayList.get(i10);
                if (!hVar.f23572a.f25583z.isShowing()) {
                    break;
                } else {
                    i10++;
                }
            } else {
                hVar = null;
                break;
            }
        }
        if (hVar != null) {
            hVar.f23573b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i10 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // l.x
    public final void p(View view) {
        if (this.f23608o != view) {
            this.f23608o = view;
            int i10 = this.f23606m;
            WeakHashMap weakHashMap = n1.f13788a;
            this.f23607n = Gravity.getAbsoluteGravity(i10, w0.d(view));
        }
    }

    @Override // l.x
    public final void q(boolean z10) {
        this.f23615v = z10;
    }

    @Override // l.x
    public final void r(int i10) {
        if (this.f23606m != i10) {
            this.f23606m = i10;
            View view = this.f23608o;
            WeakHashMap weakHashMap = n1.f13788a;
            this.f23607n = Gravity.getAbsoluteGravity(i10, w0.d(view));
        }
    }

    @Override // l.x
    public final void s(int i10) {
        this.f23611r = true;
        this.f23613t = i10;
    }

    @Override // l.x
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f23619z = onDismissListener;
    }

    @Override // l.x
    public final void u(boolean z10) {
        this.f23616w = z10;
    }

    @Override // l.x
    public final void v(int i10) {
        this.f23612s = true;
        this.f23614u = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b4  */
    /* JADX WARN: Type inference failed for: r7v0, types: [m.o2, m.i2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(l.o r18) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l.i.x(l.o):void");
    }
}
