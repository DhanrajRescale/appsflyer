package ru;

import android.os.Looper;
import java.util.List;
import qu.b2;
import vu.t;

/* loaded from: classes2.dex */
public final class a implements t {
    @Override // vu.t
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // vu.t
    public b2 b(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new d(f.a(mainLooper));
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // vu.t
    public int c() {
        return 1073741823;
    }
}
