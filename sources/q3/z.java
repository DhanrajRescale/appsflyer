package q3;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class z extends f0 {

    /* renamed from: e, reason: collision with root package name */
    public IconCompat f31653e;

    /* renamed from: f, reason: collision with root package name */
    public IconCompat f31654f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f31655g;

    @Override // q3.f0
    public final void b(r0 r0Var) {
        Bitmap a10;
        int intValue;
        int i10 = Build.VERSION.SDK_INT;
        Notification.BigPictureStyle c10 = w.c(w.b(r0Var.f31639b), this.f31612b);
        IconCompat iconCompat = this.f31653e;
        Context context = r0Var.f31638a;
        if (iconCompat != null) {
            if (i10 >= 31) {
                y.a(c10, v3.d.c(iconCompat, context));
            } else {
                int i11 = iconCompat.f1504a;
                if (i11 == -1) {
                    Object obj = iconCompat.f1505b;
                    if (i10 >= 28) {
                        intValue = v3.f.c(obj);
                    } else {
                        try {
                            intValue = ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
                        } catch (IllegalAccessException e10) {
                            Log.e("IconCompat", "Unable to get icon type " + obj, e10);
                        } catch (NoSuchMethodException e11) {
                            Log.e("IconCompat", "Unable to get icon type " + obj, e11);
                        } catch (InvocationTargetException e12) {
                            Log.e("IconCompat", "Unable to get icon type " + obj, e12);
                        }
                    }
                    i11 = intValue;
                }
                if (i11 == 1) {
                    IconCompat iconCompat2 = this.f31653e;
                    int i12 = iconCompat2.f1504a;
                    if (i12 == -1) {
                        Object obj2 = iconCompat2.f1505b;
                        if (obj2 instanceof Bitmap) {
                            a10 = (Bitmap) obj2;
                        } else {
                            a10 = null;
                        }
                    } else if (i12 == 1) {
                        a10 = (Bitmap) iconCompat2.f1505b;
                    } else if (i12 == 5) {
                        a10 = IconCompat.a((Bitmap) iconCompat2.f1505b, true);
                    } else {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    c10 = w.a(c10, a10);
                }
            }
        }
        if (this.f31655g) {
            IconCompat iconCompat3 = this.f31654f;
            if (iconCompat3 == null) {
                w.d(c10, null);
            } else {
                x.a(c10, v3.d.c(iconCompat3, context));
            }
        }
        if (this.f31614d) {
            w.e(c10, this.f31613c);
        }
        if (i10 >= 31) {
            y.c(c10, false);
            y.b(c10, null);
        }
    }

    @Override // q3.f0
    public final String c() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
