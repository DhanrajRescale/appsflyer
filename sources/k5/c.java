package k5;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import lp.j1;
import lp.o0;
import lp.o1;
import lp.q0;
import lp.v0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final c f22045c = new c(new int[]{2}, 10);

    /* renamed from: d, reason: collision with root package name */
    public static final j1 f22046d;

    /* renamed from: e, reason: collision with root package name */
    public static final o1 f22047e;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f22048a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22049b;

    static {
        Object[] objArr = {2, 5, 6};
        lp.g0.a(3, objArr);
        f22046d = o0.o(3, objArr);
        q0 q0Var = new q0(4);
        q0Var.b(5, 6);
        q0Var.b(17, 6);
        q0Var.b(7, 6);
        q0Var.b(30, 10);
        q0Var.b(18, 6);
        q0Var.b(6, 8);
        q0Var.b(8, 8);
        q0Var.b(14, 8);
        f22047e = q0Var.a();
    }

    public c(int[] iArr, int i10) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f22048a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f22048a = new int[0];
        }
        this.f22049b = i10;
    }

    public static boolean a() {
        if (e5.x.f15050a >= 17) {
            String str = e5.x.f15052c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static c b(Context context) {
        return c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [lp.t0, lp.h0] */
    public static c c(Context context, Intent intent) {
        List aVar;
        int i10 = e5.x.f15050a;
        c cVar = f22045c;
        if (i10 >= 23 && a.b(context)) {
            return cVar;
        }
        ?? h0Var = new lp.h0();
        if (a() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            j1 j1Var = f22046d;
            j1Var.getClass();
            h0Var.c0(j1Var);
        }
        if (i10 >= 29 && (e5.x.E(context) || (i10 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            o0 a10 = b.a();
            a10.getClass();
            h0Var.c0(a10);
            return new c(kp.j.c0(h0Var.f0()), 10);
        }
        if (intent != null && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1) {
            int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (intArrayExtra != null) {
                if (intArrayExtra.length == 0) {
                    aVar = Collections.emptyList();
                } else {
                    aVar = new np.a(0, intArrayExtra.length, intArrayExtra);
                }
                aVar.getClass();
                h0Var.c0(aVar);
            }
            return new c(kp.j.c0(h0Var.f0()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10));
        }
        v0 f02 = h0Var.f0();
        if (!f02.isEmpty()) {
            return new c(kp.j.c0(f02), 10);
        }
        return cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a1, code lost:
    
        if (r8 != 5) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair d(b5.v r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.f3652l
            r0.getClass()
            java.lang.String r1 = r10.f3649i
            int r0 = b5.r0.c(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            lp.o1 r2 = k5.c.f22047e
            boolean r1 = r2.containsKey(r1)
            r3 = 0
            if (r1 != 0) goto L19
            return r3
        L19:
            int[] r1 = r9.f22048a
            r4 = 7
            r5 = 6
            r6 = 8
            r7 = 18
            if (r0 != r7) goto L2c
            int r8 = java.util.Arrays.binarySearch(r1, r7)
            if (r8 < 0) goto L2a
            goto L2c
        L2a:
            r0 = r5
            goto L40
        L2c:
            if (r0 != r6) goto L34
            int r8 = java.util.Arrays.binarySearch(r1, r6)
            if (r8 < 0) goto L3f
        L34:
            r8 = 30
            if (r0 != r8) goto L40
            int r8 = java.util.Arrays.binarySearch(r1, r8)
            if (r8 < 0) goto L3f
            goto L40
        L3f:
            r0 = r4
        L40:
            int r1 = java.util.Arrays.binarySearch(r1, r0)
            if (r1 < 0) goto Lcb
            r1 = -1
            int r8 = r10.f3665y
            if (r8 == r1) goto L62
            if (r0 != r7) goto L4e
            goto L62
        L4e:
            java.lang.String r10 = r10.f3652l
            java.lang.String r1 = "audio/vnd.dts.uhd;profile=p2"
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L5d
            r10 = 10
            if (r8 <= r10) goto L90
            return r3
        L5d:
            int r10 = r9.f22049b
            if (r8 <= r10) goto L90
            return r3
        L62:
            int r10 = r10.f3666z
            if (r10 == r1) goto L67
            goto L6a
        L67:
            r10 = 48000(0xbb80, float:6.7262E-41)
        L6a:
            int r1 = e5.x.f15050a
            r7 = 29
            if (r1 < r7) goto L76
            int r10 = k5.b.b(r0, r10)
        L74:
            r8 = r10
            goto L90
        L76:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r10 = r2.get(r10)
            if (r10 == 0) goto L86
            r1 = r10
        L86:
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r10 = r1.intValue()
            goto L74
        L90:
            int r10 = e5.x.f15050a
            r1 = 28
            if (r10 > r1) goto La4
            if (r8 != r4) goto L9a
            r5 = r6
            goto La5
        L9a:
            r1 = 3
            if (r8 == r1) goto La5
            r1 = 4
            if (r8 == r1) goto La5
            r1 = 5
            if (r8 != r1) goto La4
            goto La5
        La4:
            r5 = r8
        La5:
            r1 = 26
            if (r10 > r1) goto Lb7
            java.lang.String r10 = "fugu"
            java.lang.String r1 = e5.x.f15051b
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto Lb7
            r10 = 1
            if (r5 != r10) goto Lb7
            r5 = 2
        Lb7:
            int r10 = e5.x.n(r5)
            if (r10 != 0) goto Lbe
            return r3
        Lbe:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            android.util.Pair r10 = android.util.Pair.create(r0, r10)
            return r10
        Lcb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.c.d(b5.v):android.util.Pair");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (Arrays.equals(this.f22048a, cVar.f22048a) && this.f22049b == cVar.f22049b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f22048a) * 31) + this.f22049b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f22049b + ", supportedEncodings=" + Arrays.toString(this.f22048a) + "]";
    }
}
