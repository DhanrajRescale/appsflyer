package uu;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qu.f0;
import qu.g0;

/* loaded from: classes2.dex */
public abstract class f implements r {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f37431a;

    /* renamed from: b, reason: collision with root package name */
    public final int f37432b;

    /* renamed from: c, reason: collision with root package name */
    public final su.a f37433c;

    public f(CoroutineContext coroutineContext, int i10, su.a aVar) {
        this.f37431a = coroutineContext;
        this.f37432b = i10;
        this.f37433c = aVar;
    }

    @Override // tu.f
    public Object c(tu.g gVar, yt.a aVar) {
        Object P = hl.f.P(new d(null, gVar, this), aVar);
        if (P != zt.a.f42823a) {
            return Unit.f23355a;
        }
        return P;
    }

    @Override // uu.r
    public final tu.f e(CoroutineContext coroutineContext, int i10, su.a aVar) {
        CoroutineContext coroutineContext2 = this.f37431a;
        CoroutineContext l10 = coroutineContext.l(coroutineContext2);
        su.a aVar2 = su.a.f34776a;
        su.a aVar3 = this.f37433c;
        int i11 = this.f37432b;
        if (aVar == aVar2) {
            if (i11 != -3) {
                if (i10 != -3) {
                    if (i11 != -2) {
                        if (i10 != -2) {
                            i10 += i11;
                            if (i10 < 0) {
                                i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                            }
                        }
                    }
                }
                i10 = i11;
            }
            aVar = aVar3;
        }
        if (Intrinsics.a(l10, coroutineContext2) && i10 == i11 && aVar == aVar3) {
            return this;
        }
        return i(l10, i10, aVar);
    }

    public String g() {
        return null;
    }

    public abstract Object h(su.n nVar, yt.a aVar);

    public abstract f i(CoroutineContext coroutineContext, int i10, su.a aVar);

    public tu.f j() {
        return null;
    }

    public su.o k(f0 f0Var) {
        int i10 = this.f37432b;
        if (i10 == -3) {
            i10 = -2;
        }
        g0 g0Var = g0.f32207c;
        Function2 eVar = new e(this, null);
        su.m mVar = new su.m(yk.g.J(f0Var, this.f37431a), hl.f.a(i10, this.f37433c, 4));
        mVar.m0(g0Var, mVar, eVar);
        return mVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String g10 = g();
        if (g10 != null) {
            arrayList.add(g10);
        }
        kotlin.coroutines.k kVar = kotlin.coroutines.k.f23369a;
        CoroutineContext coroutineContext = this.f37431a;
        if (coroutineContext != kVar) {
            arrayList.add("context=" + coroutineContext);
        }
        int i10 = this.f37432b;
        if (i10 != -3) {
            arrayList.add("capacity=" + i10);
        }
        su.a aVar = su.a.f34776a;
        su.a aVar2 = this.f37433c;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        return nn.d.n(sb2, vt.g0.B(arrayList, ", ", null, null, null, 62), ']');
    }
}
