package r9;

import j9.y;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f33476a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33477b;

    /* renamed from: c, reason: collision with root package name */
    public final bk.c f33478c;

    /* renamed from: d, reason: collision with root package name */
    public final bk.c f33479d;

    /* renamed from: e, reason: collision with root package name */
    public final bk.c f33480e;

    /* renamed from: f, reason: collision with root package name */
    public final bk.c f33481f;

    /* renamed from: g, reason: collision with root package name */
    public final q9.a f33482g;

    /* renamed from: h, reason: collision with root package name */
    public final int f33483h;

    /* renamed from: i, reason: collision with root package name */
    public final int f33484i;

    /* renamed from: j, reason: collision with root package name */
    public final float f33485j;

    /* renamed from: k, reason: collision with root package name */
    public final List f33486k;

    /* renamed from: l, reason: collision with root package name */
    public final q9.a f33487l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f33488m;

    public e(String str, int i10, bk.c cVar, bk.c cVar2, bk.c cVar3, bk.c cVar4, q9.a aVar, int i11, int i12, float f10, ArrayList arrayList, q9.a aVar2, boolean z10) {
        this.f33476a = str;
        this.f33477b = i10;
        this.f33478c = cVar;
        this.f33479d = cVar2;
        this.f33480e = cVar3;
        this.f33481f = cVar4;
        this.f33482g = aVar;
        this.f33483h = i11;
        this.f33484i = i12;
        this.f33485j = f10;
        this.f33486k = arrayList;
        this.f33487l = aVar2;
        this.f33488m = z10;
    }

    @Override // r9.b
    public final l9.d a(y yVar, j9.i iVar, s9.b bVar) {
        return new l9.j(yVar, bVar, this);
    }
}
