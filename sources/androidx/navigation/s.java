package androidx.navigation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2290a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2291b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Object obj, int i10) {
        super(1);
        this.f2290a = i10;
        this.f2291b = obj;
    }

    public final Boolean a(String key) {
        int i10 = this.f2290a;
        Object obj = this.f2291b;
        switch (i10) {
            case 0:
                return Boolean.valueOf(Intrinsics.a(key, (String) obj));
            default:
                Intrinsics.checkNotNullParameter(key, "key");
                z zVar = (z) obj;
                ArrayList arrayList = zVar.f2352d;
                Collection values = ((Map) zVar.f2356h.getValue()).values();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    vt.d0.m(((w) it.next()).f2335b, arrayList2);
                }
                return Boolean.valueOf(!vt.g0.I((List) zVar.f2359k.getValue(), vt.g0.I(arrayList2, arrayList)).contains(key));
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f2290a) {
            case 0:
                return a((String) obj);
            default:
                return a((String) obj);
        }
    }
}
