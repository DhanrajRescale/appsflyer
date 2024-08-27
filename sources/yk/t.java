package yk;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import vt.g0;

/* loaded from: classes.dex */
public final class t implements Serializable {
    private static final long serialVersionUID = 20160629001L;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f41725a;

    public t() {
        this.f41725a = new HashMap();
    }

    private final Object writeReplace() throws ObjectStreamException {
        if (sl.a.b(this)) {
            return null;
        }
        try {
            return new s(this.f41725a);
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return null;
        }
    }

    public final void a(b accessTokenAppIdPair, List appEvents) {
        if (sl.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            HashMap hashMap = this.f41725a;
            if (!hashMap.containsKey(accessTokenAppIdPair)) {
                hashMap.put(accessTokenAppIdPair, g0.S(appEvents));
                return;
            }
            List list = (List) hashMap.get(accessTokenAppIdPair);
            if (list != null) {
                list.addAll(appEvents);
            }
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }

    public t(HashMap appEventMap) {
        Intrinsics.checkNotNullParameter(appEventMap, "appEventMap");
        HashMap hashMap = new HashMap();
        this.f41725a = hashMap;
        hashMap.putAll(appEventMap);
    }
}
