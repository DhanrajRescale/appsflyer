package nn;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class c implements ln.b, xs.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29000a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider f29001b;

    public /* synthetic */ c(Provider provider, int i10) {
        this.f29000a = i10;
        this.f29001b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i10 = this.f29000a;
        Provider provider = this.f29001b;
        switch (i10) {
            case 0:
                rn.a aVar = (rn.a) provider.get();
                da.d dVar = new da.d(29);
                gn.c cVar = gn.c.f17525a;
                x9.c cVar2 = new x9.c(9);
                Set emptySet = Collections.emptySet();
                if (emptySet != null) {
                    cVar2.f40140d = emptySet;
                    cVar2.f40138b = 30000L;
                    cVar2.f40139c = 86400000L;
                    ((Map) dVar.f14277c).put(cVar, cVar2.f());
                    gn.c cVar3 = gn.c.f17527c;
                    x9.c cVar4 = new x9.c(9);
                    Set emptySet2 = Collections.emptySet();
                    if (emptySet2 != null) {
                        cVar4.f40140d = emptySet2;
                        cVar4.f40138b = 1000L;
                        cVar4.f40139c = 86400000L;
                        ((Map) dVar.f14277c).put(cVar3, cVar4.f());
                        gn.c cVar5 = gn.c.f17526b;
                        x9.c cVar6 = new x9.c(9);
                        Set emptySet3 = Collections.emptySet();
                        if (emptySet3 != null) {
                            cVar6.f40140d = emptySet3;
                            cVar6.f40138b = 86400000L;
                            cVar6.f40139c = 86400000L;
                            Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(on.d.f30123b)));
                            if (unmodifiableSet != null) {
                                cVar6.f40140d = unmodifiableSet;
                                ((Map) dVar.f14277c).put(cVar5, cVar6.f());
                                dVar.f14276b = aVar;
                                if (aVar != null) {
                                    if (((Map) dVar.f14277c).keySet().size() >= gn.c.values().length) {
                                        Map map = (Map) dVar.f14277c;
                                        dVar.f14277c = new HashMap();
                                        return new on.a((rn.a) dVar.f14276b, map);
                                    }
                                    throw new IllegalStateException("Not all priorities have been configured");
                                }
                                throw new NullPointerException("missing required property: clock");
                            }
                            throw new NullPointerException("Null flags");
                        }
                        throw new NullPointerException("Null flags");
                    }
                    throw new NullPointerException("Null flags");
                }
                throw new NullPointerException("Null flags");
            default:
                return provider.get();
        }
    }
}
