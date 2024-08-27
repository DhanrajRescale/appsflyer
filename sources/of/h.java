package of;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public long f30002a;

    /* renamed from: b, reason: collision with root package name */
    public long f30003b;

    /* renamed from: c, reason: collision with root package name */
    public long f30004c;

    /* renamed from: d, reason: collision with root package name */
    public long f30005d;

    /* renamed from: e, reason: collision with root package name */
    public long f30006e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f30007f;

    /* renamed from: g, reason: collision with root package name */
    public final x9.c f30008g;

    public h(Context context, a aVar) {
        x9.c cVar = new x9.c(context.getSharedPreferences("com.google.android.vending.licensing.ServerManagedPolicy", 0), aVar);
        this.f30008g = cVar;
        this.f30007f = Integer.parseInt(cVar.k("lastResponse", Integer.toString(291)));
        this.f30002a = Long.parseLong(cVar.k("validityTimestamp", "0"));
        this.f30003b = Long.parseLong(cVar.k("retryUntil", "0"));
        this.f30004c = Long.parseLong(cVar.k("maxRetries", "0"));
        this.f30005d = Long.parseLong(cVar.k("retryCount", "0"));
        cVar.k("licensingUrl", null);
    }

    public final boolean a() {
        long currentTimeMillis = System.currentTimeMillis();
        int i10 = this.f30007f;
        if (i10 == 256) {
            if (currentTimeMillis <= this.f30002a) {
                return true;
            }
            return false;
        }
        if (i10 != 291 || currentTimeMillis >= this.f30006e + 60000) {
            return false;
        }
        if (currentTimeMillis <= this.f30003b || this.f30005d <= this.f30004c) {
            return true;
        }
        return false;
    }

    public final void b(int i10, g gVar) {
        x9.c cVar = this.f30008g;
        if (i10 != 291) {
            this.f30005d = 0L;
            cVar.p("retryCount", Long.toString(0L));
        } else {
            long j10 = this.f30005d + 1;
            this.f30005d = j10;
            cVar.p("retryCount", Long.toString(j10));
        }
        HashMap hashMap = new HashMap();
        if (gVar != null) {
            try {
                dp.b.r(new URI("?" + gVar.f30001g), hashMap);
            } catch (URISyntaxException unused) {
                Log.w("ServerManagedPolicy", "Invalid syntax error while decoding extras data from server.");
            }
        }
        if (i10 == 256) {
            this.f30007f = i10;
            cVar.p("licensingUrl", null);
            e((String) hashMap.get("VT"));
            d((String) hashMap.get("GT"));
            c((String) hashMap.get("GR"));
        } else if (i10 == 561) {
            e("0");
            d("0");
            c("0");
            cVar.p("licensingUrl", (String) hashMap.get("LU"));
        }
        this.f30006e = System.currentTimeMillis();
        this.f30007f = i10;
        cVar.p("lastResponse", Integer.toString(i10));
        SharedPreferences.Editor editor = (SharedPreferences.Editor) cVar.f40140d;
        if (editor != null) {
            editor.commit();
            cVar.f40140d = null;
        }
    }

    public final void c(String str) {
        Long l10;
        try {
            l10 = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            Log.w("ServerManagedPolicy", "Licence retry count (GR) missing, grace period disabled");
            l10 = 0L;
            str = "0";
        }
        this.f30004c = l10.longValue();
        this.f30008g.p("maxRetries", str);
    }

    public final void d(String str) {
        Long l10;
        try {
            l10 = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            Log.w("ServerManagedPolicy", "License retry timestamp (GT) missing, grace period disabled");
            l10 = 0L;
            str = "0";
        }
        this.f30003b = l10.longValue();
        this.f30008g.p("retryUntil", str);
    }

    public final void e(String str) {
        Long valueOf;
        try {
            valueOf = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            Log.w("ServerManagedPolicy", "License validity timestamp (VT) missing, caching for a minute");
            valueOf = Long.valueOf(System.currentTimeMillis() + 60000);
            str = Long.toString(valueOf.longValue());
        }
        this.f30002a = valueOf.longValue();
        this.f30008g.p("validityTimestamp", str);
    }
}
