package y;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class k3 extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public l3 f40827a;

    /* renamed from: b, reason: collision with root package name */
    public ut.d f40828b;

    /* renamed from: c, reason: collision with root package name */
    public Function0 f40829c;

    /* renamed from: d, reason: collision with root package name */
    public float f40830d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f40831e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l3 f40832f;

    /* renamed from: g, reason: collision with root package name */
    public int f40833g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(l3 l3Var, yt.a aVar) {
        super(aVar);
        this.f40832f = l3Var;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f40831e = obj;
        this.f40833g |= Integer.MIN_VALUE;
        return this.f40832f.a(null, null, this);
    }
}
