package e0;

import kotlin.jvm.functions.Function2;
import x.s1;

/* loaded from: classes.dex */
public final class h0 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public j0 f14699a;

    /* renamed from: b, reason: collision with root package name */
    public s1 f14700b;

    /* renamed from: c, reason: collision with root package name */
    public Function2 f14701c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f14702d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j0 f14703e;

    /* renamed from: f, reason: collision with root package name */
    public int f14704f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(j0 j0Var, yt.a aVar) {
        super(aVar);
        this.f14703e = j0Var;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f14702d = obj;
        this.f14704f |= Integer.MIN_VALUE;
        return j0.p(this.f14703e, null, null, this);
    }
}
