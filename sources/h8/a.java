package h8;

import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.u;

/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: i, reason: collision with root package name */
    public static final String f18038i = u.C("BatteryChrgTracker");

    @Override // h8.d
    public final Object a() {
        Intent registerReceiver = this.f18044b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z10 = false;
        if (registerReceiver == null) {
            u.w().v(f18038i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        if (intExtra == 2 || intExtra == 5) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override // h8.c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        if (r6.equals("android.intent.action.ACTION_POWER_DISCONNECTED") == false) goto L7;
     */
    @Override // h8.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(android.content.Intent r6) {
        /*
            r5 = this;
            java.lang.String r6 = r6.getAction()
            if (r6 != 0) goto L7
            return
        L7:
            androidx.work.u r0 = androidx.work.u.w()
            java.lang.String r1 = "Received %s"
            java.lang.Object[] r2 = new java.lang.Object[]{r6}
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r2 = 0
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            java.lang.String r4 = h8.a.f18038i
            r0.u(r4, r1, r3)
            int r0 = r6.hashCode()
            r1 = -1
            switch(r0) {
                case -1886648615: goto L48;
                case -54942926: goto L3d;
                case 948344062: goto L32;
                case 1019184907: goto L27;
                default: goto L25;
            }
        L25:
            r2 = r1
            goto L51
        L27:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L30
            goto L25
        L30:
            r2 = 3
            goto L51
        L32:
            java.lang.String r0 = "android.os.action.CHARGING"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L3b
            goto L25
        L3b:
            r2 = 2
            goto L51
        L3d:
            java.lang.String r0 = "android.os.action.DISCHARGING"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L46
            goto L25
        L46:
            r2 = 1
            goto L51
        L48:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L51
            goto L25
        L51:
            switch(r2) {
                case 0: goto L67;
                case 1: goto L61;
                case 2: goto L5b;
                case 3: goto L55;
                default: goto L54;
            }
        L54:
            goto L6c
        L55:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.c(r6)
            goto L6c
        L5b:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.c(r6)
            goto L6c
        L61:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.c(r6)
            goto L6c
        L67:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.c(r6)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h8.a.g(android.content.Intent):void");
    }
}
