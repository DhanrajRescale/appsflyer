package yj;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class m implements f {

    /* renamed from: a, reason: collision with root package name */
    public final bk.h f41671a;

    public m(bk.h hVar) {
        this.f41671a = hVar;
    }

    @Override // yj.f
    public final Class a() {
        return InputStream.class;
    }

    @Override // yj.f
    public final g b(Object obj) {
        return new t9.c((InputStream) obj, this.f41671a);
    }
}
