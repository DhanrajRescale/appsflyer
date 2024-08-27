package q0;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f31541a;

    /* renamed from: b, reason: collision with root package name */
    public Map f31542b;

    public u(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                this.f31541a = new LinkedHashMap();
                this.f31542b = new LinkedHashMap();
                return;
            } else {
                this.f31541a = new HashMap();
                this.f31542b = new HashMap();
                return;
            }
        }
        this.f31541a = new HashMap();
    }

    public final synchronized Map a() {
        try {
            if (this.f31542b == null) {
                this.f31542b = Collections.unmodifiableMap(new HashMap(this.f31541a));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f31542b;
    }
}
