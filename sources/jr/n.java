package jr;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.FirebaseException;
import h.q0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f21631p = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f21632q = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a, reason: collision with root package name */
    public final Set f21633a;

    /* renamed from: c, reason: collision with root package name */
    public int f21635c;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f21638f;

    /* renamed from: g, reason: collision with root package name */
    public final i f21639g;

    /* renamed from: h, reason: collision with root package name */
    public final pp.g f21640h;

    /* renamed from: i, reason: collision with root package name */
    public final nq.d f21641i;

    /* renamed from: j, reason: collision with root package name */
    public final d f21642j;

    /* renamed from: k, reason: collision with root package name */
    public final Context f21643k;

    /* renamed from: l, reason: collision with root package name */
    public final String f21644l;

    /* renamed from: o, reason: collision with root package name */
    public final l f21647o;

    /* renamed from: b, reason: collision with root package name */
    public boolean f21634b = false;

    /* renamed from: m, reason: collision with root package name */
    public final Random f21645m = new Random();

    /* renamed from: n, reason: collision with root package name */
    public final Clock f21646n = DefaultClock.getInstance();

    /* renamed from: d, reason: collision with root package name */
    public boolean f21636d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21637e = false;

    public n(pp.g gVar, nq.d dVar, i iVar, d dVar2, Context context, String str, Set set, l lVar, ScheduledExecutorService scheduledExecutorService) {
        this.f21633a = set;
        this.f21638f = scheduledExecutorService;
        this.f21635c = Math.max(8 - lVar.b().f21622a, 1);
        this.f21640h = gVar;
        this.f21639g = iVar;
        this.f21641i = dVar;
        this.f21642j = dVar2;
        this.f21643k = context;
        this.f21644l = str;
        this.f21647o = lVar;
    }

    public static void b(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
                if (httpURLConnection.getErrorStream() != null) {
                    httpURLConnection.getErrorStream().close();
                }
            } catch (IOException unused) {
            }
        }
    }

    public static boolean d(int i10) {
        return i10 == 408 || i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504;
    }

    public static String f(InputStream inputStream) {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb2.append(readLine);
            }
        } catch (IOException unused) {
            if (sb2.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb2.toString();
    }

    public final synchronized boolean a() {
        boolean z10;
        if (!this.f21633a.isEmpty() && !this.f21634b && !this.f21636d) {
            if (!this.f21637e) {
                z10 = true;
            }
        }
        z10 = false;
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.net.HttpURLConnection c() {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jr.n.c():java.net.HttpURLConnection");
    }

    public final synchronized void e(long j10) {
        try {
            if (!a()) {
                return;
            }
            int i10 = this.f21635c;
            if (i10 > 0) {
                this.f21635c = i10 - 1;
                this.f21638f.schedule(new q0(this, 27), j10, TimeUnit.MILLISECONDS);
            } else if (!this.f21637e) {
                new FirebaseException("Unable to connect to the server. Check your connection and try again.");
                g();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void g() {
        Iterator it = this.f21633a.iterator();
        while (it.hasNext()) {
            ((m) it.next()).a();
        }
    }

    public final synchronized void h() {
        e(Math.max(0L, this.f21647o.b().f21623b.getTime() - new Date(this.f21646n.currentTimeMillis()).getTime()));
    }

    public final synchronized c i(HttpURLConnection httpURLConnection) {
        return new c(httpURLConnection, this.f21639g, this.f21642j, this.f21633a, new m(this), this.f21638f);
    }

    public final void j(Date date) {
        l lVar = this.f21647o;
        int i10 = lVar.b().f21622a + 1;
        int i11 = 8;
        if (i10 < 8) {
            i11 = i10;
        }
        lVar.d(i10, new Date(date.getTime() + (TimeUnit.MINUTES.toMillis(f21631p[i11 - 1]) / 2) + this.f21645m.nextInt((int) r2)));
    }
}
