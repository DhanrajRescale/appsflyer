package d7;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public String f14050a;

    /* renamed from: b, reason: collision with root package name */
    public Map f14051b;

    public /* synthetic */ i0(String str, Map map) {
        this.f14050a = str;
        this.f14051b = map;
    }

    public final fq.c a() {
        Map unmodifiableMap;
        if (this.f14051b == null) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new HashMap(this.f14051b));
        }
        return new fq.c(this.f14050a, unmodifiableMap);
    }

    public final void b(iq.a aVar) {
        if (this.f14051b == null) {
            this.f14051b = new HashMap();
        }
        this.f14051b.put(aVar.annotationType(), aVar);
    }
}
