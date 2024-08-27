package jv;

import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b extends u {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f21678b;

    public b(x xVar) {
        this.f21678b = xVar;
    }

    @Override // jv.u
    public final String a(lv.m mVar, long j10, z zVar, Locale locale) {
        Map map = (Map) this.f21678b.f21736a.get(zVar);
        if (map != null) {
            return (String) map.get(Long.valueOf(j10));
        }
        return null;
    }
}
