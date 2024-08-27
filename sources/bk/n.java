package bk;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Queue;
import java.util.TreeMap;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class n implements j {

    /* renamed from: d, reason: collision with root package name */
    public static final Bitmap.Config[] f7066d;

    /* renamed from: e, reason: collision with root package name */
    public static final Bitmap.Config[] f7067e;

    /* renamed from: f, reason: collision with root package name */
    public static final Bitmap.Config[] f7068f;

    /* renamed from: g, reason: collision with root package name */
    public static final Bitmap.Config[] f7069g;

    /* renamed from: h, reason: collision with root package name */
    public static final Bitmap.Config[] f7070h;

    /* renamed from: a, reason: collision with root package name */
    public final c f7071a = new c(2);

    /* renamed from: b, reason: collision with root package name */
    public final da.d f7072b = new da.d(9);

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f7073c = new HashMap();

    static {
        Bitmap.Config config;
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            int length = configArr.length - 1;
            config = Bitmap.Config.RGBA_F16;
            configArr[length] = config;
        }
        f7066d = configArr;
        f7067e = configArr;
        f7068f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f7069g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f7070h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String e(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    @Override // bk.j
    public final Bitmap a() {
        Bitmap bitmap = (Bitmap) this.f7072b.x();
        if (bitmap != null) {
            c(Integer.valueOf(rk.k.c(bitmap)), bitmap);
        }
        return bitmap;
    }

    @Override // bk.j
    public final void b(Bitmap bitmap) {
        int c10 = rk.k.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        c cVar = this.f7071a;
        k kVar = (k) ((Queue) cVar.f3178b).poll();
        if (kVar == null) {
            kVar = cVar.h();
        }
        m mVar = (m) kVar;
        mVar.f7064b = c10;
        mVar.f7065c = config;
        this.f7072b.v(mVar, bitmap);
        NavigableMap f10 = f(bitmap.getConfig());
        Integer num = (Integer) f10.get(Integer.valueOf(mVar.f7064b));
        Integer valueOf = Integer.valueOf(mVar.f7064b);
        int i10 = 1;
        if (num != null) {
            i10 = 1 + num.intValue();
        }
        f10.put(valueOf, Integer.valueOf(i10));
    }

    public final void c(Integer num, Bitmap bitmap) {
        NavigableMap f10 = f(bitmap.getConfig());
        Integer num2 = (Integer) f10.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                f10.remove(num);
                return;
            } else {
                f10.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + e(rk.k.c(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3 A[EDGE_INSN: B:34:0x00a3->B:20:0x00a3 BREAK  A[LOOP:0: B:10:0x0055->B:32:0x00a0], SYNTHETIC] */
    @Override // bk.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap d(int r11, int r12, android.graphics.Bitmap.Config r13) {
        /*
            r10 = this;
            int r0 = rk.k.b(r11, r12, r13)
            bk.c r1 = r10.f7071a
            java.lang.Object r2 = r1.f3178b
            java.util.Queue r2 = (java.util.Queue) r2
            java.lang.Object r2 = r2.poll()
            bk.k r2 = (bk.k) r2
            if (r2 != 0) goto L16
            bk.k r2 = r1.h()
        L16:
            bk.m r2 = (bk.m) r2
            r2.f7064b = r0
            r2.f7065c = r13
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            r5 = 0
            if (r3 < r4) goto L30
            android.graphics.Bitmap$Config r3 = in.juspay.hypersdk.mystique.a.b()
            boolean r3 = r3.equals(r13)
            if (r3 == 0) goto L30
            android.graphics.Bitmap$Config[] r3 = bk.n.f7067e
            goto L54
        L30:
            int[] r3 = bk.l.f7062a
            int r4 = r13.ordinal()
            r3 = r3[r4]
            r4 = 1
            if (r3 == r4) goto L52
            r6 = 2
            if (r3 == r6) goto L4f
            r6 = 3
            if (r3 == r6) goto L4c
            r6 = 4
            if (r3 == r6) goto L49
            android.graphics.Bitmap$Config[] r3 = new android.graphics.Bitmap.Config[r4]
            r3[r5] = r13
            goto L54
        L49:
            android.graphics.Bitmap$Config[] r3 = bk.n.f7070h
            goto L54
        L4c:
            android.graphics.Bitmap$Config[] r3 = bk.n.f7069g
            goto L54
        L4f:
            android.graphics.Bitmap$Config[] r3 = bk.n.f7068f
            goto L54
        L52:
            android.graphics.Bitmap$Config[] r3 = bk.n.f7066d
        L54:
            int r4 = r3.length
        L55:
            if (r5 >= r4) goto La3
            r6 = r3[r5]
            java.util.NavigableMap r7 = r10.f(r6)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            java.lang.Object r7 = r7.ceilingKey(r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto La0
            int r8 = r7.intValue()
            int r9 = r0 * 8
            if (r8 > r9) goto La0
            int r3 = r7.intValue()
            if (r3 != r0) goto L82
            if (r6 != 0) goto L7c
            if (r13 == 0) goto La3
            goto L82
        L7c:
            boolean r0 = r6.equals(r13)
            if (r0 != 0) goto La3
        L82:
            r1.g(r2)
            int r0 = r7.intValue()
            java.lang.Object r2 = r1.f3178b
            java.util.Queue r2 = (java.util.Queue) r2
            java.lang.Object r2 = r2.poll()
            bk.k r2 = (bk.k) r2
            if (r2 != 0) goto L99
            bk.k r2 = r1.h()
        L99:
            bk.m r2 = (bk.m) r2
            r2.f7064b = r0
            r2.f7065c = r6
            goto La3
        La0:
            int r5 = r5 + 1
            goto L55
        La3:
            da.d r0 = r10.f7072b
            java.lang.Object r0 = r0.o(r2)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto Lb9
            int r1 = r2.f7064b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.c(r1, r0)
            r0.reconfigure(r11, r12, r13)
        Lb9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bk.n.d(int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }

    public final NavigableMap f(Bitmap.Config config) {
        HashMap hashMap = this.f7073c;
        NavigableMap navigableMap = (NavigableMap) hashMap.get(config);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            hashMap.put(config, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    @Override // bk.j
    public final String g(int i10, int i11, Bitmap.Config config) {
        return e(rk.k.b(i10, i11, config), config);
    }

    @Override // bk.j
    public final int k(Bitmap bitmap) {
        return rk.k.c(bitmap);
    }

    @Override // bk.j
    public final String m(Bitmap bitmap) {
        return e(rk.k.c(bitmap), bitmap.getConfig());
    }

    public final String toString() {
        StringBuilder p10 = da.e.p("SizeConfigStrategy{groupedMap=");
        p10.append(this.f7072b);
        p10.append(", sortedSizes=(");
        HashMap hashMap = this.f7073c;
        for (Map.Entry entry : hashMap.entrySet()) {
            p10.append(entry.getKey());
            p10.append('[');
            p10.append(entry.getValue());
            p10.append("], ");
        }
        if (!hashMap.isEmpty()) {
            p10.replace(p10.length() - 2, p10.length(), HttpUrl.FRAGMENT_ENCODE_SET);
        }
        p10.append(")}");
        return p10.toString();
    }
}
