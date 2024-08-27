package uq;

import android.app.Activity;
import android.util.SparseIntArray;
import java.util.HashMap;
import java.util.Map;
import q3.r;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final yq.a f37355e = yq.a.d();

    /* renamed from: a, reason: collision with root package name */
    public final Activity f37356a;

    /* renamed from: b, reason: collision with root package name */
    public final r f37357b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f37358c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f37359d;

    public e(Activity activity) {
        r rVar = new r();
        HashMap hashMap = new HashMap();
        this.f37359d = false;
        this.f37356a = activity;
        this.f37357b = rVar;
        this.f37358c = hashMap;
    }

    public final fr.d a() {
        boolean z10 = this.f37359d;
        yq.a aVar = f37355e;
        if (!z10) {
            aVar.a("No recording has been started.");
            return new fr.d();
        }
        SparseIntArray[] sparseIntArrayArr = this.f37357b.f31637a.f31634c;
        if (sparseIntArrayArr == null) {
            aVar.a("FrameMetricsAggregator.mMetrics is uninitialized.");
            return new fr.d();
        }
        SparseIntArray sparseIntArray = sparseIntArrayArr[0];
        if (sparseIntArray == null) {
            aVar.a("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
            return new fr.d();
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < sparseIntArray.size(); i13++) {
            int keyAt = sparseIntArray.keyAt(i13);
            int valueAt = sparseIntArray.valueAt(i13);
            i10 += valueAt;
            if (keyAt > 700) {
                i12 += valueAt;
            }
            if (keyAt > 16) {
                i11 += valueAt;
            }
        }
        return new fr.d(new zq.e(i10, i11, i12));
    }
}
