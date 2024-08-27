package androidx.compose.foundation.selection;

import a0.l;
import h2.g;
import iu.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import x.n1;

/* loaded from: classes.dex */
public final class b extends k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i2.a f1317a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1318b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f1319c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f1320d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i2.a aVar, boolean z10, g gVar, Function0 function0) {
        super(2);
        this.f1317a = aVar;
        this.f1318b = z10;
        this.f1319c = gVar;
        this.f1320d = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new TriStateToggleableElement(this.f1317a, (l) obj, (n1) obj2, this.f1318b, this.f1319c, this.f1320d);
    }
}
