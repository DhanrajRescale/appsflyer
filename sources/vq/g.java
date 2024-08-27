package vq;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class g extends bl.j {

    /* renamed from: b, reason: collision with root package name */
    public static g f38257b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map f38258c;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(461L, "FIREPERF_AUTOPUSH");
        hashMap.put(462L, "FIREPERF");
        hashMap.put(675L, "FIREPERF_INTERNAL_LOW");
        hashMap.put(676L, "FIREPERF_INTERNAL_HIGH");
        f38258c = Collections.unmodifiableMap(hashMap);
    }

    @Override // bl.j
    public final String B() {
        return "com.google.firebase.perf.LogSourceName";
    }
}
