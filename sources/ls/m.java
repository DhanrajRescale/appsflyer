package ls;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import com.mixpanel.android.util.ImageStore$CantGetImageException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: f, reason: collision with root package name */
    public static final JSONArray f25237f = new JSONArray();

    /* renamed from: a, reason: collision with root package name */
    public final d0 f25238a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f25239b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f25240c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ns.c f25241d;

    /* renamed from: e, reason: collision with root package name */
    public final b1 f25242e;

    public m(Context context, d0 d0Var) {
        this.f25239b = context;
        this.f25238a = d0Var;
        this.f25241d = new ns.c(context, "DecideChecker");
        this.f25242e = b1.a(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x02d5 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0125 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.firebase.messaging.u a(java.lang.String r10, java.lang.String r11, ll.e r12) {
        /*
            Method dump skipped, instructions count: 743
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ls.m.a(java.lang.String, java.lang.String, ll.e):com.google.firebase.messaging.u");
    }

    public final void b(ll.e eVar, String str) {
        String str2;
        n nVar = (n) this.f25240c.get(str);
        if (nVar != null) {
            synchronized (nVar) {
                str2 = nVar.f25244a;
            }
            try {
                com.google.firebase.messaging.u a10 = a(nVar.f25245b, str2, eVar);
                if (a10 != null) {
                    nVar.b((List) a10.f11787b, (List) a10.f11788c, (JSONArray) a10.f11789d, (JSONArray) a10.f11790e, a10.f11786a, (JSONArray) a10.f11791f);
                }
            } catch (l e10) {
                el.l.N("MixpanelAPI.DChecker", e10.getMessage(), e10);
            }
        }
    }

    public final void c(Iterator it) {
        Bitmap bitmap;
        while (it.hasNext()) {
            a0 a0Var = (a0) it.next();
            String d10 = a0.d(a0Var.f25117h, "@2x");
            String str = a0Var.f25117h;
            String[] strArr = {d10, str};
            Display defaultDisplay = ((WindowManager) this.f25239b.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            int i10 = point.x;
            if (a0Var.b() == z.f25368b && i10 >= 720) {
                strArr = new String[]{a0.d(str, "@4x"), a0.d(str, "@2x"), str};
            }
            int length = strArr.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    String str2 = strArr[i11];
                    try {
                        bitmap = this.f25241d.a(str2);
                        break;
                    } catch (ImageStore$CantGetImageException e10) {
                        el.l.U0("MixpanelAPI.DChecker", "Can't load image " + str2 + " for a notification", e10);
                        i11++;
                    }
                } else {
                    bitmap = null;
                    break;
                }
            }
            if (bitmap == null) {
                el.l.l0("MixpanelAPI.DChecker", "Could not retrieve image for notification " + a0Var.f25112c + ", will not show the notification.");
                it.remove();
            } else {
                a0Var.f25119j = bitmap;
            }
        }
    }
}
