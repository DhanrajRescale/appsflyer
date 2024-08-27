package ls;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public final class g1 implements Parcelable {
    public static final Parcelable.Creator<g1> CREATOR = new zq.c(13);

    /* renamed from: d, reason: collision with root package name */
    public static final ReentrantLock f25205d = new ReentrantLock();

    /* renamed from: e, reason: collision with root package name */
    public static long f25206e = -1;

    /* renamed from: f, reason: collision with root package name */
    public static g1 f25207f = null;

    /* renamed from: g, reason: collision with root package name */
    public static int f25208g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static int f25209h = -1;

    /* renamed from: a, reason: collision with root package name */
    public final String f25210a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25211b;

    /* renamed from: c, reason: collision with root package name */
    public final f1 f25212c;

    public g1(e1 e1Var, String str, String str2) {
        this.f25210a = str;
        this.f25211b = str2;
        this.f25212c = e1Var;
    }

    public static boolean a() {
        if (f25205d.isHeldByCurrentThread()) {
            long currentTimeMillis = System.currentTimeMillis() - f25206e;
            if (f25208g > 0 && currentTimeMillis > 43200000) {
                el.l.l0("MixpanelAPI.UpDisplSt", "UpdateDisplayState set long, long ago, without showing. Update state will be cleared.");
                f25207f = null;
            }
            if (f25207f != null) {
                return true;
            }
            return false;
        }
        throw new AssertionError();
    }

    public static int b(e1 e1Var, String str, String str2) {
        if (f25205d.isHeldByCurrentThread()) {
            if (!a()) {
                f25206e = System.currentTimeMillis();
                f25207f = new g1(e1Var, str, str2);
                int i10 = f25208g + 1;
                f25208g = i10;
                return i10;
            }
            el.l.T0("MixpanelAPI.UpDisplSt", "Already showing (or cooking) a Mixpanel update, declining to show another.");
            return -1;
        }
        throw new AssertionError();
    }

    public static void c(int i10) {
        ReentrantLock reentrantLock = f25205d;
        reentrantLock.lock();
        try {
            if (i10 == f25209h) {
                f25209h = -1;
                f25207f = null;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = new Bundle();
        bundle.putString("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISTINCT_ID_BUNDLE_KEY", this.f25210a);
        bundle.putString("com.mixpanel.android.mpmetrics.UpdateDisplayState.TOKEN_BUNDLE_KEY", this.f25211b);
        bundle.putParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISPLAYSTATE_BUNDLE_KEY", this.f25212c);
        parcel.writeBundle(bundle);
    }

    public g1(Bundle bundle) {
        this.f25210a = bundle.getString("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISTINCT_ID_BUNDLE_KEY");
        this.f25211b = bundle.getString("com.mixpanel.android.mpmetrics.UpdateDisplayState.TOKEN_BUNDLE_KEY");
        this.f25212c = (f1) bundle.getParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISPLAYSTATE_BUNDLE_KEY");
    }
}
