package u5;

import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.text.TextUtils;
import android.util.Pair;
import b5.j1;
import b5.k1;
import com.google.android.gms.common.api.Api;
import e5.x;
import i5.g1;
import i5.m0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import lp.i1;
import lp.o0;
import n5.b0;
import r5.e1;

/* loaded from: classes.dex */
public final class p extends v implements g1 {

    /* renamed from: j, reason: collision with root package name */
    public static final i1 f36827j;

    /* renamed from: k, reason: collision with root package name */
    public static final i1 f36828k;

    /* renamed from: c, reason: collision with root package name */
    public final Object f36829c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f36830d;

    /* renamed from: e, reason: collision with root package name */
    public final r f36831e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f36832f;

    /* renamed from: g, reason: collision with root package name */
    public i f36833g;

    /* renamed from: h, reason: collision with root package name */
    public final b0 f36834h;

    /* renamed from: i, reason: collision with root package name */
    public b5.g f36835i;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        i1 b0Var;
        i1 b0Var2;
        t0.s sVar = new t0.s(7);
        if (sVar instanceof i1) {
            b0Var = (i1) sVar;
        } else {
            b0Var = new lp.b0(sVar);
        }
        f36827j = b0Var;
        t0.s sVar2 = new t0.s(8);
        if (sVar2 instanceof i1) {
            b0Var2 = (i1) sVar2;
        } else {
            b0Var2 = new lp.b0(sVar2);
        }
        f36828k = b0Var2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [u5.r, java.lang.Object] */
    public p(Context context) {
        Context context2;
        boolean z10;
        Spatializer spatializer;
        ?? obj = new Object();
        int i10 = i.f36789h0;
        i iVar = new i(new h(context));
        this.f36829c = new Object();
        b0 b0Var = null;
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.f36830d = context2;
        this.f36831e = obj;
        this.f36833g = iVar;
        this.f36835i = b5.g.f3297g;
        if (context != null && x.E(context)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f36832f = z10;
        if (!z10 && context != null && x.f15050a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager != null) {
                spatializer = audioManager.getSpatializer();
                b0Var = new b0(spatializer);
            }
            this.f36834h = b0Var;
        }
        if (this.f36833g.J && context == null) {
            e5.m.f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int a(int i10, int i11) {
        if (i10 != 0 && i10 == i11) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        return Integer.bitCount(i10 & i11);
    }

    public static int b(String str) {
        if (str == null) {
            return 0;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1851077871:
                if (str.equals("video/dolby-vision")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1662735862:
                if (str.equals("video/av01")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 5;
            case 1:
                return 4;
            case 2:
                return 3;
            case 3:
                return 1;
            case 4:
                return 2;
            default:
                return 0;
        }
    }

    public static void c(e1 e1Var, i iVar, HashMap hashMap) {
        for (int i10 = 0; i10 < e1Var.f33147a; i10++) {
            k1 k1Var = (k1) iVar.f3487y.get(e1Var.a(i10));
            if (k1Var != null) {
                j1 j1Var = k1Var.f3397a;
                k1 k1Var2 = (k1) hashMap.get(Integer.valueOf(j1Var.f3378c));
                if (k1Var2 == null || (k1Var2.f3398b.isEmpty() && !k1Var.f3398b.isEmpty())) {
                    hashMap.put(Integer.valueOf(j1Var.f3378c), k1Var);
                }
            }
        }
    }

    public static int d(b5.v vVar, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(vVar.f3643c)) {
            return 4;
        }
        String h10 = h(str);
        String h11 = h(vVar.f3643c);
        if (h11 != null && h10 != null) {
            if (!h11.startsWith(h10) && !h10.startsWith(h11)) {
                int i10 = x.f15050a;
                if (!h11.split("-", 2)[0].equals(h10.split("-", 2)[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        }
        if (!z10 || h11 != null) {
            return 0;
        }
        return 1;
    }

    public static boolean f(int i10, boolean z10) {
        int i11 = i10 & 7;
        return i11 == 4 || (z10 && i11 == 3);
    }

    public static String h(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static Pair i(int i10, u uVar, int[][][] iArr, m mVar, t0.s sVar) {
        RandomAccess randomAccess;
        boolean z10;
        u uVar2 = uVar;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < uVar2.f36839a) {
            if (i10 == uVar2.f36840b[i11]) {
                e1 e1Var = uVar2.f36841c[i11];
                for (int i12 = 0; i12 < e1Var.f33147a; i12++) {
                    j1 a10 = e1Var.a(i12);
                    lp.j1 d10 = mVar.d(i11, a10, iArr[i11][i12]);
                    int i13 = a10.f3376a;
                    boolean[] zArr = new boolean[i13];
                    for (int i14 = 0; i14 < i13; i14++) {
                        n nVar = (n) d10.get(i14);
                        int a11 = nVar.a();
                        if (!zArr[i14] && a11 != 0) {
                            if (a11 == 1) {
                                randomAccess = o0.v(nVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(nVar);
                                for (int i15 = i14 + 1; i15 < i13; i15++) {
                                    n nVar2 = (n) d10.get(i15);
                                    if (nVar2.a() == 2 && nVar.b(nVar2)) {
                                        arrayList2.add(nVar2);
                                        z10 = true;
                                        zArr[i15] = true;
                                    } else {
                                        z10 = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                    }
                }
            }
            i11++;
            uVar2 = uVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, sVar);
        int[] iArr2 = new int[list.size()];
        for (int i16 = 0; i16 < list.size(); i16++) {
            iArr2[i16] = ((n) list.get(i16)).f36811c;
        }
        n nVar3 = (n) list.get(0);
        return Pair.create(new q(0, nVar3.f36810b, iArr2), Integer.valueOf(nVar3.f36809a));
    }

    public final i e() {
        i iVar;
        synchronized (this.f36829c) {
            iVar = this.f36833g;
        }
        return iVar;
    }

    public final void g() {
        boolean z10;
        m0 m0Var;
        b0 b0Var;
        synchronized (this.f36829c) {
            try {
                if (this.f36833g.J && !this.f36832f && x.f15050a >= 32 && (b0Var = this.f36834h) != null && b0Var.f28247b) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10 && (m0Var = this.f36845a) != null) {
            m0Var.f19558h.d(10);
        }
    }

    public final void j(i iVar) {
        boolean z10;
        iVar.getClass();
        synchronized (this.f36829c) {
            z10 = !this.f36833g.equals(iVar);
            this.f36833g = iVar;
        }
        if (z10) {
            if (iVar.J && this.f36830d == null) {
                e5.m.f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            m0 m0Var = this.f36845a;
            if (m0Var != null) {
                m0Var.f19558h.d(10);
            }
        }
    }
}
