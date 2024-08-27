package u5;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import b5.j1;
import b5.k1;
import b5.l1;
import e5.x;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import lp.o0;

/* loaded from: classes.dex */
public final class h extends l1 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public final SparseArray O;
    public final SparseBooleanArray P;

    public h(Context context) {
        f(context);
        h(context);
        this.O = new SparseArray();
        this.P = new SparseBooleanArray();
        d();
    }

    @Override // b5.l1
    public final void a(int i10) {
        super.a(i10);
    }

    @Override // b5.l1
    public final l1 c(int i10, int i11) {
        super.c(i10, i11);
        return this;
    }

    public final void d() {
        this.A = true;
        this.B = false;
        this.C = true;
        this.D = false;
        this.E = true;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = true;
        this.K = true;
        this.L = false;
        this.M = true;
        this.N = false;
    }

    public final void e(k1 k1Var) {
        j1 j1Var = k1Var.f3397a;
        a(j1Var.f3378c);
        this.f3430y.put(j1Var, k1Var);
    }

    public final void f(Context context) {
        CaptioningManager captioningManager;
        String locale;
        int i10 = x.f15050a;
        if (i10 >= 19) {
            if ((i10 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f3425t = 1088;
                Locale locale2 = captioningManager.getLocale();
                if (locale2 != null) {
                    if (i10 >= 21) {
                        locale = locale2.toLanguageTag();
                    } else {
                        locale = locale2.toString();
                    }
                    this.f3424s = o0.v(locale);
                }
            }
        }
    }

    public final void g(int i10) {
        this.f3431z.remove(Integer.valueOf(i10));
    }

    public final void h(Context context) {
        Display display;
        Point point;
        String y10;
        String[] split;
        DisplayManager displayManager;
        int i10 = x.f15050a;
        if (i10 >= 17 && (displayManager = (DisplayManager) context.getSystemService("display")) != null) {
            display = displayManager.getDisplay(0);
        } else {
            display = null;
        }
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && x.E(context)) {
            if (i10 < 28) {
                y10 = x.y("sys.display-size");
            } else {
                y10 = x.y("vendor.display-size");
            }
            if (!TextUtils.isEmpty(y10)) {
                try {
                    split = y10.trim().split("x", -1);
                } catch (NumberFormatException unused) {
                }
                if (split.length == 2) {
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    if (parseInt > 0 && parseInt2 > 0) {
                        point = new Point(parseInt, parseInt2);
                        c(point.x, point.y);
                    }
                }
                e5.m.c("Util", "Invalid display size: " + y10);
            }
            if ("Sony".equals(x.f15052c) && x.f15053d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                point = new Point(3840, 2160);
                c(point.x, point.y);
            }
        }
        point = new Point();
        if (i10 >= 23) {
            Display.Mode mode = display.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
        } else if (i10 >= 17) {
            display.getRealSize(point);
        } else {
            display.getSize(point);
        }
        c(point.x, point.y);
    }

    public h(i iVar) {
        b(iVar);
        this.A = iVar.A;
        this.B = iVar.B;
        this.C = iVar.C;
        this.D = iVar.D;
        this.E = iVar.E;
        this.F = iVar.F;
        this.G = iVar.G;
        this.H = iVar.H;
        this.I = iVar.I;
        this.J = iVar.J;
        this.K = iVar.X;
        this.L = iVar.Y;
        this.M = iVar.Z;
        this.N = iVar.f36790e0;
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray2 = iVar.f36791f0;
            if (i10 < sparseArray2.size()) {
                sparseArray.put(sparseArray2.keyAt(i10), new HashMap((Map) sparseArray2.valueAt(i10)));
                i10++;
            } else {
                this.O = sparseArray;
                this.P = iVar.f36792g0.clone();
                return;
            }
        }
    }

    public h() {
        this.O = new SparseArray();
        this.P = new SparseBooleanArray();
        d();
    }
}
