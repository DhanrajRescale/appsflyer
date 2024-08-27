package r9;

import android.graphics.Path;
import j9.y;

/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f33468a;

    /* renamed from: b, reason: collision with root package name */
    public final Path.FillType f33469b;

    /* renamed from: c, reason: collision with root package name */
    public final bk.c f33470c;

    /* renamed from: d, reason: collision with root package name */
    public final bk.c f33471d;

    /* renamed from: e, reason: collision with root package name */
    public final bk.c f33472e;

    /* renamed from: f, reason: collision with root package name */
    public final bk.c f33473f;

    /* renamed from: g, reason: collision with root package name */
    public final String f33474g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f33475h;

    public d(String str, int i10, Path.FillType fillType, bk.c cVar, bk.c cVar2, bk.c cVar3, bk.c cVar4, boolean z10) {
        this.f33468a = i10;
        this.f33469b = fillType;
        this.f33470c = cVar;
        this.f33471d = cVar2;
        this.f33472e = cVar3;
        this.f33473f = cVar4;
        this.f33474g = str;
        this.f33475h = z10;
    }

    @Override // r9.b
    public final l9.d a(y yVar, j9.i iVar, s9.b bVar) {
        return new l9.i(yVar, iVar, bVar, this);
    }
}
