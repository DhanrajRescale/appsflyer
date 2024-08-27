package h;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.os.PowerManager;
import android.util.Log;
import in.juspay.hyper.constants.LogSubCategory;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class z extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17791c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0 f17792d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f17793e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(e0 e0Var, c cVar) {
        super(e0Var);
        this.f17792d = e0Var;
        this.f17793e = cVar;
    }

    @Override // h.b0
    public final IntentFilter b() {
        switch (this.f17791c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [h.t0, java.lang.Object] */
    @Override // h.b0
    public final int c() {
        Location location;
        boolean z10;
        long j10;
        boolean z11;
        int i10 = this.f17791c;
        Object obj = this.f17793e;
        switch (i10) {
            case 0:
                if (((PowerManager) obj).isPowerSaveMode()) {
                    return 2;
                }
                return 1;
            default:
                c cVar = (c) obj;
                u0 u0Var = (u0) cVar.f17585d;
                if (u0Var.f17755b > System.currentTimeMillis()) {
                    z11 = u0Var.f17754a;
                } else {
                    Location location2 = null;
                    if (hl.f.D((Context) cVar.f17583b, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        location = cVar.A(LogSubCategory.ApiCall.NETWORK);
                    } else {
                        location = null;
                    }
                    if (hl.f.D((Context) cVar.f17583b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        location2 = cVar.A("gps");
                    }
                    if (location2 == null || location == null ? location2 != null : location2.getTime() > location.getTime()) {
                        location = location2;
                    }
                    if (location != null) {
                        u0 u0Var2 = (u0) cVar.f17585d;
                        long currentTimeMillis = System.currentTimeMillis();
                        if (t0.f17748d == null) {
                            t0.f17748d = new Object();
                        }
                        t0 t0Var = t0.f17748d;
                        t0Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                        t0Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                        if (t0Var.f17751c == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        long j11 = t0Var.f17750b;
                        long j12 = t0Var.f17749a;
                        t0Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis + 86400000);
                        long j13 = t0Var.f17750b;
                        if (j11 != -1 && j12 != -1) {
                            if (currentTimeMillis > j12) {
                                j11 = j13;
                            } else if (currentTimeMillis > j11) {
                                j11 = j12;
                            }
                            j10 = j11 + 60000;
                        } else {
                            j10 = 43200000 + currentTimeMillis;
                        }
                        u0Var2.f17754a = z10;
                        u0Var2.f17755b = j10;
                        z11 = u0Var.f17754a;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i11 = Calendar.getInstance().get(11);
                        if (i11 < 6 || i11 >= 22) {
                            return 2;
                        }
                        return 1;
                    }
                }
                if (z11) {
                    return 2;
                }
                return 1;
        }
    }

    @Override // h.b0
    public final void g() {
        int i10 = this.f17791c;
        e0 e0Var = this.f17792d;
        switch (i10) {
            case 0:
                e0Var.l(true, true);
                return;
            default:
                e0Var.l(true, true);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(e0 e0Var, Context context) {
        super(e0Var);
        this.f17792d = e0Var;
        this.f17793e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
