package androidx.compose.foundation.selection;

import a0.l;
import g1.o;
import h2.g;
import iu.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ut.d;
import x.n1;

/* loaded from: classes.dex */
public final class a extends k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1312a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1313b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1314c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f1315d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f1316e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(boolean z10, boolean z11, g gVar, d dVar, int i10) {
        super(2);
        this.f1312a = i10;
        this.f1313b = z10;
        this.f1314c = z11;
        this.f1315d = gVar;
        this.f1316e = dVar;
    }

    public final o a(l lVar, n1 n1Var) {
        int i10 = this.f1312a;
        d dVar = this.f1316e;
        switch (i10) {
            case 0:
                return new SelectableElement(this.f1313b, lVar, n1Var, this.f1314c, this.f1315d, (Function0) dVar);
            default:
                return new ToggleableElement(this.f1313b, lVar, n1Var, this.f1314c, this.f1315d, (Function1) dVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f1312a) {
            case 0:
                return a((l) obj, (n1) obj2);
            default:
                return a((l) obj, (n1) obj2);
        }
    }
}
