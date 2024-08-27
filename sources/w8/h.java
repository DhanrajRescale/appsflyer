package w8;

import t.q;

/* loaded from: classes.dex */
public final class h extends q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f38865a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i10, i iVar) {
        super(i10);
        this.f38865a = iVar;
    }

    @Override // t.q
    public final void entryRemoved(boolean z10, Object obj, Object obj2, Object obj3) {
        g gVar = (g) obj2;
        this.f38865a.f38866a.y((c) obj, gVar.f38862a, gVar.f38863b, gVar.f38864c);
    }

    @Override // t.q
    public final int sizeOf(Object obj, Object obj2) {
        return ((g) obj2).f38864c;
    }
}
