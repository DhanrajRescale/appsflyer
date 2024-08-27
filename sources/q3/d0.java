package q3;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.assetgro.stockgro.prod.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f31586a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f31590e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f31591f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f31592g;

    /* renamed from: h, reason: collision with root package name */
    public IconCompat f31593h;

    /* renamed from: i, reason: collision with root package name */
    public int f31594i;

    /* renamed from: j, reason: collision with root package name */
    public int f31595j;

    /* renamed from: l, reason: collision with root package name */
    public f0 f31597l;

    /* renamed from: m, reason: collision with root package name */
    public int f31598m;

    /* renamed from: n, reason: collision with root package name */
    public int f31599n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f31600o;

    /* renamed from: p, reason: collision with root package name */
    public String f31601p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f31602q;

    /* renamed from: s, reason: collision with root package name */
    public Bundle f31604s;

    /* renamed from: v, reason: collision with root package name */
    public String f31607v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f31608w;

    /* renamed from: x, reason: collision with root package name */
    public final Notification f31609x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f31610y;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f31587b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f31588c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f31589d = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f31596k = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f31603r = false;

    /* renamed from: t, reason: collision with root package name */
    public int f31605t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f31606u = 0;

    public d0(Context context, String str) {
        Notification notification = new Notification();
        this.f31609x = notification;
        this.f31586a = context;
        this.f31607v = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f31595j = 0;
        this.f31610y = new ArrayList();
        this.f31608w = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        if (charSequence == null) {
            return charSequence;
        }
        if (charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }

    public final Notification a() {
        Notification a10;
        Bundle bundle;
        r0 r0Var = new r0(this);
        f0 f0Var = r0Var.f31640c.f31597l;
        if (f0Var != null) {
            f0Var.b(r0Var);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            a10 = g0.a(r0Var.f31639b);
        } else {
            a10 = g0.a(r0Var.f31639b);
        }
        r0Var.f31640c.getClass();
        if (f0Var != null) {
            r0Var.f31640c.f31597l.getClass();
        }
        if (f0Var != null && (bundle = a10.extras) != null) {
            f0Var.a(bundle);
        }
        return a10;
    }

    public final void c(int i10, boolean z10) {
        Notification notification = this.f31609x;
        if (z10) {
            notification.flags = i10 | notification.flags;
        } else {
            notification.flags = (~i10) & notification.flags;
        }
    }

    public final void d(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f31586a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f1503k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f1505b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f31593h = iconCompat;
    }

    public final void e(f0 f0Var) {
        if (this.f31597l != f0Var) {
            this.f31597l = f0Var;
            if (f0Var.f31611a != this) {
                f0Var.f31611a = this;
                e(f0Var);
            }
        }
    }
}
