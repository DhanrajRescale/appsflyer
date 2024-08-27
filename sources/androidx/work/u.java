package androidx.work;

import android.app.Dialog;
import android.content.res.AssetFileDescriptor;
import android.graphics.Color;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import c2.d1;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import n1.o0;
import n1.x0;
import nl.n0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class u implements a2.l, d1, xj.c, ek.k, ek.x, hk.d0, kk.a, lk.i, sk.c, qj.m, u9.i0, x0 {

    /* renamed from: b, reason: collision with root package name */
    public static u f2636b;

    /* renamed from: a, reason: collision with root package name */
    public int f2637a;

    public /* synthetic */ u(int i10) {
        this.f2637a = i10;
    }

    public static void A(String event, String str, float[] fArr) {
        kl.d dVar = kl.d.f23249a;
        if (!sl.a.b(kl.d.class)) {
            try {
                Intrinsics.checkNotNullParameter(event, "event");
                if (kl.d.f23251c.contains(event)) {
                    yk.m loggerImpl = new yk.m(FacebookSdk.getApplicationContext(), (String) null);
                    Intrinsics.checkNotNullParameter(loggerImpl, "loggerImpl");
                    if (!sl.a.b(loggerImpl)) {
                        try {
                            Bundle bundle = new Bundle();
                            bundle.putString("_is_suggested_event", "1");
                            bundle.putString("_button_text", str);
                            loggerImpl.d(event, bundle);
                            return;
                        } catch (Throwable th2) {
                            sl.a.a(loggerImpl, th2);
                            return;
                        }
                    }
                    return;
                }
            } catch (Throwable th3) {
                sl.a.a(kl.d.class, th3);
            }
        }
        kl.d dVar2 = kl.d.f23249a;
        if (!sl.a.b(kl.d.class)) {
            try {
                Intrinsics.checkNotNullParameter(event, "event");
                if (kl.d.f23252d.contains(event)) {
                    Bundle bundle2 = new Bundle();
                    try {
                        bundle2.putString("event_name", event);
                        JSONObject jSONObject = new JSONObject();
                        StringBuilder sb2 = new StringBuilder();
                        int length = fArr.length;
                        int i10 = 0;
                        while (i10 < length) {
                            float f10 = fArr[i10];
                            i10++;
                            sb2.append(f10);
                            sb2.append(",");
                        }
                        jSONObject.put("dense", sb2.toString());
                        jSONObject.put("button_text", str);
                        bundle2.putString("metadata", jSONObject.toString());
                        String str2 = xk.z.f40475j;
                        String format = String.format(Locale.US, "%s/suggested_events", Arrays.copyOf(new Object[]{FacebookSdk.getApplicationId()}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                        xk.z y10 = ek.e.y(null, format, null, null);
                        Intrinsics.checkNotNullParameter(bundle2, "<set-?>");
                        y10.f40482d = bundle2;
                        y10.c();
                    } catch (JSONException unused) {
                    }
                }
            } catch (Throwable th4) {
                sl.a.a(kl.d.class, th4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b1, code lost:
    
        r8 = new java.lang.String[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0117, code lost:
    
        r14 = "com.facebook.appevents.UserDataStore.internalUserData";
        r0 = nl.n0.H(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0121, code lost:
    
        if (sl.a.b(r2) == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0124, code lost:
    
        com.facebook.FacebookSdk.getExecutor().execute(new yk.v(r14, r0, r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0131, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0132, code lost:
    
        sl.a.a(r2, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void B(java.util.HashMap r14) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.u.B(java.util.HashMap):void");
    }

    public static String C(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        if (length >= 20) {
            sb2.append(str.substring(0, 20));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public static final boolean p(String pathID, String str) {
        HashSet hashSet = kl.f.f23258e;
        kl.b bVar = kl.b.f23243a;
        String str2 = null;
        if (!sl.a.b(kl.b.class)) {
            try {
                Intrinsics.checkNotNullParameter(pathID, "pathID");
                LinkedHashMap linkedHashMap = kl.b.f23244b;
                if (linkedHashMap.containsKey(pathID)) {
                    str2 = (String) linkedHashMap.get(pathID);
                }
            } catch (Throwable th2) {
                sl.a.a(kl.b.class, th2);
            }
        }
        if (str2 == null) {
            return false;
        }
        int i10 = 1;
        if (!Intrinsics.a(str2, "other")) {
            n0.Q(new yk.v(str2, str, i10));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void q(android.view.View r6, android.view.View r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "hostView"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "rootView"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "activityName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            int r0 = r6.hashCode()
            java.util.HashSet r1 = kl.f.f23258e
            java.lang.Class<kl.f> r1 = kl.f.class
            boolean r2 = sl.a.b(r1)
            r3 = 0
            if (r2 == 0) goto L20
        L1e:
            r2 = r3
            goto L28
        L20:
            java.util.HashSet r2 = kl.f.f23258e     // Catch: java.lang.Throwable -> L23
            goto L28
        L23:
            r2 = move-exception
            sl.a.a(r1, r2)
            goto L1e
        L28:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            boolean r2 = r2.contains(r4)
            if (r2 != 0) goto L9f
            cl.g r2 = cl.g.f8225a
            kl.f r2 = new kl.f
            r2.<init>(r6, r7, r8)
            java.lang.Class<cl.g> r7 = cl.g.class
            boolean r8 = sl.a.b(r7)
            if (r8 == 0) goto L42
            goto L8a
        L42:
            java.lang.String r8 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r8)     // Catch: java.lang.Throwable -> L60
            java.lang.String r8 = "android.view.View"
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.Throwable -> L60 java.lang.Throwable -> L62 java.lang.Exception -> L8a
            java.lang.String r4 = "mListenerInfo"
            java.lang.reflect.Field r8 = r8.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L60 java.lang.Throwable -> L62 java.lang.Exception -> L8a
            java.lang.String r4 = "android.view.View$ListenerInfo"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Throwable -> L60 java.lang.Throwable -> L63 java.lang.Exception -> L8a
            java.lang.String r5 = "mOnClickListener"
            java.lang.reflect.Field r4 = r4.getDeclaredField(r5)     // Catch: java.lang.Throwable -> L60 java.lang.Throwable -> L63 java.lang.Exception -> L8a
            goto L64
        L60:
            r6 = move-exception
            goto L87
        L62:
            r8 = r3
        L63:
            r4 = r3
        L64:
            if (r8 == 0) goto L83
            if (r4 != 0) goto L69
            goto L83
        L69:
            r5 = 1
            r8.setAccessible(r5)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L8a
            r4.setAccessible(r5)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L8a
            r8.setAccessible(r5)     // Catch: java.lang.Throwable -> L60 java.lang.IllegalAccessException -> L78 java.lang.Exception -> L8a
            java.lang.Object r8 = r8.get(r6)     // Catch: java.lang.Throwable -> L60 java.lang.IllegalAccessException -> L78 java.lang.Exception -> L8a
            goto L79
        L78:
            r8 = r3
        L79:
            if (r8 != 0) goto L7f
            r6.setOnClickListener(r2)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L8a
            goto L8a
        L7f:
            r4.set(r8, r2)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L8a
            goto L8a
        L83:
            r6.setOnClickListener(r2)     // Catch: java.lang.Throwable -> L60 java.lang.Exception -> L8a
            goto L8a
        L87:
            sl.a.a(r7, r6)
        L8a:
            boolean r6 = sl.a.b(r1)
            if (r6 == 0) goto L91
            goto L98
        L91:
            java.util.HashSet r3 = kl.f.f23258e     // Catch: java.lang.Throwable -> L94
            goto L98
        L94:
            r6 = move-exception
            sl.a.a(r1, r6)
        L98:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r3.add(r6)
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.u.q(android.view.View, android.view.View, java.lang.String):void");
    }

    public static ArrayList r(List requests, HttpURLConnection httpURLConnection, FacebookException facebookException) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        ArrayList arrayList = new ArrayList(vt.z.k(requests));
        Iterator it = requests.iterator();
        while (it.hasNext()) {
            arrayList.add(new xk.d0((xk.z) it.next(), httpURLConnection, new xk.q(facebookException)));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static xk.d0 s(xk.z r22, java.net.HttpURLConnection r23, java.lang.Object r24, java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.u.s(xk.z, java.net.HttpURLConnection, java.lang.Object, java.lang.Object):xk.d0");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList t(java.io.InputStream r10, java.net.HttpURLConnection r11, xk.c0 r12) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.u.t(java.io.InputStream, java.net.HttpURLConnection, xk.c0):java.util.ArrayList");
    }

    public static synchronized u w() {
        u uVar;
        synchronized (u.class) {
            try {
                if (f2636b == null) {
                    f2636b = new u(3);
                }
                uVar = f2636b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uVar;
    }

    public static Bundle y(cl.c cVar, View rootView, View hostView) {
        ArrayList n10;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        Bundle bundle = new Bundle();
        if (cVar == null) {
            return bundle;
        }
        List<cl.d> unmodifiableList = Collections.unmodifiableList(cVar.f8210c);
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(parameters)");
        if (unmodifiableList != null) {
            for (cl.d dVar : unmodifiableList) {
                String str = dVar.f8213b;
                String str2 = dVar.f8212a;
                if (str != null && str.length() > 0) {
                    bundle.putString(str2, dVar.f8213b);
                } else {
                    ArrayList arrayList = dVar.f8214c;
                    if (arrayList.size() > 0) {
                        if (Intrinsics.a(dVar.f8215d, "relative")) {
                            String simpleName = hostView.getClass().getSimpleName();
                            Intrinsics.checkNotNullExpressionValue(simpleName, "hostView.javaClass.simpleName");
                            n10 = ek.h.n(hostView, arrayList, 0, -1, simpleName);
                        } else {
                            String simpleName2 = rootView.getClass().getSimpleName();
                            Intrinsics.checkNotNullExpressionValue(simpleName2, "rootView.javaClass.simpleName");
                            n10 = ek.h.n(rootView, arrayList, 0, -1, simpleName2);
                        }
                        Iterator it = n10.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                bl.f fVar = (bl.f) it.next();
                                if (fVar.a() != null) {
                                    cl.g gVar = cl.g.f8225a;
                                    String i10 = cl.g.i(fVar.a());
                                    if (i10.length() > 0) {
                                        bundle.putString(str2, i10);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return bundle;
    }

    public void D(String str, String str2, Throwable... thArr) {
        if (this.f2637a <= 5) {
            if (thArr.length >= 1) {
                Log.w(str, str2, thArr[0]);
            } else {
                Log.w(str, str2);
            }
        }
    }

    @Override // ek.k
    public Class a() {
        return InputStream.class;
    }

    @Override // a2.l
    public long b(long j10, long j11) {
        switch (this.f2637a) {
            case 0:
                float max = Math.max(m1.f.e(j11) / m1.f.e(j10), m1.f.c(j11) / m1.f.c(j10));
                return androidx.compose.ui.layout.a.b(max, max);
            case 1:
                return androidx.compose.ui.layout.a.b(m1.f.e(j11) / m1.f.e(j10), m1.f.c(j11) / m1.f.c(j10));
            case 2:
            default:
                if (m1.f.e(j10) <= m1.f.e(j11) && m1.f.c(j10) <= m1.f.c(j11)) {
                    return androidx.compose.ui.layout.a.b(1.0f, 1.0f);
                }
                float min = Math.min(m1.f.e(j11) / m1.f.e(j10), m1.f.c(j11) / m1.f.c(j10));
                return androidx.compose.ui.layout.a.b(min, min);
            case 3:
                float e10 = m1.f.e(j11) / m1.f.e(j10);
                return androidx.compose.ui.layout.a.b(e10, e10);
            case 4:
                float min2 = Math.min(m1.f.e(j11) / m1.f.e(j10), m1.f.c(j11) / m1.f.c(j10));
                return androidx.compose.ui.layout.a.b(min2, min2);
        }
    }

    @Override // n1.x0
    public o0 d(long j10, w2.k kVar, w2.b bVar) {
        switch (this.f2637a) {
            case 0:
                float m02 = bVar.m0(x.k0.f39613a);
                return new n1.m0(new m1.d(s0.g.f34069a, -m02, m1.f.e(j10), m1.f.c(j10) + m02));
            default:
                float m03 = bVar.m0(x.k0.f39613a);
                return new n1.m0(new m1.d(-m03, s0.g.f34069a, m1.f.e(j10) + m03, m1.f.c(j10)));
        }
    }

    @Override // qj.m
    public void e(Dialog dialog) {
    }

    @Override // ek.x
    public ek.w f(ek.c0 c0Var) {
        switch (this.f2637a) {
            case 2:
                return new ek.e0(c0Var.a(Uri.class, ParcelFileDescriptor.class), 0);
            default:
                return new fk.b(c0Var.a(ek.l.class, InputStream.class));
        }
    }

    @Override // ek.k
    public Object g(File file) {
        return new FileInputStream(file);
    }

    @Override // xj.c
    public boolean h(Object obj, File file, xj.k kVar) {
        try {
            rk.a.b((ByteBuffer) obj, file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e10);
            }
            return false;
        }
    }

    @Override // u9.i0
    public Object i(v9.c cVar, float f10) {
        boolean z10;
        int i10;
        float f11;
        int i11;
        int i12;
        int argb;
        float d10;
        ArrayList arrayList = new ArrayList();
        int i13 = 1;
        if (cVar.x() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            cVar.a();
        }
        while (cVar.g()) {
            arrayList.add(Float.valueOf((float) cVar.l()));
        }
        int i14 = 4;
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(s0.g.f34069a));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.f2637a = 2;
        }
        if (z10) {
            cVar.c();
        }
        if (this.f2637a == -1) {
            this.f2637a = arrayList.size() / 4;
        }
        int i15 = this.f2637a;
        float[] fArr = new float[i15];
        int[] iArr = new int[i15];
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            i10 = this.f2637a * i14;
            if (i16 >= i10) {
                break;
            }
            int i19 = i16 / 4;
            double floatValue = ((Float) arrayList.get(i16)).floatValue();
            int i20 = i16 % 4;
            if (i20 != 0) {
                if (i20 != i13) {
                    if (i20 != 2) {
                        if (i20 == 3) {
                            iArr[i19] = Color.argb(255, i17, i18, (int) (floatValue * 255.0d));
                        }
                    } else {
                        i18 = (int) (floatValue * 255.0d);
                    }
                } else {
                    i17 = (int) (floatValue * 255.0d);
                }
            } else {
                if (i19 > 0) {
                    float f12 = (float) floatValue;
                    if (fArr[i19 - 1] >= f12) {
                        fArr[i19] = f12 + 0.01f;
                    }
                }
                fArr[i19] = (float) floatValue;
            }
            i16++;
            i13 = 1;
            i14 = 4;
        }
        r9.c cVar2 = new r9.c(fArr, iArr);
        if (arrayList.size() > i10) {
            int size = (arrayList.size() - i10) / 2;
            float[] fArr2 = new float[size];
            float[] fArr3 = new float[size];
            int i21 = 0;
            while (i10 < arrayList.size()) {
                if (i10 % 2 == 0) {
                    fArr2[i21] = ((Float) arrayList.get(i10)).floatValue();
                } else {
                    fArr3[i21] = ((Float) arrayList.get(i10)).floatValue();
                    i21++;
                }
                i10++;
            }
            float[] fArr4 = cVar2.f33466a;
            if (fArr4.length == 0) {
                fArr4 = fArr2;
            } else if (size != 0) {
                int length = fArr4.length + size;
                float[] fArr5 = new float[length];
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                for (int i25 = 0; i25 < length; i25++) {
                    float f13 = Float.NaN;
                    if (i23 < fArr4.length) {
                        f11 = fArr4[i23];
                    } else {
                        f11 = Float.NaN;
                    }
                    if (i24 < size) {
                        f13 = fArr2[i24];
                    }
                    if (!Float.isNaN(f13) && f11 >= f13) {
                        if (!Float.isNaN(f11) && f13 >= f11) {
                            fArr5[i25] = f11;
                            i23++;
                            i24++;
                            i22++;
                        } else {
                            fArr5[i25] = f13;
                            i24++;
                        }
                    } else {
                        fArr5[i25] = f11;
                        i23++;
                    }
                }
                if (i22 == 0) {
                    fArr4 = fArr5;
                } else {
                    fArr4 = Arrays.copyOf(fArr5, length - i22);
                }
            }
            int length2 = fArr4.length;
            int[] iArr2 = new int[length2];
            int i26 = 0;
            while (i26 < length2) {
                float f14 = fArr4[i26];
                int binarySearch = Arrays.binarySearch(fArr, f14);
                int binarySearch2 = Arrays.binarySearch(fArr2, f14);
                int[] iArr3 = cVar2.f33467b;
                if (binarySearch >= 0 && binarySearch2 <= 0) {
                    int i27 = iArr3[binarySearch];
                    if (size >= 2 && f14 > fArr2[0]) {
                        for (int i28 = 1; i28 < size; i28++) {
                            float f15 = fArr2[i28];
                            if (f15 >= f14 || i28 == size - 1) {
                                if (f15 <= f14) {
                                    d10 = fArr3[i28];
                                } else {
                                    int i29 = i28 - 1;
                                    float f16 = fArr2[i29];
                                    d10 = w9.e.d(fArr3[i29], fArr3[i28], (f14 - f16) / (f15 - f16));
                                }
                                argb = Color.argb((int) (d10 * 255.0f), Color.red(i27), Color.green(i27), Color.blue(i27));
                            }
                        }
                        throw new IllegalArgumentException("Unreachable code.");
                    }
                    argb = Color.argb((int) (fArr3[0] * 255.0f), Color.red(i27), Color.green(i27), Color.blue(i27));
                    iArr2[i26] = argb;
                    i11 = i15;
                } else {
                    if (binarySearch2 < 0) {
                        binarySearch2 = -(binarySearch2 + 1);
                    }
                    float f17 = fArr3[binarySearch2];
                    if (iArr3.length < 2 || f14 == fArr[0]) {
                        i11 = i15;
                        i12 = iArr3[0];
                    } else {
                        for (int i30 = 1; i30 < i15; i30++) {
                            float f18 = fArr[i30];
                            if (f18 >= f14 || i30 == i15 - 1) {
                                int i31 = i30 - 1;
                                float f19 = fArr[i31];
                                float f20 = (f14 - f19) / (f18 - f19);
                                int i32 = iArr3[i30];
                                int i33 = iArr3[i31];
                                i11 = i15;
                                i12 = Color.argb((int) (f17 * 255.0f), bl.j.y(Color.red(i33), f20, Color.red(i32)), bl.j.y(Color.green(i33), f20, Color.green(i32)), bl.j.y(Color.blue(i33), f20, Color.blue(i32)));
                            }
                        }
                        throw new IllegalArgumentException("Unreachable code.");
                    }
                    iArr2[i26] = i12;
                }
                i26++;
                i15 = i11;
            }
            return new r9.c(fArr4, iArr2);
        }
        return cVar2;
    }

    @Override // hk.d0
    public void j(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        switch (this.f2637a) {
            case 4:
                AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                return;
            default:
                mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                return;
        }
    }

    @Override // sk.c
    public void k(Object obj) {
        ((List) obj).clear();
    }

    @Override // kk.a
    public ak.e0 l(ak.e0 e0Var, xj.k kVar) {
        r4.b bVar;
        byte[] bArr;
        ByteBuffer asReadOnlyBuffer = ((wj.e) ((jk.c) e0Var.get()).f21422a.f21421a.f21439a).f39126d.asReadOnlyBuffer();
        int i10 = rk.a.f33931a;
        if (!asReadOnlyBuffer.isReadOnly() && asReadOnlyBuffer.hasArray()) {
            bVar = new r4.b(asReadOnlyBuffer.array(), asReadOnlyBuffer.arrayOffset(), asReadOnlyBuffer.limit());
        } else {
            bVar = null;
        }
        if (bVar != null && bVar.f33056b == 0 && bVar.f33057c == ((byte[]) bVar.f33058d).length) {
            bArr = asReadOnlyBuffer.array();
        } else {
            ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr2 = new byte[asReadOnlyBuffer2.limit()];
            asReadOnlyBuffer2.position(0);
            asReadOnlyBuffer2.get(bArr2);
            bArr = bArr2;
        }
        return new hk.z(bArr);
    }

    @Override // qj.m
    public void m(Dialog dialog) {
        switch (this.f2637a) {
            case 0:
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            default:
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
        }
    }

    @Override // ek.k
    public void n(Object obj) {
        ((InputStream) obj).close();
    }

    @Override // qj.m
    public void o() {
    }

    public void u(String str, String str2, Throwable... thArr) {
        if (this.f2637a <= 3) {
            if (thArr.length >= 1) {
                Log.d(str, str2, thArr[0]);
            } else {
                Log.d(str, str2);
            }
        }
    }

    public void v(String str, String str2, Throwable... thArr) {
        if (this.f2637a <= 6) {
            if (thArr.length >= 1) {
                Log.e(str, str2, thArr[0]);
            } else {
                Log.e(str, str2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044 A[Catch: all -> 0x002e, TRY_ENTER, TryCatch #3 {all -> 0x002e, blocks: (B:3:0x0001, B:8:0x0018, B:14:0x002a, B:15:0x0030, B:28:0x003d, B:21:0x0044, B:22:0x004b, B:33:0x0012, B:30:0x000e, B:11:0x0026, B:25:0x0039), top: B:2:0x0001, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018 A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #3 {all -> 0x002e, blocks: (B:3:0x0001, B:8:0x0018, B:14:0x002a, B:15:0x0030, B:28:0x003d, B:21:0x0044, B:22:0x004b, B:33:0x0012, B:30:0x000e, B:11:0x0026, B:25:0x0039), top: B:2:0x0001, inners: #0, #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized bl.h x() {
        /*
            r4 = this;
            monitor-enter(r4)
            androidx.work.u r0 = bl.h.f7101f     // Catch: java.lang.Throwable -> L2e
            java.lang.Class<bl.h> r0 = bl.h.class
            boolean r1 = sl.a.b(r0)     // Catch: java.lang.Throwable -> L2e
            r2 = 0
            if (r1 == 0) goto Le
        Lc:
            r0 = r2
            goto L16
        Le:
            bl.h r0 = bl.h.f7103h     // Catch: java.lang.Throwable -> L11
            goto L16
        L11:
            r1 = move-exception
            sl.a.a(r0, r1)     // Catch: java.lang.Throwable -> L2e
            goto Lc
        L16:
            if (r0 != 0) goto L30
            bl.h r0 = new bl.h     // Catch: java.lang.Throwable -> L2e
            r0.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.Class<bl.h> r1 = bl.h.class
            boolean r3 = sl.a.b(r1)     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L26
            goto L30
        L26:
            bl.h.f7103h = r0     // Catch: java.lang.Throwable -> L29
            goto L30
        L29:
            r0 = move-exception
            sl.a.a(r1, r0)     // Catch: java.lang.Throwable -> L2e
            goto L30
        L2e:
            r0 = move-exception
            goto L4c
        L30:
            java.lang.Class<bl.h> r0 = bl.h.class
            boolean r1 = sl.a.b(r0)     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L39
            goto L40
        L39:
            bl.h r2 = bl.h.f7103h     // Catch: java.lang.Throwable -> L3c
            goto L40
        L3c:
            r1 = move-exception
            sl.a.a(r0, r1)     // Catch: java.lang.Throwable -> L2e
        L40:
            if (r2 == 0) goto L44
            monitor-exit(r4)
            return r2
        L44:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2e
            throw r0     // Catch: java.lang.Throwable -> L2e
        L4c:
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.u.x():bl.h");
    }

    public void z(String str, String str2, Throwable... thArr) {
        if (this.f2637a <= 4) {
            if (thArr.length >= 1) {
                Log.i(str, str2, thArr[0]);
            } else {
                Log.i(str, str2);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i10, int i11) {
        this(11);
        this.f2637a = i10;
        switch (i10) {
            case 12:
                this(12);
                return;
            case 13:
                this(13);
                return;
            case 14:
                this(14);
                return;
            case 15:
                this(15);
                return;
            case 16:
                this(16);
                return;
            case 17:
                this(17);
                return;
            case 18:
                this(18);
                return;
            case 19:
                this(19);
                return;
            case 20:
                this(20);
                return;
            case 21:
                this(21);
                return;
            case 22:
                this(22);
                return;
            case 23:
                this(23);
                return;
            case 24:
                this(24);
                return;
            case 25:
                this(25);
                return;
            case 26:
                this(26);
                return;
            case 27:
                this(27);
                return;
            case 28:
                this(28);
                return;
            case 29:
                this(29);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u() {
        this(4);
        this.f2637a = 4;
    }
}
