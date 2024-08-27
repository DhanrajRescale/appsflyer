package h;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class h {
    public TextView A;
    public TextView B;
    public View C;
    public ListAdapter D;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final boolean J;
    public final f K;

    /* renamed from: a, reason: collision with root package name */
    public final Context f17667a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f17668b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f17669c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17670d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f17671e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f17672f;

    /* renamed from: g, reason: collision with root package name */
    public AlertController$RecycleListView f17673g;

    /* renamed from: h, reason: collision with root package name */
    public View f17674h;

    /* renamed from: i, reason: collision with root package name */
    public int f17675i;

    /* renamed from: k, reason: collision with root package name */
    public Button f17677k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f17678l;

    /* renamed from: m, reason: collision with root package name */
    public Message f17679m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f17680n;

    /* renamed from: o, reason: collision with root package name */
    public Button f17681o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f17682p;

    /* renamed from: q, reason: collision with root package name */
    public Message f17683q;

    /* renamed from: r, reason: collision with root package name */
    public Drawable f17684r;

    /* renamed from: s, reason: collision with root package name */
    public Button f17685s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f17686t;

    /* renamed from: u, reason: collision with root package name */
    public Message f17687u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f17688v;

    /* renamed from: w, reason: collision with root package name */
    public NestedScrollView f17689w;

    /* renamed from: y, reason: collision with root package name */
    public Drawable f17691y;

    /* renamed from: z, reason: collision with root package name */
    public ImageView f17692z;

    /* renamed from: j, reason: collision with root package name */
    public boolean f17676j = false;

    /* renamed from: x, reason: collision with root package name */
    public int f17690x = 0;
    public int E = -1;
    public final b L = new b(this, 0);

    public h(Context context, g0 g0Var, Window window) {
        this.f17667a = context;
        this.f17668b = g0Var;
        this.f17669c = window;
        this.K = new f(g0Var);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, g.a.f16353e, R.attr.alertDialogStyle, 0);
        this.F = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.G = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.H = obtainStyledAttributes.getResourceId(7, 0);
        this.I = obtainStyledAttributes.getResourceId(3, 0);
        this.J = obtainStyledAttributes.getBoolean(6, true);
        this.f17670d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        g0Var.e().g(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static void b(View view, View view2, View view3) {
        int i10;
        int i11 = 4;
        if (view2 != null) {
            if (view.canScrollVertically(-1)) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            view2.setVisibility(i10);
        }
        if (view3 != null) {
            if (view.canScrollVertically(1)) {
                i11 = 0;
            }
            view3.setVisibility(i11);
        }
    }

    public static ViewGroup c(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void d(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message message;
        if (onClickListener != null) {
            message = this.K.obtainMessage(i10, onClickListener);
        } else {
            message = null;
        }
        if (i10 != -3) {
            if (i10 != -2) {
                if (i10 == -1) {
                    this.f17678l = charSequence;
                    this.f17679m = message;
                    this.f17680n = null;
                    return;
                }
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f17682p = charSequence;
            this.f17683q = message;
            this.f17684r = null;
            return;
        }
        this.f17686t = charSequence;
        this.f17687u = message;
        this.f17688v = null;
    }
}
