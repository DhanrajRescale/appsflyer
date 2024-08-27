package q3;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class q extends ni.j {

    /* renamed from: f, reason: collision with root package name */
    public static HandlerThread f31631f;

    /* renamed from: g, reason: collision with root package name */
    public static Handler f31632g;

    /* renamed from: b, reason: collision with root package name */
    public final int f31633b;

    /* renamed from: c, reason: collision with root package name */
    public SparseIntArray[] f31634c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f31635d;

    /* renamed from: e, reason: collision with root package name */
    public final p f31636e;

    public q() {
        super(2);
        this.f31634c = new SparseIntArray[9];
        this.f31635d = new ArrayList();
        this.f31636e = new p(this);
        this.f31633b = 1;
    }

    public static void u(SparseIntArray sparseIntArray, long j10) {
        if (sparseIntArray != null) {
            int i10 = (int) ((500000 + j10) / 1000000);
            if (j10 >= 0) {
                sparseIntArray.put(i10, sparseIntArray.get(i10) + 1);
            }
        }
    }

    public final void t(Activity activity) {
        if (f31631f == null) {
            HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
            f31631f = handlerThread;
            handlerThread.start();
            f31632g = new Handler(f31631f.getLooper());
        }
        for (int i10 = 0; i10 <= 8; i10++) {
            SparseIntArray[] sparseIntArrayArr = this.f31634c;
            if (sparseIntArrayArr[i10] == null && (this.f31633b & (1 << i10)) != 0) {
                sparseIntArrayArr[i10] = new SparseIntArray();
            }
        }
        activity.getWindow().addOnFrameMetricsAvailableListener(this.f31636e, f31632g);
        this.f31635d.add(new WeakReference(activity));
    }

    public final SparseIntArray[] v(Activity activity) {
        ArrayList arrayList = this.f31635d;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == activity) {
                arrayList.remove(weakReference);
                break;
            }
        }
        activity.getWindow().removeOnFrameMetricsAvailableListener(this.f31636e);
        return this.f31634c;
    }

    public final SparseIntArray[] w() {
        SparseIntArray[] sparseIntArrayArr = this.f31634c;
        this.f31634c = new SparseIntArray[9];
        return sparseIntArrayArr;
    }
}
