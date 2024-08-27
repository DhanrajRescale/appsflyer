package ll;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.facebook.FacebookSdk;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;
import nl.l0;
import nl.n0;
import nl.t;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import vt.g0;
import wl.q;
import wl.r;
import wl.s;
import wl.x;

/* loaded from: classes.dex */
public final class e implements ln.b, kr.b, or.b, et.a, et.c {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f24906b;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24907a;

    public /* synthetic */ e(int i10) {
        this.f24907a = i10;
    }

    public static final Bundle a(String str) {
        ScheduledExecutorService scheduledExecutorService = x.f39298d;
        Bundle bundle = new Bundle();
        bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
        bundle.putString("0_auth_logger_id", str);
        bundle.putString("3_method", HttpUrl.FRAGMENT_ENCODE_SET);
        bundle.putString("2_result", HttpUrl.FRAGMENT_ENCODE_SET);
        bundle.putString("5_error_message", HttpUrl.FRAGMENT_ENCODE_SET);
        bundle.putString("4_error_code", HttpUrl.FRAGMENT_ENCODE_SET);
        bundle.putString("6_extras", HttpUrl.FRAGMENT_ENCODE_SET);
        return bundle;
    }

    public static mr.b d(byte[][] bArr, int i10) {
        int i11 = i10 * 2;
        int length = bArr[0].length + i11;
        int length2 = bArr.length + i11;
        mr.b bVar = new mr.b(length, length2);
        int[] iArr = bVar.f27988d;
        int length3 = iArr.length;
        for (int i12 = 0; i12 < length3; i12++) {
            iArr[i12] = 0;
        }
        int i13 = (length2 - i10) - 1;
        int i14 = 0;
        while (i14 < bArr.length) {
            byte[] bArr2 = bArr[i14];
            for (int i15 = 0; i15 < bArr[0].length; i15++) {
                if (bArr2[i15] == 1) {
                    bVar.b(i15 + i10, i13);
                }
            }
            i14++;
            i13--;
        }
        return bVar;
    }

    public static s f(q qVar, String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(str);
        }
        if (str2 != null) {
            arrayList.add(str2);
        }
        return new s(qVar, r.ERROR, null, TextUtils.join(": ", arrayList), str3);
    }

    public static t g(int i10) {
        t[] valuesCustom = t.valuesCustom();
        int length = valuesCustom.length;
        int i11 = 0;
        while (i11 < length) {
            t tVar = valuesCustom[i11];
            i11++;
            if (tVar.f28936a == i10) {
                return tVar;
            }
        }
        return t.Unknown;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dd A[Catch: all -> 0x00f3, Exception -> 0x00f6, TryCatch #8 {Exception -> 0x00f6, all -> 0x00f3, blocks: (B:31:0x00cf, B:33:0x00dd, B:35:0x00e1, B:38:0x00f8, B:40:0x0112, B:42:0x0121, B:44:0x0142, B:48:0x0154, B:50:0x0158, B:52:0x0161, B:75:0x014a, B:77:0x012b, B:79:0x013a, B:81:0x01c5, B:82:0x01cc), top: B:30:0x00cf }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0154 A[Catch: all -> 0x00f3, Exception -> 0x00f6, TryCatch #8 {Exception -> 0x00f6, all -> 0x00f3, blocks: (B:31:0x00cf, B:33:0x00dd, B:35:0x00e1, B:38:0x00f8, B:40:0x0112, B:42:0x0121, B:44:0x0142, B:48:0x0154, B:50:0x0158, B:52:0x0161, B:75:0x014a, B:77:0x012b, B:79:0x013a, B:81:0x01c5, B:82:0x01cc), top: B:30:0x00cf }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0158 A[Catch: all -> 0x00f3, Exception -> 0x00f6, TryCatch #8 {Exception -> 0x00f6, all -> 0x00f3, blocks: (B:31:0x00cf, B:33:0x00dd, B:35:0x00e1, B:38:0x00f8, B:40:0x0112, B:42:0x0121, B:44:0x0142, B:48:0x0154, B:50:0x0158, B:52:0x0161, B:75:0x014a, B:77:0x012b, B:79:0x013a, B:81:0x01c5, B:82:0x01cc), top: B:30:0x00cf }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0161 A[Catch: all -> 0x00f3, Exception -> 0x00f6, TRY_LEAVE, TryCatch #8 {Exception -> 0x00f6, all -> 0x00f3, blocks: (B:31:0x00cf, B:33:0x00dd, B:35:0x00e1, B:38:0x00f8, B:40:0x0112, B:42:0x0121, B:44:0x0142, B:48:0x0154, B:50:0x0158, B:52:0x0161, B:75:0x014a, B:77:0x012b, B:79:0x013a, B:81:0x01c5, B:82:0x01cc), top: B:30:0x00cf }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014a A[Catch: all -> 0x00f3, Exception -> 0x00f6, TryCatch #8 {Exception -> 0x00f6, all -> 0x00f3, blocks: (B:31:0x00cf, B:33:0x00dd, B:35:0x00e1, B:38:0x00f8, B:40:0x0112, B:42:0x0121, B:44:0x0142, B:48:0x0154, B:50:0x0158, B:52:0x0161, B:75:0x014a, B:77:0x012b, B:79:0x013a, B:81:0x01c5, B:82:0x01cc), top: B:30:0x00cf }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c5 A[Catch: all -> 0x00f3, Exception -> 0x00f6, TRY_ENTER, TryCatch #8 {Exception -> 0x00f6, all -> 0x00f3, blocks: (B:31:0x00cf, B:33:0x00dd, B:35:0x00e1, B:38:0x00f8, B:40:0x0112, B:42:0x0121, B:44:0x0142, B:48:0x0154, B:50:0x0158, B:52:0x0161, B:75:0x014a, B:77:0x012b, B:79:0x013a, B:81:0x01c5, B:82:0x01cc), top: B:30:0x00cf }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e2  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [nl.c] */
    /* JADX WARN: Type inference failed for: r11v10, types: [nl.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r18v0, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [nl.c, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static nl.c h(android.content.Context r18) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ll.e.h(android.content.Context):nl.c");
    }

    public static float i(um.k kVar, xm.d dVar) {
        float yChartMax = dVar.getYChartMax();
        float yChartMin = dVar.getYChartMin();
        um.j lineData = dVar.getLineData();
        if (kVar.f37273q > s0.g.f34069a && kVar.f37274r < s0.g.f34069a) {
            return s0.g.f34069a;
        }
        if (lineData.f37248a > s0.g.f34069a) {
            yChartMax = 0.0f;
        }
        if (lineData.f37249b < s0.g.f34069a) {
            yChartMin = 0.0f;
        }
        if (kVar.f37274r >= s0.g.f34069a) {
            return yChartMin;
        }
        return yChartMax;
    }

    public static boolean k(Context context) {
        Method r10 = n0.r("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (r10 == null) {
            return false;
        }
        Object v10 = n0.v(null, r10, context);
        if ((v10 instanceof Integer) && Intrinsics.a(v10, 0)) {
            return true;
        }
        return false;
    }

    public static boolean l(Context context) {
        String str;
        if (f24906b) {
            return false;
        }
        boolean z10 = true;
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                el.l.T0("MixpanelAPI.Message", "A default network has not been set so we cannot be certain whether we are offline");
            } else {
                boolean isConnectedOrConnecting = activeNetworkInfo.isConnectedOrConnecting();
                StringBuilder sb2 = new StringBuilder("ConnectivityManager says we ");
                if (isConnectedOrConnecting) {
                    str = "are";
                } else {
                    str = "are not";
                }
                sb2.append(str);
                sb2.append(" online");
                el.l.T0("MixpanelAPI.Message", sb2.toString());
                z10 = isConnectedOrConnecting;
            }
        } catch (SecurityException unused) {
            el.l.T0("MixpanelAPI.Message", "Don't have permission to check connectivity, will assume we are online");
        }
        return z10;
    }

    public static void m(Uri url) {
        Intrinsics.checkNotNullParameter(url, "url");
        o();
        wl.c.f39160d.lock();
        q.h hVar = wl.c.f39159c;
        if (hVar != null) {
            Bundle bundle = new Bundle();
            PendingIntent pendingIntent = (PendingIntent) hVar.f31454f;
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            try {
                ((a.c) ((a.e) hVar.f31451c)).i((a.b) hVar.f31452d, url, bundle);
            } catch (RemoteException unused) {
            }
        }
        wl.c.f39160d.unlock();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0017 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0127 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0122 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0144 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.io.OutputStream, java.io.BufferedOutputStream] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] n(java.lang.String r11, java.util.HashMap r12, javax.net.ssl.SSLSocketFactory r13) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ll.e.n(java.lang.String, java.util.HashMap, javax.net.ssl.SSLSocketFactory):byte[]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Binder, android.os.IInterface, q.c] */
    public static void o() {
        com.google.firebase.messaging.t tVar;
        wl.c.f39160d.lock();
        if (wl.c.f39159c == null && (tVar = wl.c.f39158b) != null) {
            ?? binder = new Binder();
            binder.attachInterface(binder, "android.support.customtabs.ICustomTabsCallback");
            new Handler(Looper.getMainLooper());
            q.h hVar = null;
            try {
                if (((a.c) ((a.e) tVar.f11782b)).j(binder)) {
                    hVar = new q.h((a.e) tVar.f11782b, binder, (ComponentName) tVar.f11783c);
                }
            } catch (RemoteException unused) {
            }
            wl.c.f39159c = hVar;
        }
        wl.c.f39160d.unlock();
    }

    public static byte[][] p(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int length = (bArr.length - i10) - 1;
            for (int i11 = 0; i11 < bArr[0].length; i11++) {
                bArr2[i11][length] = bArr[i10][i11];
            }
        }
        return bArr2;
    }

    public static void q() {
        File[] listFiles;
        if (n0.y()) {
            return;
        }
        File D = bl.j.D();
        int i10 = 1;
        if (D == null) {
            listFiles = new File[0];
        } else {
            listFiles = D.listFiles(new l0(i10));
            if (listFiles == null) {
                listFiles = new File[0];
            }
        }
        ArrayList arrayList = new ArrayList(listFiles.length);
        for (File file : listFiles) {
            arrayList.add(al.d.z0(file));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((pl.c) next).a()) {
                arrayList2.add(next);
            }
        }
        List M = g0.M(arrayList2, new t0.s(27));
        JSONArray jSONArray = new JSONArray();
        nu.f it2 = kotlin.ranges.d.k(0, Math.min(M.size(), 5)).iterator();
        while (it2.f29173c) {
            jSONArray.put(M.get(it2.b()));
        }
        bl.j.Y("crash_reports", jSONArray, new ql.b(i10, M));
    }

    public static byte[] r(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[UserMetadata.MAX_INTERNAL_KEY_SIZE];
        while (true) {
            int read = inputStream.read(bArr, 0, UserMetadata.MAX_INTERNAL_KEY_SIZE);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    @Override // et.c
    public final void b(Object obj) {
        yk.g.M((Throwable) obj);
    }

    @Override // or.b
    public final void c(or.c cVar) {
        boolean z10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) 0);
        while (true) {
            if (!cVar.b()) {
                break;
            }
            sb2.append(cVar.a());
            int i10 = cVar.f30266d + 1;
            cVar.f30266d = i10;
            if (zq.f.Y(cVar.f30263a, i10, 5) != 5) {
                cVar.f30267e = 0;
                break;
            }
        }
        int length = sb2.length() - 1;
        StringBuilder sb3 = cVar.f30265c;
        int length2 = sb3.length() + length + 1;
        cVar.c(length2);
        if (cVar.f30268f.f30276b - length2 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (cVar.b() || z10) {
            if (length <= 249) {
                sb2.setCharAt(0, (char) length);
            } else if (length <= 1555) {
                sb2.setCharAt(0, (char) ((length / 250) + 249));
                sb2.insert(1, (char) (length % 250));
            } else {
                throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
            }
        }
        int length3 = sb2.length();
        for (int i11 = 0; i11 < length3; i11++) {
            int length4 = (((sb3.length() + 1) * 149) % 255) + 1 + sb2.charAt(i11);
            if (length4 > 255) {
                length4 -= 256;
            }
            cVar.d((char) length4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x01db, code lost:
    
        r15 = r15 - r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0212 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0416 A[LOOP:12: B:219:0x0414->B:220:0x0416, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x095d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b2  */
    @Override // kr.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final mr.b e(java.lang.String r25, int r26, int r27, int r28, java.util.Map r29) {
        /*
            Method dump skipped, instructions count: 2420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ll.e.e(java.lang.String, int, int, int, java.util.Map):mr.b");
    }

    @Override // javax.inject.Provider
    public final Object get() {
        switch (this.f24907a) {
            case 15:
                return Integer.valueOf(pn.m.f31252d);
            default:
                return new rn.c(0);
        }
    }

    public final Uri j(Bundle bundle, String action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (Intrinsics.a(action, "oauth")) {
            return n0.b(nl.l.d(), "oauth/authorize", bundle);
        }
        return n0.b(nl.l.d(), FacebookSdk.getGraphApiVersion() + "/dialog/" + action, bundle);
    }

    @Override // et.a
    public final void run() {
    }

    public final String toString() {
        switch (this.f24907a) {
            case 28:
                return "EmptyAction";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10, int i11) {
        this(0);
        this.f24907a = i10;
        switch (i10) {
            case 1:
                this(1);
                return;
            case 2:
                this(2);
                return;
            case 3:
                this(3);
                return;
            case 4:
                this(4);
                return;
            case 5:
                this(5);
                return;
            case 6:
                this(6);
                return;
            case 7:
                this(7);
                return;
            case 8:
                this(8);
                return;
            case 9:
                this(9);
                return;
            case 10:
                this(10);
                return;
            case 11:
                this(11);
                return;
            case 12:
                this(12);
                return;
            case 13:
                this(13);
                return;
            default:
                switch (i10) {
                    case 25:
                        this(25);
                        return;
                    case 26:
                        this(26);
                        return;
                    case 27:
                        this(27);
                        return;
                    default:
                        return;
                }
        }
    }
}
