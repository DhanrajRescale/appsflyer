package c0;

import kotlin.jvm.functions.Function2;
import x.s1;

/* loaded from: classes.dex */
public final class i0 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public m0 f7506a;

    /* renamed from: b, reason: collision with root package name */
    public s1 f7507b;

    /* renamed from: c, reason: collision with root package name */
    public Function2 f7508c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f7509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m0 f7510e;

    /* renamed from: f, reason: collision with root package name */
    public int f7511f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(m0 m0Var, yt.a aVar) {
        super(aVar);
        this.f7510e = m0Var;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f7509d = obj;
        this.f7511f |= Integer.MIN_VALUE;
        return this.f7510e.b(null, null, this);
    }
}
