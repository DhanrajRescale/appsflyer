package g7;

import kotlin.collections.IndexedValue;

/* loaded from: classes.dex */
public final class r extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public s f17024a;

    /* renamed from: b, reason: collision with root package name */
    public IndexedValue f17025b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f17026c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f17027d;

    /* renamed from: e, reason: collision with root package name */
    public int f17028e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, yt.a aVar) {
        super(aVar);
        this.f17027d = sVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f17026c = obj;
        this.f17028e |= Integer.MIN_VALUE;
        return this.f17027d.a(null, this);
    }
}
