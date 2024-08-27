package hf;

import e0.j0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes.dex */
public final class s extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f0 f18402a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f18403b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18404c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f18405d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f18406e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(f0 f0Var, j0 j0Var, int i10, List list, Function2 function2) {
        super(0);
        this.f18402a = f0Var;
        this.f18403b = j0Var;
        this.f18404c = i10;
        this.f18405d = list;
        this.f18406e = function2;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        yk.g.H(this.f18402a, null, null, new r(this.f18403b, this.f18404c, this.f18405d, this.f18406e, null), 3);
        return Unit.f23355a;
    }
}
