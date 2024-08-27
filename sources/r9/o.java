package r9;

import j9.y;
import java.util.ArrayList;
import java.util.List;
import l9.t;

/* loaded from: classes.dex */
public final class o implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f33529a;

    /* renamed from: b, reason: collision with root package name */
    public final q9.a f33530b;

    /* renamed from: c, reason: collision with root package name */
    public final List f33531c;

    /* renamed from: d, reason: collision with root package name */
    public final bk.c f33532d;

    /* renamed from: e, reason: collision with root package name */
    public final bk.c f33533e;

    /* renamed from: f, reason: collision with root package name */
    public final q9.a f33534f;

    /* renamed from: g, reason: collision with root package name */
    public final int f33535g;

    /* renamed from: h, reason: collision with root package name */
    public final int f33536h;

    /* renamed from: i, reason: collision with root package name */
    public final float f33537i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f33538j;

    public o(String str, q9.a aVar, ArrayList arrayList, bk.c cVar, bk.c cVar2, q9.a aVar2, int i10, int i11, float f10, boolean z10) {
        this.f33529a = str;
        this.f33530b = aVar;
        this.f33531c = arrayList;
        this.f33532d = cVar;
        this.f33533e = cVar2;
        this.f33534f = aVar2;
        this.f33535g = i10;
        this.f33536h = i11;
        this.f33537i = f10;
        this.f33538j = z10;
    }

    @Override // r9.b
    public final l9.d a(y yVar, j9.i iVar, s9.b bVar) {
        return new t(yVar, bVar, this);
    }
}
