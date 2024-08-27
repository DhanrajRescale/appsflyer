package e5;

import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class t implements h {

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f15043b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    public final Handler f15044a;

    public t(Handler handler) {
        this.f15044a = handler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static s b() {
        s sVar;
        ArrayList arrayList = f15043b;
        synchronized (arrayList) {
            try {
                if (arrayList.isEmpty()) {
                    sVar = new Object();
                } else {
                    sVar = (s) arrayList.remove(arrayList.size() - 1);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sVar;
    }

    public final s a(int i10, Object obj) {
        s b10 = b();
        b10.f15042a = this.f15044a.obtainMessage(i10, obj);
        return b10;
    }

    public final boolean c(Runnable runnable) {
        return this.f15044a.post(runnable);
    }

    public final boolean d(int i10) {
        return this.f15044a.sendEmptyMessage(i10);
    }
}
