package m9;

import android.graphics.PointF;

/* loaded from: classes.dex */
public final class r extends x9.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x9.b f27675e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x9.c f27676f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p9.b f27677g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(x9.b bVar, x9.c cVar, p9.b bVar2) {
        super(0);
        this.f27675e = bVar;
        this.f27676f = cVar;
        this.f27677g = bVar2;
    }

    @Override // x9.c
    public final Object m(x9.b bVar) {
        Object obj;
        float f10 = bVar.f40130a;
        float f11 = bVar.f40131b;
        String str = ((p9.b) bVar.f40132c).f30771a;
        String str2 = ((p9.b) bVar.f40133d).f30771a;
        float f12 = bVar.f40134e;
        float f13 = bVar.f40135f;
        float f14 = bVar.f40136g;
        x9.b bVar2 = this.f27675e;
        bVar2.f40130a = f10;
        bVar2.f40131b = f11;
        bVar2.f40132c = str;
        bVar2.f40133d = str2;
        bVar2.f40134e = f12;
        bVar2.f40135f = f13;
        bVar2.f40136g = f14;
        String str3 = (String) this.f27676f.m(bVar2);
        if (bVar.f40135f == 1.0f) {
            obj = bVar.f40133d;
        } else {
            obj = bVar.f40132c;
        }
        p9.b bVar3 = (p9.b) obj;
        String str4 = bVar3.f30772b;
        float f15 = bVar3.f30773c;
        int i10 = bVar3.f30774d;
        int i11 = bVar3.f30775e;
        float f16 = bVar3.f30776f;
        float f17 = bVar3.f30777g;
        int i12 = bVar3.f30778h;
        int i13 = bVar3.f30779i;
        float f18 = bVar3.f30780j;
        boolean z10 = bVar3.f30781k;
        PointF pointF = bVar3.f30782l;
        PointF pointF2 = bVar3.f30783m;
        p9.b bVar4 = this.f27677g;
        bVar4.f30771a = str3;
        bVar4.f30772b = str4;
        bVar4.f30773c = f15;
        bVar4.f30774d = i10;
        bVar4.f30775e = i11;
        bVar4.f30776f = f16;
        bVar4.f30777g = f17;
        bVar4.f30778h = i12;
        bVar4.f30779i = i13;
        bVar4.f30780j = f18;
        bVar4.f30781k = z10;
        bVar4.f30782l = pointF;
        bVar4.f30783m = pointF2;
        return bVar4;
    }
}
