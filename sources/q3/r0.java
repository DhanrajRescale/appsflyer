package q3;

import android.app.Notification;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.applinks.AppLinkData;
import java.util.ArrayList;
import java.util.Iterator;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f31638a;

    /* renamed from: b, reason: collision with root package name */
    public final Notification.Builder f31639b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f31640c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f31641d;

    public r0(d0 d0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        Icon c10;
        int i10;
        Bundle bundle;
        int i11;
        ArrayList arrayList;
        Icon icon;
        Bundle bundle2;
        int i12;
        new ArrayList();
        this.f31641d = new Bundle();
        this.f31640c = d0Var;
        Context context = d0Var.f31586a;
        this.f31638a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f31639b = n0.a(context, d0Var.f31607v);
        } else {
            this.f31639b = new Notification.Builder(d0Var.f31586a);
        }
        Notification notification = d0Var.f31609x;
        Notification.Builder lights = this.f31639b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        if ((notification.flags & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z10);
        if ((notification.flags & 8) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z11);
        if ((notification.flags & 16) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        onlyAlertOnce.setAutoCancel(z12).setDefaults(notification.defaults).setContentTitle(d0Var.f31590e).setContentText(d0Var.f31591f).setContentInfo(null).setContentIntent(d0Var.f31592g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(d0Var.f31594i).setProgress(d0Var.f31598m, d0Var.f31599n, d0Var.f31600o);
        Notification.Builder builder = this.f31639b;
        IconCompat iconCompat = d0Var.f31593h;
        if (iconCompat == null) {
            c10 = null;
        } else {
            c10 = v3.d.c(iconCompat, context);
        }
        l0.b(builder, c10);
        g0.b(g0.d(g0.c(this.f31639b, null), false), d0Var.f31595j);
        Iterator it = d0Var.f31587b.iterator();
        while (it.hasNext()) {
            v vVar = (v) it.next();
            if (vVar.f31645b == null && (i12 = vVar.f31648e) != 0) {
                vVar.f31645b = IconCompat.b(HttpUrl.FRAGMENT_ENCODE_SET, i12);
            }
            IconCompat iconCompat2 = vVar.f31645b;
            if (iconCompat2 != null) {
                icon = v3.d.c(iconCompat2, null);
            } else {
                icon = null;
            }
            Notification.Action.Builder a10 = l0.a(icon, vVar.f31649f, vVar.f31650g);
            Bundle bundle3 = vVar.f31644a;
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            boolean z13 = vVar.f31646c;
            bundle2.putBoolean("android.support.allowGeneratedReplies", z13);
            int i13 = Build.VERSION.SDK_INT;
            m0.a(a10, z13);
            bundle2.putInt("android.support.action.semanticAction", 0);
            if (i13 >= 28) {
                o0.b(a10, 0);
            }
            if (i13 >= 29) {
                p0.c(a10, false);
            }
            if (i13 >= 31) {
                q0.a(a10, false);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", vVar.f31647d);
            j0.b(a10, bundle2);
            j0.a(this.f31639b, j0.d(a10));
        }
        Bundle bundle4 = d0Var.f31604s;
        if (bundle4 != null) {
            this.f31641d.putAll(bundle4);
        }
        int i14 = Build.VERSION.SDK_INT;
        h0.a(this.f31639b, d0Var.f31596k);
        j0.i(this.f31639b, d0Var.f31603r);
        j0.g(this.f31639b, d0Var.f31601p);
        j0.j(this.f31639b, null);
        j0.h(this.f31639b, d0Var.f31602q);
        k0.b(this.f31639b, null);
        k0.c(this.f31639b, d0Var.f31605t);
        k0.f(this.f31639b, d0Var.f31606u);
        k0.d(this.f31639b, null);
        k0.e(this.f31639b, notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = d0Var.f31588c;
        ArrayList arrayList3 = d0Var.f31610y;
        if (i14 < 28) {
            if (arrayList2 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList2.size());
                Iterator it2 = arrayList2.iterator();
                if (it2.hasNext()) {
                    a3.a.u(it2.next());
                    throw null;
                }
            }
            if (arrayList != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList;
                } else {
                    t.g gVar = new t.g(arrayList3.size() + arrayList.size());
                    gVar.addAll(arrayList);
                    gVar.addAll(arrayList3);
                    arrayList3 = new ArrayList(gVar);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                k0.a(this.f31639b, (String) it3.next());
            }
        }
        ArrayList arrayList4 = d0Var.f31589d;
        if (arrayList4.size() > 0) {
            if (d0Var.f31604s == null) {
                d0Var.f31604s = new Bundle();
            }
            Bundle bundle5 = d0Var.f31604s.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                String num = Integer.toString(i15);
                v vVar2 = (v) arrayList4.get(i15);
                Object obj = s0.f31642a;
                Bundle bundle8 = new Bundle();
                if (vVar2.f31645b == null && (i11 = vVar2.f31648e) != 0) {
                    vVar2.f31645b = IconCompat.b(HttpUrl.FRAGMENT_ENCODE_SET, i11);
                }
                IconCompat iconCompat3 = vVar2.f31645b;
                if (iconCompat3 != null) {
                    i10 = iconCompat3.c();
                } else {
                    i10 = 0;
                }
                bundle8.putInt("icon", i10);
                bundle8.putCharSequence("title", vVar2.f31649f);
                bundle8.putParcelable("actionIntent", vVar2.f31650g);
                Bundle bundle9 = vVar2.f31644a;
                if (bundle9 != null) {
                    bundle = new Bundle(bundle9);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", vVar2.f31646c);
                bundle8.putBundle(AppLinkData.ARGUMENTS_EXTRAS_KEY, bundle);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", vVar2.f31647d);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(num, bundle8);
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (d0Var.f31604s == null) {
                d0Var.f31604s = new Bundle();
            }
            d0Var.f31604s.putBundle("android.car.EXTENSIONS", bundle5);
            this.f31641d.putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i16 = Build.VERSION.SDK_INT;
        i0.a(this.f31639b, d0Var.f31604s);
        m0.e(this.f31639b, null);
        if (i16 >= 26) {
            n0.b(this.f31639b, 0);
            n0.e(this.f31639b, null);
            n0.f(this.f31639b, null);
            n0.g(this.f31639b, 0L);
            n0.d(this.f31639b, 0);
            if (!TextUtils.isEmpty(d0Var.f31607v)) {
                this.f31639b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i16 >= 28) {
            Iterator it4 = arrayList2.iterator();
            if (it4.hasNext()) {
                a3.a.u(it4.next());
                throw null;
            }
        }
        if (i16 >= 29) {
            p0.a(this.f31639b, d0Var.f31608w);
            p0.b(this.f31639b, null);
        }
    }
}
