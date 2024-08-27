package da;

import ak.e0;
import ak.i0;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.DisplayMetrics;
import android.util.Log;
import bk.j;
import bk.k;
import cn.h;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import com.firebase.ui.auth.FirebaseUiException;
import com.firebase.ui.auth.data.model.IntentRequiredException;
import com.firebase.ui.auth.ui.email.WelcomeBackEmailLinkPrompt;
import com.firebase.ui.auth.ui.email.WelcomeBackPasswordPrompt;
import com.firebase.ui.auth.ui.idp.WelcomeBackIdpPrompt;
import com.firebase.ui.auth.viewmodel.email.EmailProviderResponseHandler;
import com.github.mikephil.charting.charts.PieChart;
import com.google.android.gms.tasks.OnSuccessListener;
import ek.c0;
import ek.v;
import hk.m;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Provider;
import okhttp3.HttpUrl;
import q0.g0;
import s0.g;
import t.j0;
import xj.n;

/* loaded from: classes.dex */
public final class d implements yj.d, j, n, m, OnSuccessListener, wm.d, ln.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14275a;

    /* renamed from: b, reason: collision with root package name */
    public Object f14276b;

    /* renamed from: c, reason: collision with root package name */
    public Object f14277c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ d() {
        /*
            r1 = this;
            r0 = 0
            r1.f14275a = r0
            r1.<init>(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: da.d.<init>():void");
    }

    public static String p(int i10, int i11, Bitmap.Config config) {
        StringBuilder q10 = e.q("[", i10, "x", i11, "], ");
        q10.append(config);
        return q10.toString();
    }

    @Override // bk.j
    public final Bitmap a() {
        return (Bitmap) ((d) this.f14277c).x();
    }

    @Override // bk.j
    public final void b(Bitmap bitmap) {
        bk.c cVar = (bk.c) this.f14276b;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        k kVar = (k) ((Queue) cVar.f3178b).poll();
        if (kVar == null) {
            kVar = cVar.h();
        }
        bk.b bVar = (bk.b) kVar;
        bVar.f7034b = width;
        bVar.f7035c = height;
        bVar.f7036d = config;
        ((d) this.f14277c).v(bVar, bitmap);
    }

    @Override // xj.n
    public final int c(xj.k kVar) {
        return ((n) this.f14277c).c(kVar);
    }

    @Override // bk.j
    public final Bitmap d(int i10, int i11, Bitmap.Config config) {
        bk.c cVar = (bk.c) this.f14276b;
        k kVar = (k) ((Queue) cVar.f3178b).poll();
        if (kVar == null) {
            kVar = cVar.h();
        }
        bk.b bVar = (bk.b) kVar;
        bVar.f7034b = i10;
        bVar.f7035c = i11;
        bVar.f7036d = config;
        return (Bitmap) ((d) this.f14277c).o(bVar);
    }

    @Override // yj.d
    public final void e(Exception exc) {
        i0 i0Var = (i0) this.f14277c;
        v vVar = (v) this.f14276b;
        v vVar2 = i0Var.f515f;
        if (vVar2 != null && vVar2 == vVar) {
            i0 i0Var2 = (i0) this.f14277c;
            v vVar3 = (v) this.f14276b;
            ak.f fVar = i0Var2.f516g;
            yj.e eVar = vVar3.f15630c;
            i0Var2.f511b.a(fVar, exc, eVar, eVar.f());
        }
    }

    @Override // wm.d
    public final wm.c f(float f10, float f11) {
        if (((sm.c) this.f14276b).l(f10, f11) > ((sm.c) this.f14276b).getRadius()) {
            return null;
        }
        float m10 = ((sm.c) this.f14276b).m(f10, f11);
        sm.c cVar = (sm.c) this.f14276b;
        if (cVar instanceof PieChart) {
            cVar.getAnimator().getClass();
            m10 /= 1.0f;
        }
        PieChart pieChart = (PieChart) ((sm.c) this.f14276b);
        float rotationAngle = m10 - pieChart.getRotationAngle();
        DisplayMetrics displayMetrics = h.f8264a;
        while (rotationAngle < g.f34069a) {
            rotationAngle += 360.0f;
        }
        float f12 = rotationAngle % 360.0f;
        int i10 = 0;
        while (true) {
            float[] fArr = pieChart.f11058g0;
            if (i10 < fArr.length) {
                if (fArr[i10] > f12) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 < 0 || i10 >= ((um.h) ((sm.c) this.f14276b).getData().f()).f37272p.size()) {
            return null;
        }
        um.n i11 = ((um.m) ((PieChart) ((sm.c) this.f14276b)).getData()).i();
        return new wm.c(i10, i11.g(i10).a(), f10, f11, 0, i11.f37260d);
    }

    @Override // bk.j
    public final String g(int i10, int i11, Bitmap.Config config) {
        return p(i10, i11, config);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new kn.f((Context) ((Provider) this.f14276b).get(), (kn.d) ((Provider) this.f14277c).get());
    }

    @Override // xj.c
    public final boolean h(Object obj, File file, xj.k kVar) {
        return ((n) this.f14277c).h(new hk.c(((BitmapDrawable) ((e0) obj).get()).getBitmap(), (bk.d) this.f14276b), file, kVar);
    }

    @Override // hk.m
    public final void i() {
        hk.v vVar = (hk.v) this.f14276b;
        synchronized (vVar) {
            vVar.f18571c = vVar.f18569a.length;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r3 != xj.a.f40290e) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        if (r3 == xj.a.f40287b) goto L16;
     */
    @Override // yj.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f14277c
            ak.i0 r0 = (ak.i0) r0
            java.lang.Object r1 = r7.f14276b
            ek.v r1 = (ek.v) r1
            ek.v r0 = r0.f515f
            if (r0 == 0) goto L53
            if (r0 != r1) goto L53
            java.lang.Object r0 = r7.f14277c
            ak.i0 r0 = (ak.i0) r0
            java.lang.Object r1 = r7.f14276b
            ek.v r1 = (ek.v) r1
            ak.i r2 = r0.f510a
            ak.p r2 = r2.f507p
            if (r8 == 0) goto L3e
            yj.e r3 = r1.f15630c
            xj.a r3 = r3.f()
            ak.o r2 = (ak.o) r2
            int r2 = r2.f554e
            switch(r2) {
                case 1: goto L3e;
                case 2: goto L2e;
                case 3: goto L3e;
                default: goto L29;
            }
        L29:
            xj.a r2 = xj.a.f40287b
            if (r3 != r2) goto L3e
            goto L36
        L2e:
            xj.a r2 = xj.a.f40288c
            if (r3 == r2) goto L3e
            xj.a r2 = xj.a.f40290e
            if (r3 == r2) goto L3e
        L36:
            r0.f514e = r8
            ak.g r8 = r0.f511b
            r8.c()
            goto L53
        L3e:
            ak.g r2 = r0.f511b
            xj.g r3 = r1.f15628a
            yj.e r4 = r1.f15630c
            xj.a r5 = r4.f()
            ak.f r6 = r0.f516g
            r0 = r2
            r1 = r3
            r2 = r8
            r3 = r4
            r4 = r5
            r5 = r6
            r0.d(r1, r2, r3, r4, r5)
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: da.d.j(java.lang.Object):void");
    }

    @Override // bk.j
    public final int k(Bitmap bitmap) {
        return rk.k.c(bitmap);
    }

    @Override // hk.m
    public final void l(Bitmap bitmap, bk.d dVar) {
        IOException iOException = ((rk.d) this.f14277c).f33937b;
        if (iOException != null) {
            if (bitmap != null) {
                dVar.b(bitmap);
                throw iOException;
            }
            throw iOException;
        }
    }

    @Override // bk.j
    public final String m(Bitmap bitmap) {
        return p(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.datatransport.cct.CctBackendFactory n(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: da.d.n(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    public final Object o(k kVar) {
        int i10;
        bk.f fVar = (bk.f) ((Map) this.f14277c).get(kVar);
        if (fVar == null) {
            fVar = new bk.f(kVar);
            ((Map) this.f14277c).put(kVar, fVar);
        } else {
            kVar.a();
        }
        bk.f fVar2 = fVar.f7042d;
        fVar2.f7041c = fVar.f7041c;
        fVar.f7041c.f7042d = fVar2;
        bk.f fVar3 = (bk.f) this.f14276b;
        fVar.f7042d = fVar3;
        bk.f fVar4 = fVar3.f7041c;
        fVar.f7041c = fVar4;
        fVar4.f7042d = fVar;
        fVar.f7042d.f7041c = fVar;
        ArrayList arrayList = fVar.f7040b;
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            return fVar.f7040b.remove(i10 - 1);
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        String str = (String) obj;
        if (str == null) {
            Log.w("EmailProviderResponseHa", "No providers known for user (" + ((String) this.f14276b) + ") this email address may be reserved.");
            ((EmailProviderResponseHandler) this.f14277c).h(am.d.a(new FirebaseUiException(0)));
            return;
        }
        if ("password".equalsIgnoreCase(str)) {
            EmailProviderResponseHandler emailProviderResponseHandler = (EmailProviderResponseHandler) this.f14277c;
            Application e10 = ((EmailProviderResponseHandler) this.f14277c).e();
            am.b bVar = (am.b) ((EmailProviderResponseHandler) this.f14277c).f10961d;
            zl.d a10 = new g0(new am.e("password", (String) this.f14276b, null, null, null)).a();
            int i10 = WelcomeBackPasswordPrompt.f10925i;
            emailProviderResponseHandler.h(am.d.a(new IntentRequiredException(104, cm.c.v(e10, WelcomeBackPasswordPrompt.class, bVar).putExtra("extra_idp_response", a10))));
            return;
        }
        if ("emailLink".equalsIgnoreCase(str)) {
            EmailProviderResponseHandler emailProviderResponseHandler2 = (EmailProviderResponseHandler) this.f14277c;
            Application e11 = ((EmailProviderResponseHandler) this.f14277c).e();
            am.b bVar2 = (am.b) ((EmailProviderResponseHandler) this.f14277c).f10961d;
            zl.d a11 = new g0(new am.e("emailLink", (String) this.f14276b, null, null, null)).a();
            int i11 = WelcomeBackEmailLinkPrompt.f10921f;
            emailProviderResponseHandler2.h(am.d.a(new IntentRequiredException(112, cm.c.v(e11, WelcomeBackEmailLinkPrompt.class, bVar2).putExtra("extra_idp_response", a11))));
            return;
        }
        ((EmailProviderResponseHandler) this.f14277c).h(am.d.a(new IntentRequiredException(103, WelcomeBackIdpPrompt.B(((EmailProviderResponseHandler) this.f14277c).e(), (am.b) ((EmailProviderResponseHandler) this.f14277c).f10961d, new am.e(str, (String) this.f14276b, null, null, null), null))));
    }

    public final synchronized List q(String str) {
        List list;
        try {
            if (!((List) this.f14276b).contains(str)) {
                ((List) this.f14276b).add(str);
            }
            list = (List) ((Map) this.f14277c).get(str);
            if (list == null) {
                list = new ArrayList();
                ((Map) this.f14277c).put(str, list);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return list;
    }

    public final int r(xj.d dVar) {
        try {
            return dVar.c((InputStream) this.f14276b, (bk.h) this.f14277c);
        } finally {
            ((InputStream) this.f14276b).reset();
        }
    }

    public final synchronized ArrayList s(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((List) this.f14276b).iterator();
        while (it.hasNext()) {
            List<mk.c> list = (List) ((Map) this.f14277c).get((String) it.next());
            if (list != null) {
                for (mk.c cVar : list) {
                    if (cVar.f27816a.isAssignableFrom(cls) && cls2.isAssignableFrom(cVar.f27817b) && !arrayList.contains(cVar.f27817b)) {
                        arrayList.add(cVar.f27817b);
                    }
                }
            }
        }
        return arrayList;
    }

    public final String t(xj.g gVar) {
        String str;
        synchronized (((rk.g) this.f14276b)) {
            str = (String) ((rk.g) this.f14276b).a(gVar);
        }
        if (str == null) {
            Object c10 = ((c4.e) this.f14277c).c();
            al.d.V(c10);
            ck.j jVar = (ck.j) c10;
            try {
                gVar.a(jVar.f8204a);
                byte[] digest = jVar.f8204a.digest();
                char[] cArr = rk.k.f33951b;
                synchronized (cArr) {
                    for (int i10 = 0; i10 < digest.length; i10++) {
                        byte b10 = digest[i10];
                        int i11 = i10 * 2;
                        char[] cArr2 = rk.k.f33950a;
                        cArr[i11] = cArr2[(b10 & 255) >>> 4];
                        cArr[i11 + 1] = cArr2[b10 & 15];
                    }
                    str = new String(cArr);
                }
            } finally {
                ((c4.e) this.f14277c).b(jVar);
            }
        }
        synchronized (((rk.g) this.f14276b)) {
            ((rk.g) this.f14276b).d(gVar, str);
        }
        return str;
    }

    public final String toString() {
        int i10;
        switch (this.f14275a) {
            case 8:
                return "AttributeStrategy:\n  " + ((d) this.f14277c);
            case 9:
                StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
                bk.f fVar = ((bk.f) this.f14276b).f7041c;
                boolean z10 = false;
                while (!fVar.equals((bk.f) this.f14276b)) {
                    sb2.append(UrlTreeKt.componentParamPrefixChar);
                    sb2.append(fVar.f7039a);
                    sb2.append(':');
                    ArrayList arrayList = fVar.f7040b;
                    if (arrayList != null) {
                        i10 = arrayList.size();
                    } else {
                        i10 = 0;
                    }
                    sb2.append(i10);
                    sb2.append("}, ");
                    fVar = fVar.f7041c;
                    z10 = true;
                }
                if (z10) {
                    sb2.delete(sb2.length() - 2, sb2.length());
                }
                sb2.append(" )");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public final byte[] u(int i10) {
        Object obj = this.f14277c;
        if (((bk.h) obj) == null) {
            return new byte[i10];
        }
        return (byte[]) ((bk.h) obj).c(i10, byte[].class);
    }

    public final void v(k kVar, Object obj) {
        bk.f fVar = (bk.f) ((Map) this.f14277c).get(kVar);
        if (fVar == null) {
            fVar = new bk.f(kVar);
            fVar.f7041c = fVar;
            fVar.f7042d = fVar;
            bk.f fVar2 = (bk.f) this.f14276b;
            fVar.f7042d = fVar2.f7042d;
            fVar.f7041c = fVar2;
            fVar2.f7042d = fVar;
            fVar.f7042d.f7041c = fVar;
            ((Map) this.f14277c).put(kVar, fVar);
        } else {
            kVar.a();
        }
        if (fVar.f7040b == null) {
            fVar.f7040b = new ArrayList();
        }
        fVar.f7040b.add(obj);
    }

    public final void w(String str) {
        ck.b bVar;
        synchronized (this) {
            try {
                Object obj = ((Map) this.f14276b).get(str);
                al.d.V(obj);
                bVar = (ck.b) obj;
                int i10 = bVar.f8190b;
                if (i10 >= 1) {
                    int i11 = i10 - 1;
                    bVar.f8190b = i11;
                    if (i11 == 0) {
                        ck.b bVar2 = (ck.b) ((Map) this.f14276b).remove(str);
                        if (bVar2.equals(bVar)) {
                            ck.c cVar = (ck.c) this.f14277c;
                            synchronized (cVar.f8191a) {
                                try {
                                    if (cVar.f8191a.size() < 10) {
                                        cVar.f8191a.offer(bVar2);
                                    }
                                } finally {
                                }
                            }
                        } else {
                            throw new IllegalStateException("Removed the wrong lock, expected to remove: " + bVar + ", but actually removed: " + bVar2 + ", safeKey: " + str);
                        }
                    }
                } else {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + bVar.f8190b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        bVar.f8189a.unlock();
    }

    public final Object x() {
        int i10;
        bk.f fVar = ((bk.f) this.f14276b).f7042d;
        while (true) {
            Object obj = null;
            if (fVar.equals((bk.f) this.f14276b)) {
                return null;
            }
            ArrayList arrayList = fVar.f7040b;
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                obj = fVar.f7040b.remove(i10 - 1);
            }
            if (obj != null) {
                return obj;
            }
            bk.f fVar2 = fVar.f7042d;
            fVar2.f7041c = fVar.f7041c;
            fVar.f7041c.f7042d = fVar2;
            Map map = (Map) this.f14277c;
            Object obj2 = fVar.f7039a;
            map.remove(obj2);
            ((k) obj2).a();
            fVar = fVar.f7042d;
        }
    }

    public /* synthetic */ d(int i10, int i11) {
        this.f14275a = i10;
    }

    public /* synthetic */ d(int i10, Object obj, Object obj2) {
        this.f14275a = i10;
        this.f14277c = obj;
        this.f14276b = obj2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(com.google.android.gms.internal.p002firebaseauthapi.a aVar) {
        this(2, 0);
        this.f14275a = 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(c cVar) {
        this(3, 0);
        this.f14275a = 3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj) {
        this(1, 0);
        this.f14275a = 1;
    }

    public /* synthetic */ d(Object obj, Object obj2, int i10) {
        this.f14275a = i10;
        this.f14276b = obj;
        this.f14277c = obj2;
    }

    public d(int i10) {
        this.f14275a = i10;
        if (i10 == 9) {
            this.f14276b = new bk.f(null);
            this.f14277c = new HashMap();
            return;
        }
        int i11 = 0;
        if (i10 == 10) {
            this.f14276b = new HashMap();
            this.f14277c = new ck.c(0);
            return;
        }
        if (i10 == 12) {
            this.f14276b = new rk.g(1000L);
            this.f14277c = sk.d.a(10, new hr.c(this, 25));
            return;
        }
        if (i10 == 17) {
            this.f14276b = new AtomicReference();
            this.f14277c = new j0(0);
            return;
        }
        if (i10 == 18) {
            this.f14276b = new ArrayList();
            this.f14277c = new HashMap();
            return;
        }
        if (i10 == 28) {
            this.f14276b = HttpUrl.FRAGMENT_ENCODE_SET;
            this.f14277c = new ArrayList();
        } else {
            if (i10 != 29) {
                switch (i10) {
                    case 23:
                        return;
                    case 24:
                        return;
                    case 25:
                        return;
                    default:
                        this.f14276b = new bk.c(i11);
                        this.f14277c = new d(9);
                        return;
                }
            }
            this.f14277c = new HashMap();
        }
    }

    public d(PieChart pieChart) {
        this.f14275a = 22;
        this.f14277c = new ArrayList();
        this.f14276b = pieChart;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(c4.e eVar) {
        this(new c0(eVar));
        this.f14275a = 13;
    }

    public d(c0 c0Var) {
        this.f14275a = 13;
        this.f14277c = new androidx.work.j(1);
        this.f14276b = c0Var;
    }

    public d(Context context) {
        this.f14275a = 26;
        this.f14277c = null;
        this.f14276b = context;
    }
}
