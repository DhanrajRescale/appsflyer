package l;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.assetgro.stockgro.prod.R;
import d4.n1;
import d4.w0;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f23546a;

    /* renamed from: b, reason: collision with root package name */
    public final o f23547b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23548c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23549d;

    /* renamed from: e, reason: collision with root package name */
    public final int f23550e;

    /* renamed from: f, reason: collision with root package name */
    public View f23551f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f23553h;

    /* renamed from: i, reason: collision with root package name */
    public b0 f23554i;

    /* renamed from: j, reason: collision with root package name */
    public x f23555j;

    /* renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f23556k;

    /* renamed from: g, reason: collision with root package name */
    public int f23552g = 8388611;

    /* renamed from: l, reason: collision with root package name */
    public final y f23557l = new y(this, 0);

    public a0(int i10, int i11, Context context, View view, o oVar, boolean z10) {
        this.f23546a = context;
        this.f23547b = oVar;
        this.f23551f = view;
        this.f23548c = z10;
        this.f23549d = i10;
        this.f23550e = i11;
    }

    public final x a() {
        x h0Var;
        if (this.f23555j == null) {
            Context context = this.f23546a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            z.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                h0Var = new i(this.f23546a, this.f23551f, this.f23549d, this.f23550e, this.f23548c);
            } else {
                Context context2 = this.f23546a;
                o oVar = this.f23547b;
                h0Var = new h0(this.f23549d, this.f23550e, context2, this.f23551f, oVar, this.f23548c);
            }
            h0Var.n(this.f23547b);
            h0Var.t(this.f23557l);
            h0Var.p(this.f23551f);
            h0Var.i(this.f23554i);
            h0Var.q(this.f23553h);
            h0Var.r(this.f23552g);
            this.f23555j = h0Var;
        }
        return this.f23555j;
    }

    public final boolean b() {
        x xVar = this.f23555j;
        if (xVar != null && xVar.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f23555j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f23556k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z10, boolean z11) {
        x a10 = a();
        a10.u(z11);
        if (z10) {
            int i12 = this.f23552g;
            View view = this.f23551f;
            WeakHashMap weakHashMap = n1.f13788a;
            if ((Gravity.getAbsoluteGravity(i12, w0.d(view)) & 7) == 5) {
                i10 -= this.f23551f.getWidth();
            }
            a10.s(i10);
            a10.v(i11);
            int i13 = (int) ((this.f23546a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a10.f23699a = new Rect(i10 - i13, i11 - i13, i10 + i13, i11 + i13);
        }
        a10.f();
    }
}
