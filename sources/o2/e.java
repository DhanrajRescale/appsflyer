package o2;

import java.util.List;

/* loaded from: classes.dex */
public final class e extends au.c {

    /* renamed from: a, reason: collision with root package name */
    public i f29470a;

    /* renamed from: b, reason: collision with root package name */
    public List f29471b;

    /* renamed from: c, reason: collision with root package name */
    public q f29472c;

    /* renamed from: d, reason: collision with root package name */
    public int f29473d;

    /* renamed from: e, reason: collision with root package name */
    public int f29474e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f29475f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i f29476g;

    /* renamed from: h, reason: collision with root package name */
    public int f29477h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, yt.a aVar) {
        super(aVar);
        this.f29476g = iVar;
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        this.f29475f = obj;
        this.f29477h |= Integer.MIN_VALUE;
        return this.f29476g.b(this);
    }
}
