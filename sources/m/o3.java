package m;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.PowerManager;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class o3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25669a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f25670b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f25671c;

    /* renamed from: d, reason: collision with root package name */
    public Object f25672d;

    /* renamed from: e, reason: collision with root package name */
    public Object f25673e;

    public final int a(int i10, int i11) {
        if (!this.f25671c) {
            return c(i10, i11);
        }
        int i12 = ((SparseIntArray) this.f25673e).get(i10, -1);
        if (i12 != -1) {
            return i12;
        }
        int c10 = c(i10, i11);
        ((SparseIntArray) this.f25673e).put(i10, c10);
        return c10;
    }

    public final int b(int i10, int i11) {
        if (!this.f25670b) {
            return i10 % i11;
        }
        int i12 = ((SparseIntArray) this.f25672d).get(i10, -1);
        if (i12 != -1) {
            return i12;
        }
        int i13 = i10 % i11;
        ((SparseIntArray) this.f25672d).put(i10, i13);
        return i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(int r8, int r9) {
        /*
            r7 = this;
            boolean r0 = r7.f25671c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L49
            java.lang.Object r0 = r7.f25673e
            android.util.SparseIntArray r0 = (android.util.SparseIntArray) r0
            int r3 = r0.size()
            int r3 = r3 - r1
            r4 = r2
        L10:
            if (r4 > r3) goto L22
            int r5 = r4 + r3
            int r5 = r5 >>> r1
            int r6 = r0.keyAt(r5)
            if (r6 >= r8) goto L1e
            int r4 = r5 + 1
            goto L10
        L1e:
            int r5 = r5 + (-1)
            r3 = r5
            goto L10
        L22:
            int r4 = r4 - r1
            r3 = -1
            if (r4 < 0) goto L31
            int r5 = r0.size()
            if (r4 >= r5) goto L31
            int r0 = r0.keyAt(r4)
            goto L32
        L31:
            r0 = r3
        L32:
            if (r0 == r3) goto L49
            java.lang.Object r3 = r7.f25673e
            android.util.SparseIntArray r3 = (android.util.SparseIntArray) r3
            int r3 = r3.get(r0)
            int r4 = r0 + 1
            int r0 = r7.b(r0, r9)
            int r0 = r0 + r1
            if (r0 != r9) goto L4c
            int r3 = r3 + 1
            r0 = r2
            goto L4c
        L49:
            r0 = r2
            r3 = r0
            r4 = r3
        L4c:
            if (r4 >= r8) goto L5e
            int r0 = r0 + 1
            if (r0 != r9) goto L56
            int r3 = r3 + 1
            r0 = r2
            goto L5b
        L56:
            if (r0 <= r9) goto L5b
            int r3 = r3 + 1
            r0 = r1
        L5b:
            int r4 = r4 + 1
            goto L4c
        L5e:
            int r0 = r0 + r1
            if (r0 <= r9) goto L63
            int r3 = r3 + 1
        L63:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: m.o3.c(int, int):int");
    }

    public final void d() {
        ((SparseIntArray) this.f25672d).clear();
    }

    public final void e() {
        switch (this.f25669a) {
            case 1:
                this.f25670b = false;
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f25673e;
                if (wakeLock != null) {
                    wakeLock.release();
                    return;
                }
                return;
            default:
                this.f25670b = false;
                WifiManager.WifiLock wifiLock = (WifiManager.WifiLock) this.f25673e;
                if (wifiLock != null) {
                    wifiLock.release();
                    return;
                }
                return;
        }
    }

    public final void f(boolean z10) {
        switch (this.f25669a) {
            case 1:
                this.f25671c = z10;
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f25673e;
                if (wakeLock != null) {
                    if (this.f25670b && z10) {
                        wakeLock.acquire();
                        return;
                    } else {
                        wakeLock.release();
                        return;
                    }
                }
                return;
            default:
                this.f25671c = z10;
                WifiManager.WifiLock wifiLock = (WifiManager.WifiLock) this.f25673e;
                if (wifiLock != null) {
                    if (this.f25670b && z10) {
                        wifiLock.acquire();
                        return;
                    } else {
                        wifiLock.release();
                        return;
                    }
                }
                return;
        }
    }

    public o3(Context context, int i10) {
        this.f25669a = i10;
        if (i10 != 2) {
            this.f25672d = (PowerManager) context.getApplicationContext().getSystemService("power");
        } else {
            this.f25672d = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        }
    }

    public o3() {
        this.f25669a = 4;
        this.f25672d = new SparseIntArray();
        this.f25673e = new SparseIntArray();
        this.f25670b = false;
        this.f25671c = false;
    }
}
